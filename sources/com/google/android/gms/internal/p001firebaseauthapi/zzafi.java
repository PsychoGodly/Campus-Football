package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzafi implements zzacs<zzafi> {
    private static final String zza = "zzafi";
    private List<String> zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafi zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.zzb.add(optJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw zzahc.zza((Exception) e10, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
