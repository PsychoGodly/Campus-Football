package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import n4.b0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class n4 extends a {
    public static final Parcelable.Creator<n4> CREATOR = new o4();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14513a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14514b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14515c;

    public n4(b0 b0Var) {
        this(b0Var.c(), b0Var.b(), b0Var.a());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 2, this.f14513a);
        c.c(parcel, 3, this.f14514b);
        c.c(parcel, 4, this.f14515c);
        c.b(parcel, a10);
    }

    public n4(boolean z10, boolean z11, boolean z12) {
        this.f14513a = z10;
        this.f14514b = z11;
        this.f14515c = z12;
    }
}
