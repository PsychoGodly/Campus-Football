package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcai implements Runnable {
    final /* synthetic */ zzcan zza;

    zzcai(zzcan zzcan) {
        this.zza = zzcan;
    }

    public final void run() {
        zzcan zzcan = this.zza;
        if (zzcan.zzr != null) {
            zzcan.zzr.zzh();
        }
    }
}
