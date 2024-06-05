package z2;

import android.util.Pair;
import k3.k;
import k4.n0;
import s2.b0;
import s2.c0;

/* compiled from: MlltSeeker */
final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f24116a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f24117b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24118c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f24116a = jArr;
        this.f24117b = jArr2;
        this.f24118c = j10 == -9223372036854775807L ? n0.C0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c b(long j10, k kVar, long j11) {
        int length = kVar.f19661f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (kVar.f19659c + kVar.f19661f[i12]);
            j12 += (long) (kVar.f19660d + kVar.f19662g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        int i10 = n0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i11] - j12)))) + j12));
    }

    public long a(long j10) {
        return n0.C0(((Long) c(j10, this.f24116a, this.f24117b).second).longValue());
    }

    public long d() {
        return -1;
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        Pair<Long, Long> c10 = c(n0.Z0(n0.r(j10, 0, this.f24118c)), this.f24117b, this.f24116a);
        return new b0.a(new c0(n0.C0(((Long) c10.first).longValue()), ((Long) c10.second).longValue()));
    }

    public long i() {
        return this.f24118c;
    }
}
