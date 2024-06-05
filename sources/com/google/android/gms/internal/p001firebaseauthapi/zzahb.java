package com.google.android.gms.internal.p001firebaseauthapi;

import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzahb implements zzacs<zzahb> {
    private static final String zza = "zzahb";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahb zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("idToken", (String) null));
            this.zzc = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = q.a(jSONObject.optString("localId", (String) null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = q.a(jSONObject.optString("temporaryProof", (String) null));
            this.zzh = q.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }
}
