package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j;
import h5.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class o0 extends a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: a  reason: collision with root package name */
    final int f15458a;

    /* renamed from: b  reason: collision with root package name */
    final IBinder f15459b;

    /* renamed from: c  reason: collision with root package name */
    private final b f15460c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15461d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15462f;

    o0(int i10, IBinder iBinder, b bVar, boolean z10, boolean z11) {
        this.f15458a = i10;
        this.f15459b = iBinder;
        this.f15460c = bVar;
        this.f15461d = z10;
        this.f15462f = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f15460c.equals(o0Var.f15460c) && p.a(w(), o0Var.w());
    }

    public final b v() {
        return this.f15460c;
    }

    public final j w() {
        IBinder iBinder = this.f15459b;
        if (iBinder == null) {
            return null;
        }
        return j.a.M0(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15458a);
        c.j(parcel, 2, this.f15459b, false);
        c.p(parcel, 3, this.f15460c, i10, false);
        c.c(parcel, 4, this.f15461d);
        c.c(parcel, 5, this.f15462f);
        c.b(parcel, a10);
    }

    public final boolean x() {
        return this.f15461d;
    }

    public final boolean y() {
        return this.f15462f;
    }
}
