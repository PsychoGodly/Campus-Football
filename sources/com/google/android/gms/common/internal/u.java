package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final int f15485a;

    /* renamed from: b  reason: collision with root package name */
    private List<o> f15486b;

    public u(int i10, List<o> list) {
        this.f15485a = i10;
        this.f15486b = list;
    }

    public final int v() {
        return this.f15485a;
    }

    public final List<o> w() {
        return this.f15486b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15485a);
        c.u(parcel, 2, this.f15486b, false);
        c.b(parcel, a10);
    }

    public final void x(o oVar) {
        if (this.f15486b == null) {
            this.f15486b = new ArrayList();
        }
        this.f15486b.add(oVar);
    }
}
