package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagx implements zzacs<zzagx> {
    private static final String zza = "zzagx";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagx zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("idToken", (String) null));
            this.zzc = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
