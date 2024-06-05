package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfgd implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzfgd(zzfge zzfge, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
