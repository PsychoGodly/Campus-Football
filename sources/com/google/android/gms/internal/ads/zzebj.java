package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzebj implements zzeba {
    private final Context zza;
    private final zzcny zzb;
    private final Executor zzc;

    zzebj(Context context, zzcny zzcny, Executor executor) {
        this.zza = context;
        this.zzb = zzcny;
        this.zzc = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzcnv zza2 = this.zzb.zza(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdcz(new zzebi(zzeaw), (zzcei) null), new zzcnw(zzeyc.zzab));
        zza2.zzd().zzm(new zzcmm((zzezs) zzeaw.zzb), this.zzc);
        ((zzecq) zzeaw.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        ((zzezs) zzeaw.zzb).zzl(this.zza, zzeyo.zza.zza.zzd, zzeyc.zzw.toString(), (zzbnl) zzeaw.zzc);
    }
}
