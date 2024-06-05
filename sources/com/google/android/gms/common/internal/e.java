package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new h1();

    /* renamed from: a  reason: collision with root package name */
    private final s f15372a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15373b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15374c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f15375d;

    /* renamed from: f  reason: collision with root package name */
    private final int f15376f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f15377g;

    public e(s sVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f15372a = sVar;
        this.f15373b = z10;
        this.f15374c = z11;
        this.f15375d = iArr;
        this.f15376f = i10;
        this.f15377g = iArr2;
    }

    public final s B() {
        return this.f15372a;
    }

    public int v() {
        return this.f15376f;
    }

    public int[] w() {
        return this.f15375d;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f15372a, i10, false);
        c.c(parcel, 2, y());
        c.c(parcel, 3, z());
        c.l(parcel, 4, w(), false);
        c.k(parcel, 5, v());
        c.l(parcel, 6, x(), false);
        c.b(parcel, a10);
    }

    public int[] x() {
        return this.f15377g;
    }

    public boolean y() {
        return this.f15373b;
    }

    public boolean z() {
        return this.f15374c;
    }
}
