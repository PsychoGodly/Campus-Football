package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcte implements zzcxj {
    private final Context zza;
    private final zzeyx zzb;
    private final zzbzg zzc;
    private final p1 zzd;
    private final zzdrk zze;
    private final zzfep zzf;

    public zzcte(Context context, zzeyx zzeyx, zzbzg zzbzg, p1 p1Var, zzdrk zzdrk, zzfep zzfep) {
        this.zza = context;
        this.zzb = zzeyx;
        this.zzc = zzbzg;
        this.zzd = p1Var;
        this.zze = zzdrk;
        this.zzf = zzfep;
    }

    public final void zzb(zzeyo zzeyo) {
    }

    public final void zzbA(zzbtn zzbtn) {
        if (((Boolean) a0.c().zzb(zzbar.zzdz)).booleanValue()) {
            t.c().c(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
