package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcah implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcan zzc;

    zzcah(zzcan zzcan, String str, String str2) {
        this.zzc = zzcan;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        zzcan zzcan = this.zzc;
        if (zzcan.zzr != null) {
            zzcan.zzr.zzb(this.zza, this.zzb);
        }
    }
}
