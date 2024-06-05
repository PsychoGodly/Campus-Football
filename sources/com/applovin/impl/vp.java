package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class vp extends ua {
    public static final Parcelable.Creator<vp> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f12871b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12872c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public vp[] newArray(int i10) {
            return new vp[i10];
        }

        /* renamed from: a */
        public vp createFromParcel(Parcel parcel) {
            return new vp(parcel);
        }
    }

    vp(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.f12871b = parcel.readString();
        this.f12872c = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vp.class != obj.getClass()) {
            return false;
        }
        vp vpVar = (vp) obj;
        if (!this.f12545a.equals(vpVar.f12545a) || !yp.a((Object) this.f12871b, (Object) vpVar.f12871b) || !yp.a((Object) this.f12872c, (Object) vpVar.f12872c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f12545a.hashCode() + 527) * 31;
        String str = this.f12871b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12872c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f12545a + ": url=" + this.f12872c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12545a);
        parcel.writeString(this.f12871b);
        parcel.writeString(this.f12872c);
    }

    public vp(String str, String str2, String str3) {
        super(str);
        this.f12871b = str2;
        this.f12872c = str3;
    }
}
