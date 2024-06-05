package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbw zza;

    /* synthetic */ zzbv(zzbw zzbw, zzbu zzbu) {
        this.zza = zzbw;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (zzbw.zze(this.zza, str)) {
            this.zza.zzb.zzd(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.zza.zzc) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            this.zza.zzc = true;
        }
    }

    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zza.zzb.zze(i10, str, str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!zzbw.zze(this.zza, uri)) {
            return false;
        }
        this.zza.zzb.zzd(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzbw.zze(this.zza, str)) {
            return false;
        }
        this.zza.zzb.zzd(str);
        return true;
    }
}
