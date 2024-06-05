package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafl implements zzacp {
    private final String zza;
    private final String zzb = "CLIENT_TYPE_ANDROID";
    private final String zzc;

    private zzafl(String str, String str2) {
        this.zza = str;
        this.zzc = str2;
    }

    public static zzafl zza(String str, String str2) {
        return new zzafl(str, str2);
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zza)) {
            jSONObject.put("tenantId", this.zza);
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("clientType", this.zzb);
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject.put("recaptchaVersion", this.zzc);
        }
        return jSONObject.toString();
    }
}
