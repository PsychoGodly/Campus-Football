package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {213, 214, 229}, m = "requestShow")
/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$requestShow$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$requestShow$1(WebViewAdPlayer webViewAdPlayer, xd.d<? super WebViewAdPlayer$requestShow$1> dVar) {
        super(dVar);
        this.this$0 = webViewAdPlayer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.requestShow((Map<String, ? extends Object>) null, this);
    }
}
