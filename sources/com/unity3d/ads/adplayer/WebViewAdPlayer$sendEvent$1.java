package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fe.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {241, 255}, m = "sendEvent")
/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$sendEvent$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendEvent$1(WebViewAdPlayer webViewAdPlayer, xd.d<? super WebViewAdPlayer$sendEvent$1> dVar) {
        super(dVar);
        this.this$0 = webViewAdPlayer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.sendEvent((a<? extends WebViewEvent>) null, this);
    }
}
