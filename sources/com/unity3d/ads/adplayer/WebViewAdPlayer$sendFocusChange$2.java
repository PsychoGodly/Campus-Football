package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fe.a;
import kotlin.jvm.internal.n;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$sendFocusChange$2 extends n implements a<WebViewEvent> {
    final /* synthetic */ boolean $isFocused;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$sendFocusChange$2(boolean z10) {
        super(0);
        this.$isFocused = z10;
    }

    public final WebViewEvent invoke() {
        return new OnFocusChangeEvent(this.$isFocused);
    }
}
