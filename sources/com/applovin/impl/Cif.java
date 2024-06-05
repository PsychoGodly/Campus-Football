package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

/* renamed from: com.applovin.impl.if  reason: invalid class name */
public final class Cif implements we.b {
    public static final Parcelable.Creator<Cif> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f8530a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8531b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8532c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8533d;

    /* renamed from: f  reason: collision with root package name */
    public final long f8534f;

    /* renamed from: com.applovin.impl.if$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public Cif[] newArray(int i10) {
            return new Cif[i10];
        }

        /* renamed from: a */
        public Cif createFromParcel(Parcel parcel) {
            return new Cif(parcel, (a) null);
        }
    }

    public Cif(long j10, long j11, long j12, long j13, long j14) {
        this.f8530a = j10;
        this.f8531b = j11;
        this.f8532c = j12;
        this.f8533d = j13;
        this.f8534f = j14;
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
        if (obj == null || Cif.class != obj.getClass()) {
            return false;
        }
        Cif ifVar = (Cif) obj;
        if (this.f8530a == ifVar.f8530a && this.f8531b == ifVar.f8531b && this.f8532c == ifVar.f8532c && this.f8533d == ifVar.f8533d && this.f8534f == ifVar.f8534f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((nc.a(this.f8530a) + 527) * 31) + nc.a(this.f8531b)) * 31) + nc.a(this.f8532c)) * 31) + nc.a(this.f8533d)) * 31) + nc.a(this.f8534f);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8530a + ", photoSize=" + this.f8531b + ", photoPresentationTimestampUs=" + this.f8532c + ", videoStartPosition=" + this.f8533d + ", videoSize=" + this.f8534f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8530a);
        parcel.writeLong(this.f8531b);
        parcel.writeLong(this.f8532c);
        parcel.writeLong(this.f8533d);
        parcel.writeLong(this.f8534f);
    }

    private Cif(Parcel parcel) {
        this.f8530a = parcel.readLong();
        this.f8531b = parcel.readLong();
        this.f8532c = parcel.readLong();
        this.f8533d = parcel.readLong();
        this.f8534f = parcel.readLong();
    }

    /* synthetic */ Cif(Parcel parcel, a aVar) {
        this(parcel);
    }
}
