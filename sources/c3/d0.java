package c3;

import c3.i0;
import java.util.List;
import k4.a;
import k4.a0;
import n2.r1;
import s2.c;
import s2.e0;
import s2.n;

/* compiled from: SeiReader */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<r1> f5656a;

    /* renamed from: b  reason: collision with root package name */
    private final e0[] f5657b;

    public d0(List<r1> list) {
        this.f5656a = list;
        this.f5657b = new e0[list.size()];
    }

    public void a(long j10, a0 a0Var) {
        c.a(j10, a0Var, this.f5657b);
    }

    public void b(n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f5657b.length; i10++) {
            dVar.a();
            e0 e10 = nVar.e(dVar.c(), 3);
            r1 r1Var = this.f5656a.get(i10);
            String str = r1Var.f20654m;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.b(z10, "Invalid closed caption mime type provided: " + str);
            String str2 = r1Var.f20643a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            e10.a(new r1.b().U(str2).g0(str).i0(r1Var.f20646d).X(r1Var.f20645c).H(r1Var.E).V(r1Var.f20656o).G());
            this.f5657b[i10] = e10;
        }
    }
}
