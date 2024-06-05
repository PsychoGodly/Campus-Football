package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class eo extends pk {
    public static final Parcelable.Creator<eo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f7485a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7486b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public eo[] newArray(int i10) {
            return new eo[i10];
        }

        /* renamed from: a */
        public eo createFromParcel(Parcel parcel) {
            return new eo(parcel.readLong(), parcel.readLong(), (a) null);
        }
    }

    private eo(long j10, long j11) {
        this.f7485a = j10;
        this.f7486b = j11;
    }

    static eo a(yg ygVar, long j10, io ioVar) {
        long a10 = a(ygVar, j10);
        return new eo(a10, ioVar.b(a10));
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7485a);
        parcel.writeLong(this.f7486b);
    }

    /* synthetic */ eo(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static long a(yg ygVar, long j10) {
        long w10 = (long) ygVar.w();
        if ((128 & w10) != 0) {
            return 8589934591L & ((((w10 & 1) << 32) | ygVar.y()) + j10);
        }
        return -9223372036854775807L;
    }
}
