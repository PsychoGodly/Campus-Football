package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;
import n2.e2;

/* compiled from: ApicFrame */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0209a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19626b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19627c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19628d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f19629f;

    /* renamed from: k3.a$a  reason: collision with other inner class name */
    /* compiled from: ApicFrame */
    class C0209a implements Parcelable.Creator<a> {
        C0209a() {
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

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f19626b = str;
        this.f19627c = str2;
        this.f19628d = i10;
        this.f19629f = bArr;
    }

    public void M(e2.b bVar) {
        bVar.I(this.f19629f, this.f19628d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19628d != aVar.f19628d || !n0.c(this.f19626b, aVar.f19626b) || !n0.c(this.f19627c, aVar.f19627c) || !Arrays.equals(this.f19629f, aVar.f19629f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (527 + this.f19628d) * 31;
        String str = this.f19626b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19627c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.f19629f);
    }

    public String toString() {
        return this.f19654a + ": mimeType=" + this.f19626b + ", description=" + this.f19627c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19626b);
        parcel.writeString(this.f19627c);
        parcel.writeInt(this.f19628d);
        parcel.writeByteArray(this.f19629f);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f19626b = (String) n0.j(parcel.readString());
        this.f19627c = parcel.readString();
        this.f19628d = parcel.readInt();
        this.f19629f = (byte[]) n0.j(parcel.createByteArray());
    }
}
