package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagr;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class y0 extends j0 {
    public static final Parcelable.Creator<y0> CREATOR = new w1();

    /* renamed from: a  reason: collision with root package name */
    private final String f26345a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26346b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26347c;

    /* renamed from: d  reason: collision with root package name */
    private final zzagr f26348d;

    public y0(String str, String str2, long j10, zzagr zzagr) {
        this.f26345a = q.g(str);
        this.f26346b = str2;
        this.f26347c = j10;
        this.f26348d = (zzagr) q.l(zzagr, "totpInfo cannot be null.");
    }

    public static y0 y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new y0(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzagr());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    public String c() {
        return this.f26345a;
    }

    public String m() {
        return this.f26346b;
    }

    public long v() {
        return this.f26347c;
    }

    public String w() {
        return "totp";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, c(), false);
        c.q(parcel, 2, m(), false);
        c.n(parcel, 3, v());
        c.p(parcel, 4, this.f26348d, i10, false);
        c.b(parcel, a10);
    }

    public JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f26345a);
            jSONObject.putOpt("displayName", this.f26346b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f26347c));
            jSONObject.putOpt("totpInfo", this.f26348d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }
}
