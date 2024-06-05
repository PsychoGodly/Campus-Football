package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class t0 extends j0 {
    public static final Parcelable.Creator<t0> CREATOR = new u1();

    /* renamed from: a  reason: collision with root package name */
    private final String f26326a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26327b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26328c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26329d;

    public t0(String str, String str2, long j10, String str3) {
        this.f26326a = q.g(str);
        this.f26327b = str2;
        this.f26328c = j10;
        this.f26329d = q.g(str3);
    }

    public static t0 y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new t0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public String c() {
        return this.f26326a;
    }

    public String getPhoneNumber() {
        return this.f26329d;
    }

    public String m() {
        return this.f26327b;
    }

    public long v() {
        return this.f26328c;
    }

    public String w() {
        return "phone";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, c(), false);
        c.q(parcel, 2, m(), false);
        c.n(parcel, 3, v());
        c.q(parcel, 4, getPhoneNumber(), false);
        c.b(parcel, a10);
    }

    public JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f26326a);
            jSONObject.putOpt("displayName", this.f26327b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f26328c));
            jSONObject.putOpt("phoneNumber", this.f26329d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e10);
        }
    }
}
