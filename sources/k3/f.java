package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: GeobFrame */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19645b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19646c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19647d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f19648f;

    /* compiled from: GeobFrame */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19645b = str;
        this.f19646c = str2;
        this.f19647d = str3;
        this.f19648f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!n0.c(this.f19645b, fVar.f19645b) || !n0.c(this.f19646c, fVar.f19646c) || !n0.c(this.f19647d, fVar.f19647d) || !Arrays.equals(this.f19648f, fVar.f19648f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19645b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19646c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19647d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.f19648f);
    }

    public String toString() {
        return this.f19654a + ": mimeType=" + this.f19645b + ", filename=" + this.f19646c + ", description=" + this.f19647d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19645b);
        parcel.writeString(this.f19646c);
        parcel.writeString(this.f19647d);
        parcel.writeByteArray(this.f19648f);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f19645b = (String) n0.j(parcel.readString());
        this.f19646c = (String) n0.j(parcel.readString());
        this.f19647d = (String) n0.j(parcel.readString());
        this.f19648f = (byte[]) n0.j(parcel.createByteArray());
    }
}
