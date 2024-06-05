package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.m;

/* compiled from: SharedInstances.kt */
public final class SharedInstances$webViewAppNativeCallbackSubject$1 implements INativeCallbackSubject {
    SharedInstances$webViewAppNativeCallbackSubject$1() {
    }

    public NativeCallback getCallback(String str) {
        m.e(str, "callbackId");
        NativeCallback callback = WebViewApp.getCurrentApp().getCallback(str);
        m.d(callback, "getCurrentApp().getCallback(callbackId)");
        return callback;
    }

    public void remove(NativeCallback nativeCallback) {
        m.e(nativeCallback, "callback");
        WebViewApp.getCurrentApp().removeCallback(nativeCallback);
    }
}
