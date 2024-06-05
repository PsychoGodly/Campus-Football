package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaha  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaha implements zzacp {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaha(String str, String str2, String str3) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
