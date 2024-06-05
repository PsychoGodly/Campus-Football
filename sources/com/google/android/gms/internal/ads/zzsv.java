package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzsv implements Runnable {
    public final /* synthetic */ zztb zza;
    public final /* synthetic */ zztc zzb;
    public final /* synthetic */ zzso zzc;

    public /* synthetic */ zzsv(zztb zztb, zztc zztc, zzso zzso) {
        this.zza = zztb;
        this.zzb = zztc;
        this.zzc = zzso;
    }

    public final void run() {
        zztb zztb = this.zza;
        this.zzb.zzaf(0, zztb.zzb, this.zzc);
    }
}
