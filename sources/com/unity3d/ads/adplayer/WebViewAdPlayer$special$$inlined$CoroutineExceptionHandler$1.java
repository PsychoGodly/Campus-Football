package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import pe.l0;
import xd.a;
import xd.g;

/* compiled from: CoroutineExceptionHandler.kt */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends a implements l0 {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(l0.b bVar, WebViewAdPlayer webViewAdPlayer) {
        super(bVar);
        this.this$0 = webViewAdPlayer;
    }

    public void handleException(g gVar, Throwable th) {
        Storage.Companion.removeStorageEventCallback(this.this$0.storageEventCallback);
    }
}
