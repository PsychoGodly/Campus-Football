package d7;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class i implements Parcelable.Creator<f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                j10 = b.u(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                j11 = b.u(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new f(j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
