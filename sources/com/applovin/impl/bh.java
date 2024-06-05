package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;

public final class bh implements cj {

    /* renamed from: a  reason: collision with root package name */
    private d9 f6711a;

    /* renamed from: b  reason: collision with root package name */
    private io f6712b;

    /* renamed from: c  reason: collision with root package name */
    private ro f6713c;

    public bh(String str) {
        this.f6711a = new d9.b().f(str).a();
    }

    private void a() {
        a1.b((Object) this.f6712b);
        yp.a((Object) this.f6713c);
    }

    public void a(yg ygVar) {
        a();
        long b10 = this.f6712b.b();
        long c10 = this.f6712b.c();
        if (b10 != -9223372036854775807L && c10 != -9223372036854775807L) {
            d9 d9Var = this.f6711a;
            if (c10 != d9Var.f7157q) {
                d9 a10 = d9Var.a().a(c10).a();
                this.f6711a = a10;
                this.f6713c.a(a10);
            }
            int a11 = ygVar.a();
            this.f6713c.a(ygVar, a11);
            this.f6713c.a(b10, 1, a11, 0, (ro.a) null);
        }
    }

    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f6712b = ioVar;
        dVar.a();
        ro a10 = k8Var.a(dVar.c(), 5);
        this.f6713c = a10;
        a10.a(this.f6711a);
    }
}
