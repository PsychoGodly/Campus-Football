package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhl implements zzbhp {
    zzbhl() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcei.zzbj();
        } else if ("resume".equals(str)) {
            zzcei.zzbk();
        }
    }
}
