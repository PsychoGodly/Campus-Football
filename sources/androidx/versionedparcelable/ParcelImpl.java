package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import i1.b;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f4959a;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(b bVar) {
        this.f4959a = bVar;
    }

    public <T extends b> T c() {
        return this.f4959a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).l0(this.f4959a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4959a = new b(parcel).H();
    }
}
