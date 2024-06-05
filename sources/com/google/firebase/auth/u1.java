package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class u1 implements Parcelable.Creator<t0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                str2 = b.f(parcel, r10);
            } else if (l10 == 3) {
                j10 = b.u(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                str3 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new t0(str, str2, j10, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
