package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagm implements zzagg {
    private final String zza;
    private final String zzb;

    private zzagm(String str, String str2) {
        this.zza = q.g(str);
        this.zzb = str2;
    }

    public static zzagm zza(String str, String str2) {
        return new zzagm(str, str2);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
