package com.unity3d.ads.adplayer;

import com.unity3d.services.banners.BannerView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
final class AndroidEmbeddableWebViewAdPlayer$show$3 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$3(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, d<? super AndroidEmbeddableWebViewAdPlayer$show$3> dVar) {
        super(2, dVar);
        this.$bannerView = bannerView;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3(this.$bannerView, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
