package m3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SpliceNullCommand */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* compiled from: SpliceNullCommand */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
