package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbxw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        z4 z4Var = null;
        u4 u4Var = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                str2 = b.f(parcel, r10);
            } else if (l10 == 3) {
                z4Var = (z4) b.e(parcel, r10, z4.CREATOR);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                u4Var = (u4) b.e(parcel, r10, u4.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new zzbxv(str, str2, z4Var, u4Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbxv[i10];
    }
}
