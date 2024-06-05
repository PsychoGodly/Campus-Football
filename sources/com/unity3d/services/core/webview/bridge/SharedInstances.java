package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.m;

/* compiled from: SharedInstances.kt */
public final class SharedInstances {
    public static final SharedInstances INSTANCE = new SharedInstances();
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = a.f32083a;
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new SharedInstances$webViewAppNativeCallbackSubject$1();
    private static final IWebViewBridge webViewBridge = new SharedInstances$webViewBridge$1();
    private static final IEventSender webViewEventSender = new SharedInstances$webViewEventSender$1();

    private SharedInstances() {
    }

    /* access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation invocation) {
        m.e(invocation, "it");
        WebViewApp.getCurrentApp().invokeCallback(invocation);
    }

    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
