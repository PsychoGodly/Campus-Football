package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafx implements zzacp {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafx(String str, String str2, String str3) {
        this.zza = q.g(str);
        this.zzb = str2;
        this.zzc = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
