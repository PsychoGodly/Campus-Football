package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfgn implements Runnable {
    final /* synthetic */ zzfgo zza;
    private final WebView zzb;

    zzfgn(zzfgo zzfgo) {
        this.zza = zzfgo;
        this.zzb = zzfgo.zza;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
