package g5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class e implements Parcelable.Creator<a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            if (b.l(r10) != 1) {
                b.x(parcel, r10);
            } else {
                intent = (Intent) b.e(parcel, r10, Intent.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
