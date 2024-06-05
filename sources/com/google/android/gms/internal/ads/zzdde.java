package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdde implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;

    public zzdde(zzdcz zzdcz, zzgxl zzgxl) {
        this.zza = zzdcz;
        this.zzb = zzgxl;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdbu((zzctm) this.zzb.zzb(), zzbzn.zzf));
        zzgxg.zzb(singleton);
        return singleton;
    }
}
