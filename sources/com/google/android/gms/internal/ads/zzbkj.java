package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.x;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbkj {
    public static void zza(zzbkk zzbkk, String str, Map map) {
        try {
            zzbkk.zze(str, x.b().zzj(map));
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbkk zzbkk, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        zzbza.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzbkk.zza(sb2.toString());
    }

    public static void zzc(zzbkk zzbkk, String str, String str2) {
        zzbkk.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbkk zzbkk, String str, JSONObject jSONObject) {
        zzbkk.zzb(str, jSONObject.toString());
    }
}
