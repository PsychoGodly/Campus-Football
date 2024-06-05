package ue;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import pe.t0;
import ue.f;

/* compiled from: ConcurrentLinkedList.kt */
public abstract class f<N extends f<N>> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38801a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38802b;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<f> cls2 = f.class;
        f38801a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f38802b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public f(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (f) f38802b.get(g10);
        }
        return g10;
    }

    private final N d() {
        N e10;
        if (!t0.a() || (!i())) {
            N e11 = e();
            m.b(e11);
            while (e11.h() && (e10 = e11.e()) != null) {
                e11 = e10;
            }
            return e11;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public final Object f() {
        return f38801a.get(this);
    }

    public final void b() {
        f38802b.lazySet(this, (Object) null);
    }

    public final N e() {
        N a10 = f();
        if (a10 == e.f38800a) {
            return null;
        }
        return (f) a10;
    }

    public final N g() {
        return (f) f38802b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return b.a(f38801a, this, (Object) null, e.f38800a);
    }

    public final void k() {
        Object obj;
        if (t0.a()) {
            if (!(h() || i())) {
                throw new AssertionError();
            }
        }
        if (!i()) {
            while (true) {
                f c10 = c();
                f d10 = d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38802b;
                do {
                    obj = atomicReferenceFieldUpdater.get(d10);
                } while (!b.a(atomicReferenceFieldUpdater, d10, obj, ((f) obj) == null ? null : c10));
                if (c10 != null) {
                    f38801a.set(c10, d10);
                }
                if ((!d10.h() || d10.i()) && (c10 == null || !c10.h())) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return b.a(f38801a, this, (Object) null, n10);
    }
}
