package pe;

import sd.o;

/* compiled from: CompletableDeferred.kt */
public final class z {
    public static final <T> x<T> a(c2 c2Var) {
        return new y(c2Var);
    }

    public static /* synthetic */ x b(c2 c2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2Var = null;
        }
        return a(c2Var);
    }

    public static final <T> boolean c(x<T> xVar, Object obj) {
        Throwable d10 = o.d(obj);
        return d10 == null ? xVar.n0(obj) : xVar.l0(d10);
    }
}
