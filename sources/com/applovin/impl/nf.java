package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.of;
import com.applovin.impl.ro;

public final class nf implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final yg f9966a;

    /* renamed from: b  reason: collision with root package name */
    private final of.a f9967b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9968c;

    /* renamed from: d  reason: collision with root package name */
    private ro f9969d;

    /* renamed from: e  reason: collision with root package name */
    private String f9970e;

    /* renamed from: f  reason: collision with root package name */
    private int f9971f;

    /* renamed from: g  reason: collision with root package name */
    private int f9972g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9973h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9974i;

    /* renamed from: j  reason: collision with root package name */
    private long f9975j;

    /* renamed from: k  reason: collision with root package name */
    private int f9976k;

    /* renamed from: l  reason: collision with root package name */
    private long f9977l;

    public nf() {
        this((String) null);
    }

    private void b(yg ygVar) {
        byte[] c10 = ygVar.c();
        int e10 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e10; d10++) {
            byte b10 = c10[d10];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f9974i && (b10 & 224) == 224;
            this.f9974i = z10;
            if (z11) {
                ygVar.f(d10 + 1);
                this.f9974i = false;
                this.f9966a.c()[1] = c10[d10];
                this.f9972g = 2;
                this.f9971f = 1;
                return;
            }
        }
        ygVar.f(e10);
    }

    private void c(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f9976k - this.f9972g);
        this.f9969d.a(ygVar, min);
        int i10 = this.f9972g + min;
        this.f9972g = i10;
        int i11 = this.f9976k;
        if (i10 >= i11) {
            long j10 = this.f9977l;
            if (j10 != -9223372036854775807L) {
                this.f9969d.a(j10, 1, i11, 0, (ro.a) null);
                this.f9977l += this.f9975j;
            }
            this.f9972g = 0;
            this.f9971f = 0;
        }
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), 4 - this.f9972g);
        ygVar.a(this.f9966a.c(), this.f9972g, min);
        int i10 = this.f9972g + min;
        this.f9972g = i10;
        if (i10 >= 4) {
            this.f9966a.f(0);
            if (!this.f9967b.a(this.f9966a.j())) {
                this.f9972g = 0;
                this.f9971f = 1;
                return;
            }
            of.a aVar = this.f9967b;
            this.f9976k = aVar.f10230c;
            if (!this.f9973h) {
                this.f9975j = (((long) aVar.f10234g) * 1000000) / ((long) aVar.f10231d);
                this.f9969d.a(new d9.b().c(this.f9970e).f(this.f9967b.f10229b).i(4096).c(this.f9967b.f10232e).n(this.f9967b.f10231d).e(this.f9968c).a());
                this.f9973h = true;
            }
            this.f9966a.f(0);
            this.f9969d.a(this.f9966a, 4);
            this.f9971f = 2;
        }
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f9969d);
        while (ygVar.a() > 0) {
            int i10 = this.f9971f;
            if (i10 == 0) {
                b(ygVar);
            } else if (i10 == 1) {
                d(ygVar);
            } else if (i10 == 2) {
                c(ygVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void b() {
    }

    public nf(String str) {
        this.f9971f = 0;
        yg ygVar = new yg(4);
        this.f9966a = ygVar;
        ygVar.c()[0] = -1;
        this.f9967b = new of.a();
        this.f9977l = -9223372036854775807L;
        this.f9968c = str;
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f9970e = dVar.b();
        this.f9969d = k8Var.a(dVar.c(), 1);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9977l = j10;
        }
    }

    public void a() {
        this.f9971f = 0;
        this.f9972g = 0;
        this.f9974i = false;
        this.f9977l = -9223372036854775807L;
    }
}
