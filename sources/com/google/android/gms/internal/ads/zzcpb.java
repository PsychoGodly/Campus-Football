package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcpb implements zzgwy {
    private final zzcor zza;
    private final zzgxl zzb;

    public zzcpb(zzcor zzcor, zzgxl zzgxl) {
        this.zza = zzcor;
        this.zzb = zzgxl;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdbu((zzcqb) this.zzb.zzb(), zzbzn.zzf));
        zzgxg.zzb(singleton);
        return singleton;
    }
}
