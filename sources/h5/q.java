package h5;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                str = b.f(parcel, r10);
            } else if (l10 == 2) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                j10 = b.u(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new d(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
