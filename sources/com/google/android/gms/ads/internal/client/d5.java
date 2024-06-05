package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class d5 extends a {
    public static final Parcelable.Creator<d5> CREATOR = new e5();

    /* renamed from: a  reason: collision with root package name */
    public final String f14450a;

    /* renamed from: b  reason: collision with root package name */
    public long f14451b;

    /* renamed from: c  reason: collision with root package name */
    public c3 f14452c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f14453d;

    /* renamed from: f  reason: collision with root package name */
    public final String f14454f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14455g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14456h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14457i;

    public d5(String str, long j10, c3 c3Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f14450a = str;
        this.f14451b = j10;
        this.f14452c = c3Var;
        this.f14453d = bundle;
        this.f14454f = str2;
        this.f14455g = str3;
        this.f14456h = str4;
        this.f14457i = str5;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f14450a, false);
        c.n(parcel, 2, this.f14451b);
        c.p(parcel, 3, this.f14452c, i10, false);
        c.e(parcel, 4, this.f14453d, false);
        c.q(parcel, 5, this.f14454f, false);
        c.q(parcel, 6, this.f14455g, false);
        c.q(parcel, 7, this.f14456h, false);
        c.q(parcel, 8, this.f14457i, false);
        c.b(parcel, a10);
    }
}
