package r5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class b implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = i5.b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y10) {
            int r10 = i5.b.r(parcel);
            if (i5.b.l(r10) != 1) {
                i5.b.x(parcel, r10);
            } else {
                bundle = i5.b.a(parcel, r10);
            }
        }
        i5.b.k(parcel, y10);
        return new c(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
