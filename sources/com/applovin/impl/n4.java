package com.applovin.impl;

import com.applovin.impl.ej;

public class n4 implements ej {

    /* renamed from: a  reason: collision with root package name */
    private final long f9895a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9896b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9897c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9898d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9899e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9900f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9901g;

    public n4(long j10, long j11, int i10, int i11, boolean z10) {
        this.f9895a = j10;
        this.f9896b = j11;
        this.f9897c = i11 == -1 ? 1 : i11;
        this.f9899e = i10;
        this.f9901g = z10;
        if (j10 == -1) {
            this.f9898d = -1;
            this.f9900f = -9223372036854775807L;
            return;
        }
        this.f9898d = j10 - j11;
        this.f9900f = a(j10, j11, i10);
    }

    private static long a(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    private long c(long j10) {
        long j11 = (long) this.f9897c;
        long j12 = (((j10 * ((long) this.f9899e)) / 8000000) / j11) * j11;
        long j13 = this.f9898d;
        if (j13 != -1) {
            j12 = Math.min(j12, j13 - j11);
        }
        return this.f9896b + Math.max(j12, 0);
    }

    public ej.a b(long j10) {
        if (this.f9898d == -1 && !this.f9901g) {
            return new ej.a(new gj(0, this.f9896b));
        }
        long c10 = c(j10);
        long d10 = d(c10);
        gj gjVar = new gj(d10, c10);
        if (this.f9898d != -1 && d10 < j10) {
            long j11 = c10 + ((long) this.f9897c);
            if (j11 < this.f9895a) {
                return new ej.a(gjVar, new gj(d(j11), j11));
            }
        }
        return new ej.a(gjVar);
    }

    public long d() {
        return this.f9900f;
    }

    public long d(long j10) {
        return a(j10, this.f9896b, this.f9899e);
    }

    public boolean b() {
        return this.f9898d != -1 || this.f9901g;
    }
}
