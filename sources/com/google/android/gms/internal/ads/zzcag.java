package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcag implements Runnable {
    final /* synthetic */ zzcan zza;

    zzcag(zzcan zzcan) {
        this.zza = zzcan;
    }

    public final void run() {
        zzcan zzcan = this.zza;
        if (zzcan.zzr != null) {
            zzcan.zzr.zza();
        }
    }
}
