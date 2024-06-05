package o6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.g;

/* compiled from: ExtendableSavedState */
public class a extends e0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0319a();

    /* renamed from: c  reason: collision with root package name */
    public final g<String, Bundle> f29483c;

    /* renamed from: o6.a$a  reason: collision with other inner class name */
    /* compiled from: ExtendableSavedState */
    static class C0319a implements Parcelable.ClassLoaderCreator<a> {
        C0319a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0319a) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0319a) null);
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0319a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f29483c + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f29483c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f29483c.j(i11);
            bundleArr[i11] = this.f29483c.n(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f29483c = new g<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f29483c = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f29483c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
