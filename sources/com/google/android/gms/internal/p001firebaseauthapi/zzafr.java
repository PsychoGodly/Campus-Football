package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafr {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzagr zze;
    private String zzf;

    private zzafr(String str, String str2, String str3, long j10, zzagr zzagr) {
        if (TextUtils.isEmpty(str) || zzagr == null) {
            this.zza = str;
            this.zzb = q.g(str2);
            this.zzc = str3;
            this.zzd = j10;
            this.zze = zzagr;
            return;
        }
        Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }

    private static long zza(String str) {
        try {
            return zzanc.zza(zzanc.zza(str));
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0;
        }
    }

    public final zzagr zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzafr zza(JSONObject jSONObject) {
        zzafr zzafr = new zzafr(jSONObject.optString("phoneInfo", (String) null), jSONObject.optString("mfaEnrollmentId", (String) null), jSONObject.optString("displayName", (String) null), zza(jSONObject.optString("enrolledAt", MaxReward.DEFAULT_LABEL)), jSONObject.opt("totpInfo") != null ? new zzagr() : null);
        zzafr.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzafr;
    }

    public static List<zzafr> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zza(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
