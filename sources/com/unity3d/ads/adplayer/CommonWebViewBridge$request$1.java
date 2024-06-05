package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {61, 63}, m = "request")
/* compiled from: CommonWebViewBridge.kt */
final class CommonWebViewBridge$request$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$request$1(CommonWebViewBridge commonWebViewBridge, xd.d<? super CommonWebViewBridge$request$1> dVar) {
        super(dVar);
        this.this$0 = commonWebViewBridge;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.request((String) null, (String) null, (Object[]) null, this);
    }
}
