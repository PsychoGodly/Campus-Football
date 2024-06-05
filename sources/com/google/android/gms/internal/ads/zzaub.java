package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzaub implements ValueCallback {
    public final /* synthetic */ zzauc zza;
    public final /* synthetic */ zzatu zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzaub(zzauc zzauc, zzatu zzatu, WebView webView, boolean z10) {
        this.zza = zzauc;
        this.zzb = zzatu;
        this.zzc = webView;
        this.zzd = z10;
    }

    public final void onReceiveValue(Object obj) {
        zzauc zzauc = this.zza;
        zzatu zzatu = this.zzb;
        WebView webView = this.zzc;
        boolean z10 = this.zzd;
        zzauc.zze.zzd(zzatu, webView, (String) obj, z10);
    }
}
