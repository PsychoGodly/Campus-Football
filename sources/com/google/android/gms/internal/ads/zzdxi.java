package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxi implements Callable {
    public final /* synthetic */ zzfut zza;
    public final /* synthetic */ zzfut zzb;

    public /* synthetic */ zzdxi(zzfut zzfut, zzfut zzfut2) {
        this.zza = zzfut;
        this.zzb = zzfut2;
    }

    public final Object call() {
        zzfut zzfut = this.zza;
        zzfut zzfut2 = this.zzb;
        return new zzdxo((zzdyc) zzfut.get(), ((zzdxm) zzfut2.get()).zzb, ((zzdxm) zzfut2.get()).zza);
    }
}
