package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class qa implements Parcelable.Creator<na> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                j10 = b.u(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                i10 = b.t(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new na(str, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new na[i10];
    }
}
