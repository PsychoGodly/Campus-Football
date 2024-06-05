package com.startapp;

import android.webkit.WebView;

/* compiled from: Sta */
public class dc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f15766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15767b;

    public dc(WebView webView, String str) {
        this.f15766a = webView;
        this.f15767b = str;
    }

    public void run() {
        this.f15766a.loadUrl(this.f15767b);
    }
}
