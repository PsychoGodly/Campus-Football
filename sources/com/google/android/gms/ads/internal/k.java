package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f10 = 0.0f;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 2:
                    z10 = b.m(parcel, r10);
                    break;
                case 3:
                    z11 = b.m(parcel, r10);
                    break;
                case 4:
                    str = b.f(parcel, r10);
                    break;
                case 5:
                    z12 = b.m(parcel, r10);
                    break;
                case 6:
                    f10 = b.p(parcel, r10);
                    break;
                case 7:
                    i10 = b.t(parcel, r10);
                    break;
                case 8:
                    z13 = b.m(parcel, r10);
                    break;
                case 9:
                    z14 = b.m(parcel, r10);
                    break;
                case 10:
                    z15 = b.m(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new j(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
