package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

public final class er implements we.b {
    public static final Parcelable.Creator<er> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f7505a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7506b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public er[] newArray(int i10) {
            return new er[i10];
        }

        /* renamed from: a */
        public er createFromParcel(Parcel parcel) {
            return new er(parcel);
        }
    }

    er(Parcel parcel) {
        this.f7505a = (String) yp.a((Object) parcel.readString());
        this.f7506b = (String) yp.a((Object) parcel.readString());
    }

    public void a(qd.b bVar) {
        String str = this.f7505a;
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
                bVar.b((CharSequence) this.f7506b);
                return;
            case 1:
                bVar.k((CharSequence) this.f7506b);
                return;
            case 2:
                bVar.g((CharSequence) this.f7506b);
                return;
            case 3:
                bVar.a((CharSequence) this.f7506b);
                return;
            case 4:
                bVar.c((CharSequence) this.f7506b);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ byte[] a() {
        return e70.b(this);
    }

    public /* synthetic */ d9 b() {
        return e70.c(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er.class != obj.getClass()) {
            return false;
        }
        er erVar = (er) obj;
        if (!this.f7505a.equals(erVar.f7505a) || !this.f7506b.equals(erVar.f7506b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f7505a.hashCode() + 527) * 31) + this.f7506b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f7505a + "=" + this.f7506b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7505a);
        parcel.writeString(this.f7506b);
    }

    public er(String str, String str2) {
        this.f7505a = str;
        this.f7506b = str2;
    }
}
