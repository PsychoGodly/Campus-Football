package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class x1 implements Parcelable.Creator<a1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                str2 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new a1(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a1[i10];
    }
}
