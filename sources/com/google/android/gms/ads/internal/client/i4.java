package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import n4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class i4 extends a {
    public static final Parcelable.Creator<i4> CREATOR = new j4();

    /* renamed from: a  reason: collision with root package name */
    public final int f14476a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14477b;

    public i4(int i10, int i11) {
        this.f14476a = i10;
        this.f14477b = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f14476a);
        c.k(parcel, 2, this.f14477b);
        c.b(parcel, a10);
    }

    public i4(x xVar) {
        this.f14476a = xVar.b();
        this.f14477b = xVar.c();
    }
}
