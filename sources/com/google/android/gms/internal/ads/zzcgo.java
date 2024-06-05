package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcgo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcgo(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdrm zzdrm = (zzdrm) this.zza.zzb();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        if (((Boolean) a0.c().zzb(zzbar.zzbw)).booleanValue()) {
            set = Collections.singleton(new zzdbu(zzdrm, zzfuu));
        } else {
            set = Collections.emptySet();
        }
        zzgxg.zzb(set);
        return set;
    }
}
