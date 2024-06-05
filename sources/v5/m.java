package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o0;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m implements Parcelable.Creator<l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        h5.b bVar = null;
        o0 o0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                bVar = (h5.b) b.e(parcel, r10, h5.b.CREATOR);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                o0Var = (o0) b.e(parcel, r10, o0.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new l(i10, bVar, o0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
