package n2;

import k4.d;
import k4.f0;
import k4.t;

/* compiled from: DefaultMediaClock */
final class l implements t {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f20523a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20524b;

    /* renamed from: c  reason: collision with root package name */
    private p3 f20525c;

    /* renamed from: d  reason: collision with root package name */
    private t f20526d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20527f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20528g;

    /* compiled from: DefaultMediaClock */
    public interface a {
        void d(f3 f3Var);
    }

    public l(a aVar, d dVar) {
        this.f20524b = aVar;
        this.f20523a = new f0(dVar);
    }

    private boolean f(boolean z10) {
        p3 p3Var = this.f20525c;
        return p3Var == null || p3Var.b() || (!this.f20525c.isReady() && (z10 || this.f20525c.g()));
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f20527f = true;
            if (this.f20528g) {
                this.f20523a.b();
                return;
            }
            return;
        }
        t tVar = (t) k4.a.e(this.f20526d);
        long l10 = tVar.l();
        if (this.f20527f) {
            if (l10 < this.f20523a.l()) {
                this.f20523a.d();
                return;
            }
            this.f20527f = false;
            if (this.f20528g) {
                this.f20523a.b();
            }
        }
        this.f20523a.a(l10);
        f3 e10 = tVar.e();
        if (!e10.equals(this.f20523a.e())) {
            this.f20523a.c(e10);
            this.f20524b.d(e10);
        }
    }

    public void a(p3 p3Var) {
        if (p3Var == this.f20525c) {
            this.f20526d = null;
            this.f20525c = null;
            this.f20527f = true;
        }
    }

    public void b(p3 p3Var) throws q {
        t tVar;
        t w10 = p3Var.w();
        if (w10 != null && w10 != (tVar = this.f20526d)) {
            if (tVar == null) {
                this.f20526d = w10;
                this.f20525c = p3Var;
                w10.c(this.f20523a.e());
                return;
            }
            throw q.h(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(f3 f3Var) {
        t tVar = this.f20526d;
        if (tVar != null) {
            tVar.c(f3Var);
            f3Var = this.f20526d.e();
        }
        this.f20523a.c(f3Var);
    }

    public void d(long j10) {
        this.f20523a.a(j10);
    }

    public f3 e() {
        t tVar = this.f20526d;
        if (tVar != null) {
            return tVar.e();
        }
        return this.f20523a.e();
    }

    public void g() {
        this.f20528g = true;
        this.f20523a.b();
    }

    public void h() {
        this.f20528g = false;
        this.f20523a.d();
    }

    public long i(boolean z10) {
        j(z10);
        return l();
    }

    public long l() {
        if (this.f20527f) {
            return this.f20523a.l();
        }
        return ((t) k4.a.e(this.f20526d)).l();
    }
}
