package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class s3 extends ua {
    public static final Parcelable.Creator<s3> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f11287b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11288c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11289d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public s3[] newArray(int i10) {
            return new s3[i10];
        }

        /* renamed from: a */
        public s3 createFromParcel(Parcel parcel) {
            return new s3(parcel);
        }
    }

    s3(Parcel parcel) {
        super("COMM");
        this.f11287b = (String) yp.a((Object) parcel.readString());
        this.f11288c = (String) yp.a((Object) parcel.readString());
        this.f11289d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!yp.a((Object) this.f11288c, (Object) s3Var.f11288c) || !yp.a((Object) this.f11287b, (Object) s3Var.f11287b) || !yp.a((Object) this.f11289d, (Object) s3Var.f11289d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11287b;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11288c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11289d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f12545a + ": language=" + this.f11287b + ", description=" + this.f11288c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12545a);
        parcel.writeString(this.f11287b);
        parcel.writeString(this.f11289d);
    }

    public s3(String str, String str2, String str3) {
        super("COMM");
        this.f11287b = str;
        this.f11288c = str2;
        this.f11289d = str3;
    }
}
