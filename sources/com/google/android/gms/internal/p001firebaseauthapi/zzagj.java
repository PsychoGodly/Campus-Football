package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagj implements zzacs<zzagj> {
    private static final String zza = "zzagj";

    public String zza() {
        return null;
    }

    /* renamed from: zzb */
    public zzagj zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzagn) ((zzagj) new zzagn().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzagp) ((zzagj) new zzagp().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }
}
