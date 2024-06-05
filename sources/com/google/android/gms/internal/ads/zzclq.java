package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzclq {
    private final Map zza;
    private final Map zzb;

    zzclq(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzeyo zzeyo) throws Exception {
        for (zzeym zzeym : zzeyo.zzb.zzc) {
            if (this.zza.containsKey(zzeym.zza)) {
                ((zzclt) this.zza.get(zzeym.zza)).zza(zzeym.zzb);
            } else if (this.zzb.containsKey(zzeym.zza)) {
                zzcls zzcls = (zzcls) this.zzb.get(zzeym.zza);
                JSONObject jSONObject = zzeym.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcls.zza(hashMap);
            }
        }
    }
}
