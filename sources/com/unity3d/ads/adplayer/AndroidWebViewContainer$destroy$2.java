package com.unity3d.ads.adplayer;

import android.view.ViewGroup;
import android.view.ViewParent;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidWebViewContainer.kt */
final class AndroidWebViewContainer$destroy$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$destroy$2(AndroidWebViewContainer androidWebViewContainer, d<? super AndroidWebViewContainer$destroy$2> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewContainer$destroy$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidWebViewContainer$destroy$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            ViewParent parent = this.this$0.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.this$0.getWebView());
            }
            this.this$0.getWebView().destroy();
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
