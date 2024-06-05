package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import m5.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzafk implements zzacs<zzafk> {
    private static final String zza = "zzafk";
    private String zzb;
    private zzap<zzafu> zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final zzafk zza(String str) throws zzaaf {
        zzap<zzafu> zzap;
        zzafu zzafu;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = q.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        zzao zzg = zzap.zzg();
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                            if (jSONObject2 == null) {
                                zzafu = zzafu.zza((String) null, (String) null);
                            } else {
                                zzafu = zzafu.zza(q.a(jSONObject2.optString("provider")), q.a(jSONObject2.optString("enforcementState")));
                            }
                            zzg.zza(zzafu);
                        }
                        zzap = zzg.zza();
                        this.zzc = zzap;
                    }
                }
                zzap = zzap.zza(new ArrayList());
                this.zzc = zzap;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final boolean zzb(String str) {
        zzap<zzafu> zzap = this.zzc;
        if (zzap != null && !zzap.isEmpty()) {
            zzap<zzafu> zzap2 = this.zzc;
            int size = zzap2.size();
            int i10 = 0;
            while (i10 < size) {
                zzafu zzafu = zzap2.get(i10);
                i10++;
                zzafu zzafu2 = zzafu;
                String zza2 = zzafu2.zza();
                String zzb2 = zzafu2.zzb();
                if (!(zza2 == null || zzb2 == null)) {
                    if ((zza2.equals("ENFORCE") || zza2.equals("AUDIT")) && zzb2.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String zza() {
        return this.zzb;
    }
}
