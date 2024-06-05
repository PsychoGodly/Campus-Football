package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class y0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                z10 = b.m(parcel, r10);
            } else if (l10 == 3) {
                z11 = b.m(parcel, r10);
            } else if (l10 == 4) {
                i11 = b.t(parcel, r10);
            } else if (l10 != 5) {
                b.x(parcel, r10);
            } else {
                i12 = b.t(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new s(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
