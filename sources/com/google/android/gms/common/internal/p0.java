package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class p0 implements Parcelable.Creator<o0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        IBinder iBinder = null;
        h5.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                iBinder = b.s(parcel, r10);
            } else if (l10 == 3) {
                bVar = (h5.b) b.e(parcel, r10, h5.b.CREATOR);
            } else if (l10 == 4) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 5) {
                b.x(parcel, r10);
            } else {
                z11 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new o0(i10, iBinder, bVar, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new o0[i10];
    }
}
