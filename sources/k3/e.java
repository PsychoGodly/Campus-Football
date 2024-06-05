package k3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.n0;

/* compiled from: CommentFrame */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19642b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19643c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19644d;

    /* compiled from: CommentFrame */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f19642b = str;
        this.f19643c = str2;
        this.f19644d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!n0.c(this.f19643c, eVar.f19643c) || !n0.c(this.f19642b, eVar.f19642b) || !n0.c(this.f19644d, eVar.f19644d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19642b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19643c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19644d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f19654a + ": language=" + this.f19642b + ", description=" + this.f19643c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19654a);
        parcel.writeString(this.f19642b);
        parcel.writeString(this.f19644d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f19642b = (String) n0.j(parcel.readString());
        this.f19643c = (String) n0.j(parcel.readString());
        this.f19644d = (String) n0.j(parcel.readString());
    }
}
