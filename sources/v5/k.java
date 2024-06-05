package v5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m0;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class k implements Parcelable.Creator<j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        int i10 = 0;
        m0 m0Var = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                m0Var = (m0) b.e(parcel, r10, m0.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new j(i10, m0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
