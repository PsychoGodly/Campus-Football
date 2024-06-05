package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        long j10 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) b.e(parcel, r10, ParcelFileDescriptor.CREATOR);
            } else if (l10 == 3) {
                z10 = b.m(parcel, r10);
            } else if (l10 == 4) {
                z11 = b.m(parcel, r10);
            } else if (l10 == 5) {
                j10 = b.u(parcel, r10);
            } else if (l10 != 6) {
                b.x(parcel, r10);
            } else {
                z12 = b.m(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new zzavn(parcelFileDescriptor, z10, z11, j10, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzavn[i10];
    }
}
