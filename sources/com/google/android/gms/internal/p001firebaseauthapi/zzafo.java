package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafo {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;
    private boolean zzf;

    public static zzafo zza(String str) throws UnsupportedEncodingException {
        try {
            zzafo zzafo = new zzafo();
            JSONObject jSONObject = new JSONObject(str);
            zzafo.zza = jSONObject.optString("iss");
            zzafo.zzb = jSONObject.optString("aud");
            zzafo.zzc = jSONObject.optString("sub");
            zzafo.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzafo.zze = Long.valueOf(jSONObject.optLong("exp"));
            zzafo.zzf = jSONObject.optBoolean("is_anonymous");
            return zzafo;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e10);
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + valueOf);
            }
            String valueOf2 = String.valueOf(e10);
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + valueOf2);
        }
    }

    public final Long zzb() {
        return this.zzd;
    }

    public final Long zza() {
        return this.zze;
    }
}
