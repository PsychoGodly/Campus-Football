package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class f2 implements Parcelable.Creator<l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 1) {
                b.x(parcel, r10);
            } else {
                str = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new l(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
