package o2;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import k4.d;
import k4.l;
import k4.n;
import k4.n0;
import k4.q;
import l4.z;
import n2.c3;
import n2.c4;
import n2.e2;
import n2.f3;
import n2.g3;
import n2.h4;
import n2.o;
import n2.r1;
import n2.z1;
import o2.c;
import p3.t;
import p3.x;
import q2.e;
import q2.i;
import r2.p;
import r6.k;
import s6.b0;
import s6.u;
import s6.v;
import y3.b;

/* compiled from: DefaultAnalyticsCollector */
public class p1 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d f21003a;

    /* renamed from: b  reason: collision with root package name */
    private final c4.b f21004b;

    /* renamed from: c  reason: collision with root package name */
    private final c4.d f21005c = new c4.d();

    /* renamed from: d  reason: collision with root package name */
    private final a f21006d;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<c.a> f21007f;

    /* renamed from: g  reason: collision with root package name */
    private q<c> f21008g;

    /* renamed from: h  reason: collision with root package name */
    private g3 f21009h;

    /* renamed from: i  reason: collision with root package name */
    private n f21010i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f21011j;

    /* compiled from: DefaultAnalyticsCollector */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c4.b f21012a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public u<x.b> f21013b = u.y();

        /* renamed from: c  reason: collision with root package name */
        private v<x.b, c4> f21014c = v.k();

        /* renamed from: d  reason: collision with root package name */
        private x.b f21015d;

        /* renamed from: e  reason: collision with root package name */
        private x.b f21016e;

        /* renamed from: f  reason: collision with root package name */
        private x.b f21017f;

        public a(c4.b bVar) {
            this.f21012a = bVar;
        }

        private void b(v.a<x.b, c4> aVar, x.b bVar, c4 c4Var) {
            if (bVar != null) {
                if (c4Var.f(bVar.f21677a) != -1) {
                    aVar.f(bVar, c4Var);
                    return;
                }
                c4 c4Var2 = this.f21014c.get(bVar);
                if (c4Var2 != null) {
                    aVar.f(bVar, c4Var2);
                }
            }
        }

        private static x.b c(g3 g3Var, u<x.b> uVar, x.b bVar, c4.b bVar2) {
            c4 J = g3Var.J();
            int p10 = g3Var.p();
            Object q10 = J.u() ? null : J.q(p10);
            int g10 = (g3Var.i() || J.u()) ? -1 : J.j(p10, bVar2).g(n0.C0(g3Var.getCurrentPosition()) - bVar2.q());
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                x.b bVar3 = uVar.get(i10);
                if (i(bVar3, q10, g3Var.i(), g3Var.F(), g3Var.s(), g10)) {
                    return bVar3;
                }
            }
            if (uVar.isEmpty() && bVar != null) {
                if (i(bVar, q10, g3Var.i(), g3Var.F(), g3Var.s(), g10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(x.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f21677a.equals(obj)) {
                return false;
            }
            if ((z10 && bVar.f21678b == i10 && bVar.f21679c == i11) || (!z10 && bVar.f21678b == -1 && bVar.f21681e == i12)) {
                return true;
            }
            return false;
        }

        private void m(c4 c4Var) {
            v.a a10 = v.a();
            if (this.f21013b.isEmpty()) {
                b(a10, this.f21016e, c4Var);
                if (!k.a(this.f21017f, this.f21016e)) {
                    b(a10, this.f21017f, c4Var);
                }
                if (!k.a(this.f21015d, this.f21016e) && !k.a(this.f21015d, this.f21017f)) {
                    b(a10, this.f21015d, c4Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f21013b.size(); i10++) {
                    b(a10, this.f21013b.get(i10), c4Var);
                }
                if (!this.f21013b.contains(this.f21015d)) {
                    b(a10, this.f21015d, c4Var);
                }
            }
            this.f21014c = a10.c();
        }

        public x.b d() {
            return this.f21015d;
        }

        public x.b e() {
            if (this.f21013b.isEmpty()) {
                return null;
            }
            return (x.b) b0.d(this.f21013b);
        }

        public c4 f(x.b bVar) {
            return this.f21014c.get(bVar);
        }

        public x.b g() {
            return this.f21016e;
        }

        public x.b h() {
            return this.f21017f;
        }

        public void j(g3 g3Var) {
            this.f21015d = c(g3Var, this.f21013b, this.f21016e, this.f21012a);
        }

        public void k(List<x.b> list, x.b bVar, g3 g3Var) {
            this.f21013b = u.u(list);
            if (!list.isEmpty()) {
                this.f21016e = list.get(0);
                this.f21017f = (x.b) k4.a.e(bVar);
            }
            if (this.f21015d == null) {
                this.f21015d = c(g3Var, this.f21013b, this.f21016e, this.f21012a);
            }
            m(g3Var.J());
        }

        public void l(g3 g3Var) {
            this.f21015d = c(g3Var, this.f21013b, this.f21016e, this.f21012a);
            m(g3Var.J());
        }
    }

    public p1(d dVar) {
        this.f21003a = (d) k4.a.e(dVar);
        this.f21008g = new q<>(n0.Q(), dVar, k1.f36647a);
        c4.b bVar = new c4.b();
        this.f21004b = bVar;
        this.f21006d = new a(bVar);
        this.f21007f = new SparseArray<>();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void A2(c.a aVar, int i10, g3.e eVar, g3.e eVar2, c cVar) {
        cVar.l0(aVar, i10);
        cVar.e(aVar, eVar, eVar2, i10);
    }

    private c.a E1(x.b bVar) {
        c4 c4Var;
        k4.a.e(this.f21009h);
        if (bVar == null) {
            c4Var = null;
        } else {
            c4Var = this.f21006d.f(bVar);
        }
        if (bVar != null && c4Var != null) {
            return D1(c4Var, c4Var.l(bVar.f21677a, this.f21004b).f20218c, bVar);
        }
        int G = this.f21009h.G();
        c4 J = this.f21009h.J();
        if (!(G < J.t())) {
            J = c4.f20205a;
        }
        return D1(J, G, (x.b) null);
    }

    private c.a F1() {
        return E1(this.f21006d.e());
    }

    private c.a G1(int i10, x.b bVar) {
        k4.a.e(this.f21009h);
        boolean z10 = true;
        if (bVar != null) {
            if (this.f21006d.f(bVar) == null) {
                z10 = false;
            }
            if (z10) {
                return E1(bVar);
            }
            return D1(c4.f20205a, i10, bVar);
        }
        c4 J = this.f21009h.J();
        if (i10 >= J.t()) {
            z10 = false;
        }
        if (!z10) {
            J = c4.f20205a;
        }
        return D1(J, i10, (x.b) null);
    }

    private c.a H1() {
        return E1(this.f21006d.g());
    }

    private c.a I1() {
        return E1(this.f21006d.h());
    }

    private c.a J1(c3 c3Var) {
        p3.v vVar;
        if (!(c3Var instanceof n2.q) || (vVar = ((n2.q) c3Var).f20624o) == null) {
            return C1();
        }
        return E1(new x.b(vVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K1(c cVar, l lVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L2(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.u0(aVar, str, j10);
        long j12 = j10;
        cVar.B(aVar, str, j11, j12);
        cVar.S(aVar, 2, str, j12);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N2(c.a aVar, e eVar, c cVar) {
        cVar.i(aVar, eVar);
        cVar.b0(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void O1(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.x0(aVar, str, j10);
        long j12 = j10;
        cVar.y(aVar, str, j11, j12);
        cVar.S(aVar, 1, str, j12);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void O2(c.a aVar, e eVar, c cVar) {
        cVar.H(aVar, eVar);
        cVar.f0(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q1(c.a aVar, e eVar, c cVar) {
        cVar.s(aVar, eVar);
        cVar.b0(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q2(c.a aVar, r1 r1Var, i iVar, c cVar) {
        cVar.h(aVar, r1Var);
        cVar.a(aVar, r1Var, iVar);
        cVar.s0(aVar, 2, r1Var);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void R1(c.a aVar, e eVar, c cVar) {
        cVar.j0(aVar, eVar);
        cVar.f0(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void R2(c.a aVar, z zVar, c cVar) {
        cVar.I(aVar, zVar);
        cVar.c(aVar, zVar.f20004a, zVar.f20005b, zVar.f20006c, zVar.f20007d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void S1(c.a aVar, r1 r1Var, i iVar, c cVar) {
        cVar.z(aVar, r1Var);
        cVar.g0(aVar, r1Var, iVar);
        cVar.s0(aVar, 1, r1Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U2(g3 g3Var, c cVar, l lVar) {
        cVar.v0(g3Var, new c.b(lVar, this.f21007f));
    }

    /* access modifiers changed from: private */
    public void V2() {
        c.a C1 = C1();
        W2(C1, 1028, new z(C1));
        this.f21008g.j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g2(c.a aVar, int i10, c cVar) {
        cVar.k(aVar);
        cVar.T(aVar, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k2(c.a aVar, boolean z10, c cVar) {
        cVar.d0(aVar, z10);
        cVar.o0(aVar, z10);
    }

    public final void A(g3.e eVar, g3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f21011j = false;
        }
        this.f21006d.j((g3) k4.a.e(this.f21009h));
        c.a C1 = C1();
        W2(C1, 11, new m(C1, i10, eVar, eVar2));
    }

    public void B(boolean z10) {
    }

    public void C(int i10) {
    }

    /* access modifiers changed from: protected */
    public final c.a C1() {
        return E1(this.f21006d.d());
    }

    public void D(e2 e2Var) {
        c.a C1 = C1();
        W2(C1, 14, new i0(C1, e2Var));
    }

    /* access modifiers changed from: protected */
    public final c.a D1(c4 c4Var, int i10, x.b bVar) {
        long j10;
        c4 c4Var2 = c4Var;
        int i11 = i10;
        x.b bVar2 = c4Var.u() ? null : bVar;
        long b10 = this.f21003a.b();
        boolean z10 = true;
        boolean z11 = c4Var2.equals(this.f21009h.J()) && i11 == this.f21009h.G();
        long j11 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (!(z11 && this.f21009h.F() == bVar2.f21678b && this.f21009h.s() == bVar2.f21679c)) {
                z10 = false;
            }
            if (z10) {
                j11 = this.f21009h.getCurrentPosition();
            }
        } else if (z11) {
            j10 = this.f21009h.x();
            return new c.a(b10, c4Var, i10, bVar2, j10, this.f21009h.J(), this.f21009h.G(), this.f21006d.d(), this.f21009h.getCurrentPosition(), this.f21009h.j());
        } else if (!c4Var.u()) {
            j11 = c4Var2.r(i11, this.f21005c).d();
        }
        j10 = j11;
        return new c.a(b10, c4Var, i10, bVar2, j10, this.f21009h.J(), this.f21009h.G(), this.f21006d.d(), this.f21009h.getCurrentPosition(), this.f21009h.j());
    }

    public final void E(int i10, x.b bVar, p3.q qVar, t tVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1000, new s0(G1, qVar, tVar));
    }

    public final void F(List<x.b> list, x.b bVar) {
        this.f21006d.k(list, bVar, (g3) k4.a.e(this.f21009h));
    }

    public void G(o oVar) {
        c.a C1 = C1();
        W2(C1, 29, new e0(C1, oVar));
    }

    public final void H(boolean z10) {
        c.a C1 = C1();
        W2(C1, 3, new f1(C1, z10));
    }

    public final void I() {
        c.a C1 = C1();
        W2(C1, -1, new v0(C1));
    }

    public void J(h4 h4Var) {
        c.a C1 = C1();
        W2(C1, 2, new o0(C1, h4Var));
    }

    public final void K(c4 c4Var, int i10) {
        this.f21006d.l((g3) k4.a.e(this.f21009h));
        c.a C1 = C1();
        W2(C1, 0, new h(C1, i10));
    }

    public final void L(float f10) {
        c.a I1 = I1();
        W2(I1, 22, new n1(I1, f10));
    }

    public final void M(int i10) {
        c.a C1 = C1();
        W2(C1, 4, new f(C1, i10));
    }

    public void N(g3.b bVar) {
        c.a C1 = C1();
        W2(C1, 13, new n0(C1, bVar));
    }

    public final void O(int i10, x.b bVar, p3.q qVar, t tVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new r0(G1, qVar, tVar));
    }

    public final void P(int i10, long j10, long j11) {
        c.a F1 = F1();
        W2(F1, 1006, new k(F1, i10, j10, j11));
    }

    public final void Q() {
        if (!this.f21011j) {
            c.a C1 = C1();
            this.f21011j = true;
            W2(C1, -1, new m1(C1));
        }
    }

    public final void R(boolean z10) {
        c.a C1 = C1();
        W2(C1, 9, new d1(C1, z10));
    }

    public void S(g3 g3Var, Looper looper) {
        k4.a.f(this.f21009h == null || this.f21006d.f21013b.isEmpty());
        this.f21009h = (g3) k4.a.e(g3Var);
        this.f21010i = this.f21003a.d(looper, (Handler.Callback) null);
        this.f21008g = this.f21008g.e(looper, new j1(this, g3Var));
    }

    public final void T(int i10, x.b bVar, p3.q qVar, t tVar, IOException iOException, boolean z10) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1003, new t0(G1, qVar, tVar, iOException, z10));
    }

    public final void U(int i10, x.b bVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1023, new k0(G1));
    }

    public final void V(int i10, x.b bVar, t tVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1004, new u0(G1, tVar));
    }

    public void W(int i10, boolean z10) {
        c.a C1 = C1();
        W2(C1, 30, new n(C1, i10, z10));
    }

    /* access modifiers changed from: protected */
    public final void W2(c.a aVar, int i10, q.a<c> aVar2) {
        this.f21007f.put(i10, aVar);
        this.f21008g.k(i10, aVar2);
    }

    public final void X(boolean z10, int i10) {
        c.a C1 = C1();
        W2(C1, -1, new i1(C1, z10, i10));
    }

    public final void Y(z1 z1Var, int i10) {
        c.a C1 = C1();
        W2(C1, 1, new h0(C1, z1Var, i10));
    }

    public final void Z(int i10, x.b bVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1026, new g1(G1));
    }

    public final void a(boolean z10) {
        c.a I1 = I1();
        W2(I1, 23, new e1(I1, z10));
    }

    public final void a0(int i10, x.b bVar, Exception exc) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1024, new v(G1, exc));
    }

    public final void b(Exception exc) {
        c.a I1 = I1();
        W2(I1, 1014, new u(I1, exc));
    }

    public void b0() {
    }

    public final void c(String str) {
        c.a I1 = I1();
        W2(I1, 1019, new x(I1, str));
    }

    public final void c0(p2.e eVar) {
        c.a I1 = I1();
        W2(I1, 20, new p0(I1, eVar));
    }

    public final void d(f3 f3Var) {
        c.a C1 = C1();
        W2(C1, 12, new m0(C1, f3Var));
    }

    public final void d0(boolean z10, int i10) {
        c.a C1 = C1();
        W2(C1, 5, new h1(C1, z10, i10));
    }

    public final void e(String str, long j10, long j11) {
        c.a I1 = I1();
        W2(I1, 1016, new b0(I1, str, j11, j10));
    }

    public final void e0(int i10, x.b bVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1025, new l1(G1));
    }

    public final void f(r1 r1Var, i iVar) {
        c.a I1 = I1();
        W2(I1, 1009, new g0(I1, r1Var, iVar));
    }

    public void f0(g3 g3Var, g3.c cVar) {
    }

    public final void g(e eVar) {
        c.a I1 = I1();
        W2(I1, 1015, new a1(I1, eVar));
    }

    public final void g0(int i10, x.b bVar, p3.q qVar, t tVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, AdError.NO_FILL_ERROR_CODE, new q0(G1, qVar, tVar));
    }

    public final void h(r1 r1Var, i iVar) {
        c.a I1 = I1();
        W2(I1, 1017, new f0(I1, r1Var, iVar));
    }

    public final void h0(int i10, int i11) {
        c.a I1 = I1();
        W2(I1, 24, new i(I1, i10, i11));
    }

    public final void i(String str) {
        c.a I1 = I1();
        W2(I1, 1012, new y(I1, str));
    }

    public final void i0(int i10, x.b bVar, int i11) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1022, new e(G1, i11));
    }

    public final void j(String str, long j10, long j11) {
        c.a I1 = I1();
        W2(I1, 1008, new a0(I1, str, j11, j10));
    }

    public final void j0(c3 c3Var) {
        c.a J1 = J1(c3Var);
        W2(J1, 10, new j0(J1, c3Var));
    }

    public final void k(int i10, long j10) {
        c.a H1 = H1();
        W2(H1, 1018, new j(H1, i10, j10));
    }

    public final void k0(int i10, x.b bVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1027, new o(G1));
    }

    public final void l(e eVar) {
        c.a I1 = I1();
        W2(I1, 1007, new z0(I1, eVar));
    }

    public void l0(c3 c3Var) {
        c.a J1 = J1(c3Var);
        W2(J1, 10, new l0(J1, c3Var));
    }

    public final void m(Object obj, long j10) {
        c.a I1 = I1();
        W2(I1, 26, new w(I1, obj, j10));
    }

    public /* synthetic */ void m0(int i10, x.b bVar) {
        p.a(this, i10, bVar);
    }

    public final void n(f3.a aVar) {
        c.a C1 = C1();
        W2(C1, 28, new r(C1, aVar));
    }

    public void n0(c cVar) {
        k4.a.e(cVar);
        this.f21008g.c(cVar);
    }

    public final void o(e eVar) {
        c.a H1 = H1();
        W2(H1, 1013, new y0(H1, eVar));
    }

    public final void o0(int i10, x.b bVar, t tVar) {
        c.a G1 = G1(i10, bVar);
        W2(G1, 1005, new w0(G1, tVar));
    }

    public final void p(int i10) {
        c.a C1 = C1();
        W2(C1, 8, new o1(C1, i10));
    }

    public void p0(boolean z10) {
        c.a C1 = C1();
        W2(C1, 7, new c1(C1, z10));
    }

    public void q(List<b> list) {
        c.a C1 = C1();
        W2(C1, 27, new c0(C1, list));
    }

    public final void r(long j10) {
        c.a I1 = I1();
        W2(I1, 1010, new p(I1, j10));
    }

    public void release() {
        ((n) k4.a.h(this.f21010i)).b(new d(this));
    }

    public final void s(z zVar) {
        c.a I1 = I1();
        W2(I1, 25, new d0(I1, zVar));
    }

    public final void t(Exception exc) {
        c.a I1 = I1();
        W2(I1, 1029, new s(I1, exc));
    }

    public void u(y3.e eVar) {
        c.a C1 = C1();
        W2(C1, 27, new b1(C1, eVar));
    }

    public final void v(Exception exc) {
        c.a I1 = I1();
        W2(I1, 1030, new t(I1, exc));
    }

    public final void w(e eVar) {
        c.a H1 = H1();
        W2(H1, 1020, new x0(H1, eVar));
    }

    public final void x(int i10, long j10, long j11) {
        c.a I1 = I1();
        W2(I1, 1011, new l(I1, i10, j10, j11));
    }

    public final void y(long j10, int i10) {
        c.a H1 = H1();
        W2(H1, 1021, new q(H1, j10, i10));
    }

    public final void z(int i10) {
        c.a C1 = C1();
        W2(C1, 6, new g(C1, i10));
    }
}
