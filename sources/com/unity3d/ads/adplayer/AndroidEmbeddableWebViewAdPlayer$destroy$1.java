package com.unity3d.ads.adplayer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {55, 58, 60}, m = "destroy")
/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
final class AndroidEmbeddableWebViewAdPlayer$destroy$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$destroy$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, xd.d<? super AndroidEmbeddableWebViewAdPlayer$destroy$1> dVar) {
        super(dVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.destroy(this);
    }
}
