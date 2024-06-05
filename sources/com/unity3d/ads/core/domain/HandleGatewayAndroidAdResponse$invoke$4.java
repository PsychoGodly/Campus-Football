package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4", f = "HandleGatewayAndroidAdResponse.kt", l = {159}, m = "invokeSuspend")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$invoke$4 extends l implements fe.l<d<? super w>, Object> {
    final /* synthetic */ String $webViewUrl;
    final /* synthetic */ AndroidWebViewContainer $webviewContainer;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$4(AndroidWebViewContainer androidWebViewContainer, String str, d<? super HandleGatewayAndroidAdResponse$invoke$4> dVar) {
        super(1, dVar);
        this.$webviewContainer = androidWebViewContainer;
        this.$webViewUrl = str;
    }

    public final d<w> create(d<?> dVar) {
        return new HandleGatewayAndroidAdResponse$invoke$4(this.$webviewContainer, this.$webViewUrl, dVar);
    }

    public final Object invoke(d<? super w> dVar) {
        return ((HandleGatewayAndroidAdResponse$invoke$4) create(dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
            String str = this.$webViewUrl;
            this.label = 1;
            if (androidWebViewContainer.loadUrl(str, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
