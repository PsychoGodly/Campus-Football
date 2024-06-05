package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcal implements Runnable {
    final /* synthetic */ zzcan zza;

    zzcal(zzcan zzcan) {
        this.zza = zzcan;
    }

    public final void run() {
        zzcan zzcan = this.zza;
        if (zzcan.zzr != null) {
            if (!zzcan.zzs) {
                zzcan.zzr.zzg();
                this.zza.zzs = true;
            }
            this.zza.zzr.zze();
        }
    }
}
