package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzduc implements Callable {
    public final /* synthetic */ zzdue zza;
    public final /* synthetic */ zzbtn zzb;

    public /* synthetic */ zzduc(zzdue zzdue, zzbtn zzbtn) {
        this.zza = zzdue;
        this.zzb = zzbtn;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
