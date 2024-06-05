package com.unity3d.ads.adplayer;

import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {34}, m = "invokeSuspend")
/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
final class AndroidEmbeddableWebViewAdPlayer$show$2$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, d<? super AndroidEmbeddableWebViewAdPlayer$show$2$1> dVar) {
        super(2, dVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2$1(this.this$0, this.$showOptions, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            WebViewAdPlayer access$getWebViewAdPlayer$p = this.this$0.webViewAdPlayer;
            Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
            this.label = 1;
            if (access$getWebViewAdPlayer$p.requestShow(unityAdsShowOptions, this) == c10) {
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
