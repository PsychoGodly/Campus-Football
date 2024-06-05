package c3;

import c3.i0;
import k4.a;
import k4.a0;
import k4.j0;
import k4.n0;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: PassthroughSectionPayloadReader */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private r1 f5953a;

    /* renamed from: b  reason: collision with root package name */
    private j0 f5954b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f5955c;

    public v(String str) {
        this.f5953a = new r1.b().g0(str).G();
    }

    private void b() {
        a.h(this.f5954b);
        n0.j(this.f5955c);
    }

    public void a(j0 j0Var, n nVar, i0.d dVar) {
        this.f5954b = j0Var;
        dVar.a();
        e0 e10 = nVar.e(dVar.c(), 5);
        this.f5955c = e10;
        e10.a(this.f5953a);
    }

    public void c(a0 a0Var) {
        b();
        long d10 = this.f5954b.d();
        long e10 = this.f5954b.e();
        if (d10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            r1 r1Var = this.f5953a;
            if (e10 != r1Var.f20658q) {
                r1 G = r1Var.b().k0(e10).G();
                this.f5953a = G;
                this.f5955c.a(G);
            }
            int a10 = a0Var.a();
            this.f5955c.d(a0Var, a10);
            this.f5955c.b(d10, 1, a10, 0, (e0.a) null);
        }
    }
}
