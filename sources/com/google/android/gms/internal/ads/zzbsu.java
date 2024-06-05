package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        ArrayList<String> arrayList = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                arrayList = b.h(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzbst(z10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbst[i10];
    }
}
