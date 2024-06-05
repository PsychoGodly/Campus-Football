package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class o extends a {
    public static final Parcelable.Creator<o> CREATOR = new l0();

    /* renamed from: a  reason: collision with root package name */
    private final int f15449a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15450b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15451c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15452d;

    /* renamed from: f  reason: collision with root package name */
    private final long f15453f;

    /* renamed from: g  reason: collision with root package name */
    private final String f15454g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15455h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15456i;

    /* renamed from: j  reason: collision with root package name */
    private final int f15457j;

    public o(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f15449a = i10;
        this.f15450b = i11;
        this.f15451c = i12;
        this.f15452d = j10;
        this.f15453f = j11;
        this.f15454g = str;
        this.f15455h = str2;
        this.f15456i = i13;
        this.f15457j = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15449a);
        c.k(parcel, 2, this.f15450b);
        c.k(parcel, 3, this.f15451c);
        c.n(parcel, 4, this.f15452d);
        c.n(parcel, 5, this.f15453f);
        c.q(parcel, 6, this.f15454g, false);
        c.q(parcel, 7, this.f15455h, false);
        c.k(parcel, 8, this.f15456i);
        c.k(parcel, 9, this.f15457j);
        c.b(parcel, a10);
    }
}
