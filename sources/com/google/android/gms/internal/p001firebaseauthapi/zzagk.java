package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagk implements zzagg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzaee zzg;
    private final String zzh = null;

    private zzagk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzagk zza(String str, String str2, String str3, String str4, String str5, String str6) {
        q.g(str2);
        return new zzagk(str, "phone", str2, str3, str4, str5, (String) null);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("playIntegrityToken", this.zzf);
            }
            zzaee zzaee = this.zzg;
            if (zzaee != null) {
                jSONObject2.put("autoRetrievalInfo", zzaee.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaee zzaee) {
        this.zzg = zzaee;
    }
}
