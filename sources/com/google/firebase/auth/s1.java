package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class s1 implements Parcelable.Creator<o0> {
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
            } else if (l10 == 4) {
                str3 = b.f(parcel, r10);
            } else if (l10 == 5) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 6) {
                b.x(parcel, r10);
            } else {
                str4 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new o0(str, str2, str3, z10, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new o0[i10];
    }
}
