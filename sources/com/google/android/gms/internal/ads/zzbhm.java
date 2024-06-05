package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhm implements zzbhp {
    zzbhm() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        if (map.keySet().contains("start")) {
            zzcei.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcei.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcei.zzN().zzk();
        }
    }
}
