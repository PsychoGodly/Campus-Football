package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class rk extends pk {
    public static final Parcelable.Creator<rk> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f11185a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11186b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11187c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11188d;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11189f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11190g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11191h;

    /* renamed from: i  reason: collision with root package name */
    public final List f11192i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11193j;

    /* renamed from: k  reason: collision with root package name */
    public final long f11194k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11195l;

    /* renamed from: m  reason: collision with root package name */
    public final int f11196m;

    /* renamed from: n  reason: collision with root package name */
    public final int f11197n;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public rk[] newArray(int i10) {
            return new rk[i10];
        }

        /* renamed from: a */
        public rk createFromParcel(Parcel parcel) {
            return new rk(parcel, (a) null);
        }
    }

    private rk(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f11185a = j10;
        this.f11186b = z10;
        this.f11187c = z11;
        this.f11188d = z12;
        this.f11189f = z13;
        this.f11190g = j11;
        this.f11191h = j12;
        this.f11192i = Collections.unmodifiableList(list);
        this.f11193j = z14;
        this.f11194k = j13;
        this.f11195l = i10;
        this.f11196m = i11;
        this.f11197n = i12;
    }

    static rk a(yg ygVar, long j10, io ioVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z11;
        List list;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        io ioVar2 = ioVar;
        long y10 = ygVar.y();
        boolean z15 = (ygVar.w() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int w10 = ygVar.w();
            boolean z16 = (w10 & 128) != 0;
            boolean z17 = (w10 & 64) != 0;
            boolean z18 = (w10 & 32) != 0;
            boolean z19 = (w10 & 16) != 0;
            long a10 = (!z17 || z19) ? -9223372036854775807L : eo.a(ygVar, j10);
            if (!z17) {
                int w11 = ygVar.w();
                ArrayList arrayList = new ArrayList(w11);
                for (int i13 = 0; i13 < w11; i13++) {
                    int w12 = ygVar.w();
                    long a11 = !z19 ? eo.a(ygVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(w12, a11, ioVar2.b(a11), (a) null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long w13 = (long) ygVar.w();
                boolean z20 = (128 & w13) != 0;
                j13 = ((((w13 & 1) << 32) | ygVar.y()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i12 = ygVar.C();
            z10 = z17;
            i11 = ygVar.w();
            i10 = ygVar.w();
            list = emptyList;
            long j14 = a10;
            z11 = z14;
            j11 = j13;
            z12 = z19;
            z13 = z16;
            j12 = j14;
        } else {
            list = emptyList;
            z13 = false;
            z12 = false;
            j12 = -9223372036854775807L;
            z11 = false;
            j11 = -9223372036854775807L;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
        }
        return new rk(y10, z15, z13, z10, z12, j12, ioVar2.b(j12), list, z11, j11, i12, i11, i10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11185a);
        parcel.writeByte(this.f11186b ? (byte) 1 : 0);
        parcel.writeByte(this.f11187c ? (byte) 1 : 0);
        parcel.writeByte(this.f11188d ? (byte) 1 : 0);
        parcel.writeByte(this.f11189f ? (byte) 1 : 0);
        parcel.writeLong(this.f11190g);
        parcel.writeLong(this.f11191h);
        int size = this.f11192i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f11192i.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f11193j ? (byte) 1 : 0);
        parcel.writeLong(this.f11194k);
        parcel.writeInt(this.f11195l);
        parcel.writeInt(this.f11196m);
        parcel.writeInt(this.f11197n);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11198a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11199b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11200c;

        private b(int i10, long j10, long j11) {
            this.f11198a = i10;
            this.f11199b = j10;
            this.f11200c = j11;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f11198a);
            parcel.writeLong(this.f11199b);
            parcel.writeLong(this.f11200c);
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }
    }

    private rk(Parcel parcel) {
        this.f11185a = parcel.readLong();
        boolean z10 = false;
        this.f11186b = parcel.readByte() == 1;
        this.f11187c = parcel.readByte() == 1;
        this.f11188d = parcel.readByte() == 1;
        this.f11189f = parcel.readByte() == 1;
        this.f11190g = parcel.readLong();
        this.f11191h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f11192i = Collections.unmodifiableList(arrayList);
        this.f11193j = parcel.readByte() == 1 ? true : z10;
        this.f11194k = parcel.readLong();
        this.f11195l = parcel.readInt();
        this.f11196m = parcel.readInt();
        this.f11197n = parcel.readInt();
    }

    /* synthetic */ rk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
