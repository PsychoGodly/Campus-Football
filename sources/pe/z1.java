package pe;

import fe.l;
import sd.w;

/* compiled from: CancellableContinuationImpl.kt */
final class z1 extends m {

    /* renamed from: a  reason: collision with root package name */
    private final l<Throwable, w> f37416a;

    public z1(l<? super Throwable, w> lVar) {
        this.f37416a = lVar;
    }

    public void d(Throwable th) {
        this.f37416a.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d((Throwable) obj);
        return w.f38141a;
    }

    public String toString() {
        return "InvokeOnCancel[" + u0.a(this.f37416a) + '@' + u0.b(this) + ']';
    }
}
