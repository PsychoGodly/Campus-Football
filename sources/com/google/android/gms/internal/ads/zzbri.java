package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbri {
    public final boolean zza;
    public final String zzb;

    public zzbri(boolean z10, String str) {
        this.zza = z10;
        this.zzb = str;
    }

    public static zzbri zza(JSONObject jSONObject) {
        return new zzbri(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", MaxReward.DEFAULT_LABEL));
    }
}
