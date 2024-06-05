package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class y implements Parcelable.Creator<u> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        int i10 = 0;
        ArrayList<o> arrayList = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                arrayList = b.j(parcel, r10, o.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new u(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
