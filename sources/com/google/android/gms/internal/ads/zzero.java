package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzero implements zzepm {
    private final JSONObject zza;

    public zzero(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zza);
        } catch (JSONException unused) {
            n1.a("Unable to get cache_state");
        }
    }
}
