package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;

final class qq implements hj {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f11069a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f11070b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11071c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11072d;

    private qq(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f11069a = jArr;
        this.f11070b = jArr2;
        this.f11071c = j10;
        this.f11072d = j11;
    }

    public static qq a(long j10, long j11, of.a aVar, yg ygVar) {
        int i10;
        long j12 = j10;
        of.a aVar2 = aVar;
        yg ygVar2 = ygVar;
        ygVar2.g(10);
        int j13 = ygVar.j();
        if (j13 <= 0) {
            return null;
        }
        int i11 = aVar2.f10231d;
        long c10 = yp.c((long) j13, 1000000 * ((long) (i11 >= 32000 ? 1152 : 576)), (long) i11);
        int C = ygVar.C();
        int C2 = ygVar.C();
        int C3 = ygVar.C();
        ygVar2.g(2);
        long j14 = j11 + ((long) aVar2.f10230c);
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        int i12 = 0;
        long j15 = j11;
        while (i12 < C) {
            int i13 = C2;
            jArr[i12] = (((long) i12) * c10) / ((long) C);
            long j16 = j14;
            jArr2[i12] = Math.max(j15, j16);
            if (C3 == 1) {
                i10 = ygVar.w();
            } else if (C3 == 2) {
                i10 = ygVar.C();
            } else if (C3 == 3) {
                i10 = ygVar.z();
            } else if (C3 != 4) {
                return null;
            } else {
                i10 = ygVar.A();
            }
            j15 += (long) (i10 * i13);
            i12++;
            j14 = j16;
            C2 = i13;
        }
        if (!(j12 == -1 || j12 == j15)) {
            kc.d("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j15);
        }
        return new qq(jArr, jArr2, c10, j15);
    }

    public ej.a b(long j10) {
        int b10 = yp.b(this.f11069a, j10, true, true);
        gj gjVar = new gj(this.f11069a[b10], this.f11070b[b10]);
        if (gjVar.f8034a >= j10 || b10 == this.f11069a.length - 1) {
            return new ej.a(gjVar);
        }
        int i10 = b10 + 1;
        return new ej.a(gjVar, new gj(this.f11069a[i10], this.f11070b[i10]));
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f11072d;
    }

    public long d() {
        return this.f11071c;
    }

    public long a(long j10) {
        return this.f11069a[yp.b(this.f11070b, j10, true, true)];
    }
}
