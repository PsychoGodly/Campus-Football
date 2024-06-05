package oe;

import oe.b;

/* compiled from: longSaturatedMath.kt */
public final class g {
    public static final long a(long j10, long j11) {
        if ((1 | (j11 - 1)) == Long.MAX_VALUE) {
            return b.D(d.o(j11, e.DAYS));
        }
        return b(j10, j11);
    }

    private static final long b(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) < 0) {
            long j13 = (long) 1000000;
            long j14 = (j10 % j13) - (j11 % j13);
            b.a aVar = b.f36768b;
            return b.z(d.o((j10 / j13) - (j11 / j13), e.MILLISECONDS), d.o(j14, e.NANOSECONDS));
        }
        b.a aVar2 = b.f36768b;
        return d.o(j12, e.NANOSECONDS);
    }

    public static final long c(long j10, long j11) {
        boolean z10 = true;
        if (!(((j11 - 1) | 1) == Long.MAX_VALUE)) {
            if ((1 | (j10 - 1)) != Long.MAX_VALUE) {
                z10 = false;
            }
            if (z10) {
                return d.o(j10, e.DAYS);
            }
            return b(j10, j11);
        } else if (j10 == j11) {
            return b.f36768b.a();
        } else {
            return b.D(d.o(j11, e.DAYS));
        }
    }
}
