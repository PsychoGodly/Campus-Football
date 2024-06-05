package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbjw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                bundle = b.a(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzbjv(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbjv[i10];
    }
}
