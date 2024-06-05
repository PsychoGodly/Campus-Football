package com.unity3d.ads.adplayer;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidWebViewContainer.kt */
final class AndroidWebViewContainer$evaluateJavascript$2 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $script;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$evaluateJavascript$2(AndroidWebViewContainer androidWebViewContainer, String str, d<? super AndroidWebViewContainer$evaluateJavascript$2> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
        this.$script = str;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewContainer$evaluateJavascript$2(this.this$0, this.$script, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidWebViewContainer$evaluateJavascript$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            WebView webView = this.this$0.getWebView();
            webView.evaluateJavascript("javascript:" + this.$script, (ValueCallback) null);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
