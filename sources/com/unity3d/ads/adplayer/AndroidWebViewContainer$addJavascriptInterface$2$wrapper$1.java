package com.unity3d.ads.adplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import kotlin.jvm.internal.m;

/* compiled from: AndroidWebViewContainer.kt */
public final class AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1 implements WebViewBridgeInterface {
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;

    AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(WebViewBridge webViewBridge) {
        this.$webViewBridgeInterface = webViewBridge;
    }

    @JavascriptInterface
    public void handleCallback(String str, String str2, String str3) {
        m.e(str, "callbackId");
        m.e(str2, "callbackStatus");
        m.e(str3, "rawParameters");
        this.$webViewBridgeInterface.handleCallback(str, str2, str3);
    }

    @JavascriptInterface
    public void handleInvocation(String str) {
        m.e(str, "message");
        this.$webViewBridgeInterface.handleInvocation(str);
    }
}
