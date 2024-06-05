package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdtl implements Callable {
    public final /* synthetic */ zzapw zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdtl(zzapw zzapw, Context context) {
        this.zza = zzapw;
        this.zzb = context;
    }

    public final Object call() {
        zzapw zzapw = this.zza;
        return zzapw.zzc().zzg(this.zzb);
    }
}
