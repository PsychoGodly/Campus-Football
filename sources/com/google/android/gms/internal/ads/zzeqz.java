package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqz implements zzepm {
    private final JSONObject zza;

    public zzeqz(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject f10 = w0.f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zza;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f10.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            n1.a("Failed putting app indexing json.");
        }
    }
}
