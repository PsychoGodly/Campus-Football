package p3;

import android.os.Handler;
import j4.p0;
import java.io.IOException;
import java.util.HashMap;
import k4.n0;
import n2.c4;
import p3.e0;
import p3.x;
import r2.p;
import r2.w;

/* compiled from: CompositeMediaSource */
public abstract class g<T> extends a {

    /* renamed from: i  reason: collision with root package name */
    private final HashMap<T, b<T>> f21442i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private Handler f21443j;

    /* renamed from: k  reason: collision with root package name */
    private p0 f21444k;

    /* compiled from: CompositeMediaSource */
    private final class a implements e0, w {

        /* renamed from: a  reason: collision with root package name */
        private final T f21445a;

        /* renamed from: b  reason: collision with root package name */
        private e0.a f21446b;

        /* renamed from: c  reason: collision with root package name */
        private w.a f21447c;

        public a(T t10) {
            this.f21446b = g.this.w((x.b) null);
            this.f21447c = g.this.u((x.b) null);
            this.f21445a = t10;
        }

        private boolean a(int i10, x.b bVar) {
            x.b bVar2;
            if (bVar != null) {
                bVar2 = g.this.I(this.f21445a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int K = g.this.K(this.f21445a, i10);
            e0.a aVar = this.f21446b;
            if (aVar.f21436a != K || !n0.c(aVar.f21437b, bVar2)) {
                this.f21446b = g.this.v(K, bVar2, 0);
            }
            w.a aVar2 = this.f21447c;
            if (aVar2.f22092a == K && n0.c(aVar2.f22093b, bVar2)) {
                return true;
            }
            this.f21447c = g.this.t(K, bVar2);
            return true;
        }

        private t d(t tVar) {
            long J = g.this.J(this.f21445a, tVar.f21647f);
            long J2 = g.this.J(this.f21445a, tVar.f21648g);
            if (J == tVar.f21647f && J2 == tVar.f21648g) {
                return tVar;
            }
            return new t(tVar.f21642a, tVar.f21643b, tVar.f21644c, tVar.f21645d, tVar.f21646e, J, J2);
        }

        public void E(int i10, x.b bVar, q qVar, t tVar) {
            if (a(i10, bVar)) {
                this.f21446b.B(qVar, d(tVar));
            }
        }

        public void O(int i10, x.b bVar, q qVar, t tVar) {
            if (a(i10, bVar)) {
                this.f21446b.s(qVar, d(tVar));
            }
        }

        public void T(int i10, x.b bVar, q qVar, t tVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f21446b.y(qVar, d(tVar), iOException, z10);
            }
        }

        public void U(int i10, x.b bVar) {
            if (a(i10, bVar)) {
                this.f21447c.h();
            }
        }

        public void V(int i10, x.b bVar, t tVar) {
            if (a(i10, bVar)) {
                this.f21446b.j(d(tVar));
            }
        }

        public void Z(int i10, x.b bVar) {
            if (a(i10, bVar)) {
                this.f21447c.i();
            }
        }

        public void a0(int i10, x.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f21447c.l(exc);
            }
        }

        public void e0(int i10, x.b bVar) {
            if (a(i10, bVar)) {
                this.f21447c.j();
            }
        }

        public void g0(int i10, x.b bVar, q qVar, t tVar) {
            if (a(i10, bVar)) {
                this.f21446b.v(qVar, d(tVar));
            }
        }

        public void i0(int i10, x.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f21447c.k(i11);
            }
        }

        public void k0(int i10, x.b bVar) {
            if (a(i10, bVar)) {
                this.f21447c.m();
            }
        }

        public /* synthetic */ void m0(int i10, x.b bVar) {
            p.a(this, i10, bVar);
        }

        public void o0(int i10, x.b bVar, t tVar) {
            if (a(i10, bVar)) {
                this.f21446b.E(d(tVar));
            }
        }
    }

    /* compiled from: CompositeMediaSource */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final x f21449a;

        /* renamed from: b  reason: collision with root package name */
        public final x.c f21450b;

        /* renamed from: c  reason: collision with root package name */
        public final g<T>.defpackage.a f21451c;

        public b(x xVar, x.c cVar, g<T>.defpackage.a aVar) {
            this.f21449a = xVar;
            this.f21450b = cVar;
            this.f21451c = aVar;
        }
    }

    protected g() {
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        this.f21444k = p0Var;
        this.f21443j = n0.w();
    }

    /* access modifiers changed from: protected */
    public void E() {
        for (b next : this.f21442i.values()) {
            next.f21449a.n(next.f21450b);
            next.f21449a.m(next.f21451c);
            next.f21449a.s(next.f21451c);
        }
        this.f21442i.clear();
    }

    /* access modifiers changed from: protected */
    public final void G(T t10) {
        b bVar = (b) k4.a.e(this.f21442i.get(t10));
        bVar.f21449a.r(bVar.f21450b);
    }

    /* access modifiers changed from: protected */
    public final void H(T t10) {
        b bVar = (b) k4.a.e(this.f21442i.get(t10));
        bVar.f21449a.d(bVar.f21450b);
    }

    /* access modifiers changed from: protected */
    public abstract x.b I(T t10, x.b bVar);

    /* access modifiers changed from: protected */
    public long J(T t10, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public abstract int K(T t10, int i10);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract void L(T t10, x xVar, c4 c4Var);

    /* access modifiers changed from: protected */
    public final void N(T t10, x xVar) {
        k4.a.a(!this.f21442i.containsKey(t10));
        f fVar = new f(this, t10);
        a aVar = new a(t10);
        this.f21442i.put(t10, new b(xVar, fVar, aVar));
        xVar.q((Handler) k4.a.e(this.f21443j), aVar);
        xVar.p((Handler) k4.a.e(this.f21443j), aVar);
        xVar.c(fVar, this.f21444k, A());
        if (!B()) {
            xVar.r(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void O(T t10) {
        b bVar = (b) k4.a.e(this.f21442i.remove(t10));
        bVar.f21449a.n(bVar.f21450b);
        bVar.f21449a.m(bVar.f21451c);
        bVar.f21449a.s(bVar.f21451c);
    }

    public void h() throws IOException {
        for (b<T> bVar : this.f21442i.values()) {
            bVar.f21449a.h();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        for (b next : this.f21442i.values()) {
            next.f21449a.r(next.f21450b);
        }
    }

    /* access modifiers changed from: protected */
    public void z() {
        for (b next : this.f21442i.values()) {
            next.f21449a.d(next.f21450b);
        }
    }
}
