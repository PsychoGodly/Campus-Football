package o2;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import k4.l;
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
import p3.q;
import p3.t;
import p3.x;
import q2.e;
import q2.i;
import r6.k;

/* compiled from: AnalyticsListener */
public interface c {

    /* compiled from: AnalyticsListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f20991a;

        /* renamed from: b  reason: collision with root package name */
        public final c4 f20992b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20993c;

        /* renamed from: d  reason: collision with root package name */
        public final x.b f20994d;

        /* renamed from: e  reason: collision with root package name */
        public final long f20995e;

        /* renamed from: f  reason: collision with root package name */
        public final c4 f20996f;

        /* renamed from: g  reason: collision with root package name */
        public final int f20997g;

        /* renamed from: h  reason: collision with root package name */
        public final x.b f20998h;

        /* renamed from: i  reason: collision with root package name */
        public final long f20999i;

        /* renamed from: j  reason: collision with root package name */
        public final long f21000j;

        public a(long j10, c4 c4Var, int i10, x.b bVar, long j11, c4 c4Var2, int i11, x.b bVar2, long j12, long j13) {
            this.f20991a = j10;
            this.f20992b = c4Var;
            this.f20993c = i10;
            this.f20994d = bVar;
            this.f20995e = j11;
            this.f20996f = c4Var2;
            this.f20997g = i11;
            this.f20998h = bVar2;
            this.f20999i = j12;
            this.f21000j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20991a == aVar.f20991a && this.f20993c == aVar.f20993c && this.f20995e == aVar.f20995e && this.f20997g == aVar.f20997g && this.f20999i == aVar.f20999i && this.f21000j == aVar.f21000j && k.a(this.f20992b, aVar.f20992b) && k.a(this.f20994d, aVar.f20994d) && k.a(this.f20996f, aVar.f20996f) && k.a(this.f20998h, aVar.f20998h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f20991a), this.f20992b, Integer.valueOf(this.f20993c), this.f20994d, Long.valueOf(this.f20995e), this.f20996f, Integer.valueOf(this.f20997g), this.f20998h, Long.valueOf(this.f20999i), Long.valueOf(this.f21000j));
        }
    }

    /* compiled from: AnalyticsListener */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final l f21001a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f21002b;

        public b(l lVar, SparseArray<a> sparseArray) {
            this.f21001a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.c());
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                int b10 = lVar.b(i10);
                sparseArray2.append(b10, (a) k4.a.e(sparseArray.get(b10)));
            }
            this.f21002b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f21001a.a(i10);
        }

        public int b(int i10) {
            return this.f21001a.b(i10);
        }

        public a c(int i10) {
            return (a) k4.a.e(this.f21002b.get(i10));
        }

        public int d() {
            return this.f21001a.c();
        }
    }

    void A(a aVar, int i10);

    void B(a aVar, String str, long j10, long j11);

    void C(a aVar, float f10);

    void D(a aVar, Object obj, long j10);

    void F(a aVar, Exception exc);

    void G(a aVar, t tVar);

    void H(a aVar, e eVar);

    void I(a aVar, z zVar);

    void J(a aVar, boolean z10);

    void K(a aVar, int i10);

    void L(a aVar, long j10);

    void M(a aVar, z1 z1Var, int i10);

    void N(a aVar, boolean z10, int i10);

    void O(a aVar, p2.e eVar);

    void P(a aVar, int i10, long j10);

    void Q(a aVar, int i10, long j10, long j11);

    void R(a aVar, q qVar, t tVar);

    @Deprecated
    void S(a aVar, int i10, String str, long j10);

    void T(a aVar, int i10);

    void U(a aVar, int i10, int i11);

    void V(a aVar, q qVar, t tVar);

    void X(a aVar, int i10, long j10, long j11);

    void Y(a aVar, c3 c3Var);

    void Z(a aVar, c3 c3Var);

    void a(a aVar, r1 r1Var, i iVar);

    void a0(a aVar, Exception exc);

    void b(a aVar, int i10, boolean z10);

    @Deprecated
    void b0(a aVar, int i10, e eVar);

    @Deprecated
    void c(a aVar, int i10, int i11, int i12, float f10);

    @Deprecated
    void c0(a aVar, boolean z10, int i10);

    void d(a aVar);

    @Deprecated
    void d0(a aVar, boolean z10);

    void e(a aVar, g3.e eVar, g3.e eVar2, int i10);

    void e0(a aVar, int i10);

    void f(a aVar);

    @Deprecated
    void f0(a aVar, int i10, e eVar);

    void g(a aVar, Exception exc);

    void g0(a aVar, r1 r1Var, i iVar);

    @Deprecated
    void h(a aVar, r1 r1Var);

    void h0(a aVar, f3 f3Var);

    void i(a aVar, e eVar);

    void i0(a aVar, h4 h4Var);

    void j(a aVar, long j10, int i10);

    void j0(a aVar, e eVar);

    @Deprecated
    void k(a aVar);

    @Deprecated
    void k0(a aVar);

    void l(a aVar, String str);

    @Deprecated
    void l0(a aVar, int i10);

    void m(a aVar);

    @Deprecated
    void m0(a aVar);

    void n(a aVar, g3.b bVar);

    void n0(a aVar, boolean z10);

    void o(a aVar, int i10);

    void o0(a aVar, boolean z10);

    void p(a aVar, boolean z10);

    void q(a aVar);

    void q0(a aVar, q qVar, t tVar, IOException iOException, boolean z10);

    void r(a aVar, String str);

    void r0(a aVar, t tVar);

    void s(a aVar, e eVar);

    @Deprecated
    void s0(a aVar, int i10, r1 r1Var);

    @Deprecated
    void t0(a aVar, List<y3.b> list);

    void u(a aVar, q qVar, t tVar);

    @Deprecated
    void u0(a aVar, String str, long j10);

    void v(a aVar, e2 e2Var);

    void v0(g3 g3Var, b bVar);

    void w(a aVar);

    void w0(a aVar, o oVar);

    void x(a aVar, f3.a aVar2);

    @Deprecated
    void x0(a aVar, String str, long j10);

    void y(a aVar, String str, long j10, long j11);

    void y0(a aVar, y3.e eVar);

    @Deprecated
    void z(a aVar, r1 r1Var);

    void z0(a aVar, Exception exc);
}
