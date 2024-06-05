package v5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class c implements Parcelable.Creator<b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                i11 = b.t(parcel, r10);
            } else if (l10 != 3) {
                b.x(parcel, r10);
            } else {
                intent = (Intent) b.e(parcel, r10, Intent.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new b(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
