package com.unity3d.services.core.webview;

import android.webkit.ValueCallback;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f32084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f32086c;

    public /* synthetic */ c(WebView webView, String str, ValueCallback valueCallback) {
        this.f32084a = webView;
        this.f32085b = str;
        this.f32086c = valueCallback;
    }

    public final void run() {
        WebView.evaluateJavascript$lambda$1(this.f32084a, this.f32085b, this.f32086c);
    }
}
