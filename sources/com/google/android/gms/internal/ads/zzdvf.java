package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdvf implements zzdvh {
    private final Map zza;
    private final zzfuu zzb;
    /* access modifiers changed from: private */
    public final zzcxh zzc;

    public zzdvf(Map map, zzfuu zzfuu, zzcxh zzcxh) {
        this.zza = map;
        this.zzb = zzfuu;
        this.zzc = zzcxh;
    }

    public final zzfut zzb(zzbtn zzbtn) {
        this.zzc.zzbA(zzbtn);
        zzfut zzg = zzfuj.zzg(new zzdtf(3));
        for (String trim : ((String) a0.c().zzb(zzbar.zzhB)).split(",")) {
            zzgxl zzgxl = (zzgxl) this.zza.get(trim.trim());
            if (zzgxl != null) {
                zzg = zzfuj.zzf(zzg, zzdtf.class, new zzdvd(zzgxl, zzbtn), this.zzb);
            }
        }
        zzfuj.zzq(zzg, new zzdve(this), zzbzn.zzf);
        return zzg;
    }
}
