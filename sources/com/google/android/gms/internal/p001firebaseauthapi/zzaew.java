package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaew  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaew implements zzaet {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaew(String str, String str2, String str3, String str4, String str5) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzaew zza(String str, String str2, String str3, String str4) {
        q.g(str2);
        q.g(str4);
        return new zzaew("totp", str, str2, str3, str4);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("verificationCode", str);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("mfaEnrollmentId", str3);
        }
        return jSONObject.toString();
    }
}
