package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxf implements Callable {
    public final /* synthetic */ zzdxp zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ zzfut zzc;
    public final /* synthetic */ zzbtn zzd;
    public final /* synthetic */ zzfec zze;

    public /* synthetic */ zzdxf(zzdxp zzdxp, zzfut zzfut, zzfut zzfut2, zzbtn zzbtn, zzfec zzfec) {
        this.zza = zzdxp;
        this.zzb = zzfut;
        this.zzc = zzfut2;
        this.zzd = zzbtn;
        this.zze = zzfec;
    }

    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
