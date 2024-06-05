package com.applovin.impl;

import java.util.List;

public abstract class pl extends wg implements kl {

    /* renamed from: d  reason: collision with root package name */
    private kl f10684d;

    /* renamed from: f  reason: collision with root package name */
    private long f10685f;

    public long a(int i10) {
        return ((kl) a1.a((Object) this.f10684d)).a(i10) + this.f10685f;
    }

    public void b() {
        super.b();
        this.f10684d = null;
    }

    public int a() {
        return ((kl) a1.a((Object) this.f10684d)).a();
    }

    public int a(long j10) {
        return ((kl) a1.a((Object) this.f10684d)).a(j10 - this.f10685f);
    }

    public List b(long j10) {
        return ((kl) a1.a((Object) this.f10684d)).b(j10 - this.f10685f);
    }

    public void a(long j10, kl klVar, long j11) {
        this.f13062b = j10;
        this.f10684d = klVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f10685f = j10;
    }
}
