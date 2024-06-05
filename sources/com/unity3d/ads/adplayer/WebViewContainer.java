package com.unity3d.ads.adplayer;

import sd.w;
import xd.d;

/* compiled from: WebViewContainer.kt */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, d<? super w> dVar);

    Object destroy(d<? super w> dVar);

    Object evaluateJavascript(String str, d<? super w> dVar);

    Object loadUrl(String str, d<? super w> dVar);
}
