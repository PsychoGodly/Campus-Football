package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$sendMuteChange$2 extends n implements a<WebViewEvent> {
    final /* synthetic */ boolean $isMuted;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendMuteChange$2(boolean z10) {
        super(0);
        this.$isMuted = z10;
    }

    public final WebViewEvent invoke() {
        return new OnMuteChangeEvent(this.$isMuted);
    }
}
