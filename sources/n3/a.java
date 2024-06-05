package n3;

import android.os.Parcel;
import android.os.Parcelable;
import i3.b;

/* compiled from: VorbisComment */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0217a();

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    /* compiled from: VorbisComment */
    class C0217a implements Parcelable.Creator<a> {
        C0217a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    a(Parcel parcel) {
        super(parcel);
    }
}
