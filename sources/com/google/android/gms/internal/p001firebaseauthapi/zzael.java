package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzael  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzael implements zzacs<zzael> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzael";
    private String zzb;
    private int zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzael zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            this.zzc = jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            String str2 = zza;
            String message = e10.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzaaf("Failed to parse error for string [" + str + "]", e10);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
