package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {59}, m = "evaluateJavascript")
/* compiled from: AndroidWebViewContainer.kt */
final class AndroidWebViewContainer$evaluateJavascript$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$evaluateJavascript$1(AndroidWebViewContainer androidWebViewContainer, xd.d<? super AndroidWebViewContainer$evaluateJavascript$1> dVar) {
        super(dVar);
        this.this$0 = androidWebViewContainer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.evaluateJavascript((String) null, this);
    }
}
