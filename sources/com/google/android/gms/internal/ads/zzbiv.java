package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import r4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbiv extends zzbii {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final a zzc;
    private final WebView zzd;

    public zzbiv(Context context, WebView webView) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(webView);
        zzfnu.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new a(context, new zzbiu(webView));
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzbza.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.b(str)) {
            super.onLoadResource(webView, str);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.b(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzc.a();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzfnu.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzc(webView)) {
            return false;
        }
        if (this.zzc.b(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
