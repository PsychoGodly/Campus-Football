package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcdb implements Runnable {
    public final /* synthetic */ zzcbj zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcdb(zzcbj zzcbj, boolean z10, long j10) {
        this.zza = zzcbj;
        this.zzb = z10;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzv(this.zzb, this.zzc);
    }
}
