package m3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.a0;
import k4.j0;

/* compiled from: TimeSignalCommand */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f20076a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20077b;

    /* compiled from: TimeSignalCommand */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static g a(a0 a0Var, long j10, j0 j0Var) {
        long b10 = b(a0Var, j10);
        return new g(b10, j0Var.b(b10));
    }

    static long b(a0 a0Var, long j10) {
        long G = (long) a0Var.G();
        if ((128 & G) != 0) {
            return 8589934591L & ((((G & 1) << 32) | a0Var.I()) + j10);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20076a);
        parcel.writeLong(this.f20077b);
    }

    private g(long j10, long j11) {
        this.f20076a = j10;
        this.f20077b = j11;
    }
}
