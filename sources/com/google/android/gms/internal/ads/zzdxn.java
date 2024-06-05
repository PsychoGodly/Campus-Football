package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdxn implements zzbly {
    zzdxn() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdxo zzdxo = (zzdxo) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) a0.c().zzb(zzbar.zziy)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdxo.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzdxo.zzd.zzd());
        }
        jSONObject2.put("base_url", zzdxo.zzd.zzb());
        jSONObject2.put("signals", zzdxo.zzc);
        jSONObject3.put("body", zzdxo.zzb.zzc);
        jSONObject3.put("headers", x.b().zzj(zzdxo.zzb.zzb));
        jSONObject3.put("response_code", zzdxo.zzb.zza);
        jSONObject3.put("latency", zzdxo.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdxo.zzd.zzg());
        return jSONObject;
    }
}
