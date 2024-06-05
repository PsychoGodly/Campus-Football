package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafv {
    private List<zzafs> zza;

    public zzafv() {
        this.zza = new ArrayList();
    }

    public static zzafv zza(JSONArray jSONArray) throws JSONException {
        zzafs zzafs;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafv(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject == null) {
                zzafs = new zzafs();
            } else {
                zzafs = new zzafs(q.a(jSONObject.optString("federatedId", (String) null)), q.a(jSONObject.optString("displayName", (String) null)), q.a(jSONObject.optString("photoUrl", (String) null)), q.a(jSONObject.optString("providerId", (String) null)), (String) null, q.a(jSONObject.optString("phoneNumber", (String) null)), q.a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzafs);
        }
        return new zzafv(arrayList);
    }

    private zzafv(List<zzafs> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzafs> zza() {
        return this.zza;
    }
}
