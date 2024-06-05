package com.startapp;

import android.webkit.WebView;
import u9.a;

/* compiled from: Sta */
public class fb extends a {
    public fb(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
