package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.d2;
import java.util.ArrayList;
import java.util.List;
import m5.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzafd implements zzacs<zzafd> {
    private static final String zza = "zzafd";
    private zzaff zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafd zza(String str) throws zzaaf {
        zzaff zzaff;
        int i10;
        zzafc zzafc;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                zzaff = new zzaff();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 == null) {
                                zzafc = new zzafc();
                                i10 = i11;
                            } else {
                                String a10 = q.a(jSONObject2.optString("localId", (String) null));
                                String a11 = q.a(jSONObject2.optString("email", (String) null));
                                boolean optBoolean = jSONObject2.optBoolean("emailVerified", z10);
                                String a12 = q.a(jSONObject2.optString("displayName", (String) null));
                                String a13 = q.a(jSONObject2.optString("photoUrl", (String) null));
                                zzafv zza2 = zzafv.zza(jSONObject2.optJSONArray("providerUserInfo"));
                                String a14 = q.a(jSONObject2.optString("rawPassword", (String) null));
                                String a15 = q.a(jSONObject2.optString("phoneNumber", (String) null));
                                i10 = i11;
                                long optLong = jSONObject2.optLong("createdAt", 0);
                                zzafc = new zzafc(a10, a11, optBoolean, a12, a13, zza2, a14, a15, optLong, jSONObject2.optLong("lastLoginAt", 0), false, (d2) null, zzafr.zza(jSONObject2.optJSONArray("mfaInfo")), zzafq.zza(jSONObject2.optJSONArray("passkeyInfo")));
                            }
                            arrayList.add(zzafc);
                            i11 = i10 + 1;
                            z10 = false;
                        }
                        zzaff = new zzaff(arrayList);
                    }
                }
                zzaff = new zzaff(new ArrayList());
            }
            this.zzb = zzaff;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str2);
        }
    }

    public final List<zzafc> zza() {
        return this.zzb.zza();
    }
}
