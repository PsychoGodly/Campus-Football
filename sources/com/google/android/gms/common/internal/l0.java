package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class l0 implements Parcelable.Creator<o> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    i11 = b.t(parcel2, r10);
                    break;
                case 3:
                    i12 = b.t(parcel2, r10);
                    break;
                case 4:
                    j10 = b.u(parcel2, r10);
                    break;
                case 5:
                    j11 = b.u(parcel2, r10);
                    break;
                case 6:
                    str = b.f(parcel2, r10);
                    break;
                case 7:
                    str2 = b.f(parcel2, r10);
                    break;
                case 8:
                    i13 = b.t(parcel2, r10);
                    break;
                case 9:
                    i14 = b.t(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new o(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
