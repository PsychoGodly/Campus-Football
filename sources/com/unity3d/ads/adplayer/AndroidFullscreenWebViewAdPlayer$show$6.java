package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.SessionChange;
import fe.p;
import kotlin.jvm.internal.k;
import sd.w;
import xd.d;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$6 extends k implements p<SessionChange, d<? super w>, Object> {
    AndroidFullscreenWebViewAdPlayer$show$6(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(SessionChange sessionChange, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, dVar);
    }
}
