package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.d2;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class z1 implements Parcelable.Creator<w1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        d dVar = null;
        u1 u1Var = null;
        d2 d2Var = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                dVar = (d) b.e(parcel, r10, d.CREATOR);
            } else if (l10 == 2) {
                u1Var = (u1) b.e(parcel, r10, u1.CREATOR);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                d2Var = (d2) b.e(parcel, r10, d2.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new w1(dVar, u1Var, d2Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w1[i10];
    }
}
