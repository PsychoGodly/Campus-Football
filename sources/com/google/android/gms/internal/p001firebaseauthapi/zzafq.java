package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import i5.a;
import i5.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafq extends a {
    public static final Parcelable.Creator<zzafq> CREATOR = new zzaft();
    private final String zza;
    private final String zzb;
    private final String zzc;

    zzafq(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzap<zzafq> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzap.zza(new ArrayList());
        }
        zzao zzg = zzap.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzg.zza(new zzafq(jSONObject.getString("credentialId"), jSONObject.getString(MediationMetaData.KEY_NAME), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.q(parcel, 2, this.zzb, false);
        c.q(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }
}
