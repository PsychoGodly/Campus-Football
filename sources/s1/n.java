package s1;

import androidx.work.p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class n {

    /* renamed from: f  reason: collision with root package name */
    private static final String f22345f = p.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f22346a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f22347b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f22348c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f22349d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Object f22350e = new Object();

    /* compiled from: WorkTimer */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f22351a = 0;

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f22351a);
            this.f22351a = this.f22351a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f22353a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22354b;

        c(n nVar, String str) {
            this.f22353a = nVar;
            this.f22354b = str;
        }

        public void run() {
            synchronized (this.f22353a.f22350e) {
                if (this.f22353a.f22348c.remove(this.f22354b) != null) {
                    b remove = this.f22353a.f22349d.remove(this.f22354b);
                    if (remove != null) {
                        remove.a(this.f22354b);
                    }
                } else {
                    p.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f22354b}), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f22346a = aVar;
        this.f22347b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f22347b.isShutdown()) {
            this.f22347b.shutdownNow();
        }
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f22350e) {
            p.c().a(f22345f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f22348c.put(str, cVar);
            this.f22349d.put(str, bVar);
            this.f22347b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f22350e) {
            if (this.f22348c.remove(str) != null) {
                p.c().a(f22345f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f22349d.remove(str);
            }
        }
    }
}
