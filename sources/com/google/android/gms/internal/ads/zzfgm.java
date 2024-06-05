package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgm extends zzfgl {
    public zzfgm(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzi(webView);
    }
}
