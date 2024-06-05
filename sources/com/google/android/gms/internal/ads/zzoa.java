package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzoa implements Runnable {
    public final /* synthetic */ zzob zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzoa(zzob zzob, int i10, long j10, long j11) {
        this.zza = zzob;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}
