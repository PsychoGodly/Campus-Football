package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagi implements zzacp {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzaee zzh;

    private zzagi(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = q.g(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzagi zza(String str, String str2, String str3, String str4, String str5, String str6) {
        q.g(str3);
        return new zzagi("phone", str, str2, str3, str4, str5, str6);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            zzaee zzaee = this.zzh;
            if (zzaee != null) {
                jSONObject2.put("autoRetrievalInfo", zzaee.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaee zzaee) {
        this.zzh = zzaee;
    }
}
