package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;

final class es implements hj {

    /* renamed from: a  reason: collision with root package name */
    private final long f7507a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7508b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7509c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7510d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7511e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f7512f;

    private es(long j10, int i10, long j11) {
        this(j10, i10, j11, -1, (long[]) null);
    }

    public static es a(long j10, long j11, of.a aVar, yg ygVar) {
        int A;
        long j12 = j10;
        of.a aVar2 = aVar;
        int i10 = aVar2.f10234g;
        int i11 = aVar2.f10231d;
        int j13 = ygVar.j();
        if ((j13 & 1) != 1 || (A = ygVar.A()) == 0) {
            return null;
        }
        long c10 = yp.c((long) A, ((long) i10) * 1000000, (long) i11);
        if ((j13 & 6) != 6) {
            return new es(j11, aVar2.f10230c, c10);
        }
        long y10 = ygVar.y();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = (long) ygVar.w();
        }
        if (j12 != -1) {
            long j14 = j11 + y10;
            if (j12 != j14) {
                kc.d("XingSeeker", "XING data size mismatch: " + j12 + ", " + j14);
            }
        }
        return new es(j11, aVar2.f10230c, c10, y10, jArr);
    }

    public ej.a b(long j10) {
        double d10;
        if (!b()) {
            return new ej.a(new gj(0, this.f7507a + ((long) this.f7508b)));
        }
        long b10 = yp.b(j10, 0, this.f7509c);
        double d11 = (((double) b10) * 100.0d) / ((double) this.f7509c);
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) a1.b((Object) this.f7512f);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new ej.a(new gj(b10, this.f7507a + yp.b(Math.round((d12 / 256.0d) * ((double) this.f7510d)), (long) this.f7508b, this.f7510d - 1)));
    }

    public long c() {
        return this.f7511e;
    }

    public long d() {
        return this.f7509c;
    }

    private es(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f7507a = j10;
        this.f7508b = i10;
        this.f7509c = j11;
        this.f7512f = jArr;
        this.f7510d = j12;
        this.f7511e = j12 != -1 ? j10 + j12 : -1;
    }

    public long a(long j10) {
        long j11;
        long j12 = j10 - this.f7507a;
        if (!b() || j12 <= ((long) this.f7508b)) {
            return 0;
        }
        long[] jArr = (long[]) a1.b((Object) this.f7512f);
        double d10 = (((double) j12) * 256.0d) / ((double) this.f7510d);
        int b10 = yp.b(jArr, (long) d10, true, true);
        long a10 = a(b10);
        long j13 = jArr[b10];
        int i10 = b10 + 1;
        long a11 = a(i10);
        if (b10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i10];
        }
        return a10 + Math.round((j13 == j11 ? 0.0d : (d10 - ((double) j13)) / ((double) (j11 - j13))) * ((double) (a11 - a10)));
    }

    public boolean b() {
        return this.f7512f != null;
    }

    private long a(int i10) {
        return (this.f7509c * ((long) i10)) / 100;
    }
}
