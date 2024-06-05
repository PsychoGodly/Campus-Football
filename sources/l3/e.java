package l3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import f3.b;
import n2.e2;
import n2.r1;
import v6.c;

/* compiled from: SmtaMetadataEntry */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f19891a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19892b;

    /* compiled from: SmtaMetadataEntry */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f19891a == eVar.f19891a && this.f19892b == eVar.f19892b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + c.a(this.f19891a)) * 31) + this.f19892b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f19891a + ", svcTemporalLayerCount=" + this.f19892b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f19891a);
        parcel.writeInt(this.f19892b);
    }

    public e(float f10, int i10) {
        this.f19891a = f10;
        this.f19892b = i10;
    }

    private e(Parcel parcel) {
        this.f19891a = parcel.readFloat();
        this.f19892b = parcel.readInt();
    }
}
