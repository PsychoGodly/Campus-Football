package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaga  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaga implements zzacp {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final boolean zzh;
    private zzaee zzi;

    public zzaga(String str, long j10, boolean z10, String str2, String str3, String str4, String str5, boolean z11) {
        this.zza = q.g(str);
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = z11;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzaee zzaee = this.zzi;
        if (zzaee != null) {
            jSONObject.put("autoRetrievalInfo", zzaee.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final void zza(zzaee zzaee) {
        this.zzi = zzaee;
    }
}
