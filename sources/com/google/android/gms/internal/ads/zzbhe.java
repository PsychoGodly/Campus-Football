package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhe implements zzbhp {
    zzbhe() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfnb.zzc("true", str)) {
                if (!zzfnb.zzc("false", str)) {
                    return;
                }
            }
            zzfkw.zzi(zzcei.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            t.q().zzu(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
