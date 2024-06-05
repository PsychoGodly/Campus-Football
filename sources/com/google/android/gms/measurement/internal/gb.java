package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class gb implements Parcelable.Creator<hb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    str = b.f(parcel2, r10);
                    break;
                case 3:
                    j10 = b.u(parcel2, r10);
                    break;
                case 4:
                    l10 = b.v(parcel2, r10);
                    break;
                case 5:
                    f10 = b.q(parcel2, r10);
                    break;
                case 6:
                    str2 = b.f(parcel2, r10);
                    break;
                case 7:
                    str3 = b.f(parcel2, r10);
                    break;
                case 8:
                    d10 = b.o(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new hb(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new hb[i10];
    }
}
