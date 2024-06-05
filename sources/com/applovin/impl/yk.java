package com.applovin.impl;

public final class yk implements bd {

    /* renamed from: a  reason: collision with root package name */
    private final j3 f13642a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13643b;

    /* renamed from: c  reason: collision with root package name */
    private long f13644c;

    /* renamed from: d  reason: collision with root package name */
    private long f13645d;

    /* renamed from: f  reason: collision with root package name */
    private mh f13646f = mh.f9802d;

    public yk(j3 j3Var) {
        this.f13642a = j3Var;
    }

    public mh a() {
        return this.f13646f;
    }

    public void b() {
        if (!this.f13643b) {
            this.f13645d = this.f13642a.c();
            this.f13643b = true;
        }
    }

    public void c() {
        if (this.f13643b) {
            a(p());
            this.f13643b = false;
        }
    }

    public long p() {
        long j10;
        long j11 = this.f13644c;
        if (!this.f13643b) {
            return j11;
        }
        long c10 = this.f13642a.c() - this.f13645d;
        mh mhVar = this.f13646f;
        if (mhVar.f9804a == 1.0f) {
            j10 = r2.a(c10);
        } else {
            j10 = mhVar.a(c10);
        }
        return j11 + j10;
    }

    public void a(long j10) {
        this.f13644c = j10;
        if (this.f13643b) {
            this.f13645d = this.f13642a.c();
        }
    }

    public void a(mh mhVar) {
        if (this.f13643b) {
            a(p());
        }
        this.f13646f = mhVar;
    }
}
