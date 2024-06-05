package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzauc implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzatu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzaue zze;

    zzauc(zzaue zzaue, zzatu zzatu, WebView webView, boolean z10) {
        this.zze = zzaue;
        this.zzb = zzatu;
        this.zzc = webView;
        this.zzd = z10;
        this.zza = new zzaub(this, zzatu, webView, z10);
    }

    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue(MaxReward.DEFAULT_LABEL);
            }
        }
    }
}
