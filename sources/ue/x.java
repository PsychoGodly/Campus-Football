package ue;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class x<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38862a = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_cur");
    private volatile Object _cur;

    public x(boolean z10) {
        this._cur = new y(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38862a;
        while (true) {
            y yVar = (y) atomicReferenceFieldUpdater.get(this);
            int a10 = yVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f38862a, this, yVar, yVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38862a;
        while (true) {
            y yVar = (y) atomicReferenceFieldUpdater.get(this);
            if (!yVar.d()) {
                b.a(f38862a, this, yVar, yVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((y) f38862a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38862a;
        while (true) {
            y yVar = (y) atomicReferenceFieldUpdater.get(this);
            E j10 = yVar.j();
            if (j10 != y.f38866h) {
                return j10;
            }
            b.a(f38862a, this, yVar, yVar.i());
        }
    }
}
