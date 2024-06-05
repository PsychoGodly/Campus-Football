package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.a1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgs implements zzbhp {
    public static final /* synthetic */ zzbgs zza = new zzbgs();

    private /* synthetic */ zzbgs() {
    }

    public final void zza(Object obj, Map map) {
        zzcfj zzcfj = (zzcfj) obj;
        zzbhp zzbhp = zzbho.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zzbza.zzj("URL missing from httpTrack GMSG.");
        } else {
            new a1(zzcfj.getContext(), ((zzcfr) zzcfj).zzn().zza, str).zzb();
        }
    }
}
