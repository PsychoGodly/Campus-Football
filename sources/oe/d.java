package oe;

import ke.f;
import kotlin.jvm.internal.m;

/* compiled from: Duration.kt */
public final class d {
    /* access modifiers changed from: private */
    public static final long h(long j10, int i10) {
        return b.g((j10 << 1) + ((long) i10));
    }

    /* access modifiers changed from: private */
    public static final long i(long j10) {
        return b.g((j10 << 1) + 1);
    }

    /* access modifiers changed from: private */
    public static final long j(long j10) {
        if (new f(-4611686018426L, 4611686018426L).g(j10)) {
            return k(m(j10));
        }
        return i(i.f(j10, -4611686018427387903L, 4611686018427387903L));
    }

    /* access modifiers changed from: private */
    public static final long k(long j10) {
        return b.g(j10 << 1);
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        if (new f(-4611686018426999999L, 4611686018426999999L).g(j10)) {
            return k(j10);
        }
        return i(n(j10));
    }

    /* access modifiers changed from: private */
    public static final long m(long j10) {
        return j10 * ((long) 1000000);
    }

    /* access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long o(long j10, e eVar) {
        m.e(eVar, "unit");
        e eVar2 = e.NANOSECONDS;
        long c10 = f.c(4611686018426999999L, eVar2, eVar);
        if (new f(-c10, c10).g(j10)) {
            return k(f.c(j10, eVar, eVar2));
        }
        return i(i.f(f.b(j10, eVar, e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
