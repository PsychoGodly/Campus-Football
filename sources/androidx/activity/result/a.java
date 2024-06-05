package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ActivityResult */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0011a();

    /* renamed from: a  reason: collision with root package name */
    private final int f743a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f744b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResult */
    class C0011a implements Parcelable.Creator<a> {
        C0011a() {
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

    public a(int i10, Intent intent) {
        this.f743a = i10;
        this.f744b = intent;
    }

    public static String e(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent c() {
        return this.f744b;
    }

    public int d() {
        return this.f743a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + e(this.f743a) + ", data=" + this.f744b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f743a);
        parcel.writeInt(this.f744b == null ? 0 : 1);
        Intent intent = this.f744b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    a(Parcel parcel) {
        this.f743a = parcel.readInt();
        this.f744b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
