package com.applovin.impl;

import com.applovin.impl.ej;

final class pr implements ej {

    /* renamed from: a  reason: collision with root package name */
    private final nr f10716a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10717b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10718c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10719d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10720e;

    public pr(nr nrVar, int i10, long j10, long j11) {
        this.f10716a = nrVar;
        this.f10717b = i10;
        this.f10718c = j10;
        long j12 = (j11 - j10) / ((long) nrVar.f10020e);
        this.f10719d = j12;
        this.f10720e = c(j12);
    }

    private long c(long j10) {
        return yp.c(j10 * ((long) this.f10717b), 1000000, (long) this.f10716a.f10018c);
    }

    public ej.a b(long j10) {
        long b10 = yp.b((((long) this.f10716a.f10018c) * j10) / (((long) this.f10717b) * 1000000), 0, this.f10719d - 1);
        long j11 = this.f10718c + (((long) this.f10716a.f10020e) * b10);
        long c10 = c(b10);
        gj gjVar = new gj(c10, j11);
        if (c10 >= j10 || b10 == this.f10719d - 1) {
            return new ej.a(gjVar);
        }
        long j12 = b10 + 1;
        return new ej.a(gjVar, new gj(c(j12), this.f10718c + (((long) this.f10716a.f10020e) * j12)));
    }

    public boolean b() {
        return true;
    }

    public long d() {
        return this.f10720e;
    }
}
