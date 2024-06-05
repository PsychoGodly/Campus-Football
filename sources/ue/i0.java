package ue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pe.s2;
import ue.i0;
import xd.g;

/* compiled from: ConcurrentLinkedList.kt */
public abstract class i0<S extends i0<S>> extends f<S> implements s2 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38807d = AtomicIntegerFieldUpdater.newUpdater(i0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f38808c;
    private volatile int cleanedAndPointers;

    public i0(long j10, S s10, int i10) {
        super(s10);
        this.f38808c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public boolean h() {
        return f38807d.get(this) == n() && !i();
    }

    public final boolean m() {
        return f38807d.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, g gVar);

    public final void p() {
        if (f38807d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38807d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
