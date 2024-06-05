package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgq implements zzbhp {
    public final /* synthetic */ zzdcc zza;

    public /* synthetic */ zzbgq(zzdcc zzdcc) {
        this.zza = zzdcc;
    }

    public final void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        zzbho.zzd(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzbza.zzj("URL missing from click GMSG.");
        } else {
            zzfuj.zzq(zzbho.zzb(zzcei, str), new zzbhf(zzcei), zzbzn.zza);
        }
    }
}
