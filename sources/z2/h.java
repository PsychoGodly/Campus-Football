package z2;

import k4.a0;
import k4.n0;
import k4.r;
import p2.h0;
import s2.b0;
import s2.c0;

/* compiled from: VbriSeeker */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f24141a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f24142b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24143c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24144d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f24141a = jArr;
        this.f24142b = jArr2;
        this.f24143c = j10;
        this.f24144d = j11;
    }

    public static h b(long j10, long j11, h0.a aVar, a0 a0Var) {
        int i10;
        long j12 = j10;
        h0.a aVar2 = aVar;
        a0 a0Var2 = a0Var;
        a0Var2.U(10);
        int p10 = a0Var.p();
        if (p10 <= 0) {
            return null;
        }
        int i11 = aVar2.f21280d;
        long O0 = n0.O0((long) p10, 1000000 * ((long) (i11 >= 32000 ? 1152 : 576)), (long) i11);
        int M = a0Var.M();
        int M2 = a0Var.M();
        int M3 = a0Var.M();
        a0Var2.U(2);
        long j13 = j11 + ((long) aVar2.f21279c);
        long[] jArr = new long[M];
        long[] jArr2 = new long[M];
        int i12 = 0;
        long j14 = j11;
        while (i12 < M) {
            int i13 = M2;
            jArr[i12] = (((long) i12) * O0) / ((long) M);
            long j15 = j13;
            jArr2[i12] = Math.max(j14, j15);
            if (M3 == 1) {
                i10 = a0Var.G();
            } else if (M3 == 2) {
                i10 = a0Var.M();
            } else if (M3 == 3) {
                i10 = a0Var.J();
            } else if (M3 != 4) {
                return null;
            } else {
                i10 = a0Var.K();
            }
            long j16 = (long) i10;
            int i14 = i13;
            j14 += j16 * ((long) i14);
            i12++;
            jArr = jArr;
            M2 = i14;
            j13 = j15;
        }
        long[] jArr3 = jArr;
        if (!(j12 == -1 || j12 == j14)) {
            r.i("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j14);
        }
        return new h(jArr3, jArr2, O0, j14);
    }

    public long a(long j10) {
        return this.f24141a[n0.i(this.f24142b, j10, true, true)];
    }

    public long d() {
        return this.f24144d;
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        int i10 = n0.i(this.f24141a, j10, true, true);
        c0 c0Var = new c0(this.f24141a[i10], this.f24142b[i10]);
        if (c0Var.f22384a >= j10 || i10 == this.f24141a.length - 1) {
            return new b0.a(c0Var);
        }
        int i11 = i10 + 1;
        return new b0.a(c0Var, new c0(this.f24141a[i11], this.f24142b[i11]));
    }

    public long i() {
        return this.f24143c;
    }
}
