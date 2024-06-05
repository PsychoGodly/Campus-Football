package s1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f22303a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f22304b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f22305c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile Runnable f22306d;

    /* compiled from: SerialExecutor */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final g f22307a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f22308b;

        a(g gVar, Runnable runnable) {
            this.f22307a = gVar;
            this.f22308b = runnable;
        }

        public void run() {
            try {
                this.f22308b.run();
            } finally {
                this.f22307a.b();
            }
        }
    }

    public g(Executor executor) {
        this.f22304b = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f22305c) {
            z10 = !this.f22303a.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f22305c) {
            Runnable poll = this.f22303a.poll();
            this.f22306d = poll;
            if (poll != null) {
                this.f22304b.execute(this.f22306d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f22305c) {
            this.f22303a.add(new a(this, runnable));
            if (this.f22306d == null) {
                b();
            }
        }
    }
}
