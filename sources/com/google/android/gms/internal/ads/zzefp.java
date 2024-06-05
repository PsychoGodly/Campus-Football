package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzefp implements zzeav {
    private final zzegt zza;

    public zzefp(zzegt zzegt) {
        this.zza = zzegt;
    }

    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzbpc zza2 = this.zza.zza(str);
        if (zza2 == null) {
            return null;
        }
        return new zzeaw(zza2, new zzecq(), str);
    }
}
