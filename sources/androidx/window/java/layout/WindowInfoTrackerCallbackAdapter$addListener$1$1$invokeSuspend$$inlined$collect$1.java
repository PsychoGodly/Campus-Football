package androidx.window.java.layout;

import androidx.core.util.a;
import sd.w;
import se.f;
import xd.d;

/* compiled from: Collect.kt */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 implements f<T> {
    final /* synthetic */ a $consumer$inlined;

    public WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t10, d<? super w> dVar) {
        this.$consumer$inlined.accept(t10);
        return w.f38141a;
    }
}
