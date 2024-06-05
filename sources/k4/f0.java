package k4;

import n2.f3;

/* compiled from: StandaloneMediaClock */
public final class f0 implements t {

    /* renamed from: a  reason: collision with root package name */
    private final d f19701a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f19702b;

    /* renamed from: c  reason: collision with root package name */
    private long f19703c;

    /* renamed from: d  reason: collision with root package name */
    private long f19704d;

    /* renamed from: f  reason: collision with root package name */
    private f3 f19705f = f3.f20380d;

    public f0(d dVar) {
        this.f19701a = dVar;
    }

    public void a(long j10) {
        this.f19703c = j10;
        if (this.f19702b) {
            this.f19704d = this.f19701a.b();
        }
    }

    public void b() {
        if (!this.f19702b) {
            this.f19704d = this.f19701a.b();
            this.f19702b = true;
        }
    }

    public void c(f3 f3Var) {
        if (this.f19702b) {
            a(l());
        }
        this.f19705f = f3Var;
    }

    public void d() {
        if (this.f19702b) {
            a(l());
            this.f19702b = false;
        }
    }

    public f3 e() {
        return this.f19705f;
    }

    public long l() {
        long j10;
        long j11 = this.f19703c;
        if (!this.f19702b) {
            return j11;
        }
        long b10 = this.f19701a.b() - this.f19704d;
        f3 f3Var = this.f19705f;
        if (f3Var.f20384a == 1.0f) {
            j10 = n0.C0(b10);
        } else {
            j10 = f3Var.b(b10);
        }
        return j11 + j10;
    }
}
