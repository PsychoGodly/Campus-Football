package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafb implements zzacp {
    private String zza = zzaez.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafb(String str) {
        this.zzb = q.g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
