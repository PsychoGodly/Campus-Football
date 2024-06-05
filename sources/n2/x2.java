package n2;

import android.util.Pair;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.n;
import k4.n0;
import o2.u1;
import p3.e0;
import p3.q;
import p3.r;
import p3.s;
import p3.s0;
import p3.t;
import p3.u;
import p3.x;
import r2.p;
import r2.w;

/* compiled from: MediaSourceList */
final class x2 {

    /* renamed from: a  reason: collision with root package name */
    private final u1 f20744a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f20745b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<u, c> f20746c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, c> f20747d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final d f20748e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<c, b> f20749f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<c> f20750g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final o2.a f20751h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final n f20752i;

    /* renamed from: j  reason: collision with root package name */
    private s0 f20753j = new s0.a(0);

    /* renamed from: k  reason: collision with root package name */
    private boolean f20754k;

    /* renamed from: l  reason: collision with root package name */
    private p0 f20755l;

    /* compiled from: MediaSourceList */
    private final class a implements e0, w {

        /* renamed from: a  reason: collision with root package name */
        private final c f20756a;

        public a(c cVar) {
            this.f20756a = cVar;
        }

        private Pair<Integer, x.b> G(int i10, x.b bVar) {
            x.b bVar2 = null;
            if (bVar != null) {
                x.b c10 = x2.n(this.f20756a, bVar);
                if (c10 == null) {
                    return null;
                }
                bVar2 = c10;
            }
            return Pair.create(Integer.valueOf(x2.r(this.f20756a, i10)), bVar2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void H(Pair pair, t tVar) {
            x2.this.f20751h.V(((Integer) pair.first).intValue(), (x.b) pair.second, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void I(Pair pair) {
            x2.this.f20751h.U(((Integer) pair.first).intValue(), (x.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void J(Pair pair) {
            x2.this.f20751h.Z(((Integer) pair.first).intValue(), (x.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void K(Pair pair) {
            x2.this.f20751h.e0(((Integer) pair.first).intValue(), (x.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void L(Pair pair, int i10) {
            x2.this.f20751h.i0(((Integer) pair.first).intValue(), (x.b) pair.second, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void M(Pair pair, Exception exc) {
            x2.this.f20751h.a0(((Integer) pair.first).intValue(), (x.b) pair.second, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            x2.this.f20751h.k0(((Integer) pair.first).intValue(), (x.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void P(Pair pair, q qVar, t tVar) {
            x2.this.f20751h.O(((Integer) pair.first).intValue(), (x.b) pair.second, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void R(Pair pair, q qVar, t tVar) {
            x2.this.f20751h.g0(((Integer) pair.first).intValue(), (x.b) pair.second, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, q qVar, t tVar, IOException iOException, boolean z10) {
            x2.this.f20751h.T(((Integer) pair.first).intValue(), (x.b) pair.second, qVar, tVar, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, q qVar, t tVar) {
            x2.this.f20751h.E(((Integer) pair.first).intValue(), (x.b) pair.second, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair, t tVar) {
            x2.this.f20751h.o0(((Integer) pair.first).intValue(), (x.b) k4.a.e((x.b) pair.second), tVar);
        }

        public void E(int i10, x.b bVar, q qVar, t tVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new t2(this, G, qVar, tVar));
            }
        }

        public void O(int i10, x.b bVar, q qVar, t tVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new v2(this, G, qVar, tVar));
            }
        }

        public void T(int i10, x.b bVar, q qVar, t tVar, IOException iOException, boolean z10) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new w2(this, G, qVar, tVar, iOException, z10));
            }
        }

        public void U(int i10, x.b bVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new o2(this, G));
            }
        }

        public void V(int i10, x.b bVar, t tVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new m2(this, G, tVar));
            }
        }

        public void Z(int i10, x.b bVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new p2(this, G));
            }
        }

        public void a0(int i10, x.b bVar, Exception exc) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new s2(this, G, exc));
            }
        }

        public void e0(int i10, x.b bVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new q2(this, G));
            }
        }

        public void g0(int i10, x.b bVar, q qVar, t tVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new u2(this, G, qVar, tVar));
            }
        }

        public void i0(int i10, x.b bVar, int i11) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new r2(this, G, i11));
            }
        }

        public void k0(int i10, x.b bVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new l2(this, G));
            }
        }

        public /* synthetic */ void m0(int i10, x.b bVar) {
            p.a(this, i10, bVar);
        }

