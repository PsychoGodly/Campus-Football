package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
final class AndroidEmbeddableWebViewAdPlayer$show$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ BannerView $bannerView;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, Context context, BannerView bannerView, d<? super AndroidEmbeddableWebViewAdPlayer$show$1> dVar) {
        super(2, dVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$context = context;
        this.$bannerView = bannerView;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1(this.this$0, this.$context, this.$bannerView, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            this.this$0.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(this.$context, (float) this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(this.$context, (float) this.$bannerView.getSize().getHeight())));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
