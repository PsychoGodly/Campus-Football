package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzafz implements zzacp {
    public static zzafy zzg() {
        return new zzaej();
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", zzc());
        jSONObject.put("token", zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzaey zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
