package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagd implements zzacs<zzagd> {
    private static final String zza = "zzagd";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagd zza(String str) throws zzaaf {
        try {
            this.zzb = q.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
