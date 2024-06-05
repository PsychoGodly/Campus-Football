package z2;

import k4.a;
import k4.a0;
import k4.n0;
import k4.r;
import p2.h0;
import s2.b0;
import s2.c0;

/* compiled from: XingSeeker */
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f24145a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24146b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24147c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24148d;

    /* renamed from: e  reason: collision with root package name */
    private final long f24149e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f24150f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1, (long[]) null);
    }

    public static i b(long j10, long j11, h0.a aVar, a0 a0Var) {
        int K;
        long j12 = j10;
        h0.a aVar2 = aVar;
        int i10 = aVar2.f21283g;
        int i11 = aVar2.f21280d;
        int p10 = a0Var.p();
        if ((p10 & 1) != 1 || (K = a0Var.K()) == 0) {
            return null;
        }
        long O0 = n0.O0((long) K, ((long) i10) * 1000000, (long) i11);
        if ((p10 & 6) != 6) {
            return new i(j11, aVar2.f21279c, O0);
        }
        long I = a0Var.I();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = (long) a0Var.G();
        }
        if (j12 != -1) {
            long j13 = j11 + I;
            if (j12 != j13) {
                r.i("XingSeeker", "XING data size mismatch: " + j12 + ", " + j13);
            }
        }
        return new i(j11, aVar2.f21279c, O0, I, jArr);
    }

    private long c(int i10) {
        return (this.f24147c * ((long) i10)) / 100;
    }

    public long a(long j10) {
        long j11;
        long j12 = j10 - this.f24145a;
        if (!f() || j12 <= ((long) this.f24146b)) {
            return 0;
        }
        long[] jArr = (long[]) a.h(this.f24150f);
        double d10 = (((double) j12) * 256.0d) / ((double) this.f24148d);
        int i10 = n0.i(jArr, (long) d10, true, true);
        long c10 = c(i10);
        long j13 = jArr[i10];
        int i11 = i10 + 1;
        long c11 = c(i11);
        if (i10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i11];
        }
        return c10 + Math.round((j13 == j11 ? 0.0d : (d10 - ((double) j13)) / ((double) (j11 - j13))) * ((double) (c11 - c10)));
    }

    public long d() {
        return this.f24149e;
    }

    public boolean f() {
        return this.f24150f != null;
    }

    public b0.a h(long j10) {
        double d10;
        if (!f()) {
            return new b0.a(new c0(0, this.f24145a + ((long) this.f24146b)));
        }
        long r10 = n0.r(j10, 0, this.f24147c);
        double d11 = (((double) r10) * 100.0d) / ((double) this.f24147c);
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) a.h(this.f24150f);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new b0.a(new c0(r10, this.f24145a + n0.r(Math.round((d12 / 256.0d) * ((double) this.f24148d)), (long) this.f24146b, this.f24148d - 1)));
    }

    public long i() {
        return this.f24147c;
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f24145a = j10;
        this.f24146b = i10;
        this.f24147c = j11;
        this.f24150f = jArr;
        this.f24148d = j12;
        this.f24149e = j12 != -1 ? j10 + j12 : -1;
    }
}
