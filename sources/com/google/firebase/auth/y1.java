package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class y1 implements Parcelable.Creator<d1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                str = b.f(parcel, r10);
            } else if (l10 == 3) {
                str2 = b.f(parcel, r10);
            } else if (l10 == 4) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 5) {
                b.x(parcel, r10);
            } else {
                z11 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new d1(str, str2, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d1[i10];
    }
}
