package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {92, 97, 101, 103}, m = "destroy")
/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
final class AndroidFullscreenWebViewAdPlayer$destroy$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$destroy$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, xd.d<? super AndroidFullscreenWebViewAdPlayer$destroy$1> dVar) {
        super(dVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.destroy(this);
    }
}
