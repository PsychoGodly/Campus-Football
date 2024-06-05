package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.ej;

final class ff implements hj {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f7773a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f7774b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7775c;

    private ff(long[] jArr, long[] jArr2, long j10) {
        this.f7773a = jArr;
        this.f7774b = jArr2;
        this.f7775c = j10 == -9223372036854775807L ? r2.a(jArr2[jArr2.length - 1]) : j10;
    }

    public static ff a(long j10, ef efVar, long j11) {
        int length = efVar.f7419f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (efVar.f7417c + efVar.f7419f[i12]);
            j12 += (long) (efVar.f7418d + efVar.f7420g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new ff(jArr, jArr2, j11);
    }

    public ej.a b(long j10) {
        Pair a10 = a(r2.b(yp.b(j10, 0, this.f7775c)), this.f7774b, this.f7773a);
        return new ej.a(new gj(r2.a(((Long) a10.first).longValue()), ((Long) a10.second).longValue()));
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return -1;
    }

    public long d() {
        return this.f7775c;
    }

    public long a(long j10) {
        return r2.a(((Long) a(j10, this.f7773a, this.f7774b).second).longValue());
    }

    private static Pair a(long j10, long[] jArr, long[] jArr2) {
        int b10 = yp.b(jArr, j10, true, true);
        long j11 = jArr[b10];
        long j12 = jArr2[b10];
        int i10 = b10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i10] - j12)))) + j12));
    }
}
