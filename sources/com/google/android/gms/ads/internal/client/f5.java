package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class f5 extends a {
    public static final Parcelable.Creator<f5> CREATOR = new g5();

    /* renamed from: a  reason: collision with root package name */
    public final int f14465a;

    public f5(int i10) {
        this.f14465a = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f14465a);
        c.b(parcel, a10);
    }
}
