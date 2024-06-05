package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzadw implements Parcelable.Creator {
    zzadw() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        Objects.requireNonNull(createStringArray);
        return new zzadx(readString, readString2, zzfqk.zzn(createStringArray));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzadx[i10];
    }
}
