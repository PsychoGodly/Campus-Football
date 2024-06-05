package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class nb extends ua {
    public static final Parcelable.Creator<nb> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f9963b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9964c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9965d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public nb[] newArray(int i10) {
            return new nb[i10];
        }

        /* renamed from: a */
        public nb createFromParcel(Parcel parcel) {
            return new nb(parcel);
        }
    }

    nb(Parcel parcel) {
        super("----");
        this.f9963b = (String) yp.a((Object) parcel.readString());
        this.f9964c = (String) yp.a((Object) parcel.readString());
        this.f9965d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb.class != obj.getClass()) {
            return false;
        }
        nb nbVar = (nb) obj;
        if (!yp.a((Object) this.f9964c, (Object) nbVar.f9964c) || !yp.a((Object) this.f9963b, (Object) nbVar.f9963b) || !yp.a((Object) this.f9965d, (Object) nbVar.f9965d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f9963b;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9964c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9965d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f12545a + ": domain=" + this.f9963b + ", description=" + this.f9964c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12545a);
        parcel.writeString(this.f9963b);
        parcel.writeString(this.f9965d);
    }

    public nb(String str, String str2, String str3) {
        super("----");
        this.f9963b = str;
        this.f9964c = str2;
        this.f9965d = str3;
    }
}
