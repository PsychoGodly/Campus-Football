package pe;

import java.util.concurrent.Future;
import sd.w;

/* compiled from: Future.kt */
final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f37349a;

    public l(Future<?> future) {
        this.f37349a = future;
    }

    public void d(Throwable th) {
        if (th != null) {
            this.f37349a.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d((Throwable) obj);
        return w.f38141a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f37349a + ']';
    }
}
