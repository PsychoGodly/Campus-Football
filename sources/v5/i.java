package v5;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class i implements Parcelable.Creator<h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                arrayList = b.h(parcel, r10);
            } else if (l10 != 2) {
                b.x(parcel, r10);
            } else {
                str = b.f(parcel, r10);
            }
        }
        b.k(parcel, y10);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
