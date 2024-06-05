package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

public final class ad implements we.b {
    public static final Parcelable.Creator<ad> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f6368a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6369b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6370c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6371d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ad[] newArray(int i10) {
            return new ad[i10];
        }

        /* renamed from: a */
        public ad createFromParcel(Parcel parcel) {
            return new ad(parcel, (a) null);
        }
    }

    private ad(Parcel parcel) {
        this.f6368a = (String) yp.a((Object) parcel.readString());
        this.f6369b = (byte[]) yp.a((Object) parcel.createByteArray());
        this.f6370c = parcel.readInt();
        this.f6371d = parcel.readInt();
    }

    public /* synthetic */ void a(qd.b bVar) {
        e70.a(this, bVar);
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
        if (obj == null || ad.class != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        if (!this.f6368a.equals(adVar.f6368a) || !Arrays.equals(this.f6369b, adVar.f6369b) || this.f6370c != adVar.f6370c || this.f6371d != adVar.f6371d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f6368a.hashCode() + 527) * 31) + Arrays.hashCode(this.f6369b)) * 31) + this.f6370c) * 31) + this.f6371d;
    }

    public String toString() {
        return "mdta: key=" + this.f6368a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6368a);
        parcel.writeByteArray(this.f6369b);
        parcel.writeInt(this.f6370c);
        parcel.writeInt(this.f6371d);
    }

    /* synthetic */ ad(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ad(String str, byte[] bArr, int i10, int i11) {
        this.f6368a = str;
        this.f6369b = bArr;
        this.f6370c = i10;
        this.f6371d = i11;
    }
}
