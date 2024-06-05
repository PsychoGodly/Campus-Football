package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class vh extends pk {
    public static final Parcelable.Creator<vh> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f12746a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12747b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f12748c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public vh[] newArray(int i10) {
            return new vh[i10];
        }

        /* renamed from: a */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel, (a) null);
        }
    }

    private vh(long j10, byte[] bArr, long j11) {
        this.f12746a = j11;
        this.f12747b = j10;
        this.f12748c = bArr;
    }

    static vh a(yg ygVar, int i10, long j10) {
        long y10 = ygVar.y();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        return new vh(y10, bArr, j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12746a);
        parcel.writeLong(this.f12747b);
        parcel.writeByteArray(this.f12748c);
    }

    private vh(Parcel parcel) {
        this.f12746a = parcel.readLong();
        this.f12747b = parcel.readLong();
        this.f12748c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    /* synthetic */ vh(Parcel parcel, a aVar) {
        this(parcel);
    }
}
