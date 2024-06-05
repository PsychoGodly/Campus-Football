package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h5.d;
import i5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class g1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        e eVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                bundle = b.a(parcel, r10);
            } else if (l10 == 2) {
                dVarArr = (d[]) b.i(parcel, r10, d.CREATOR);
            } else if (l10 == 3) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                eVar = (e) b.e(parcel, r10, e.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new f1(bundle, dVarArr, i10, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f1[i10];
    }
}
