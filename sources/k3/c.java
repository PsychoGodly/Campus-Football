package k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.n0;

/* compiled from: ChapterFrame */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19631b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19632c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19633d;

    /* renamed from: f  reason: collision with root package name */
    public final long f19634f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19635g;

    /* renamed from: h  reason: collision with root package name */
    private final i[] f19636h;

    /* compiled from: ChapterFrame */
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

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f19631b = str;
        this.f19632c = i10;
        this.f19633d = i11;
        this.f19634f = j10;
        this.f19635g = j11;
        this.f19636h = iVarArr;
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
        c cVar = (c) obj;
        if (this.f19632c == cVar.f19632c && this.f19633d == cVar.f19633d && this.f19634f == cVar.f19634f && this.f19635g == cVar.f19635g && n0.c(this.f19631b, cVar.f19631b) && Arrays.equals(this.f19636h, cVar.f19636h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f19632c) * 31) + this.f19633d) * 31) + ((int) this.f19634f)) * 31) + ((int) this.f19635g)) * 31;
        String str = this.f19631b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19631b);
        parcel.writeInt(this.f19632c);
        parcel.writeInt(this.f19633d);
        parcel.writeLong(this.f19634f);
        parcel.writeLong(this.f19635g);
        parcel.writeInt(this.f19636h.length);
        for (i writeParcelable : this.f19636h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f19631b = (String) n0.j(parcel.readString());
        this.f19632c = parcel.readInt();
        this.f19633d = parcel.readInt();
        this.f19634f = parcel.readLong();
        this.f19635g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19636h = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f19636h[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
