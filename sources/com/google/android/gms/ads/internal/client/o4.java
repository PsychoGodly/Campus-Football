package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class o4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                z10 = b.m(parcel, r10);
            } else if (l10 == 3) {
                z11 = b.m(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                z12 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new n4(z10, z11, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n4[i10];
    }
}
