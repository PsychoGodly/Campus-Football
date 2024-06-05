package pe;

import ue.l;
import xd.d;

/* compiled from: CancellableContinuation.kt */
public final class r {
    public static final void a(o<?> oVar, i1 i1Var) {
        oVar.o(new j1(i1Var));
    }

    public static final <T> p<T> b(d<? super T> dVar) {
        if (!(dVar instanceof l)) {
            return new p<>(dVar, 1);
        }
        p<T> n10 = ((l) dVar).n();
        if (n10 != null) {
            if (!n10.L()) {
                n10 = null;
            }
            if (n10 != null) {
                return n10;
            }
        }
        return new p<>(dVar, 2);
    }
}
