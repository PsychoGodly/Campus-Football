package g5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class g implements Parcelable.Creator<i> {
    g() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i(parcel.readStrongBinder());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
