package m3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.a0;

/* compiled from: SpliceScheduleCommand */
public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f20062a;

    /* compiled from: SpliceScheduleCommand */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f20063a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20064b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f20063a);
            parcel.writeLong(this.f20064b);
        }

        private b(int i10, long j10) {
            this.f20063a = i10;
            this.f20064b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(a0 a0Var) {
        int G = a0Var.G();
        ArrayList arrayList = new ArrayList(G);
        for (int i10 = 0; i10 < G; i10++) {
            arrayList.add(c.e(a0Var));
        }
        return new f((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f20062a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f20062a.get(i11).f(parcel);
        }
    }

    private f(List<c> list) {
        this.f20062a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f20062a = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f20065a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f20066b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f20067c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20068d;

        /* renamed from: e  reason: collision with root package name */
        public final long f20069e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f20070f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f20071g;

        /* renamed from: h  reason: collision with root package name */
        public final long f20072h;

        /* renamed from: i  reason: collision with root package name */
        public final int f20073i;

        /* renamed from: j  reason: collision with root package name */
        public final int f20074j;

        /* renamed from: k  reason: collision with root package name */
        public final int f20075k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f20065a = j10;
            this.f20066b = z10;
            this.f20067c = z11;
            this.f20068d = z12;
            this.f20070f = Collections.unmodifiableList(list);
            this.f20069e = j11;
            this.f20071g = z13;
            this.f20072h = j12;
            this.f20073i = i10;
            this.f20074j = i11;
            this.f20075k = i12;
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(a0 a0Var) {
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
            long I = a0Var.I();
            boolean z14 = (a0Var.G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int G = a0Var.G();
                boolean z15 = (G & 128) != 0;
                boolean z16 = (G & 64) != 0;
                boolean z17 = (G & 32) != 0;
                long I2 = z16 ? a0Var.I() : -9223372036854775807L;
                if (!z16) {
                    int G2 = a0Var.G();
                    ArrayList arrayList3 = new ArrayList(G2);
                    for (int i13 = 0; i13 < G2; i13++) {
                        arrayList3.add(new b(a0Var.G(), a0Var.I(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long G3 = (long) a0Var.G();
                    boolean z18 = (128 & G3) != 0;
                    j12 = ((((G3 & 1) << 32) | a0Var.I()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int M = a0Var.M();
                int G4 = a0Var.G();
                z10 = z16;
                i10 = a0Var.G();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = I2;
                i12 = M;
                i11 = G4;
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
            return new c(I, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f20065a);
            parcel.writeByte(this.f20066b ? (byte) 1 : 0);
            parcel.writeByte(this.f20067c ? (byte) 1 : 0);
            parcel.writeByte(this.f20068d ? (byte) 1 : 0);
            int size = this.f20070f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f20070f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f20069e);
            parcel.writeByte(this.f20071g ? (byte) 1 : 0);
            parcel.writeLong(this.f20072h);
            parcel.writeInt(this.f20073i);
            parcel.writeInt(this.f20074j);
            parcel.writeInt(this.f20075k);
        }

        private c(Parcel parcel) {
            this.f20065a = parcel.readLong();
            boolean z10 = false;
            this.f20066b = parcel.readByte() == 1;
            this.f20067c = parcel.readByte() == 1;
            this.f20068d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f20070f = Collections.unmodifiableList(arrayList);
            this.f20069e = parcel.readLong();
            this.f20071g = parcel.readByte() == 1 ? true : z10;
            this.f20072h = parcel.readLong();
            this.f20073i = parcel.readInt();
            this.f20074j = parcel.readInt();
            this.f20075k = parcel.readInt();
        }
    }
}
