package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbul implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        u4 u4Var = null;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                u4Var = (u4) b.e(parcel, r10, u4.CREATOR);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                str = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzbuk(u4Var, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbuk[i10];
    }
}
