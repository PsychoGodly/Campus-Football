package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d3 extends ua {
    public static final Parcelable.Creator<d3> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7106b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7107c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7108d;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f7109f;

    /* renamed from: g  reason: collision with root package name */
    private final ua[] f7110g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d3[] newArray(int i10) {
            return new d3[i10];
        }

        /* renamed from: a */
        public d3 createFromParcel(Parcel parcel) {
            return new d3(parcel);
        }
    }

    d3(Parcel parcel) {
        super("CTOC");
        this.f7106b = (String) yp.a((Object) parcel.readString());
        boolean z10 = true;
        this.f7107c = parcel.readByte() != 0;
        this.f7108d = parcel.readByte() == 0 ? false : z10;
        this.f7109f = (String[]) yp.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f7110g = new ua[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f7110g[i10] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.class != obj.getClass()) {
            return false;
        }
        d3 d3Var = (d3) obj;
        if (this.f7107c != d3Var.f7107c || this.f7108d != d3Var.f7108d || !yp.a((Object) this.f7106b, (Object) d3Var.f7106b) || !Arrays.equals(this.f7109f, d3Var.f7109f) || !Arrays.equals(this.f7110g, d3Var.f7110g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = ((((this.f7107c ? 1 : 0) + true) * 31) + (this.f7108d ? 1 : 0)) * 31;
        String str = this.f7106b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7106b);
        parcel.writeByte(this.f7107c ? (byte) 1 : 0);
        parcel.writeByte(this.f7108d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f7109f);
        parcel.writeInt(this.f7110g.length);
        for (ua writeParcelable : this.f7110g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public d3(String str, boolean z10, boolean z11, String[] strArr, ua[] uaVarArr) {
        super("CTOC");
        this.f7106b = str;
        this.f7107c = z10;
        this.f7108d = z11;
        this.f7109f = strArr;
        this.f7110g = uaVarArr;
    }
}
