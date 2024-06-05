package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: ChapterTocFrame */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19637b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19638c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19639d;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f19640f;

    /* renamed from: g  reason: collision with root package name */
    private final i[] f19641g;

    /* compiled from: ChapterTocFrame */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f19637b = str;
        this.f19638c = z10;
        this.f19639d = z11;
        this.f19640f = strArr;
        this.f19641g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f19638c != dVar.f19638c || this.f19639d != dVar.f19639d || !n0.c(this.f19637b, dVar.f19637b) || !Arrays.equals(this.f19640f, dVar.f19640f) || !Arrays.equals(this.f19641g, dVar.f19641g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (((true + (this.f19638c ? 1 : 0)) * 31) + (this.f19639d ? 1 : 0)) * 31;
        String str = this.f19637b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19637b);
        parcel.writeByte(this.f19638c ? (byte) 1 : 0);
        parcel.writeByte(this.f19639d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f19640f);
        parcel.writeInt(this.f19641g.length);
        for (i writeParcelable : this.f19641g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f19637b = (String) n0.j(parcel.readString());
        boolean z10 = true;
        this.f19638c = parcel.readByte() != 0;
        this.f19639d = parcel.readByte() == 0 ? false : z10;
        this.f19640f = (String[]) n0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f19641g = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f19641g[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
