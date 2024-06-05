package pe;

import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import ue.h0;
import ve.b;
import xd.d;
import xd.g;

/* compiled from: CoroutineScope.kt */
public final class q0 {
    public static final p0 a(g gVar) {
        if (gVar.get(c2.B1) == null) {
            gVar = gVar.plus(i2.b((c2) null, 1, (Object) null));
        }
        return new ue.g(gVar);
    }

    public static final p0 b() {
        return new ue.g(z2.b((c2) null, 1, (Object) null).plus(g1.c()));
    }

    public static final void c(p0 p0Var, CancellationException cancellationException) {
        c2 c2Var = (c2) p0Var.getCoroutineContext().get(c2.B1);
        if (c2Var != null) {
            c2Var.i(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + p0Var).toString());
    }

    public static /* synthetic */ void d(p0 p0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(p0Var, cancellationException);
    }

    public static final <R> Object e(p<? super p0, ? super d<? super R>, ? extends Object> pVar, d<? super R> dVar) {
        h0 h0Var = new h0(dVar.getContext(), dVar);
        Object b10 = b.b(h0Var, h0Var, pVar);
        if (b10 == d.c()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final void f(p0 p0Var) {
        g2.j(p0Var.getCoroutineContext());
    }

    public static final boolean g(p0 p0Var) {
        c2 c2Var = (c2) p0Var.getCoroutineContext().get(c2.B1);
        if (c2Var != null) {
            return c2Var.isActive();
        }
        return true;
    }

    public static final p0 h(p0 p0Var, g gVar) {
        return new ue.g(p0Var.getCoroutineContext().plus(gVar));
    }
}
