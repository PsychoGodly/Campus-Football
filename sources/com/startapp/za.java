package com.startapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: Sta */
public class za implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f17609b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ va f17610c;

    public za(va vaVar, String str, WebView webView) {
        this.f17610c = vaVar;
        this.f17608a = str;
        this.f17609b = webView;
    }

    public void run() {
        va vaVar = this.f17610c;
        vaVar.f17436f = this.f17608a;
        WebView webView = this.f17609b;
        try {
            webView.setWebViewClient((WebViewClient) null);
            vaVar.f17435e.addLast(webView);
        } catch (Throwable th) {
            if (vaVar.a(4)) {
                i3.a(th);
            }
        }
    }
}
