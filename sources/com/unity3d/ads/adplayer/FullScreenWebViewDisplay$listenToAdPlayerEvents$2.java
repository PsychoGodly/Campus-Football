package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* compiled from: FullScreenWebViewDisplay.kt */
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2 extends l implements p<DisplayMessage, d<? super w>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2(FullScreenWebViewDisplay fullScreenWebViewDisplay, d<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2 fullScreenWebViewDisplay$listenToAdPlayerEvents$2 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2(this.this$0, dVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2;
    }

    public final Object invoke(DisplayMessage displayMessage, d<? super w> dVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2) create(displayMessage, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            DisplayMessage displayMessage = (DisplayMessage) this.L$0;
            if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                this.this$0.finish();
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                this.this$0.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            }
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
