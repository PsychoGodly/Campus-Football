package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.d2;
import java.util.List;
import m5.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzagv implements zzacs<zzagv> {
    private static final String zza = "zzagv";
    private boolean zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private List<zzafr> zzt;
    private String zzu;

    public final long zza() {
        return this.zzf;
    }

    public final d2 zzb() {
        if (!TextUtils.isEmpty(this.zzn) || !TextUtils.isEmpty(this.zzo)) {
            return d2.K(this.zzk, this.zzo, this.zzn, this.zzr, this.zzp);
        }
        return null;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzu;
    }

    public final String zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzs;
    }

    public final List<zzafr> zzk() {
        return this.zzt;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzu);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzq);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagv zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            this.zzc = jSONObject.optBoolean("needEmail", false);
            this.zzd = q.a(jSONObject.optString("idToken", (String) null));
            this.zze = q.a(jSONObject.optString("refreshToken", (String) null));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            this.zzg = q.a(jSONObject.optString("localId", (String) null));
            this.zzh = q.a(jSONObject.optString("email", (String) null));
            this.zzi = q.a(jSONObject.optString("displayName", (String) null));
            this.zzj = q.a(jSONObject.optString("photoUrl", (String) null));
            this.zzk = q.a(jSONObject.optString("providerId", (String) null));
            this.zzl = q.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzm = jSONObject.optBoolean("isNewUser", false);
            this.zzn = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzo = jSONObject.optString("oauthIdToken", (String) null);
            this.zzq = q.a(jSONObject.optString("errorMessage", (String) null));
            this.zzr = q.a(jSONObject.optString("pendingToken", (String) null));
            this.zzs = q.a(jSONObject.optString("tenantId", (String) null));
            this.zzt = zzafr.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzu = q.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzp = q.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }
}
