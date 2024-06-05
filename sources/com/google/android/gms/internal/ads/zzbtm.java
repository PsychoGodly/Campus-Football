package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbtm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 2) {
                b.x(parcel, r10);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.e(parcel, r10, ParcelFileDescriptor.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new zzbtl(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbtl[i10];
    }
}
