package d7;

import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class b2 implements Parcelable.Creator<y1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    str = b.f(parcel, r10);
                    break;
                case 2:
                    str2 = b.f(parcel, r10);
                    break;
                case 3:
                    str5 = b.f(parcel, r10);
                    break;
                case 4:
                    str4 = b.f(parcel, r10);
                    break;
                case 5:
                    str3 = b.f(parcel, r10);
                    break;
                case 6:
                    str6 = b.f(parcel, r10);
                    break;
                case 7:
                    z10 = b.m(parcel, r10);
                    break;
                case 8:
                    str7 = b.f(parcel, r10);
                    break;
                default:
                    b.x(parcel, r10);
                    break;
            }
        }
        b.k(parcel, y10);
        return new y1(str, str2, str3, str4, str5, str6, z10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y1[i10];
    }
}