        public void o0(int i10, x.b bVar, t tVar) {
            Pair<Integer, x.b> G = G(i10, bVar);
            if (G != null) {
                x2.this.f20752i.b(new n2(this, G, tVar));
            }
        }
    }

    /* compiled from: MediaSourceList */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final x f20758a;

        /* renamed from: b  reason: collision with root package name */
        public final x.c f20759b;

        /* renamed from: c  reason: collision with root package name */
        public final a f20760c;

        public b(x xVar, x.c cVar, a aVar) {
            this.f20758a = xVar;
            this.f20759b = cVar;
            this.f20760c = aVar;
        }
    }

    /* compiled from: MediaSourceList */
    static final class c implements j2 {

        /* renamed from: a  reason: collision with root package name */
        public final s f20761a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20762b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<x.b> f20763c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f20764d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20765e;

        public c(x xVar, boolean z10) {
            this.f20761a = new s(xVar, z10);
        }

        public c4 a() {
            return this.f20761a.c0();
        }

        public void b(int i10) {
            this.f20764d = i10;
            this.f20765e = false;
            this.f20763c.clear();
        }

        public Object c() {
            return this.f20762b;
        }
    }

    /* compiled from: MediaSourceList */
    public interface d {
        void c();
    }

    public x2(d dVar, o2.a aVar, n nVar, u1 u1Var) {
        this.f20744a = u1Var;
        this.f20748e = dVar;
        this.f20751h = aVar;
        this.f20752i = nVar;
        this.f20749f = new HashMap<>();
        this.f20750g = new HashSet();
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f20745b.remove(i12);
            this.f20747d.remove(remove.f20762b);
            g(i12, -remove.f20761a.c0().t());
            remove.f20765e = true;
            if (this.f20754k) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f20745b.size()) {
            this.f20745b.get(i10).f20764d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f20749f.get(cVar);
        if (bVar != null) {
            bVar.f20758a.r(bVar.f20759b);
        }
    }

    private void k() {
        Iterator<c> it = this.f20750g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f20763c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f20750g.add(cVar);
        b bVar = this.f20749f.get(cVar);
        if (bVar != null) {
            bVar.f20758a.d(bVar.f20759b);
        }
    }

    private static Object m(Object obj) {
        return a.z(obj);
    }

    /* access modifiers changed from: private */
    public static x.b n(c cVar, x.b bVar) {
        for (int i10 = 0; i10 < cVar.f20763c.size(); i10++) {
            if (cVar.f20763c.get(i10).f21680d == bVar.f21680d) {
                return bVar.c(p(cVar, bVar.f21677a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return a.A(obj);
    }

    private static Object p(c cVar, Object obj) {
        return a.C(cVar.f20762b, obj);
    }

    /* access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f20764d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(x xVar, c4 c4Var) {
        this.f20748e.c();
    }

    private void u(c cVar) {
        if (cVar.f20765e && cVar.f20763c.isEmpty()) {
            b bVar = (b) k4.a.e(this.f20749f.remove(cVar));
            bVar.f20758a.n(bVar.f20759b);
            bVar.f20758a.m(bVar.f20760c);
            bVar.f20758a.s(bVar.f20760c);
            this.f20750g.remove(cVar);
        }
    }

    private void x(c cVar) {
        s sVar = cVar.f20761a;
        k2 k2Var = new k2(this);
        a aVar = new a(cVar);
        this.f20749f.put(cVar, new b(sVar, k2Var, aVar));
        sVar.q(n0.y(), aVar);
        sVar.p(n0.y(), aVar);
        sVar.c(k2Var, this.f20755l, this.f20744a);
    }

    public c4 A(int i10, int i11, s0 s0Var) {
        k4.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f20753j = s0Var;
        B(i10, i11);
        return i();
    }

    public c4 C(List<c> list, s0 s0Var) {
        B(0, this.f20745b.size());
        return f(this.f20745b.size(), list, s0Var);
    }

    public c4 D(s0 s0Var) {
        int q10 = q();
        if (s0Var.b() != q10) {
            s0Var = s0Var.i().g(0, q10);
        }
        this.f20753j = s0Var;
        return i();
    }

    public c4 f(int i10, List<c> list, s0 s0Var) {
        if (!list.isEmpty()) {
            this.f20753j = s0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f20745b.get(i11 - 1);
                    cVar.b(cVar2.f20764d + cVar2.f20761a.c0().t());
                } else {
                    cVar.b(0);
                }
                g(i11, cVar.f20761a.c0().t());
                this.f20745b.add(i11, cVar);
                this.f20747d.put(cVar.f20762b, cVar);
                if (this.f20754k) {
                    x(cVar);
                    if (this.f20746c.isEmpty()) {
                        this.f20750g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public u h(x.b bVar, j4.b bVar2, long j10) {
        Object o10 = o(bVar.f21677a);
        x.b c10 = bVar.c(m(bVar.f21677a));
        c cVar = (c) k4.a.e(this.f20747d.get(o10));
        l(cVar);
        cVar.f20763c.add(c10);
        r Z = cVar.f20761a.a(c10, bVar2, j10);
        this.f20746c.put(Z, cVar);
        k();
        return Z;
    }

    public c4 i() {
        if (this.f20745b.isEmpty()) {
            return c4.f20205a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20745b.size(); i11++) {
            c cVar = this.f20745b.get(i11);
            cVar.f20764d = i10;
            i10 += cVar.f20761a.c0().t();
        }
        return new l3(this.f20745b, this.f20753j);
    }

    public int q() {
        return this.f20745b.size();
    }

    public boolean s() {
        return this.f20754k;
    }

    public c4 v(int i10, int i11, int i12, s0 s0Var) {
        k4.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f20753j = s0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f20745b.get(min).f20764d;
        n0.B0(this.f20745b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f20745b.get(min);
            cVar.f20764d = i13;
            i13 += cVar.f20761a.c0().t();
            min++;
        }
        return i();
    }

    public void w(p0 p0Var) {
        k4.a.f(!this.f20754k);
        this.f20755l = p0Var;
        for (int i10 = 0; i10 < this.f20745b.size(); i10++) {
            c cVar = this.f20745b.get(i10);
            x(cVar);
            this.f20750g.add(cVar);
        }
        this.f20754k = true;
    }

    public void y() {
        for (b next : this.f20749f.values()) {
            try {
                next.f20758a.n(next.f20759b);
            } catch (RuntimeException e10) {
                k4.r.d("MediaSourceList", "Failed to release child source.", e10);
            }
            next.f20758a.m(next.f20760c);
            next.f20758a.s(next.f20760c);
        }
        this.f20749f.clear();
        this.f20750g.clear();
        this.f20754k = false;
    }

    public void z(u uVar) {
        c cVar = (c) k4.a.e(this.f20746c.remove(uVar));
        cVar.f20761a.b(uVar);
        cVar.f20763c.remove(((r) uVar).f21618a);
        if (!this.f20746c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
