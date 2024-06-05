package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class y9 extends ua {
    public static final Parcelable.Creator<y9> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f13553b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13554c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13555d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f13556f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public y9[] newArray(int i10) {
            return new y9[i10];
        }

        /* renamed from: a */
        public y9 createFromParcel(Parcel parcel) {
            return new y9(parcel);
        }
    }

    y9(Parcel parcel) {
        super("GEOB");
        this.f13553b = (String) yp.a((Object) parcel.readString());
        this.f13554c = (String) yp.a((Object) parcel.readString());
        this.f13555d = (String) yp.a((Object) parcel.readString());
        this.f13556f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9.class != obj.getClass()) {
            return false;
        }
        y9 y9Var = (y9) obj;
        if (!yp.a((Object) this.f13553b, (Object) y9Var.f13553b) || !yp.a((Object) this.f13554c, (Object) y9Var.f13554c) || !yp.a((Object) this.f13555d, (Object) y9Var.f13555d) || !Arrays.equals(this.f13556f, y9Var.f13556f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13553b;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f13554c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13555d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.f13556f);
    }

    public String toString() {
        return this.f12545a + ": mimeType=" + this.f13553b + ", filename=" + this.f13554c + ", description=" + this.f13555d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13553b);
        parcel.writeString(this.f13554c);
        parcel.writeString(this.f13555d);
        parcel.writeByteArray(this.f13556f);
    }

    public y9(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f13553b = str;
        this.f13554c = str2;
        this.f13555d = str3;
        this.f13556f = bArr;
    }
}
