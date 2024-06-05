package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.k;
import com.applovin.impl.ro;

public final class j implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final xg f8609a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f8610b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8611c;

    /* renamed from: d  reason: collision with root package name */
    private String f8612d;

    /* renamed from: e  reason: collision with root package name */
    private ro f8613e;

    /* renamed from: f  reason: collision with root package name */
    private int f8614f;

    /* renamed from: g  reason: collision with root package name */
    private int f8615g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8616h;

    /* renamed from: i  reason: collision with root package name */
    private long f8617i;

    /* renamed from: j  reason: collision with root package name */
    private d9 f8618j;

    /* renamed from: k  reason: collision with root package name */
    private int f8619k;

    /* renamed from: l  reason: collision with root package name */
    private long f8620l;

    public j() {
        this((String) null);
    }

    private boolean b(yg ygVar) {
        while (true) {
            boolean z10 = false;
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.f8616h) {
                if (ygVar.w() == 11) {
                    z10 = true;
                }
                this.f8616h = z10;
            } else {
                int w10 = ygVar.w();
                if (w10 == 119) {
                    this.f8616h = false;
                    return true;
                }
                if (w10 == 11) {
                    z10 = true;
                }
                this.f8616h = z10;
            }
        }
    }

    private void c() {
        this.f8609a.c(0);
        k.b a10 = k.a(this.f8609a);
        d9 d9Var = this.f8618j;
        if (d9Var == null || a10.f8825d != d9Var.f7166z || a10.f8824c != d9Var.A || !yp.a((Object) a10.f8822a, (Object) d9Var.f7153m)) {
            d9 a11 = new d9.b().c(this.f8612d).f(a10.f8822a).c(a10.f8825d).n(a10.f8824c).e(this.f8611c).a();
            this.f8618j = a11;
            this.f8613e.a(a11);
        }
        this.f8619k = a10.f8826e;
        this.f8617i = (((long) a10.f8827f) * 1000000) / ((long) this.f8618j.A);
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f8613e);
        while (ygVar.a() > 0) {
            int i10 = this.f8614f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f8619k - this.f8615g);
                        this.f8613e.a(ygVar, min);
                        int i11 = this.f8615g + min;
                        this.f8615g = i11;
                        int i12 = this.f8619k;
                        if (i11 == i12) {
                            long j10 = this.f8620l;
                            if (j10 != -9223372036854775807L) {
                                this.f8613e.a(j10, 1, i12, 0, (ro.a) null);
                                this.f8620l += this.f8617i;
                            }
                            this.f8614f = 0;
                        }
                    }
                } else if (a(ygVar, this.f8610b.c(), 128)) {
                    c();
                    this.f8610b.f(0);
                    this.f8613e.a(this.f8610b, 128);
                    this.f8614f = 2;
                }
            } else if (b(ygVar)) {
                this.f8614f = 1;
                this.f8610b.c()[0] = Ascii.VT;
                this.f8610b.c()[1] = 119;
                this.f8615g = 2;
            }
        }
    }

    public void b() {
    }

    public j(String str) {
        xg xgVar = new xg(new byte[128]);
        this.f8609a = xgVar;
        this.f8610b = new yg(xgVar.f13324a);
        this.f8614f = 0;
        this.f8620l = -9223372036854775807L;
        this.f8611c = str;
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f8615g);
        ygVar.a(bArr, this.f8615g, min);
        int i11 = this.f8615g + min;
        this.f8615g = i11;
        return i11 == i10;
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f8612d = dVar.b();
        this.f8613e = k8Var.a(dVar.c(), 1);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f8620l = j10;
        }
    }

    public void a() {
        this.f8614f = 0;
        this.f8615g = 0;
        this.f8616h = false;
        this.f8620l = -9223372036854775807L;
    }
}
