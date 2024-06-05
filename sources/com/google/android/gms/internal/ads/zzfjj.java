package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                bArr = b.b(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                i11 = b.t(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzfji(i10, bArr, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfji[i10];
    }
}
