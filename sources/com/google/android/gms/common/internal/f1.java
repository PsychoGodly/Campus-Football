package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h5.d;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class f1 extends a {
    public static final Parcelable.Creator<f1> CREATOR = new g1();

    /* renamed from: a  reason: collision with root package name */
    Bundle f15397a;

    /* renamed from: b  reason: collision with root package name */
    d[] f15398b;

    /* renamed from: c  reason: collision with root package name */
    int f15399c;

    /* renamed from: d  reason: collision with root package name */
    e f15400d;

    public f1() {
    }

    f1(Bundle bundle, d[] dVarArr, int i10, e eVar) {
        this.f15397a = bundle;
        this.f15398b = dVarArr;
        this.f15399c = i10;
        this.f15400d = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.f15397a, false);
        c.t(parcel, 2, this.f15398b, i10, false);
        c.k(parcel, 3, this.f15399c);
        c.p(parcel, 4, this.f15400d, i10, false);
        c.b(parcel, a10);
    }
}
