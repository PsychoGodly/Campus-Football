package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagy implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzagy() {
    }

    public static zzagy zza(String str, String str2, boolean z10) {
        zzagy zzagy = new zzagy();
        zzagy.zzb = q.g(str);
        zzagy.zzc = q.g(str2);
        zzagy.zzf = z10;
        return zzagy;
    }

    public static zzagy zzb(String str, String str2, boolean z10) {
        zzagy zzagy = new zzagy();
        zzagy.zza = q.g(str);
        zzagy.zzd = q.g(str2);
        zzagy.zzf = z10;
        return zzagy;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
