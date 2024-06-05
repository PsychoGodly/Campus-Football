package i3;

import android.os.Parcel;
import android.os.Parcelable;
import f3.a;
import k4.n0;
import n2.e2;
import n2.r1;

@Deprecated
/* compiled from: VorbisComment */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f18927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18928b;

    /* compiled from: VorbisComment */
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

    public b(String str, String str2) {
        this.f18927a = str;
        this.f18928b = str2;
    }

    public /* synthetic */ r1 F() {
        return f3.b.b(this);
    }

    public void M(e2.b bVar) {
        String str = this.f18927a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.N(this.f18928b);
                return;
            case 1:
                bVar.m0(this.f18928b);
                return;
            case 2:
                bVar.U(this.f18928b);
                return;
            case 3:
                bVar.M(this.f18928b);
                return;
            case 4:
                bVar.O(this.f18928b);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ byte[] a0() {
        return f3.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f18927a.equals(bVar.f18927a) || !this.f18928b.equals(bVar.f18928b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f18927a.hashCode()) * 31) + this.f18928b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f18927a + "=" + this.f18928b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18927a);
        parcel.writeString(this.f18928b);
    }

    protected b(Parcel parcel) {
        this.f18927a = (String) n0.j(parcel.readString());
        this.f18928b = (String) n0.j(parcel.readString());
    }
}
