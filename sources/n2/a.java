package n2;

import android.util.Pair;
import n2.c4;
import p3.s0;

/* compiled from: AbstractConcatenatedTimeline */
public abstract class a extends c4 {

    /* renamed from: g  reason: collision with root package name */
    private final int f20126g;

    /* renamed from: h  reason: collision with root package name */
    private final s0 f20127h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f20128i;

    public a(boolean z10, s0 s0Var) {
        this.f20128i = z10;
        this.f20127h = s0Var;
        this.f20126g = s0Var.b();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int F(int i10, boolean z10) {
        if (z10) {
            return this.f20127h.f(i10);
        }
        if (i10 < this.f20126g - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f20127h.e(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object z(Object obj) {
        return ((Pair) obj).second;
    }

    /* access modifiers changed from: protected */
    public abstract Object B(int i10);

    /* access modifiers changed from: protected */
    public abstract int D(int i10);

    /* access modifiers changed from: protected */
    public abstract int E(int i10);

    /* access modifiers changed from: protected */
    public abstract c4 H(int i10);

    public int e(boolean z10) {
        if (this.f20126g == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f20128i) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f20127h.d();
        }
        while (H(i10).u()) {
            i10 = F(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return E(i10) + H(i10).e(z10);
    }

    public final int f(Object obj) {
        int f10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object A = A(obj);
        Object z10 = z(obj);
        int w10 = w(A);
        if (w10 == -1 || (f10 = H(w10).f(z10)) == -1) {
            return -1;
        }
        return D(w10) + f10;
    }

    public int g(boolean z10) {
        int i10 = this.f20126g;
        if (i10 == 0) {
            return -1;
        }
        if (this.f20128i) {
            z10 = false;
        }
        int h10 = z10 ? this.f20127h.h() : i10 - 1;
        while (H(h10).u()) {
            h10 = G(h10, z10);
            if (h10 == -1) {
                return -1;
            }
        }
        return E(h10) + H(h10).g(z10);
    }

    public int i(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f20128i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int y10 = y(i10);
        int E = E(y10);
        c4 H = H(y10);
        int i13 = i10 - E;
        if (i11 != 2) {
            i12 = i11;
        }
        int i14 = H.i(i13, i12, z10);
        if (i14 != -1) {
            return E + i14;
        }
        int F = F(y10, z10);
        while (F != -1 && H(F).u()) {
            F = F(F, z10);
        }
        if (F != -1) {
            return E(F) + H(F).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    public final c4.b k(int i10, c4.b bVar, boolean z10) {
        int x10 = x(i10);
        int E = E(x10);
        H(x10).k(i10 - D(x10), bVar, z10);
        bVar.f20218c += E;
        if (z10) {
            bVar.f20217b = C(B(x10), k4.a.e(bVar.f20217b));
        }
        return bVar;
    }

    public final c4.b l(Object obj, c4.b bVar) {
        Object A = A(obj);
        Object z10 = z(obj);
        int w10 = w(A);
        int E = E(w10);
        H(w10).l(z10, bVar);
        bVar.f20218c += E;
        bVar.f20217b = obj;
        return bVar;
    }

    public int p(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f20128i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int y10 = y(i10);
        int E = E(y10);
        c4 H = H(y10);
        int i13 = i10 - E;
        if (i11 != 2) {
            i12 = i11;
        }
        int p10 = H.p(i13, i12, z10);
        if (p10 != -1) {
            return E + p10;
        }
        int G = G(y10, z10);
        while (G != -1 && H(G).u()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return E(G) + H(G).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    public final Object q(int i10) {
        int x10 = x(i10);
        return C(B(x10), H(x10).q(i10 - D(x10)));
    }

    public final c4.d s(int i10, c4.d dVar, long j10) {
        int y10 = y(i10);
        int E = E(y10);
        int D = D(y10);
        H(y10).s(i10 - E, dVar, j10);
        Object B = B(y10);
        if (!c4.d.f20227s.equals(dVar.f20235a)) {
            B = C(B, dVar.f20235a);
        }
        dVar.f20235a = B;
        dVar.f20249p += D;
        dVar.f20250q += D;
        return dVar;
    }

    /* access modifiers changed from: protected */
    public abstract int w(Object obj);

    /* access modifiers changed from: protected */
    public abstract int x(int i10);

    /* access modifiers changed from: protected */
    public abstract int y(int i10);
}
