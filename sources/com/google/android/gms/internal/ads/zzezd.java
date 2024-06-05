package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzezd implements zzbhp {
    public final /* synthetic */ zzfff zza;
    public final /* synthetic */ zzeaf zzb;

    public /* synthetic */ zzezd(zzfff zzfff, zzeaf zzeaf) {
        this.zza = zzfff;
        this.zzb = zzeaf;
    }

    public final void zza(Object obj, Map map) {
        zzfff zzfff = this.zza;
        zzeaf zzeaf = this.zzb;
        zzcdz zzcdz = (zzcdz) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zzbza.zzj("URL missing from httpTrack GMSG.");
        } else if (!zzcdz.zzD().zzaj) {
            zzfff.zzc(str, (zzfen) null);
        } else {
            zzeaf.zzd(new zzeah(t.b().a(), ((zzcff) zzcdz).zzP().zzb, str, 2));
        }
    }
}
