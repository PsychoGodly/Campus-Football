package pe;

import androidx.concurrent.futures.b;
import fe.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import sd.w;
import ue.i0;
import ue.k0;
import ue.l0;
import xd.d;
import xd.g;

/* compiled from: CancellableContinuationImpl.kt */
public class p<T> extends d1<T> implements o<T>, e, k3 {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37379g = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex");

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37380h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37381i;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    private final d<T> f37382d;

    /* renamed from: f  reason: collision with root package name */
    private final g f37383f;

    static {
        Class<Object> cls = Object.class;
        f37380h = AtomicReferenceFieldUpdater.newUpdater(p.class, cls, "_state");
        f37381i = AtomicReferenceFieldUpdater.newUpdater(p.class, cls, "_parentHandle");
    }

    public p(d<? super T> dVar, int i10) {
        super(i10);
        this.f37382d = dVar;
        if (t0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.f37383f = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f37286a;
    }

    private final String B() {
        Object A = A();
        if (A instanceof s2) {
            return "Active";
        }
        return A instanceof s ? "Cancelled" : "Completed";
    }

    private final i1 D() {
        c2 c2Var = (c2) getContext().get(c2.B1);
        if (c2Var == null) {
            return null;
        }
        i1 d10 = c2.a.d(c2Var, true, false, new t(this), 2, (Object) null);
        b.a(f37381i, this, (Object) null, d10);
        return d10;
    }

    private final void E(Object obj) {
        Object obj2 = obj;
        if (t0.a()) {
            if (!((obj2 instanceof m) || (obj2 instanceof i0))) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof d)) {
                if (obj3 instanceof m ? true : obj3 instanceof i0) {
                    H(obj2, obj3);
                } else {
                    boolean z10 = obj3 instanceof c0;
                    if (z10) {
                        c0 c0Var = (c0) obj3;
                        if (!c0Var.b()) {
                            H(obj2, obj3);
                        }
                        if (obj3 instanceof s) {
                            Throwable th = null;
                            if (!z10) {
                                c0Var = null;
                            }
                            if (c0Var != null) {
                                th = c0Var.f37280a;
                            }
                            if (obj2 instanceof m) {
                                n((m) obj2, th);
                                return;
                            }
                            m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            s((i0) obj2, th);
                            return;
                        }
                        return;
                    } else if (obj3 instanceof b0) {
                        b0 b0Var = (b0) obj3;
                        if (b0Var.f37271b != null) {
                            H(obj2, obj3);
                        }
                        if (!(obj2 instanceof i0)) {
                            m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            m mVar = (m) obj2;
                            if (b0Var.c()) {
                                n(mVar, b0Var.f37274e);
                                return;
                            } else {
                                if (b.a(f37380h, this, obj3, b0.b(b0Var, (Object) null, mVar, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj2 instanceof i0)) {
                        m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (b.a(f37380h, this, obj3, new b0(obj3, (m) obj2, (l) null, (Object) null, (Throwable) null, 28, (h) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (b.a(f37380h, this, obj3, obj2)) {
                return;
            }
        }
    }

    private final boolean F() {
        if (e1.c(this.f37289c)) {
            d<T> dVar = this.f37382d;
            m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((ue.l) dVar).t()) {
                return true;
            }
        }
        return false;
    }

    private final m G(l<? super Throwable, w> lVar) {
        return lVar instanceof m ? (m) lVar : new z1(lVar);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i10, l<? super Throwable, w> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof s2) {
            } else {
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.c()) {
                        if (lVar != null) {
                            q(lVar, sVar.f37280a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new sd.d();
            }
        } while (!b.a(f37380h, this, obj2, O((s2) obj2, obj, i10, lVar, (Object) null)));
        v();
        w(i10);
    }

    static /* synthetic */ void N(p pVar, Object obj, int i10, l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            pVar.M(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object O(s2 s2Var, Object obj, int i10, l<? super Throwable, w> lVar, Object obj2) {
        if (obj instanceof c0) {
            boolean z10 = true;
            if (t0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!t0.a()) {
                return obj;
            }
            if (lVar != null) {
                z10 = false;
            }
            if (z10) {
                return obj;
            }
            throw new AssertionError();
        } else if (!e1.b(i10) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && !(s2Var instanceof m) && obj2 == null) {
                return obj;
            }
            return new b0(obj, s2Var instanceof m ? (m) s2Var : null, lVar, obj2, (Throwable) null, 16, (h) null);
        }
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37379g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f37379g.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final l0 Q(Object obj, Object obj2, l<? super Throwable, w> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof s2) {
            } else if (!(obj3 instanceof b0) || obj2 == null) {
                return null;
            } else {
                b0 b0Var = (b0) obj3;
                if (b0Var.f37273d != obj2) {
                    return null;
                }
                if (!t0.a() || m.a(b0Var.f37270a, obj)) {
                    return q.f37384a;
                }
                throw new AssertionError();
            }
        } while (!b.a(f37380h, this, obj3, O((s2) obj3, obj, this.f37289c, lVar, obj2)));
        v();
        return q.f37384a;
    }

    private final boolean R() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37379g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f37379g.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void s(i0<?> i0Var, Throwable th) {
        int i10 = f37379g.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                i0Var.o(i10, th, getContext());
            } catch (Throwable th2) {
                g context = getContext();
                m0.a(context, new f0("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    private final boolean t(Throwable th) {
        if (!F()) {
            return false;
        }
        d<T> dVar = this.f37382d;
        m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((ue.l) dVar).u(th);
    }

    private final void v() {
        if (!F()) {
            u();
        }
    }

    private final void w(int i10) {
        if (!P()) {
            e1.a(this, i10);
        }
    }

    private final i1 y() {
        return (i1) f37381i.get(this);
    }

    public final Object A() {
        return f37380h.get(this);
    }

    public void C() {
        i1 D = D();
        if (D != null && h()) {
            D.dispose();
            f37381i.set(this, r2.f37394a);
        }
    }

    /* access modifiers changed from: protected */
    public String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (!t(th)) {
            p(th);
            v();
        }
    }

    public final void K() {
        Throwable w10;
        d<T> dVar = this.f37382d;
        ue.l lVar = dVar instanceof ue.l ? (ue.l) dVar : null;
        if (lVar != null && (w10 = lVar.w(this)) != null) {
            u();
            p(w10);
        }
    }

    public final boolean L() {
        if (t0.a()) {
            if (!(this.f37289c == 2)) {
                throw new AssertionError();
            }
        }
        if (t0.a()) {
            if (!(y() != r2.f37394a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (t0.a() && !(!(obj instanceof s2))) {
            throw new AssertionError();
        } else if (!(obj instanceof b0) || ((b0) obj).f37273d == null) {
            f37379g.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, d.f37286a);
            return true;
        } else {
            u();
            return false;
        }
    }

    public void a(i0<?> i0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37379g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        E(i0Var);
    }

    public void b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof s2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof c0)) {
                if (obj2 instanceof b0) {
                    b0 b0Var = (b0) obj2;
                    if (!b0Var.c()) {
                        Throwable th2 = th;
                        if (b.a(f37380h, this, obj2, b0.b(b0Var, (Object) null, (m) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            b0Var.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th3 = th;
                    if (b.a(f37380h, this, obj2, new b0(obj2, (m) null, (l) null, (Object) null, th, 14, (h) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final d<T> c() {
        return this.f37382d;
    }

    public Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 == null) {
            return null;
        }
        d<T> dVar = this.f37382d;
        return (!t0.d() || !(dVar instanceof e)) ? d10 : k0.i(d10, (e) dVar);
    }

    public <T> T e(Object obj) {
        return obj instanceof b0 ? ((b0) obj).f37270a : obj;
    }

    public Object g() {
        return A();
    }

    public e getCallerFrame() {
        d<T> dVar = this.f37382d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f37383f;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public boolean h() {
        return !(A() instanceof s2);
    }

    public void j(k0 k0Var, T t10) {
        d<T> dVar = this.f37382d;
        k0 k0Var2 = null;
        ue.l lVar = dVar instanceof ue.l ? (ue.l) dVar : null;
        if (lVar != null) {
            k0Var2 = lVar.f38814d;
        }
        N(this, t10, k0Var2 == k0Var ? 4 : this.f37289c, (l) null, 4, (Object) null);
    }

    public Object k(T t10, Object obj, l<? super Throwable, w> lVar) {
        return Q(t10, obj, lVar);
    }

    public void l(T t10, l<? super Throwable, w> lVar) {
        M(t10, this.f37289c, lVar);
    }

    public Object m(Throwable th) {
        return Q(new c0(th, false, 2, (h) null), (Object) null, (l<? super Throwable, w>) null);
    }

    public final void n(m mVar, Throwable th) {
        try {
            mVar.d(th);
        } catch (Throwable th2) {
            g context = getContext();
            m0.a(context, new f0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public void o(l<? super Throwable, w> lVar) {
        E(G(lVar));
    }

    public boolean p(Throwable th) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37380h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof s2)) {
                return false;
            }
            if ((obj instanceof m) || (obj instanceof i0)) {
                z10 = true;
            }
        } while (!b.a(f37380h, this, obj, new s(this, th, z10)));
        s2 s2Var = (s2) obj;
        if (s2Var instanceof m) {
            n((m) obj, th);
        } else if (s2Var instanceof i0) {
            s((i0) obj, th);
        }
        v();
        w(this.f37289c);
        return true;
    }

    public final void q(l<? super Throwable, w> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            g context = getContext();
            m0.a(context, new f0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public void r(Object obj) {
        if (t0.a()) {
            if (!(obj == q.f37384a)) {
                throw new AssertionError();
            }
        }
        w(this.f37289c);
    }

    public void resumeWith(Object obj) {
        N(this, g0.c(obj, this), this.f37289c, (l) null, 4, (Object) null);
    }

    public String toString() {
        return I() + '(' + u0.c(this.f37382d) + "){" + B() + "}@" + u0.b(this);
    }

    public final void u() {
        i1 y10 = y();
        if (y10 != null) {
            y10.dispose();
            f37381i.set(this, r2.f37394a);
        }
    }

    public Throwable x(c2 c2Var) {
        return c2Var.L();
    }

    public final Object z() {
        c2 c2Var;
        boolean F = F();
        if (R()) {
            if (y() == null) {
                D();
            }
            if (F) {
                K();
            }
            return d.c();
        }
        if (F) {
            K();
        }
        Object A = A();
        if (A instanceof c0) {
            Throwable th = ((c0) A).f37280a;
            if (t0.d()) {
                th = k0.i(th, this);
            }
            throw th;
        } else if (!e1.b(this.f37289c) || (c2Var = (c2) getContext().get(c2.B1)) == null || c2Var.isActive()) {
            return e(A);
        } else {
            Throwable L = c2Var.L();
            b(A, L);
            if (t0.d()) {
                L = k0.i(L, this);
            }
            throw L;
        }
    }
}
