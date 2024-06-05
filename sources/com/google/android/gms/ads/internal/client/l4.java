package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class l4 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 15) {
                b.x(parcel, r10);
            } else {
                str = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new k4(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k4[i10];
    }
}
