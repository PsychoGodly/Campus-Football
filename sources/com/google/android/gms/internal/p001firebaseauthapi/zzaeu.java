package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaeu implements zzaet {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaeu(String str, String str2, String str3, String str4, String str5) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzaeu zza(String str, String str2, String str3, String str4) {
        q.g(str3);
        q.g(str2);
        return new zzaeu("phone", str, str2, str3, str4);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
