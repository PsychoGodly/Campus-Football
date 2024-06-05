package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzagq implements Parcelable.Creator<zzagr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            b.l(r10);
            b.x(parcel, r10);
        }
        b.k(parcel, y10);
        return new zzagr();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzagr[i10];
    }
}
