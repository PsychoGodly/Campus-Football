package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfiv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        byte[] bArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                bArr = b.b(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzfiu(i10, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfiu[i10];
    }
}
