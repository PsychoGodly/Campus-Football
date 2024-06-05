package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbid implements zzbhp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    public final void zza(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = MaxReward.DEFAULT_LABEL;
        } else {
            str = "\n".concat(String.valueOf(str5));
        }
        synchronized (this.zza) {
            zzbic zzbic = (zzbic) this.zzb.remove(str2);
            if (zzbic == null) {
                zzbza.zzj("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                zzbic.zza(str4 + str);
            } else if (str6 == null) {
                zzbic.zzb((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (n1.c()) {
                        String jSONObject2 = jSONObject.toString(2);
                        n1.a("Result GMSG: " + jSONObject2);
                    }
                    zzbic.zzb(jSONObject);
                } catch (JSONException e10) {
                    zzbic.zza(e10.getMessage());
                }
            }
        }
    }

    public final zzfut zzb(zzbkv zzbkv, String str, JSONObject jSONObject) {
        zzbzs zzbzs = new zzbzs();
        t.r();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbib(this, zzbzs));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbkv.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzbzs.zze(e10);
        }
        return zzbzs;
    }

    public final void zzc(String str, zzbic zzbic) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbic);
        }
    }
}
