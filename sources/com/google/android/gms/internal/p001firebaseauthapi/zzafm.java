package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafm implements Parcelable.Creator<zzafn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l12 = b.l(r10);
            if (l12 == 2) {
                str = b.f(parcel, r10);
            } else if (l12 == 3) {
                str2 = b.f(parcel, r10);
            } else if (l12 == 4) {
                l10 = b.v(parcel, r10);
            } else if (l12 == 5) {
                str3 = b.f(parcel, r10);
            } else if (l12 != 6) {
                b.x(parcel, r10);
            } else {
                l11 = b.v(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzafn(str, str2, l10, str3, l11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzafn[i10];
    }
}
