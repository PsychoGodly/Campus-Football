package androidx.work;

import fe.l;
import kotlin.jvm.internal.n;
import sd.w;
import w6.f;

/* compiled from: ListenableFuture.kt */
public final class o extends n implements l<Throwable, w> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f<Object> f5330a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(f<Object> fVar) {
        super(1);
        this.f5330a = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w.f38141a;
    }

    public final void invoke(Throwable th) {
        this.f5330a.cancel(false);
    }
}
