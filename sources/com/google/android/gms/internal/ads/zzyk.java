package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzyk implements Runnable {
    public final /* synthetic */ zzyo zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzyk(zzyo zzyo, String str, long j10, long j11) {
        this.zza = zzyo;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
