package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.n1;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyh {
    private final zzbty zza;

    zzdyh(zzbty zzbty) {
        this.zza = zzbty;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", MaxReward.DEFAULT_LABEL))) {
                    map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", MaxReward.DEFAULT_LABEL));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", MaxReward.DEFAULT_LABEL))) {
                    map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", MaxReward.DEFAULT_LABEL));
                    return;
                }
                return;
            }
            n1.a("DSID signal does not exist.");
        }
    }

    public final void zzb() {
        zzbzq.zza(this.zza.zza(), "persistFlags");
    }
}
