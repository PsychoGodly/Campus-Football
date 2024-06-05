package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzwo implements Runnable {
    public final /* synthetic */ zzwp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzwo(zzwp zzwp, int i10, long j10, long j11) {
        this.zza = zzwp;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        zzwp zzwp = this.zza;
        zzwp.zzb.zzY(this.zzb, this.zzc, this.zzd);
    }
}
