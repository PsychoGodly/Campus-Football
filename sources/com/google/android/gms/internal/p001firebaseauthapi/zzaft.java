package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaft implements Parcelable.Creator<zzafq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                str2 = b.f(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                str3 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzafq(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzafq[i10];
    }
}
