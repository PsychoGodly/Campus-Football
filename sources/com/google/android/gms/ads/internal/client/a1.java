package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class a1 extends a {
    public static final Parcelable.Creator<a1> CREATOR = new b2();

    /* renamed from: a  reason: collision with root package name */
    public final String f14412a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14413b;

    public a1(String str, String str2) {
        this.f14412a = str;
        this.f14413b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f14412a, false);
        c.q(parcel, 2, this.f14413b, false);
        c.b(parcel, a10);
    }
}
