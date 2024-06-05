package n2;

import k4.a;
import k4.n0;

/* compiled from: SeekParameters */
public final class u3 {

    /* renamed from: c  reason: collision with root package name */
    public static final u3 f20729c;

    /* renamed from: d  reason: collision with root package name */
    public static final u3 f20730d = new u3(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final u3 f20731e = new u3(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final u3 f20732f = new u3(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final u3 f20733g;

    /* renamed from: a  reason: collision with root package name */
    public final long f20734a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20735b;

    static {
        u3 u3Var = new u3(0, 0);
        f20729c = u3Var;
        f20733g = u3Var;
    }

    public u3(long j10, long j11) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 < 0 ? false : z10);
        this.f20734a = j10;
        this.f20735b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f20734a;
        if (j13 == 0 && this.f20735b == 0) {
            return j10;
        }
        long U0 = n0.U0(j10, j13, Long.MIN_VALUE);
        long b10 = n0.b(j10, this.f20735b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = U0 <= j11 && j11 <= b10;
        if (U0 > j12 || j12 > b10) {
            z10 = false;
        }
        if (z11 && z10) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z11) {
            return j11;
        }
        return z10 ? j12 : U0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3.class != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (this.f20734a == u3Var.f20734a && this.f20735b == u3Var.f20735b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f20734a) * 31) + ((int) this.f20735b);
    }
}
