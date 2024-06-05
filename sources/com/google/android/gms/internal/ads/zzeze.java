package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeze implements zzbhp {
    public final /* synthetic */ zzdcc zza;
    public final /* synthetic */ zzfff zzb;
    public final /* synthetic */ zzeaf zzc;

    public /* synthetic */ zzeze(zzdcc zzdcc, zzfff zzfff, zzeaf zzeaf) {
        this.zza = zzdcc;
        this.zzb = zzfff;
        this.zzc = zzeaf;
    }

    public final void zza(Object obj, Map map) {
        zzdcc zzdcc = this.zza;
        zzfff zzfff = this.zzb;
        zzeaf zzeaf = this.zzc;
        zzcei zzcei = (zzcei) obj;
        zzbho.zzd(map, zzdcc);
        String str = (String) map.get("u");
        if (str == null) {
            zzbza.zzj("URL missing from click GMSG.");
        } else {
            zzfuj.zzq(zzbho.zzb(zzcei, str), new zzezf(zzcei, zzfff, zzeaf), zzbzn.zza);
        }
    }
}
