package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        h5.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i11 = b.t(parcel, r10);
            } else if (l10 == 2) {
                str = b.f(parcel, r10);
            } else if (l10 == 3) {
                pendingIntent = (PendingIntent) b.e(parcel, r10, PendingIntent.CREATOR);
            } else if (l10 == 4) {
                bVar = (h5.b) b.e(parcel, r10, h5.b.CREATOR);
            } else if (l10 != 1000) {
                b.x(parcel, r10);
            } else {
                i10 = b.t(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
