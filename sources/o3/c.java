package o3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: StreamKey */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f21071a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21072b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21073c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f21074d;

    /* compiled from: StreamKey */
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

    public c(int i10, int i11, int i12) {
        this.f21071a = i10;
        this.f21072b = i11;
        this.f21073c = i12;
        this.f21074d = i12;
    }

    /* renamed from: a */
    public int compareTo(c cVar) {
        int i10 = this.f21071a - cVar.f21071a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f21072b - cVar.f21072b;
        return i11 == 0 ? this.f21073c - cVar.f21073c : i11;
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
        if (this.f21071a == cVar.f21071a && this.f21072b == cVar.f21072b && this.f21073c == cVar.f21073c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21071a * 31) + this.f21072b) * 31) + this.f21073c;
    }

    public String toString() {
        return this.f21071a + "." + this.f21072b + "." + this.f21073c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21071a);
        parcel.writeInt(this.f21072b);
        parcel.writeInt(this.f21073c);
    }

    c(Parcel parcel) {
        this.f21071a = parcel.readInt();
        this.f21072b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f21073c = readInt;
        this.f21074d = readInt;
    }
}
