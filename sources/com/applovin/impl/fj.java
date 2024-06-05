package com.applovin.impl;

public final class fj {

    /* renamed from: c  reason: collision with root package name */
    public static final fj f7802c;

    /* renamed from: d  reason: collision with root package name */
    public static final fj f7803d = new fj(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final fj f7804e = new fj(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final fj f7805f = new fj(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final fj f7806g;

    /* renamed from: a  reason: collision with root package name */
    public final long f7807a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7808b;

    static {
        fj fjVar = new fj(0, 0);
        f7802c = fjVar;
        f7806g = fjVar;
    }

    public fj(long j10, long j11) {
        boolean z10 = true;
        a1.a(j10 >= 0);
        a1.a(j11 < 0 ? false : z10);
        this.f7807a = j10;
        this.f7808b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f7807a;
        if (j13 == 0 && this.f7808b == 0) {
            return j10;
        }
        long d10 = yp.d(j10, j13, Long.MIN_VALUE);
        long a10 = yp.a(j10, this.f7808b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = d10 <= j11 && j11 <= a10;
        if (d10 > j12 || j12 > a10) {
            z10 = false;
        }
        if (z11 && z10) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z11) {
            return j11;
        }
        return z10 ? j12 : d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fj.class != obj.getClass()) {
            return false;
        }
        fj fjVar = (fj) obj;
        if (this.f7807a == fjVar.f7807a && this.f7808b == fjVar.f7808b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7807a) * 31) + ((int) this.f7808b);
    }
}
