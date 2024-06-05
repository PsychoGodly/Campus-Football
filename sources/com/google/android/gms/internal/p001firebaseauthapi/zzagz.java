package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagz implements zzacs<zzagz> {
    private static final String zza = "zzagz";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafr> zzi;
    private String zzj;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagz zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("localId", (String) null));
            this.zzc = q.a(jSONObject.optString("email", (String) null));
            this.zzd = q.a(jSONObject.optString("displayName", (String) null));
            this.zze = q.a(jSONObject.optString("idToken", (String) null));
            this.zzf = q.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzh = jSONObject.optLong("expiresIn", 0);
            this.zzi = zzafr.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafr> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzj);
    }

    public final String zzb() {
        return this.zze;
    }
}
