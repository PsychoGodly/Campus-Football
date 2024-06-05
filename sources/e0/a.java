package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f17752b = new C0182a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f17753a;

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* compiled from: AbsSavedState */
    static class C0182a extends a {
        C0182a() {
            super((C0182a) null);
        }
    }

    /* compiled from: AbsSavedState */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f17752b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0182a aVar) {
        this();
    }

    public final Parcelable c() {
        return this.f17753a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f17753a, i10);
    }

    private a() {
        this.f17753a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f17753a = parcelable == f17752b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f17753a = readParcelable == null ? f17752b : readParcelable;
    }
}
