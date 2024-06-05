package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdul implements zzftq {
    public final /* synthetic */ zzduo zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdul(zzduo zzduo, String str, String str2) {
        this.zza = zzduo;
        this.zzb = str;
        this.zzc = str2;
    }

    public final zzfut zza(Object obj) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", MaxReward.DEFAULT_LABEL);
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzfuj.zzh(jSONObject);
        } catch (JSONException e10) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
        }
    }
}
