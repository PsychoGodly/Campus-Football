package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.f;
import com.google.firebase.auth.j;
import k5.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaep  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzaep implements zzacp {
    private static final String zza = "zzaep";
    private static final a zzb = new a(zzaep.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaep(j jVar, String str, String str2) {
        this.zzc = q.g(jVar.zzc());
        this.zzd = q.g(jVar.zze());
        this.zze = str;
        this.zzf = str2;
    }

    public final String zza() throws JSONException {
        f c10 = f.c(this.zzd);
        String str = null;
        String a10 = c10 != null ? c10.a() : null;
        if (c10 != null) {
            str = c10.d();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (a10 != null) {
            jSONObject.put("oobCode", a10);
        }
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zze;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzf;
        if (str3 != null) {
            zzahc.zza(jSONObject, "captchaResp", str3);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
