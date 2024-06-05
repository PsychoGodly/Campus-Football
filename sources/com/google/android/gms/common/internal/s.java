package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new y0();

    /* renamed from: a  reason: collision with root package name */
    private final int f15477a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15478b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15479c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15480d;

    /* renamed from: f  reason: collision with root package name */
    private final int f15481f;

    public s(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f15477a = i10;
        this.f15478b = z10;
        this.f15479c = z11;
        this.f15480d = i11;
        this.f15481f = i12;
    }

    public int v() {
        return this.f15480d;
    }

    public int w() {
        return this.f15481f;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, z());
        c.c(parcel, 2, x());
        c.c(parcel, 3, y());
        c.k(parcel, 4, v());
        c.k(parcel, 5, w());
        c.b(parcel, a10);
    }

    public boolean x() {
        return this.f15478b;
    }

    public boolean y() {
        return this.f15479c;
    }

    public int z() {
        return this.f15477a;
    }
}
