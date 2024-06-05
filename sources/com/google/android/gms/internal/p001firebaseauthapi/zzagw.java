package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagw implements zzacp {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze = true;

    public zzagw(String str, String str2, String str3, String str4) {
        this.zza = q.g(str);
        this.zzb = q.g(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzahc.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
