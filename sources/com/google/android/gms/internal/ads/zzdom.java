package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdom implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzdom(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String str = (String) this.zza.zzb();
        Context zza2 = ((zzcgj) this.zzb).zza();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        Map zzd2 = ((zzgxc) this.zzd).zzb();
        if (((Boolean) a0.c().zzb(zzbar.zzew)).booleanValue()) {
            zzawe zzawe = new zzawe(new zzawk(zza2));
            zzawe.zzb(new zzdon(str));
            set = Collections.singleton(new zzdbu(new zzdop(zzawe, zzd2), zzfuu));
        } else {
            set = Collections.emptySet();
        }
        zzgxg.zzb(set);
        return set;
    }
}
