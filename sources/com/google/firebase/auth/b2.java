package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.q0;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class b2 implements Parcelable.Creator<q0.a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            b.l(r10);
            b.x(parcel, r10);
        }
        b.k(parcel, y10);
        return new q0.a();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q0.a[i10];
    }
}
