package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeez implements zzeav {
    private final Map zza = new HashMap();
    private final zzdnd zzb;

    public zzeez(zzdnd zzdnd) {
        this.zzb = zzdnd;
    }

    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzeaw zzeaw;
        synchronized (this) {
            zzeaw = (zzeaw) this.zza.get(str);
            if (zzeaw == null) {
                zzeaw = new zzeaw(this.zzb.zzc(str, jSONObject), new zzecr(), str);
                this.zza.put(str, zzeaw);
            }
        }
        return zzeaw;
    }
}
