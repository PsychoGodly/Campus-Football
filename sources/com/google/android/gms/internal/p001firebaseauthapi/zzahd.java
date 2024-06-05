package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzahd implements zzacs<zzahd> {
    private static final String zza = "zzahd";
    private String zzb;
    private String zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahd zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("idToken", (String) null));
            this.zzc = q.a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
