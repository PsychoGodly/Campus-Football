package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: PrivFrame */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19663b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f19664c;

    /* compiled from: PrivFrame */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f19663b = str;
        this.f19664c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!n0.c(this.f19663b, lVar.f19663b) || !Arrays.equals(this.f19664c, lVar.f19664c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19663b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19664c);
    }

    public String toString() {
        return this.f19654a + ": owner=" + this.f19663b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19663b);
        parcel.writeByteArray(this.f19664c);
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f19663b = (String) n0.j(parcel.readString());
        this.f19664c = (byte[]) n0.j(parcel.createByteArray());
    }
}
