package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedh implements zzeav {
    private final zzdnd zza;

    public zzedh(zzdnd zzdnd) {
        this.zza = zzdnd;
    }

    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        return new zzeaw(this.zza.zzc(str, jSONObject), new zzecq(), str);
    }
}
