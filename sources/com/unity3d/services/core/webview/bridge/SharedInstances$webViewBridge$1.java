package com.unity3d.services.core.webview.bridge;

/* compiled from: SharedInstances.kt */
public final class SharedInstances$webViewBridge$1 implements IWebViewBridge {
    SharedInstances$webViewBridge$1() {
    }

    public void handleCallback(String str, String str2, Object[] objArr) throws Exception {
        WebViewBridge.getInstance().handleCallback(str, str2, objArr);
    }

    public void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception {
        WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
    }
}
