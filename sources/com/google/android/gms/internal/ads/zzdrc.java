package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdrc implements Callable {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ zzfec zzb;

    public /* synthetic */ zzdrc(zzdrk zzdrk, zzfec zzfec) {
        this.zza = zzdrk;
        this.zzb = zzfec;
    }

    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}
