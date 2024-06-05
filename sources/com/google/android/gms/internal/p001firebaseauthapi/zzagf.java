package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;
import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagf implements zzacs<zzagf> {
    private static final String zza = "zzagf";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafv zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagf zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("email", (String) null));
            this.zzc = q.a(jSONObject.optString("passwordHash", (String) null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = q.a(jSONObject.optString("displayName", (String) null));
            this.zzf = q.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = zzafv.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = q.a(jSONObject.optString("idToken", (String) null));
            this.zzi = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzj = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafs> zze() {
        zzafv zzafv = this.zzg;
        if (zzafv != null) {
            return zzafv.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
