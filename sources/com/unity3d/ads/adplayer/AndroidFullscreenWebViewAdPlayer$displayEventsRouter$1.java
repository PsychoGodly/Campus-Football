package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import fe.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.u;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {108, 109, 110, 111, 113}, m = "invokeSuspend")
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, d<? super AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> dVar) {
        super(2, dVar);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            DisplayMessage displayMessage = this.$displayMessage;
            if (displayMessage instanceof DisplayMessage.DisplayReady) {
                WebViewAdPlayer access$getWebViewAdPlayer$p = this.this$0.webViewAdPlayer;
                Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                this.label = 1;
                if (access$getWebViewAdPlayer$p.requestShow(showOptions, this) == c10) {
                    return c10;
                }
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                u<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                this.label = 2;
                if (displayMessages.emit(webViewInstanceResponse, this) == c10) {
                    return c10;
                }
            } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                WebViewAdPlayer access$getWebViewAdPlayer$p2 = this.this$0.webViewAdPlayer;
                boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                this.label = 3;
                if (access$getWebViewAdPlayer$p2.sendVisibilityChange(isVisible, this) == c10) {
                    return c10;
                }
            } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                WebViewAdPlayer access$getWebViewAdPlayer$p3 = this.this$0.webViewAdPlayer;
                boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                this.label = 4;
                if (access$getWebViewAdPlayer$p3.sendFocusChange(isFocused, this) == c10) {
                    return c10;
                }
            } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                this.label = 5;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == c10) {
                    return c10;
                }
            }
        } else if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
