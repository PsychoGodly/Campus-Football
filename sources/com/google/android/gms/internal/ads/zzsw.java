package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzsw implements Runnable {
    public final /* synthetic */ zztb zza;
    public final /* synthetic */ zztc zzb;
    public final /* synthetic */ zzsj zzc;
    public final /* synthetic */ zzso zzd;

    public /* synthetic */ zzsw(zztb zztb, zztc zztc, zzsj zzsj, zzso zzso) {
        this.zza = zztb;
        this.zzb = zztc;
        this.zzc = zzsj;
        this.zzd = zzso;
    }

    public final void run() {
        zztb zztb = this.zza;
        this.zzb.zzag(0, zztb.zzb, this.zzc, this.zzd);
    }
}
