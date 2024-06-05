package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import r4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzbiu implements b {
    public final /* synthetic */ WebView zza;

    public /* synthetic */ zzbiu(WebView webView) {
        this.zza = webView;
    }

    public final void onH5AdsEvent(String str) {
        WebView webView = this.zza;
        int i10 = zzbiv.zza;
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
