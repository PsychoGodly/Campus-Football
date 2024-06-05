package com.unity3d.services.ads.api;

import bb.d;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class GMAScar {
    private static final GMAScarAdapterBridge gmaScarAdapterBridge = GMA.getInstance().getBridge();

    @WebViewExposed
    public static void getSCARSignal(String str, String str2, WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.getSCARSignal(str, d.valueOf(str2.toUpperCase()));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.getVersion();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.initializeScar();
        webViewCallback.invoke(new Object[0]);
    }

    public static void isInitialized(WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.isInitialized();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.load(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, WebViewCallback webViewCallback) {
        gmaScarAdapterBridge.show(str, str2, bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }
}
