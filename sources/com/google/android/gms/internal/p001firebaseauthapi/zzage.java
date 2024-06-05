package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzage  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzage implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;

    public zzage(String str) {
        this.zzd = str;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            zzahc.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzahc.zza(jSONObject);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }

    public zzage(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = null;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }
}
