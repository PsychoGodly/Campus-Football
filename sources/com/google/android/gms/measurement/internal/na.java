package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class na extends a {
    public static final Parcelable.Creator<na> CREATOR = new qa();

    /* renamed from: a  reason: collision with root package name */
    public final String f24870a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24871b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24872c;

    na(String str, long j10, int i10) {
        this.f24870a = str;
        this.f24871b = j10;
        this.f24872c = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f24870a, false);
        c.n(parcel, 2, this.f24871b);
        c.k(parcel, 3, this.f24872c);
        c.b(parcel, a10);
    }
}
