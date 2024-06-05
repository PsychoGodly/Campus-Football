package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagh implements zzacs<zzagh> {
    private static final String zza = "zzagh";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagh zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("idToken", (String) null));
            this.zzc = q.a(jSONObject.optString("displayName", (String) null));
            this.zzd = q.a(jSONObject.optString("email", (String) null));
            this.zze = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
