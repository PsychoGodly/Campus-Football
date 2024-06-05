package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class g2 extends ua {
    public static final Parcelable.Creator<g2> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7894b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g2[] newArray(int i10) {
            return new g2[i10];
        }

        /* renamed from: a */
        public g2 createFromParcel(Parcel parcel) {
            return new g2(parcel);
        }
    }

    g2(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.f7894b = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (!this.f12545a.equals(g2Var.f12545a) || !Arrays.equals(this.f7894b, g2Var.f7894b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f12545a.hashCode() + 527) * 31) + Arrays.hashCode(this.f7894b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12545a);
        parcel.writeByteArray(this.f7894b);
    }

    public g2(String str, byte[] bArr) {
        super(str);
        this.f7894b = bArr;
    }
}
