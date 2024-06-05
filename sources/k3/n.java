package k3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.n0;

/* compiled from: UrlLinkFrame */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f19668b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19669c;

    /* compiled from: UrlLinkFrame */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f19668b = str2;
        this.f19669c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f19654a.equals(nVar.f19654a) || !n0.c(this.f19668b, nVar.f19668b) || !n0.c(this.f19669c, nVar.f19669c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f19654a.hashCode()) * 31;
        String str = this.f19668b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19669c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f19654a + ": url=" + this.f19669c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19654a);
        parcel.writeString(this.f19668b);
        parcel.writeString(this.f19669c);
    }

    n(Parcel parcel) {
        super((String) n0.j(parcel.readString()));
        this.f19668b = parcel.readString();
        this.f19669c = (String) n0.j(parcel.readString());
    }
}
