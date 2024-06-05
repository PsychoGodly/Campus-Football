package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhn implements zzbhp {
    zzbhn() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        if (map.keySet().contains("start")) {
            zzcei.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcei.zzas(false);
        }
    }
}
