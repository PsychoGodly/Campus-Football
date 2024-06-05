package androidx.window.java.layout;

import androidx.core.util.a;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.e;
import xd.d;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ e<T> $flow;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(e<? extends T> eVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = eVar;
        this.$consumer = aVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            e<T> eVar = this.$flow;
            WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(this.$consumer);
            this.label = 1;
            if (eVar.collect(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
