package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfci {
    final /* synthetic */ zzfcs zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfci(zzfcs zzfcs, Object obj, List list, zzfch zzfch) {
        this.zza = zzfcs;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfcr zza(Callable callable) {
        zzfui zzb2 = zzfuj.zzb(this.zzc);
        zzfut zza2 = zzb2.zza(zzfcg.zza, zzbzn.zzf);
        zzfcs zzfcs = this.zza;
        return new zzfcr(zzfcs, this.zzb, (String) null, zza2, this.zzc, zzb2.zza(callable, zzfcs.zzb), (zzfcq) null);
    }
}
