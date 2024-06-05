package com.unity3d.ads.adplayer;

import fe.p;
import kotlin.jvm.internal.a;
import sd.w;
import xd.d;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$2 extends a implements p<DisplayMessage, d<? super w>, Object> {
    AndroidFullscreenWebViewAdPlayer$show$2(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
    }

    public final Object invoke(DisplayMessage displayMessage, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer) this.receiver).displayEventsRouter(displayMessage);
    }
}
