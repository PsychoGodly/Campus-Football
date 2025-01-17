package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzb implements Parcelable.Creator<zza> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                str2 = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zza(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zza[i10];
    }
}
