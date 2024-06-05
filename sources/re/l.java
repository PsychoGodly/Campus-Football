package re;

import java.util.concurrent.CancellationException;
import pe.r1;

/* compiled from: Channels.common.kt */
final /* synthetic */ class l {
    public static final void a(t<?> tVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = r1.a("Channel was consumed, consumer had failed", th);
            }
        }
        tVar.i(cancellationException);
    }
}
