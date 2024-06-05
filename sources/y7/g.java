package y7;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncQueue */
public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f31351a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f31352b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<d> f31353c = new ArrayList<>();

    /* compiled from: AsyncQueue */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final d f31354a;

        /* renamed from: b  reason: collision with root package name */
        private final long f31355b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f31356c;

        /* renamed from: d  reason: collision with root package name */
        private ScheduledFuture f31357d;

        /* access modifiers changed from: private */
        public void d() {
            g.this.w();
            if (this.f31357d != null) {
                e();
                this.f31356c.run();
            }
        }

        private void e() {
            b.d(this.f31357d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f31357d = null;
            g.this.v(this);
        }

        /* access modifiers changed from: private */
        public void f(long j10) {
            this.f31357d = g.this.f31351a.schedule(new h(this), j10, TimeUnit.MILLISECONDS);
        }

        public void c() {
            g.this.w();
            ScheduledFuture scheduledFuture = this.f31357d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                e();
            }
        }

        private b(d dVar, long j10, Runnable runnable) {
            this.f31354a = dVar;
            this.f31355b = j10;
            this.f31356c = runnable;
        }
    }

    /* compiled from: AsyncQueue */
    private class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f31359a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31360b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Thread f31361c;

        /* compiled from: AsyncQueue */
        class a extends ScheduledThreadPoolExecutor {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f31363a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(int i10, ThreadFactory threadFactory, g gVar) {
                super(i10, threadFactory);
                this.f31363a = gVar;
            }

            /* access modifiers changed from: protected */
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (CancellationException unused) {
                    } catch (ExecutionException e10) {
                        th = e10.getCause();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (th != null) {
                    g.this.u(th);
                }
            }
        }

        /* compiled from: AsyncQueue */
        private class b implements Runnable, ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            private final CountDownLatch f31365a;

            /* renamed from: b  reason: collision with root package name */
            private Runnable f31366b;

            private b() {
                this.f31365a = new CountDownLatch(1);
            }

            public Thread newThread(Runnable runnable) {
                b.d(this.f31366b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f31366b = runnable;
                this.f31365a.countDown();
                return c.this.f31361c;
            }

            public void run() {
                try {
                    this.f31365a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f31366b.run();
            }
        }

        c() {
            b bVar = new b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f31361c = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new j(this));
            a aVar = new a(1, bVar, g.this);
            this.f31359a = aVar;
            aVar.setKeepAliveTime(3, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: private */
        public synchronized Task<Void> l(Runnable runnable) {
            if (o()) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(null);
                return taskCompletionSource.getTask();
            }
            Task<Void> m10 = m(new k(runnable));
            this.f31360b = true;
            return m10;
        }

        /* access modifiers changed from: private */
        public <T> Task<T> m(Callable<T> callable) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new i(taskCompletionSource, callable));
            } catch (RejectedExecutionException unused) {
                v.e(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* access modifiers changed from: private */
        public synchronized boolean o() {
            return this.f31360b;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e10) {
                taskCompletionSource.setException(e10);
                throw new RuntimeException(e10);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Thread thread, Throwable th) {
            g.this.u(th);
        }

        /* access modifiers changed from: private */
        public void s() {
            this.f31359a.shutdownNow();
        }

        /* access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f31360b) {
                return null;
            }
            return this.f31359a.schedule(runnable, j10, timeUnit);
        }

        public synchronized void execute(Runnable runnable) {
            if (!this.f31360b) {
                this.f31359a.execute(runnable);
            }
        }

        public void n(Runnable runnable) {
            try {
                this.f31359a.execute(runnable);
            } catch (RejectedExecutionException unused) {
                v.e(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    /* compiled from: AsyncQueue */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static <TResult> Task<TResult> g(Executor executor, Callable<Task<TResult>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new e(callable, executor, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private b h(d dVar, long j10, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j10, runnable);
        bVar.f(j10);
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void q(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new c(taskCompletionSource));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        } catch (Throwable th) {
            taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.9.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
            outOfMemoryError.initCause(th);
            throw outOfMemoryError;
        }
        throw new RuntimeException("Internal error in Cloud Firestore (24.9.1).", th);
    }

    /* access modifiers changed from: private */
    public void v(b bVar) {
        b.d(this.f31352b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    public Task<Void> i(Runnable runnable) {
        return j(new f(runnable));
    }

    public <T> Task<T> j(Callable<T> callable) {
        return this.f31351a.m(callable);
    }

    public b k(d dVar, long j10, Runnable runnable) {
        if (this.f31353c.contains(dVar)) {
            j10 = 0;
        }
        b h10 = h(dVar, j10, runnable);
        this.f31352b.add(h10);
        return h10;
    }

    public void l(Runnable runnable) {
        i(runnable);
    }

    public void m(Runnable runnable) {
        this.f31351a.n(runnable);
    }

    public Task<Void> n(Runnable runnable) {
        return this.f31351a.l(runnable);
    }

    public Executor o() {
        return this.f31351a;
    }

    public boolean p() {
        return this.f31351a.o();
    }

    public void u(Throwable th) {
        this.f31351a.s();
        new Handler(Looper.getMainLooper()).post(new d(th));
    }

    public void w() {
        Thread currentThread = Thread.currentThread();
        if (this.f31351a.f31361c != currentThread) {
            throw b.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f31351a.f31361c.getName(), Long.valueOf(this.f31351a.f31361c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}
