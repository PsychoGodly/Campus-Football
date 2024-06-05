package pe;

import fe.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ue.h0;
import ue.m;
import xd.d;
import xd.g;

/* compiled from: Builders.common.kt */
public final class c1<T> extends h0<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37281f = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_decision");
    private volatile int _decision;

    public c1(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37281f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f37281f.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean W0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37281f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f37281f.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        if (!V0()) {
            m.c(c.b(this.f38806d), g0.a(obj, this.f38806d), (l) null, 2, (Object) null);
        }
    }

    public final Object U0() {
        if (W0()) {
            return d.c();
        }
        Object h10 = l2.h(Y());
        if (!(h10 instanceof c0)) {
            return h10;
        }
        throw ((c0) h10).f37280a;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        P0(obj);
    }
}
