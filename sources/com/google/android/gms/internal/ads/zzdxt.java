package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxt implements zzftq {
    public static final /* synthetic */ zzdxt zza = new zzdxt();

    private /* synthetic */ zzdxt() {
    }

    public final zzfut zza(Object obj) {
        zzdyc zzdyc = (zzdyc) obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", zzdyc.zza);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : zzdyc.zzb.keySet()) {
                if (str != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : (List) zzdyc.zzb.get(str)) {
                        if (str2 != null) {
                            jSONArray.put(str2);
                        }
                    }
                    jSONObject2.put(str, jSONArray);
                }
            }
            jSONObject.put("headers", jSONObject2);
            String str3 = zzdyc.zzc;
            if (str3 != null) {
                jSONObject.put("body", str3);
            }
            jSONObject.put("latency", zzdyc.zzd);
            return zzfuj.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (JSONException e10) {
            zzbza.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e10.getMessage())));
            throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e10.getCause())));
        }
    }
}
