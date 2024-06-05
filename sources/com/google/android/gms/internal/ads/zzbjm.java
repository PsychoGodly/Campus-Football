package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbjm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                z10 = b.m(parcel, r10);
            } else if (l10 == 3) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                str2 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzbjl(str, z10, i10, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbjl[i10];
    }
}
