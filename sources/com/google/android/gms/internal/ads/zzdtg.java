package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdtg implements Callable {
    public final /* synthetic */ zzdtj zza;
    public final /* synthetic */ zzbtn zzb;

    public /* synthetic */ zzdtg(zzdtj zzdtj, zzbtn zzbtn) {
        this.zza = zzdtj;
        this.zzb = zzbtn;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
