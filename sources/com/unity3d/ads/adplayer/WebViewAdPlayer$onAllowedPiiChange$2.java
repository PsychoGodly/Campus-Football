package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fe.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: WebViewAdPlayer.kt */
final class WebViewAdPlayer$onAllowedPiiChange$2 extends n implements a<WebViewEvent> {
    final /* synthetic */ byte[] $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$onAllowedPiiChange$2(byte[] bArr) {
        super(0);
        this.$value = bArr;
    }

    public final WebViewEvent invoke() {
        String encodeToString = Base64.encodeToString(this.$value, 2);
        m.d(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
        return new OnAllowedPiiChangeEvent(encodeToString);
    }
}
