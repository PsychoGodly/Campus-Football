package k4;

/* compiled from: ConditionVariable */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f19706a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f19707b;

    public g() {
        this(d.f19684a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f19707b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f19707b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f19707b;
        this.f19707b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f19707b;
    }

    public synchronized boolean e() {
        if (this.f19707b) {
            return false;
        }
        this.f19707b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f19706a = dVar;
    }
}
