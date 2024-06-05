package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: BinaryFrame */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19630b;

    /* compiled from: BinaryFrame */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f19630b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f19654a.equals(bVar.f19654a) || !Arrays.equals(this.f19630b, bVar.f19630b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f19654a.hashCode()) * 31) + Arrays.hashCode(this.f19630b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19654a);
        parcel.writeByteArray(this.f19630b);
    }

    b(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f19630b = (byte[]) n0.j(parcel.createByteArray());
    }
}
