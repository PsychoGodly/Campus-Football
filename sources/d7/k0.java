package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.y0;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class k0 implements Parcelable.Creator<l0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        ArrayList<t0> arrayList = null;
        ArrayList<y0> arrayList2 = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                arrayList = b.j(parcel, r10, t0.CREATOR);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                arrayList2 = b.j(parcel, r10, y0.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new l0(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l0[i10];
    }
}
