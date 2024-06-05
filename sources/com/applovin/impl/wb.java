package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import java.util.Collections;

public final class wb implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final String f13035a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f13036b;

    /* renamed from: c  reason: collision with root package name */
    private final xg f13037c;

    /* renamed from: d  reason: collision with root package name */
    private ro f13038d;

    /* renamed from: e  reason: collision with root package name */
    private String f13039e;

    /* renamed from: f  reason: collision with root package name */
    private d9 f13040f;

    /* renamed from: g  reason: collision with root package name */
    private int f13041g;

    /* renamed from: h  reason: collision with root package name */
    private int f13042h;

    /* renamed from: i  reason: collision with root package name */
    private int f13043i;

    /* renamed from: j  reason: collision with root package name */
    private int f13044j;

    /* renamed from: k  reason: collision with root package name */
    private long f13045k = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13046l;

    /* renamed from: m  reason: collision with root package name */
    private int f13047m;

    /* renamed from: n  reason: collision with root package name */
    private int f13048n;

    /* renamed from: o  reason: collision with root package name */
    private int f13049o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13050p;

    /* renamed from: q  reason: collision with root package name */
    private long f13051q;

    /* renamed from: r  reason: collision with root package name */
    private int f13052r;

    /* renamed from: s  reason: collision with root package name */
    private long f13053s;

    /* renamed from: t  reason: collision with root package name */
    private int f13054t;

    /* renamed from: u  reason: collision with root package name */
    private String f13055u;

    public wb(String str) {
        this.f13035a = str;
        yg ygVar = new yg(1024);
        this.f13036b = ygVar;
        this.f13037c = new xg(ygVar.c());
    }

    private void b(xg xgVar) {
        if (!xgVar.f()) {
            this.f13046l = true;
            f(xgVar);
        } else if (!this.f13046l) {
            return;
        }
        if (this.f13047m != 0) {
            throw ah.a((String) null, (Throwable) null);
        } else if (this.f13048n == 0) {
            a(xgVar, e(xgVar));
            if (this.f13050p) {
                xgVar.d((int) this.f13051q);
            }
        } else {
            throw ah.a((String) null, (Throwable) null);
        }
    }

    private int c(xg xgVar) {
        int b10 = xgVar.b();
        a.b a10 = a.a(xgVar, true);
        this.f13055u = a10.f6275c;
        this.f13052r = a10.f6273a;
        this.f13054t = a10.f6274b;
        return b10 - xgVar.b();
    }

    private void d(xg xgVar) {
        int a10 = xgVar.a(3);
        this.f13049o = a10;
        if (a10 == 0) {
            xgVar.d(8);
        } else if (a10 == 1) {
            xgVar.d(9);
        } else if (a10 == 3 || a10 == 4 || a10 == 5) {
            xgVar.d(6);
        } else if (a10 == 6 || a10 == 7) {
            xgVar.d(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int e(xg xgVar) {
        int a10;
        if (this.f13049o == 0) {
            int i10 = 0;
            do {
                a10 = xgVar.a(8);
                i10 += a10;
            } while (a10 == 255);
            return i10;
        }
        throw ah.a((String) null, (Throwable) null);
    }

    private void f(xg xgVar) {
        boolean f10;
        int a10 = xgVar.a(1);
        int a11 = a10 == 1 ? xgVar.a(1) : 0;
        this.f13047m = a11;
        if (a11 == 0) {
            if (a10 == 1) {
                a(xgVar);
            }
            if (xgVar.f()) {
                this.f13048n = xgVar.a(6);
                int a12 = xgVar.a(4);
                int a13 = xgVar.a(3);
                if (a12 == 0 && a13 == 0) {
                    if (a10 == 0) {
                        int e10 = xgVar.e();
                        int c10 = c(xgVar);
                        xgVar.c(e10);
                        byte[] bArr = new byte[((c10 + 7) / 8)];
                        xgVar.a(bArr, 0, c10);
                        d9 a14 = new d9.b().c(this.f13039e).f("audio/mp4a-latm").a(this.f13055u).c(this.f13054t).n(this.f13052r).a(Collections.singletonList(bArr)).e(this.f13035a).a();
                        if (!a14.equals(this.f13040f)) {
                            this.f13040f = a14;
                            this.f13053s = 1024000000 / ((long) a14.A);
                            this.f13038d.a(a14);
                        }
                    } else {
                        xgVar.d(((int) a(xgVar)) - c(xgVar));
                    }
                    d(xgVar);
                    boolean f11 = xgVar.f();
                    this.f13050p = f11;
                    this.f13051q = 0;
                    if (f11) {
                        if (a10 == 1) {
                            this.f13051q = a(xgVar);
                        } else {
                            do {
                                f10 = xgVar.f();
                                this.f13051q = (this.f13051q << 8) + ((long) xgVar.a(8));
                            } while (f10);
                        }
                    }
                    if (xgVar.f()) {
                        xgVar.d(8);
                        return;
                    }
                    return;
                }
                throw ah.a((String) null, (Throwable) null);
            }
            throw ah.a((String) null, (Throwable) null);
        }
        throw ah.a((String) null, (Throwable) null);
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f13038d);
        while (ygVar.a() > 0) {
            int i10 = this.f13041g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int w10 = ygVar.w();
                    if ((w10 & 224) == 224) {
                        this.f13044j = w10;
                        this.f13041g = 2;
                    } else if (w10 != 86) {
                        this.f13041g = 0;
                    }
                } else if (i10 == 2) {
                    int w11 = ((this.f13044j & -225) << 8) | ygVar.w();
                    this.f13043i = w11;
                    if (w11 > this.f13036b.c().length) {
                        a(this.f13043i);
                    }
                    this.f13042h = 0;
                    this.f13041g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(ygVar.a(), this.f13043i - this.f13042h);
                    ygVar.a(this.f13037c.f13324a, this.f13042h, min);
                    int i11 = this.f13042h + min;
                    this.f13042h = i11;
                    if (i11 == this.f13043i) {
                        this.f13037c.c(0);
                        b(this.f13037c);
                        this.f13041g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (ygVar.w() == 86) {
                this.f13041g = 1;
            }
        }
    }

    public void b() {
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f13038d = k8Var.a(dVar.c(), 1);
        this.f13039e = dVar.b();
    }

    private static long a(xg xgVar) {
        return (long) xgVar.a((xgVar.a(2) + 1) * 8);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f13045k = j10;
        }
    }

    private void a(xg xgVar, int i10) {
        int e10 = xgVar.e();
        if ((e10 & 7) == 0) {
            this.f13036b.f(e10 >> 3);
        } else {
            xgVar.a(this.f13036b.c(), 0, i10 * 8);
            this.f13036b.f(0);
        }
        this.f13038d.a(this.f13036b, i10);
        long j10 = this.f13045k;
        if (j10 != -9223372036854775807L) {
            this.f13038d.a(j10, 1, i10, 0, (ro.a) null);
            this.f13045k += this.f13053s;
        }
    }

    private void a(int i10) {
        this.f13036b.d(i10);
        this.f13037c.a(this.f13036b.c());
    }

    public void a() {
        this.f13041g = 0;
        this.f13045k = -9223372036854775807L;
        this.f13046l = false;
    }
}
