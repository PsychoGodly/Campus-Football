package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbzh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                str = b.f(parcel, r10);
            } else if (l10 == 3) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 4) {
                i11 = b.t(parcel, r10);
            } else if (l10 == 5) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 6) {
                b.x(parcel, r10);
            } else {
                z11 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzbzg(str, i10, i11, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbzg[i10];
    }
}
