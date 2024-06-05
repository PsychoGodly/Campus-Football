package l3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import java.util.Arrays;
import k4.n0;
import n2.e2;
import n2.r1;

/* compiled from: MdtaMetadataEntry */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0212a();

    /* renamed from: a  reason: collision with root package name */
    public final String f19877a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19878b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19879c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19880d;

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    /* compiled from: MdtaMetadataEntry */
    class C0212a implements Parcelable.Creator<a> {
        C0212a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0212a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0212a aVar) {
        this(parcel);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f19877a.equals(aVar.f19877a) || !Arrays.equals(this.f19878b, aVar.f19878b) || this.f19879c != aVar.f19879c || this.f19880d != aVar.f19880d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f19877a.hashCode()) * 31) + Arrays.hashCode(this.f19878b)) * 31) + this.f19879c) * 31) + this.f19880d;
    }

    public String toString() {
        return "mdta: key=" + this.f19877a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19877a);
        parcel.writeByteArray(this.f19878b);
        parcel.writeInt(this.f19879c);
        parcel.writeInt(this.f19880d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f19877a = str;
        this.f19878b = bArr;
        this.f19879c = i10;
        this.f19880d = i11;
    }

    private a(Parcel parcel) {
        this.f19877a = (String) n0.j(parcel.readString());
        this.f19878b = (byte[]) n0.j(parcel.createByteArray());
        this.f19879c = parcel.readInt();
        this.f19880d = parcel.readInt();
    }
}
