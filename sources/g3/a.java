package g3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import n2.e2;
import n2.r1;

/* compiled from: AppInfoTable */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0191a();

    /* renamed from: a  reason: collision with root package name */
    public final int f18095a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18096b;

    /* renamed from: g3.a$a  reason: collision with other inner class name */
    /* compiled from: AppInfoTable */
    class C0191a implements Parcelable.Creator<a> {
        C0191a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) k4.a.e(parcel.readString()));
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f18095a = i10;
        this.f18096b = str;
    }

    public /* synthetic */ r1 F() {
        return b.b(this);
    }

    public /* synthetic */ void M(e2.b bVar) {
        b.c(this, bVar);
    }

    public /* synthetic */ byte[] a0() {
        return b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f18095a + ",url=" + this.f18096b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18096b);
        parcel.writeInt(this.f18095a);
    }
}
