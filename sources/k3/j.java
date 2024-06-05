package k3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.n0;

/* compiled from: InternalFrame */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19655b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19656c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19657d;

    /* compiled from: InternalFrame */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f19655b = str;
        this.f19656c = str2;
        this.f19657d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (!n0.c(this.f19656c, jVar.f19656c) || !n0.c(this.f19655b, jVar.f19655b) || !n0.c(this.f19657d, jVar.f19657d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19655b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19656c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19657d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f19654a + ": domain=" + this.f19655b + ", description=" + this.f19656c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19654a);
        parcel.writeString(this.f19655b);
        parcel.writeString(this.f19657d);
    }

    j(Parcel parcel) {
        super("----");
        this.f19655b = (String) n0.j(parcel.readString());
        this.f19656c = (String) n0.j(parcel.readString());
        this.f19657d = (String) n0.j(parcel.readString());
    }
}
