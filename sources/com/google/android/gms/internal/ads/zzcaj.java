package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcaj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcan zzc;

    zzcaj(zzcan zzcan, int i10, int i11) {
        this.zzc = zzcan;
        this.zza = i10;
        this.zzb = i11;
    }

    public final void run() {
        zzcan zzcan = this.zzc;
        if (zzcan.zzr != null) {
            zzcan.zzr.zzj(this.zza, this.zzb);
        }
    }
}
