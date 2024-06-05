package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class e2 implements Parcelable.Creator<j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                str2 = b.f(parcel, r10);
            } else if (l10 == 3) {
                str3 = b.f(parcel, r10);
            } else if (l10 == 4) {
                str4 = b.f(parcel, r10);
            } else if (l10 != 5) {
                b.x(parcel, r10);
            } else {
                z10 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new j(str, str2, str3, str4, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
