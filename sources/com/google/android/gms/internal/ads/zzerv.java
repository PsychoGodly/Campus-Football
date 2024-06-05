package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerv implements zzepm {
    private final String zza;
    private final String zzb;

    public zzerv(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject f10 = w0.f((JSONObject) obj, "pii");
            f10.put("doritos", this.zza);
            f10.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            n1.a("Failed putting doritos string.");
        }
    }
}
