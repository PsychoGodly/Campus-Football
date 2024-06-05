package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14683a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14684b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14685c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14686d;

    /* renamed from: f  reason: collision with root package name */
    public final float f14687f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14688g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14689h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14690i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f14691j;

    j(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f14683a = z10;
        this.f14684b = z11;
        this.f14685c = str;
        this.f14686d = z12;
        this.f14687f = f10;
        this.f14688g = i10;
        this.f14689h = z13;
        this.f14690i = z14;
        this.f14691j = z15;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 2, this.f14683a);
        c.c(parcel, 3, this.f14684b);
        c.q(parcel, 4, this.f14685c, false);
        c.c(parcel, 5, this.f14686d);
        c.h(parcel, 6, this.f14687f);
        c.k(parcel, 7, this.f14688g);
        c.c(parcel, 8, this.f14689h);
        c.c(parcel, 9, this.f14690i);
        c.c(parcel, 10, this.f14691j);
        c.b(parcel, a10);
    }

    public j(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, (String) null, z12, f10, -1, z13, z14, z15);
    }
}
