package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzelr implements zzepm {
    private final JSONObject zza;
    private final JSONObject zzb;

    public zzelr(JSONObject jSONObject, JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
