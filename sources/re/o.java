package re;

import fe.l;
import kotlin.jvm.internal.a0;
import pe.k3;
import re.h;
import sd.w;
import ue.d0;
import ue.l0;
import ue.u0;
import xd.d;

/* compiled from: ConflatedBufferedChannel.kt */
public class o<E> extends b<E> {

    /* renamed from: n  reason: collision with root package name */
    private final int f38015n;

    /* renamed from: o  reason: collision with root package name */
    private final a f38016o;

    public o(int i10, a aVar, l<? super E, w> lVar) {
        super(i10, lVar);
        this.f38015n = i10;
        this.f38016o = aVar;
        boolean z10 = false;
        if (aVar != a.SUSPEND) {
            if (!(i10 >= 1 ? true : z10)) {
                throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + a0.b(b.class).a() + " instead").toString());
    }

    static /* synthetic */ <E> Object N0(o<E> oVar, E e10, d<? super w> dVar) {
        u0 d10;
        Object Q0 = oVar.Q0(e10, true);
        if (!(Q0 instanceof h.a)) {
            return w.f38141a;
        }
        h.e(Q0);
        l<E, w> lVar = oVar.f37961b;
        if (lVar == null || (d10 = d0.d(lVar, e10, (u0) null, 2, (Object) null)) == null) {
            throw oVar.Q();
        }
        b.a(d10, oVar.Q());
        throw d10;
    }

    private final Object O0(E e10, boolean z10) {
        l<E, w> lVar;
        u0 d10;
        Object g10 = super.g(e10);
        if (h.i(g10) || h.h(g10)) {
            return g10;
        }
        if (!z10 || (lVar = this.f37961b) == null || (d10 = d0.d(lVar, e10, (u0) null, 2, (Object) null)) == null) {
            return h.f38005b.c(w.f38141a);
        }
        throw d10;
    }

    private final Object P0(E e10) {
        i iVar;
        l0 l0Var = c.f37985d;
        i iVar2 = (i) b.f37955i.get(this);
        while (true) {
            long andIncrement = b.f37951d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean p10 = a0(andIncrement);
            int i10 = c.f37983b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar2.f38808c != j11) {
                i j12 = L(j11, iVar2);
                if (j12 != null) {
                    iVar = j12;
                } else if (p10) {
                    return h.f38005b.a(Q());
                }
            } else {
                iVar = iVar2;
            }
            int y10 = I0(iVar, i11, e10, j10, l0Var, p10);
            if (y10 == 0) {
                iVar.b();
                return h.f38005b.c(w.f38141a);
            } else if (y10 == 1) {
                return h.f38005b.c(w.f38141a);
            } else {
                if (y10 != 2) {
                    if (y10 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (y10 != 4) {
                        if (y10 == 5) {
                            iVar.b();
                        }
                        iVar2 = iVar;
                    } else {
                        if (j10 < P()) {
                            iVar.b();
                        }
                        return h.f38005b.a(Q());
                    }
                } else if (p10) {
                    iVar.p();
                    return h.f38005b.a(Q());
                } else {
                    k3 k3Var = l0Var instanceof k3 ? (k3) l0Var : null;
                    if (k3Var != null) {
                        q0(k3Var, iVar, i11);
                    }
                    H((iVar.f38808c * ((long) i10)) + ((long) i11));
                    return h.f38005b.c(w.f38141a);
                }
            }
        }
    }

    private final Object Q0(E e10, boolean z10) {
        if (this.f38016o == a.DROP_LATEST) {
            return O0(e10, z10);
        }
        return P0(e10);
    }

    /* access modifiers changed from: protected */
    public boolean b0() {
        return this.f38016o == a.DROP_OLDEST;
    }

    public Object c(E e10, d<? super w> dVar) {
        return N0(this, e10, dVar);
    }

    public Object g(E e10) {
        return Q0(e10, false);
    }
}
