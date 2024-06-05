package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f14154a;

    class a implements Parcelable.Creator<WrappedParcelable> {
        a() {
        }

        /* renamed from: a */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        /* renamed from: b */
        public WrappedParcelable[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f14154a = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f14154a;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14154a);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f14154a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f14154a = bArr;
    }
}
