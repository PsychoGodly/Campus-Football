package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfar implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel, r10);
                    break;
                case 2:
                    i11 = b.t(parcel, r10);
                    break;
                case 3:
                    i12 = b.t(parcel, r10);
                    break;
                case 4:
                    i13 = b.t(parcel, r10);
                    break;
                case 5:
                    str = b.f(parcel, r10);
                    break;
                case 6:
                    i14 = b.t(parcel, r10);
                    break;
                case 7:
                    i15 = b.t(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new zzfaq(i10, i11, i12, i13, str, i14, i15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfaq[i10];
    }
}
