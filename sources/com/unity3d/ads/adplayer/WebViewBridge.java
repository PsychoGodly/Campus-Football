package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import sd.w;
import se.z;
import xd.d;

/* compiled from: WebViewBridge.kt */
public interface WebViewBridge {
    z<Invocation> getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, d<? super Object[]> dVar);

    Object sendEvent(WebViewEvent webViewEvent, d<? super w> dVar);
}
