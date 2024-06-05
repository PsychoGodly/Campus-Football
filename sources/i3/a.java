package i3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import java.util.Arrays;
import k4.a0;
import k4.n0;
import n2.e2;
import n2.r1;
import r6.e;

/* compiled from: PictureFrame */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0201a();

    /* renamed from: a  reason: collision with root package name */
    public final int f18919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18920b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18921c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18922d;

    /* renamed from: f  reason: collision with root package name */
    public final int f18923f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18924g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18925h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f18926i;

    /* renamed from: i3.a$a  reason: collision with other inner class name */
    /* compiled from: PictureFrame */
    class C0201a implements Parcelable.Creator<a> {
        C0201a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f18919a = i10;
        this.f18920b = str;
        this.f18921c = str2;
        this.f18922d = i11;
        this.f18923f = i12;
        this.f18924g = i13;
        this.f18925h = i14;
        this.f18926i = bArr;
    }

    public static a a(a0 a0Var) {
        int p10 = a0Var.p();
        String E = a0Var.E(a0Var.p(), e.f29801a);
        String D = a0Var.D(a0Var.p());
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        int p13 = a0Var.p();
        int p14 = a0Var.p();
        int p15 = a0Var.p();
        byte[] bArr = new byte[p15];
        a0Var.l(bArr, 0, p15);
        return new a(p10, E, D, p11, p12, p13, p14, bArr);
    }

    public /* synthetic */ r1 F() {
        return b.b(this);
    }

    public void M(e2.b bVar) {
        bVar.I(this.f18926i, this.f18919a);
    }

    public /* synthetic */ byte[] a0() {
        return b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f18919a == aVar.f18919a && this.f18920b.equals(aVar.f18920b) && this.f18921c.equals(aVar.f18921c) && this.f18922d == aVar.f18922d && this.f18923f == aVar.f18923f && this.f18924g == aVar.f18924g && this.f18925h == aVar.f18925h && Arrays.equals(this.f18926i, aVar.f18926i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f18919a) * 31) + this.f18920b.hashCode()) * 31) + this.f18921c.hashCode()) * 31) + this.f18922d) * 31) + this.f18923f) * 31) + this.f18924g) * 31) + this.f18925h) * 31) + Arrays.hashCode(this.f18926i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f18920b + ", description=" + this.f18921c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18919a);
        parcel.writeString(this.f18920b);
        parcel.writeString(this.f18921c);
        parcel.writeInt(this.f18922d);
        parcel.writeInt(this.f18923f);
        parcel.writeInt(this.f18924g);
        parcel.writeInt(this.f18925h);
        parcel.writeByteArray(this.f18926i);
    }

    a(Parcel parcel) {
        this.f18919a = parcel.readInt();
        this.f18920b = (String) n0.j(parcel.readString());
        this.f18921c = (String) n0.j(parcel.readString());
        this.f18922d = parcel.readInt();
        this.f18923f = parcel.readInt();
        this.f18924g = parcel.readInt();
        this.f18925h = parcel.readInt();
        this.f18926i = (byte[]) n0.j(parcel.createByteArray());
    }
}
