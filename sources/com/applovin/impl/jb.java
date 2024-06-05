package com.applovin.impl;

import com.applovin.impl.ej;

final class jb implements hj {

    /* renamed from: a  reason: collision with root package name */
    private final long f8716a;

    /* renamed from: b  reason: collision with root package name */
    private final mc f8717b;

    /* renamed from: c  reason: collision with root package name */
    private final mc f8718c;

    /* renamed from: d  reason: collision with root package name */
    private long f8719d;

    public jb(long j10, long j11, long j12) {
        this.f8719d = j10;
        this.f8716a = j12;
        mc mcVar = new mc();
        this.f8717b = mcVar;
        mc mcVar2 = new mc();
        this.f8718c = mcVar2;
        mcVar.a(0);
        mcVar2.a(j11);
    }

    public long a(long j10) {
        return this.f8717b.a(yp.a(this.f8718c, j10, true, true));
    }

    public ej.a b(long j10) {
        int a10 = yp.a(this.f8717b, j10, true, true);
        gj gjVar = new gj(this.f8717b.a(a10), this.f8718c.a(a10));
        if (gjVar.f8034a == j10 || a10 == this.f8717b.a() - 1) {
            return new ej.a(gjVar);
        }
        int i10 = a10 + 1;
        return new ej.a(gjVar, new gj(this.f8717b.a(i10), this.f8718c.a(i10)));
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f8716a;
    }

    public long d() {
        return this.f8719d;
    }

    public boolean c(long j10) {
        mc mcVar = this.f8717b;
        return j10 - mcVar.a(mcVar.a() - 1) < 100000;
    }

    /* access modifiers changed from: package-private */
    public void d(long j10) {
        this.f8719d = j10;
    }

    public void a(long j10, long j11) {
        if (!c(j10)) {
            this.f8717b.a(j10);
            this.f8718c.a(j11);
        }
    }
}
