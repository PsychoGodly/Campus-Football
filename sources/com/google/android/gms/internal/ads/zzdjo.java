package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdjo {
    private final Executor zza;
    private final zzdjj zzb;

    public zzdjo(Executor executor, zzdjj zzdjj) {
        this.zza = executor;
        this.zzb = zzdjj;
    }

    public final zzfut zza(JSONObject jSONObject, String str) {
        zzfut zzfut;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzfut = zzfuj.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString(MediationMetaData.KEY_NAME);
                if (optString == null) {
                    zzfut = zzfuj.zzh((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzfut = zzfuj.zzh(new zzdjn(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzfut = zzfuj.zzl(this.zzb.zze(optJSONObject, "image_value"), new zzdjl(optString), this.zza);
                    } else {
                        zzfut = zzfuj.zzh((Object) null);
                    }
                }
            }
            arrayList.add(zzfut);
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), zzdjm.zza, this.zza);
    }
}
