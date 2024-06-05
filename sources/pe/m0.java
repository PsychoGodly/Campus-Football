package pe;

import ue.i;
import xd.g;

/* compiled from: CoroutineExceptionHandler.kt */
public final class m0 {
    public static final void a(g gVar, Throwable th) {
        try {
            l0 l0Var = (l0) gVar.get(l0.A1);
            if (l0Var != null) {
                l0Var.handleException(gVar, th);
            } else {
                i.a(gVar, th);
            }
        } catch (Throwable th2) {
            i.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        b.a(runtimeException, th);
        return runtimeException;
    }
}
