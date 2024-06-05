package q4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                z10 = b.m(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                iBinder = b.s(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new a(z10, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
