package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagn extends zzagj {
    private static final String zza = "zzagn";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final zzagn zzb(String str) throws zzaaf {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzag.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final /* synthetic */ zzacs zza(String str) throws zzaaf {
        return (zzagn) zza(str);
    }

    public final String zza() {
        return this.zzb;
    }
}
