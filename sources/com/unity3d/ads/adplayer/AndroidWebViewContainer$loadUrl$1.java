package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {45, 49, 51}, m = "loadUrl")
/* compiled from: AndroidWebViewContainer.kt */
final class AndroidWebViewContainer$loadUrl$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$loadUrl$1(AndroidWebViewContainer androidWebViewContainer, xd.d<? super AndroidWebViewContainer$loadUrl$1> dVar) {
        super(dVar);
        this.this$0 = androidWebViewContainer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.loadUrl((String) null, this);
    }
}
