package com.unity3d.ads.adplayer;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidWebViewContainer.kt */
final class AndroidWebViewContainer$addJavascriptInterface$2 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$addJavascriptInterface$2(AndroidWebViewContainer androidWebViewContainer, String str, WebViewBridge webViewBridge, d<? super AndroidWebViewContainer$addJavascriptInterface$2> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
        this.$name = str;
        this.$webViewBridgeInterface = webViewBridge;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewContainer$addJavascriptInterface$2(this.this$0, this.$name, this.$webViewBridgeInterface, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidWebViewContainer$addJavascriptInterface$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            this.this$0.getWebView().addJavascriptInterface(new AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(this.$webViewBridgeInterface), this.$name);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
