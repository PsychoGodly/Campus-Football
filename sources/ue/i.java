package ue;

import pe.l0;
import pe.m0;
import xd.g;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
public final class i {
    public static final void a(g gVar, Throwable th) {
        for (l0 handleException : h.a()) {
            try {
                handleException.handleException(gVar, th);
            } catch (n unused) {
                return;
            } catch (Throwable th2) {
                h.b(m0.b(th, th2));
            }
        }
        try {
            b.a(th, new k(gVar));
        } catch (Throwable unused2) {
        }
        h.b(th);
    }
}
