package k8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final a f29143a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f29144b;

    /* renamed from: k8.b$b  reason: collision with other inner class name */
    /* compiled from: PoolableExecutors */
    private static class C0309b implements a {
        private C0309b() {
        }

        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0309b bVar = new C0309b();
        f29143a = bVar;
        f29144b = bVar;
    }

    public static a a() {
        return f29144b;
    }
}
