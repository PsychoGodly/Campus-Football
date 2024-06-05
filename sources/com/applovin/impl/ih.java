package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

public final class ih implements we.b {
    public static final Parcelable.Creator<ih> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f8542a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8543b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8544c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8545d;

    /* renamed from: f  reason: collision with root package name */
    public final int f8546f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8547g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8548h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f8549i;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ih[] newArray(int i10) {
            return new ih[i10];
        }

        /* renamed from: a */
        public ih createFromParcel(Parcel parcel) {
            return new ih(parcel);
        }
    }

    public ih(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f8542a = i10;
        this.f8543b = str;
        this.f8544c = str2;
        this.f8545d = i11;
        this.f8546f = i12;
        this.f8547g = i13;
        this.f8548h = i14;
        this.f8549i = bArr;
    }

    public void a(qd.b bVar) {
        bVar.a(this.f8549i, this.f8542a);
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
        if (obj == null || ih.class != obj.getClass()) {
            return false;
        }
        ih ihVar = (ih) obj;
        if (this.f8542a == ihVar.f8542a && this.f8543b.equals(ihVar.f8543b) && this.f8544c.equals(ihVar.f8544c) && this.f8545d == ihVar.f8545d && this.f8546f == ihVar.f8546f && this.f8547g == ihVar.f8547g && this.f8548h == ihVar.f8548h && Arrays.equals(this.f8549i, ihVar.f8549i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.f8542a + 527) * 31) + this.f8543b.hashCode()) * 31) + this.f8544c.hashCode()) * 31) + this.f8545d) * 31) + this.f8546f) * 31) + this.f8547g) * 31) + this.f8548h) * 31) + Arrays.hashCode(this.f8549i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f8543b + ", description=" + this.f8544c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8542a);
        parcel.writeString(this.f8543b);
        parcel.writeString(this.f8544c);
        parcel.writeInt(this.f8545d);
        parcel.writeInt(this.f8546f);
        parcel.writeInt(this.f8547g);
        parcel.writeInt(this.f8548h);
        parcel.writeByteArray(this.f8549i);
    }

    ih(Parcel parcel) {
        this.f8542a = parcel.readInt();
        this.f8543b = (String) yp.a((Object) parcel.readString());
        this.f8544c = (String) yp.a((Object) parcel.readString());
        this.f8545d = parcel.readInt();
        this.f8546f = parcel.readInt();
        this.f8547g = parcel.readInt();
        this.f8548h = parcel.readInt();
        this.f8549i = (byte[]) yp.a((Object) parcel.createByteArray());
    }
}
