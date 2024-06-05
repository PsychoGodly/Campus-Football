package ue;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.m;
import pe.b3;
import pe.d0;
import pe.d1;
import pe.g0;
import pe.k0;
import pe.m1;
import pe.o;
import pe.p;
import pe.t0;
import pe.u0;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: DispatchedContinuation.kt */
public final class l<T> extends d1<T> implements e, d<T> {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38813i = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f38814d;

    /* renamed from: f  reason: collision with root package name */
    public final d<T> f38815f;

    /* renamed from: g  reason: collision with root package name */
    public Object f38816g = m.f38819a;

    /* renamed from: h  reason: collision with root package name */
    public final Object f38817h = p0.b(getContext());

    public l(k0 k0Var, d<? super T> dVar) {
        super(-1);
        this.f38814d = k0Var;
        this.f38815f = dVar;
    }

    private final p<?> s() {
        Object obj = f38813i.get(this);
        if (obj instanceof p) {
            return (p) obj;
        }
        return null;
    }

    public void b(Object obj, Throwable th) {
        if (obj instanceof d0) {
            ((d0) obj).f37288b.invoke(th);
        }
    }

    public d<T> c() {
        return this;
    }

    public Object g() {
        Object obj = this.f38816g;
        if (t0.a()) {
            if (!(obj != m.f38819a)) {
                throw new AssertionError();
            }
        }
        this.f38816g = m.f38819a;
        return obj;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f38815f;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f38815f.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void i() {
        do {
        } while (f38813i.get(this) == m.f38820b);
    }

    public final p<T> n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38813i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f38813i.set(this, m.f38820b);
                return null;
            } else if (obj instanceof p) {
                if (b.a(f38813i, this, obj, m.f38820b)) {
                    return (p) obj;
                }
            } else if (obj != m.f38820b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void q(g gVar, T t10) {
        this.f38816g = t10;
        this.f37289c = 1;
        this.f38814d.Y0(gVar, this);
    }

    public void resumeWith(Object obj) {
        g context;
        Object c10;
        g context2 = this.f38815f.getContext();
        Object d10 = g0.d(obj, (fe.l) null, 1, (Object) null);
        if (this.f38814d.Z0(context2)) {
            this.f38816g = d10;
            this.f37289c = 0;
            this.f38814d.X0(context2, this);
            return;
        }
        boolean a10 = t0.a();
        m1 b10 = b3.f37276a.b();
        if (b10.i1()) {
            this.f38816g = d10;
            this.f37289c = 0;
            b10.e1(this);
            return;
        }
        b10.g1(true);
        try {
            context = getContext();
            c10 = p0.c(context, this.f38817h);
            this.f38815f.resumeWith(obj);
            w wVar = w.f38141a;
            p0.a(context, c10);
            do {
            } while (b10.l1());
        } catch (Throwable th) {
            try {
                f(th, (Throwable) null);
            } catch (Throwable th2) {
                b10.b1(true);
                throw th2;
            }
        }
        b10.b1(true);
    }

    public final boolean t() {
        return f38813i.get(this) != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f38814d + ", " + u0.c(this.f38815f) + ']';
    }

    public final boolean u(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38813i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            l0 l0Var = m.f38820b;
            if (m.a(obj, l0Var)) {
                if (b.a(f38813i, this, l0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f38813i, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        i();
        p<?> s10 = s();
        if (s10 != null) {
            s10.u();
        }
    }

    public final Throwable w(o<?> oVar) {
        l0 l0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38813i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            l0Var = m.f38820b;
            if (obj != l0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f38813i, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!b.a(f38813i, this, l0Var, oVar));
        return null;
    }
}
