package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class w2 extends a {
    public static final Parcelable.Creator<w2> CREATOR = new x2();

    /* renamed from: a  reason: collision with root package name */
    public final int f14595a;

    public w2(int i10) {
        this.f14595a = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, this.f14595a);
        c.b(parcel, a10);
    }
}
