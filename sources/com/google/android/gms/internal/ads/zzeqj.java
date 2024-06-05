package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqj implements zzepm {
    private final String zza;

    public zzeqj(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e10) {
            n1.b("Failed putting Ad ID.", e10);
        }
    }
}
