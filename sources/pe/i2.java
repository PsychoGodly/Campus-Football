package pe;

import java.util.concurrent.CancellationException;
import me.d;
import xd.g;

/* compiled from: Job.kt */
final /* synthetic */ class i2 {
    public static final a0 a(c2 c2Var) {
        return new f2(c2Var);
    }

    public static /* synthetic */ a0 b(c2 c2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2Var = null;
        }
        return g2.a(c2Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        c2 c2Var = (c2) gVar.get(c2.B1);
        if (c2Var != null) {
            c2Var.i(cancellationException);
        }
    }

    public static /* synthetic */ void d(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.c(gVar, cancellationException);
    }

    public static final void e(g gVar, CancellationException cancellationException) {
        d<c2> A;
        c2 c2Var = (c2) gVar.get(c2.B1);
        if (c2Var != null && (A = c2Var.A()) != null) {
            for (c2 i10 : A) {
                i10.i(cancellationException);
            }
        }
    }

    public static /* synthetic */ void f(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.e(gVar, cancellationException);
    }

    public static final i1 g(c2 c2Var, i1 i1Var) {
        return c2Var.u(new k1(i1Var));
    }

    public static final void h(c2 c2Var) {
        if (!c2Var.isActive()) {
            throw c2Var.L();
        }
    }

    public static final void i(g gVar) {
        c2 c2Var = (c2) gVar.get(c2.B1);
        if (c2Var != null) {
            g2.i(c2Var);
        }
    }

    public static final c2 j(g gVar) {
        c2 c2Var = (c2) gVar.get(c2.B1);
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}
