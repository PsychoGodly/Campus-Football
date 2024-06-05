package re;

import fe.l;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.m;
import pe.k3;
import sd.w;
import ue.d0;
import ue.i0;
import xd.g;

/* compiled from: BufferedChannel.kt */
public final class i<E> extends i0<i<E>> {

    /* renamed from: f  reason: collision with root package name */
    private final b<E> f38009f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReferenceArray f38010g = new AtomicReferenceArray(c.f37983b * 2);

    public i(long j10, i<E> iVar, b<E> bVar, int i10) {
        super(j10, iVar, i10);
        this.f38009f = bVar;
    }

    private final void z(int i10, Object obj) {
        this.f38010g.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f38010g.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    public int n() {
        return c.f37983b;
    }

    public void o(int i10, Throwable th, g gVar) {
        l<E, w> lVar;
        l<E, w> lVar2;
        int i11 = c.f37983b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object v10 = v(i10);
        while (true) {
            Object w10 = w(i10);
            if ((w10 instanceof k3) || (w10 instanceof v)) {
                if (r(i10, w10, z10 ? c.f37991j : c.f37992k)) {
                    s(i10);
                    x(i10, !z10);
                    if (z10 && (lVar = u().f37961b) != null) {
                        d0.b(lVar, v10, gVar);
                        return;
                    }
                    return;
                }
            } else if (w10 == c.f37991j || w10 == c.f37992k) {
                s(i10);
            } else if (!(w10 == c.f37988g || w10 == c.f37987f)) {
                if (w10 != c.f37990i && w10 != c.f37985d && w10 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + w10).toString());
                }
                return;
            }
        }
        s(i10);
        if (z10 && (lVar2 = u().f37961b) != null) {
            d0.b(lVar2, v10, gVar);
        }
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return this.f38010g.compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, (Object) null);
    }

    public final Object t(int i10, Object obj) {
        return this.f38010g.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f38009f;
        m.b(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return this.f38010g.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f38010g.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().M0((this.f38808c * ((long) c.f37983b)) + ((long) i10));
        }
        p();
    }

    public final E y(int i10) {
        E v10 = v(i10);
        s(i10);
        return v10;
    }
}
