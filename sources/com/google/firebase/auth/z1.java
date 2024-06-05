package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class z1 implements Parcelable.Creator<e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    str = b.f(parcel, r10);
                    break;
                case 2:
                    str2 = b.f(parcel, r10);
                    break;
                case 3:
                    str3 = b.f(parcel, r10);
                    break;
                case 4:
                    str4 = b.f(parcel, r10);
                    break;
                case 5:
                    z10 = b.m(parcel, r10);
                    break;
                case 6:
                    str5 = b.f(parcel, r10);
                    break;
                case 7:
                    z11 = b.m(parcel, r10);
                    break;
                case 8:
                    str6 = b.f(parcel, r10);
                    break;
                case 9:
                    i10 = b.t(parcel, r10);
                    break;
                case 10:
                    str7 = b.f(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new e(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
