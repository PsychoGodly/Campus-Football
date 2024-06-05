package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import i5.c;

/* compiled from: RemoteMessageCreator */
public class q0 implements Parcelable.Creator<p0> {
    static void c(p0 p0Var, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, p0Var.f26853a, false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public p0 createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 2) {
                b.x(parcel, r10);
            } else {
                bundle = b.a(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new p0(bundle);
    }

    /* renamed from: b */
    public p0[] newArray(int i10) {
        return new p0[i10];
    }
}
