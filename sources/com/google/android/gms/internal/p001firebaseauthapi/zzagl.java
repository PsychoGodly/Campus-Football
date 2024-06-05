package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagl implements zzacs<zzagl> {
    private static final String zza = "zzagl";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagl zza(String str) throws zzaaf {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = q.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
