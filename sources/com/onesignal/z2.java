package com.onesignal;

import com.onesignal.k3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: OSTaskController */
class z2 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f28479a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f28480b = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f28481c;

    /* renamed from: d  reason: collision with root package name */
    protected final v1 f28482d;

    /* compiled from: OSTaskController */
    class a implements ThreadFactory {
        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    /* compiled from: OSTaskController */
    private static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private z2 f28484a;

        /* renamed from: b  reason: collision with root package name */
        private Runnable f28485b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f28486c;

        b(z2 z2Var, Runnable runnable) {
            this.f28484a = z2Var;
            this.f28485b = runnable;
        }

        public void run() {
            this.f28485b.run();
            this.f28484a.d(this.f28486c);
        }

        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f28485b + ", taskId=" + this.f28486c + '}';
        }
    }

    z2(v1 v1Var) {
        this.f28482d = v1Var;
    }

    private void b(b bVar) {
        synchronized (this.f28479a) {
            long unused = bVar.f28486c = this.f28480b.incrementAndGet();
            ExecutorService executorService = this.f28481c;
            if (executorService == null) {
                v1 v1Var = this.f28482d;
                v1Var.d("Adding a task to the pending queue with ID: " + bVar.f28486c);
                this.f28479a.add(bVar);
            } else if (!executorService.isShutdown()) {
                v1 v1Var2 = this.f28482d;
                v1Var2.d("Executor is still running, add to the executor with ID: " + bVar.f28486c);
                try {
                    this.f28481c.submit(bVar);
                } catch (RejectedExecutionException e10) {
                    v1 v1Var3 = this.f28482d;
                    v1Var3.f("Executor is shutdown, running task manually with ID: " + bVar.f28486c);
                    bVar.run();
                    e10.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void d(long j10) {
        if (this.f28480b.get() == j10) {
            k3.a(k3.r0.INFO, "Last Pending Task has ran, shutting down");
            this.f28481c.shutdown();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Runnable runnable) {
        b(new b(this, runnable));
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (k3.i1() && this.f28481c == null) {
            return false;
        }
        if (k3.i1() || this.f28481c != null) {
            return !this.f28481c.isShutdown();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        synchronized (this.f28479a) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "startPendingTasks with task queue quantity: " + this.f28479a.size());
            if (!this.f28479a.isEmpty()) {
                this.f28481c = Executors.newSingleThreadExecutor(new a());
                while (!this.f28479a.isEmpty()) {
                    this.f28481c.submit(this.f28479a.poll());
                }
            }
        }
    }
}
