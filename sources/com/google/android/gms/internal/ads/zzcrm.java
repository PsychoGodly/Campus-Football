package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcrm implements Callable {
    public final /* synthetic */ zzcrt zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ zzfut zzc;
    public final /* synthetic */ zzfut zzd;

    public /* synthetic */ zzcrm(zzcrt zzcrt, zzfut zzfut, zzfut zzfut2, zzfut zzfut3) {
        this.zza = zzcrt;
        this.zzb = zzfut;
        this.zzc = zzfut2;
        this.zzd = zzfut3;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
