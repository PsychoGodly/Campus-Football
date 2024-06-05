package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class h1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        s sVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    sVar = (s) b.e(parcel, r10, s.CREATOR);
                    break;
                case 2:
                    z10 = b.m(parcel, r10);
                    break;
                case 3:
                    z11 = b.m(parcel, r10);
                    break;
                case 4:
                    iArr = b.c(parcel, r10);
                    break;
                case 5:
                    i10 = b.t(parcel, r10);
                    break;
                case 6:
                    iArr2 = b.c(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new e(sVar, z10, z11, iArr, i10, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
