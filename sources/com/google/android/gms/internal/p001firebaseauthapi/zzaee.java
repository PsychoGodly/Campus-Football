package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaee  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaee {
    private final String zza;

    public zzaee(String str) {
        this.zza = q.g(str);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
