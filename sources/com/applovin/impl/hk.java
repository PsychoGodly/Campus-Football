package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

public final class hk implements we.b {
    public static final Parcelable.Creator<hk> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f8327a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8328b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public hk[] newArray(int i10) {
            return new hk[i10];
        }

        /* renamed from: a */
        public hk createFromParcel(Parcel parcel) {
            return new hk(parcel, (a) null);
        }
    }

    public hk(float f10, int i10) {
        this.f8327a = f10;
        this.f8328b = i10;
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
        if (obj == null || hk.class != obj.getClass()) {
            return false;
        }
        hk hkVar = (hk) obj;
        if (this.f8327a == hkVar.f8327a && this.f8328b == hkVar.f8328b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((b9.a(this.f8327a) + 527) * 31) + this.f8328b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f8327a + ", svcTemporalLayerCount=" + this.f8328b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f8327a);
        parcel.writeInt(this.f8328b);
    }

    private hk(Parcel parcel) {
        this.f8327a = parcel.readFloat();
        this.f8328b = parcel.readInt();
    }

    /* synthetic */ hk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
