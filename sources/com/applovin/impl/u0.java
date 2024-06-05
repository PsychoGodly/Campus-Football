package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.Arrays;

public final class u0 extends ua {
    public static final Parcelable.Creator<u0> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f12474b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12475c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12476d;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f12477f;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public u0[] newArray(int i10) {
            return new u0[i10];
        }

        /* renamed from: a */
        public u0 createFromParcel(Parcel parcel) {
            return new u0(parcel);
        }
    }

    u0(Parcel parcel) {
        super("APIC");
        this.f12474b = (String) yp.a((Object) parcel.readString());
        this.f12475c = parcel.readString();
        this.f12476d = parcel.readInt();
        this.f12477f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public void a(qd.b bVar) {
        bVar.a(this.f12477f, this.f12476d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f12476d != u0Var.f12476d || !yp.a((Object) this.f12474b, (Object) u0Var.f12474b) || !yp.a((Object) this.f12475c, (Object) u0Var.f12475c) || !Arrays.equals(this.f12477f, u0Var.f12477f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (this.f12476d + 527) * 31;
        String str = this.f12474b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12475c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.f12477f);
    }

    public String toString() {
        return this.f12545a + ": mimeType=" + this.f12474b + ", description=" + this.f12475c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12474b);
        parcel.writeString(this.f12475c);
        parcel.writeInt(this.f12476d);
        parcel.writeByteArray(this.f12477f);
    }

    public u0(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f12474b = str;
        this.f12475c = str2;
        this.f12476d = i10;
        this.f12477f = bArr;
    }
}
