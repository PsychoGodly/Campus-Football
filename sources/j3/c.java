package j3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import java.util.Arrays;
import n2.e2;
import n2.r1;

/* compiled from: IcyInfo */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f19282a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19283b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19284c;

    /* compiled from: IcyInfo */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f19282a = bArr;
        this.f19283b = str;
        this.f19284c = str2;
    }

    public /* synthetic */ r1 F() {
        return b.b(this);
    }

    public void M(e2.b bVar) {
        String str = this.f19283b;
        if (str != null) {
            bVar.m0(str);
        }
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19282a, ((c) obj).f19282a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19282a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f19283b, this.f19284c, Integer.valueOf(this.f19282a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f19282a);
        parcel.writeString(this.f19283b);
        parcel.writeString(this.f19284c);
    }

    c(Parcel parcel) {
        this.f19282a = (byte[]) k4.a.e(parcel.createByteArray());
        this.f19283b = parcel.readString();
        this.f19284c = parcel.readString();
    }
}
