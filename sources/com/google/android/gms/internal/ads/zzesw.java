package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesw implements zzepm {
    private final String zza;

    public zzesw(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                w0.f(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e10) {
            zzbza.zzk("Failed putting trustless token.", e10);
        }
    }
}
