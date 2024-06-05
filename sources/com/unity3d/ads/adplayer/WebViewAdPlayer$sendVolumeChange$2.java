package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$sendVolumeChange$2 extends n implements a<WebViewEvent> {
    final /* synthetic */ double $volume;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendVolumeChange$2(double d10) {
        super(0);
        this.$volume = d10;
    }

    public final WebViewEvent invoke() {
        return new OnVolumeChangeEvent(this.$volume);
    }
}
