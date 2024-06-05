package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class b5 extends a {
    public static final Parcelable.Creator<b5> CREATOR = new c5();

    /* renamed from: a  reason: collision with root package name */
    public final int f14422a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14424c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14425d;

    public b5(int i10, int i11, String str, long j10) {
        this.f14422a = i10;
        this.f14423b = i11;
        this.f14424c = str;
        this.f14425d = j10;
    }

    public static b5 b(JSONObject jSONObject) throws JSONException {
        return new b5(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14422a);
        c.k(parcel, 2, this.f14423b);
        c.q(parcel, 3, this.f14424c, false);
        c.n(parcel, 4, this.f14425d);
        c.b(parcel, a10);
    }
}
