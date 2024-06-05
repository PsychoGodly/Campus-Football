package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class c5 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        long j10 = 0;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                i11 = b.t(parcel, r10);
            } else if (l10 == 3) {
                str = b.f(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                j10 = b.u(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new b5(i10, i11, str, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b5[i10];
    }
}