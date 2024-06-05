package androidx.work;

import java.util.concurrent.CancellationException;
import pe.o;
import sd.o;
import sd.p;
import w6.f;

/* compiled from: ListenableFuture.kt */
public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o<Object> f5328a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f<Object> f5329b;

    public n(o<Object> oVar, f<Object> fVar) {
        this.f5328a = oVar;
        this.f5329b = fVar;
    }

    public final void run() {
        try {
            o<Object> oVar = this.f5328a;
            Object obj = this.f5329b.get();
            o.a aVar = sd.o.f38128b;
            oVar.resumeWith(sd.o.b(obj));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f5328a.p(cause);
                return;
            }
            pe.o<Object> oVar2 = this.f5328a;
            o.a aVar2 = sd.o.f38128b;
            oVar2.resumeWith(sd.o.b(p.a(cause)));
        }
    }
}
