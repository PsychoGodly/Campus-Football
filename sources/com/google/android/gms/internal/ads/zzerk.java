package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerk implements zzepm {
    private final String zza;

    public zzerk(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject f10 = w0.f((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zza)) {
                f10.put("attok", this.zza);
            }
        } catch (JSONException e10) {
            n1.b("Failed putting attestation token.", e10);
        }
    }
}
