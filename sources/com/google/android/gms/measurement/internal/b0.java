package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class b0 implements Parcelable.Creator<z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 2) {
                b.x(parcel, r10);
            } else {
                bundle = b.a(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new z(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
