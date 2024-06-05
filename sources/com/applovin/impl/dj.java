package com.applovin.impl;

import com.applovin.impl.ep;

public final class dj implements ep {

    /* renamed from: a  reason: collision with root package name */
    private final cj f7250a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f7251b = new yg(32);

    /* renamed from: c  reason: collision with root package name */
    private int f7252c;

    /* renamed from: d  reason: collision with root package name */
    private int f7253d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7254e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7255f;

    public dj(cj cjVar) {
        this.f7250a = cjVar;
    }

    public void a(yg ygVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int d10 = z10 ? ygVar.d() + ygVar.w() : -1;
        if (this.f7255f) {
            if (z10) {
                this.f7255f = false;
                ygVar.f(d10);
                this.f7253d = 0;
            } else {
                return;
            }
        }
        while (ygVar.a() > 0) {
            int i11 = this.f7253d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int w10 = ygVar.w();
                    ygVar.f(ygVar.d() - 1);
                    if (w10 == 255) {
                        this.f7255f = true;
                        return;
                    }
                }
                int min = Math.min(ygVar.a(), 3 - this.f7253d);
                ygVar.a(this.f7251b.c(), this.f7253d, min);
                int i12 = this.f7253d + min;
                this.f7253d = i12;
                if (i12 == 3) {
                    this.f7251b.f(0);
                    this.f7251b.e(3);
                    this.f7251b.g(1);
                    int w11 = this.f7251b.w();
                    int w12 = this.f7251b.w();
                    this.f7254e = (w11 & 128) != 0;
                    this.f7252c = (((w11 & 15) << 8) | w12) + 3;
                    int b10 = this.f7251b.b();
                    int i13 = this.f7252c;
                    if (b10 < i13) {
                        this.f7251b.a(Math.min(4098, Math.max(i13, this.f7251b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ygVar.a(), this.f7252c - this.f7253d);
                ygVar.a(this.f7251b.c(), this.f7253d, min2);
                int i14 = this.f7253d + min2;
                this.f7253d = i14;
                int i15 = this.f7252c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f7254e) {
                        this.f7251b.e(i15);
                    } else if (yp.a(this.f7251b.c(), 0, this.f7252c, -1) != 0) {
                        this.f7255f = true;
                        return;
                    } else {
                        this.f7251b.e(this.f7252c - 4);
                    }
                    this.f7251b.f(0);
                    this.f7250a.a(this.f7251b);
                    this.f7253d = 0;
                }
            }
        }
    }

    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f7250a.a(ioVar, k8Var, dVar);
        this.f7255f = true;
    }

    public void a() {
        this.f7255f = true;
    }
}
