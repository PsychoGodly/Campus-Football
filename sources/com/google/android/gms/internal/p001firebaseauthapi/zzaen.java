package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaen  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzaen implements zzacs<zzaen> {
    private static final String zza = "zzaen";
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private zzago zzf = zzago.zza();
    private List<String> zzg;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaen zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", (String) null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", (String) null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = zzago.zza();
            } else {
                this.zzf = new zzago(1, zzahc.zza(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzahc.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzg;
    }
}
