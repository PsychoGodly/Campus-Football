package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: MlltFrame */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f19658b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19659c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19660d;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f19661f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f19662g;

    /* compiled from: MlltFrame */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19658b = i10;
        this.f19659c = i11;
        this.f19660d = i12;
        this.f19661f = iArr;
        this.f19662g = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f19658b == kVar.f19658b && this.f19659c == kVar.f19659c && this.f19660d == kVar.f19660d && Arrays.equals(this.f19661f, kVar.f19661f) && Arrays.equals(this.f19662g, kVar.f19662g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f19658b) * 31) + this.f19659c) * 31) + this.f19660d) * 31) + Arrays.hashCode(this.f19661f)) * 31) + Arrays.hashCode(this.f19662g);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19658b);
        parcel.writeInt(this.f19659c);
        parcel.writeInt(this.f19660d);
        parcel.writeIntArray(this.f19661f);
        parcel.writeIntArray(this.f19662g);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f19658b = parcel.readInt();
        this.f19659c = parcel.readInt();
        this.f19660d = parcel.readInt();
        this.f19661f = (int[]) n0.j(parcel.createIntArray());
        this.f19662g = (int[]) n0.j(parcel.createIntArray());
    }
}
