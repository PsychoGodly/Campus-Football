package se;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.p;
import pe.t0;
import sd.o;
import sd.w;
import te.c;
import te.d;

/* compiled from: StateFlow.kt */
final class l0 extends d<j0<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f38231a = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean a(j0<?> j0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38231a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, k0.f38225a);
        return true;
    }

    public final Object e(xd.d<? super w> dVar) {
        boolean z10 = true;
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        if (!t0.a() || (!(f38231a.get(this) instanceof p))) {
            if (!b.a(f38231a, this, k0.f38225a, pVar)) {
                if (t0.a()) {
                    if (f38231a.get(this) != k0.f38226b) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                o.a aVar = o.f38128b;
                pVar.resumeWith(o.b(w.f38141a));
            }
            Object z11 = pVar.z();
            if (z11 == d.c()) {
                h.c(dVar);
            }
            if (z11 == d.c()) {
                return z11;
            }
            return w.f38141a;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public xd.d<w>[] b(j0<?> j0Var) {
        f38231a.set(this, (Object) null);
        return c.f38648a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38231a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != k0.f38226b) {
                if (obj == k0.f38225a) {
                    if (b.a(f38231a, this, obj, k0.f38226b)) {
                        return;
                    }
                } else if (b.a(f38231a, this, obj, k0.f38225a)) {
                    o.a aVar = o.f38128b;
                    ((p) obj).resumeWith(o.b(w.f38141a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f38231a.getAndSet(this, k0.f38225a);
        m.b(andSet);
        if (t0.a() && !(!(andSet instanceof p))) {
            throw new AssertionError();
        } else if (andSet == k0.f38226b) {
            return true;
        } else {
            return false;
        }
    }
}
