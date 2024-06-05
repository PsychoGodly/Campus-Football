package com.unity3d.ads.adplayer;

import android.view.View;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.DisplayMessage;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.u;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {56}, m = "invokeSuspend")
/* compiled from: FullScreenWebViewDisplay.kt */
final class FullScreenWebViewDisplay$loadWebView$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$loadWebView$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, WebView webView, d<? super FullScreenWebViewDisplay$loadWebView$1> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$webView = webView;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new FullScreenWebViewDisplay$loadWebView$1(this.this$0, this.$webView, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$loadWebView$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            this.this$0.setContentView((View) this.$webView);
            u<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, this.this$0.showOptions);
            this.label = 1;
            if (displayMessages.emit(displayReady, this) == c10) {
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
