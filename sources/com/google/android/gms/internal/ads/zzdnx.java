package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdnx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdnx(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        zzdop zza2 = ((zzdoq) this.zzb).zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzew)).booleanValue()) {
            set = Collections.singleton(new zzdbu(zza2, zzfuu));
        } else {
            set = Collections.emptySet();
        }
        zzgxg.zzb(set);
        return set;
    }
}
