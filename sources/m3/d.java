package m3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.a0;
import k4.j0;

/* compiled from: SpliceInsertCommand */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f20046a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20047b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20048c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20049d;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20050f;

    /* renamed from: g  reason: collision with root package name */
    public final long f20051g;

    /* renamed from: h  reason: collision with root package name */
    public final long f20052h;

    /* renamed from: i  reason: collision with root package name */
    public final List<b> f20053i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f20054j;

    /* renamed from: k  reason: collision with root package name */
    public final long f20055k;

    /* renamed from: l  reason: collision with root package name */
    public final int f20056l;

    /* renamed from: m  reason: collision with root package name */
    public final int f20057m;

    /* renamed from: n  reason: collision with root package name */
    public final int f20058n;

    /* compiled from: SpliceInsertCommand */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* compiled from: SpliceInsertCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f20059a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20060b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20061c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f20059a);
            parcel.writeLong(this.f20060b);
            parcel.writeLong(this.f20061c);
        }

        private b(int i10, long j10, long j11) {
            this.f20059a = i10;
            this.f20060b = j10;
            this.f20061c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(a0 a0Var, long j10, j0 j0Var) {
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
        j0 j0Var2 = j0Var;
        long I = a0Var.I();
        boolean z15 = (a0Var.G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int G = a0Var.G();
            boolean z16 = (G & 128) != 0;
            boolean z17 = (G & 64) != 0;
            boolean z18 = (G & 32) != 0;
            boolean z19 = (G & 16) != 0;
            long b10 = (!z17 || z19) ? -9223372036854775807L : g.b(a0Var, j10);
            if (!z17) {
                int G2 = a0Var.G();
                ArrayList arrayList = new ArrayList(G2);
                for (int i13 = 0; i13 < G2; i13++) {
                    int G3 = a0Var.G();
                    long b11 = !z19 ? g.b(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(G3, b11, j0Var2.b(b11), (a) null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long G4 = (long) a0Var.G();
                boolean z20 = (128 & G4) != 0;
                j13 = ((((G4 & 1) << 32) | a0Var.I()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i12 = a0Var.M();
            z10 = z17;
            i11 = a0Var.G();
            i10 = a0Var.G();
            list = emptyList;
            long j14 = b10;
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
        return new d(I, z15, z13, z10, z12, j12, j0Var2.b(j12), list, z11, j11, i12, i11, i10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20046a);
        parcel.writeByte(this.f20047b ? (byte) 1 : 0);
        parcel.writeByte(this.f20048c ? (byte) 1 : 0);
        parcel.writeByte(this.f20049d ? (byte) 1 : 0);
        parcel.writeByte(this.f20050f ? (byte) 1 : 0);
        parcel.writeLong(this.f20051g);
        parcel.writeLong(this.f20052h);
        int size = this.f20053i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f20053i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f20054j ? (byte) 1 : 0);
        parcel.writeLong(this.f20055k);
        parcel.writeInt(this.f20056l);
        parcel.writeInt(this.f20057m);
        parcel.writeInt(this.f20058n);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f20046a = j10;
        this.f20047b = z10;
        this.f20048c = z11;
        this.f20049d = z12;
        this.f20050f = z13;
        this.f20051g = j11;
        this.f20052h = j12;
        this.f20053i = Collections.unmodifiableList(list);
        this.f20054j = z14;
        this.f20055k = j13;
        this.f20056l = i10;
        this.f20057m = i11;
        this.f20058n = i12;
    }

    private d(Parcel parcel) {
        this.f20046a = parcel.readLong();
        boolean z10 = false;
        this.f20047b = parcel.readByte() == 1;
        this.f20048c = parcel.readByte() == 1;
        this.f20049d = parcel.readByte() == 1;
        this.f20050f = parcel.readByte() == 1;
        this.f20051g = parcel.readLong();
        this.f20052h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f20053i = Collections.unmodifiableList(arrayList);
        this.f20054j = parcel.readByte() == 1 ? true : z10;
        this.f20055k = parcel.readLong();
        this.f20056l = parcel.readInt();
        this.f20057m = parcel.readInt();
        this.f20058n = parcel.readInt();
    }
}
