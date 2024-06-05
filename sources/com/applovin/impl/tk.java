package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class tk extends pk {
    public static final Parcelable.Creator<tk> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List f12412a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public tk[] newArray(int i10) {
            return new tk[i10];
        }

        /* renamed from: a */
        public tk createFromParcel(Parcel parcel) {
            return new tk(parcel, (a) null);
        }
    }

    private tk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.b(parcel));
        }
        this.f12412a = Collections.unmodifiableList(arrayList);
    }

    static tk a(yg ygVar) {
        int w10 = ygVar.w();
        ArrayList arrayList = new ArrayList(w10);
        for (int i10 = 0; i10 < w10; i10++) {
            arrayList.add(c.b(ygVar));
        }
        return new tk((List) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f12412a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((c) this.f12412a.get(i11)).c(parcel);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12413a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12414b;

        private b(int i10, long j10) {
            this.f12413a = i10;
            this.f12414b = j10;
        }

        /* access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f12413a);
            parcel.writeLong(this.f12414b);
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }
    }

    /* synthetic */ tk(Parcel parcel, a aVar) {
        this(parcel);
    }

    private tk(List list) {
        this.f12412a = Collections.unmodifiableList(list);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f12415a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12416b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12417c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f12418d;

        /* renamed from: e  reason: collision with root package name */
        public final long f12419e;

        /* renamed from: f  reason: collision with root package name */
        public final List f12420f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12421g;

        /* renamed from: h  reason: collision with root package name */
        public final long f12422h;

        /* renamed from: i  reason: collision with root package name */
        public final int f12423i;

        /* renamed from: j  reason: collision with root package name */
        public final int f12424j;

        /* renamed from: k  reason: collision with root package name */
        public final int f12425k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f12415a = j10;
            this.f12416b = z10;
            this.f12417c = z11;
            this.f12418d = z12;
            this.f12420f = Collections.unmodifiableList(list);
            this.f12419e = j11;
            this.f12421g = z13;
            this.f12422h = j12;
            this.f12423i = i10;
            this.f12424j = i11;
            this.f12425k = i12;
        }

        /* access modifiers changed from: private */
        public static c b(yg ygVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z11;
            long j11;
            ArrayList arrayList;
            boolean z12;
            long j12;
            boolean z13;
            long y10 = ygVar.y();
            boolean z14 = (ygVar.w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int w10 = ygVar.w();
                boolean z15 = (w10 & 128) != 0;
                boolean z16 = (w10 & 64) != 0;
                boolean z17 = (w10 & 32) != 0;
                long y11 = z16 ? ygVar.y() : -9223372036854775807L;
                if (!z16) {
                    int w11 = ygVar.w();
                    ArrayList arrayList3 = new ArrayList(w11);
                    for (int i13 = 0; i13 < w11; i13++) {
                        arrayList3.add(new b(ygVar.w(), ygVar.y(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long w12 = (long) ygVar.w();
                    boolean z18 = (128 & w12) != 0;
                    j12 = ((((w12 & 1) << 32) | ygVar.y()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int C = ygVar.C();
                int w13 = ygVar.w();
                z10 = z16;
                i10 = ygVar.w();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = y11;
                i12 = C;
                i11 = w13;
                j11 = j13;
                boolean z19 = z15;
                z11 = z13;
                z12 = z19;
            } else {
                arrayList = arrayList2;
                z12 = false;
                j11 = -9223372036854775807L;
                z11 = false;
                j10 = -9223372036854775807L;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z10 = false;
            }
            return new c(y10, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        /* access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.f12415a);
            parcel.writeByte(this.f12416b ? (byte) 1 : 0);
            parcel.writeByte(this.f12417c ? (byte) 1 : 0);
            parcel.writeByte(this.f12418d ? (byte) 1 : 0);
            int size = this.f12420f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f12420f.get(i10)).c(parcel);
            }
            parcel.writeLong(this.f12419e);
            parcel.writeByte(this.f12421g ? (byte) 1 : 0);
            parcel.writeLong(this.f12422h);
            parcel.writeInt(this.f12423i);
            parcel.writeInt(this.f12424j);
            parcel.writeInt(this.f12425k);
        }

        private c(Parcel parcel) {
            this.f12415a = parcel.readLong();
            boolean z10 = false;
            this.f12416b = parcel.readByte() == 1;
            this.f12417c = parcel.readByte() == 1;
            this.f12418d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.b(parcel));
            }
            this.f12420f = Collections.unmodifiableList(arrayList);
            this.f12419e = parcel.readLong();
            this.f12421g = parcel.readByte() == 1 ? true : z10;
            this.f12422h = parcel.readLong();
            this.f12423i = parcel.readInt();
            this.f12424j = parcel.readInt();
            this.f12425k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }
}
