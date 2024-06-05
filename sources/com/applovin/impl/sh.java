package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class sh extends ua {
    public static final Parcelable.Creator<sh> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f12113b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f12114c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public sh[] newArray(int i10) {
            return new sh[i10];
        }

        /* renamed from: a */
        public sh createFromParcel(Parcel parcel) {
            return new sh(parcel);
        }
    }

    sh(Parcel parcel) {
        super("PRIV");
        this.f12113b = (String) yp.a((Object) parcel.readString());
        this.f12114c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sh.class != obj.getClass()) {
            return false;
        }
        sh shVar = (sh) obj;
        if (!yp.a((Object) this.f12113b, (Object) shVar.f12113b) || !Arrays.equals(this.f12114c, shVar.f12114c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12113b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f12114c);
    }

    public String toString() {
        return this.f12545a + ": owner=" + this.f12113b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12113b);
        parcel.writeByteArray(this.f12114c);
    }

    public sh(String str, byte[] bArr) {
        super("PRIV");
        this.f12113b = str;
        this.f12114c = bArr;
    }
}
