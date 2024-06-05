package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import fe.p;
import kotlin.jvm.internal.k;
import sd.w;
import xd.d;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends k implements p<VolumeSettingsChange, d<? super w>, Object> {
    AndroidFullscreenWebViewAdPlayer$show$3(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(VolumeSettingsChange volumeSettingsChange, d<? super w> dVar) {
        return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, dVar);
    }
}
