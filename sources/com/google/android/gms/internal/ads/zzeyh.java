package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.w0;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyh {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzeyh(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject h10 = w0.h(jsonReader);
        this.zzd = h10;
        this.zza = h10.optString("ad_html", (String) null);
        this.zzb = h10.optString("ad_base_url", (String) null);
        this.zzc = h10.optJSONObject("ad_json");
    }
}
