package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzafj implements zzacs<zzafj> {
    private static final String zza = "zzafj";
    private String zzb;

    public zzafj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafj zza(String str) throws zzaaf {
        try {
            this.zzb = q.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public zzafj(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
