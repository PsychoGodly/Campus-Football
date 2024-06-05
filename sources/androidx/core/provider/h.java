package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor */
class h {

    /* compiled from: RequestExecutor */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f3026a;

        /* renamed from: b  reason: collision with root package name */
        private int f3027b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* compiled from: RequestExecutor */
        private static class C0039a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f3028a;

            C0039a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f3028a = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f3028a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f3026a = str;
            this.f3027b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0039a(runnable, this.f3026a, this.f3027b);
        }
    }

    /* compiled from: RequestExecutor */
    private static class b<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f3029a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.core.util.a<T> f3030b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f3031c;

        /* compiled from: RequestExecutor */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f3032a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f3033b;

            a(androidx.core.util.a aVar, Object obj) {
                this.f3032a = aVar;
                this.f3033b = obj;
            }

            public void run() {
                this.f3032a.accept(this.f3033b);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f3029a = callable;
            this.f3030b = aVar;
            this.f3031c = handler;
        }

        public void run() {
            T t10;
            try {
                t10 = this.f3029a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f3031c.post(new a(this.f3030b, t10));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
