package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.h3;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sr;
import com.applovin.impl.x3;
import com.applovin.mediation.MaxReward;

public class l extends h3 {

    /* renamed from: c  reason: collision with root package name */
    private final String f6483c;

    public l(String str, b bVar, sr srVar, Context context) {
        super(context);
        this.f6483c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.L0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (x3.e() && bVar.H0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(srVar);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f6483c, str, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
    }
}
