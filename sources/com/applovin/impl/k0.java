package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import java.util.Arrays;
import java.util.Collections;

public final class k0 implements o7 {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f8828v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8829a;

    /* renamed from: b  reason: collision with root package name */
    private final xg f8830b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f8831c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8832d;

    /* renamed from: e  reason: collision with root package name */
    private String f8833e;

    /* renamed from: f  reason: collision with root package name */
    private ro f8834f;

    /* renamed from: g  reason: collision with root package name */
    private ro f8835g;

    /* renamed from: h  reason: collision with root package name */
    private int f8836h;

    /* renamed from: i  reason: collision with root package name */
    private int f8837i;

    /* renamed from: j  reason: collision with root package name */
    private int f8838j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8839k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8840l;

    /* renamed from: m  reason: collision with root package name */
    private int f8841m;

    /* renamed from: n  reason: collision with root package name */
    private int f8842n;

    /* renamed from: o  reason: collision with root package name */
    private int f8843o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8844p;

    /* renamed from: q  reason: collision with root package name */
    private long f8845q;

    /* renamed from: r  reason: collision with root package name */
    private int f8846r;

    /* renamed from: s  reason: collision with root package name */
    private long f8847s;

    /* renamed from: t  reason: collision with root package name */
    private ro f8848t;

    /* renamed from: u  reason: collision with root package name */
    private long f8849u;

    public k0(boolean z10) {
        this(z10, (String) null);
    }

    public static boolean a(int i10) {
        return (i10 & 65526) == 65520;
    }

    private boolean a(yg ygVar, int i10) {
        ygVar.f(i10 + 1);
        if (!b(ygVar, this.f8830b.f13324a, 1)) {
            return false;
        }
        this.f8830b.c(4);
        int a10 = this.f8830b.a(1);
        int i11 = this.f8841m;
        if (i11 != -1 && a10 != i11) {
            return false;
        }
        if (this.f8842n != -1) {
            if (!b(ygVar, this.f8830b.f13324a, 1)) {
                return true;
            }
            this.f8830b.c(2);
            if (this.f8830b.a(4) != this.f8842n) {
                return false;
            }
            ygVar.f(i10 + 2);
        }
        if (!b(ygVar, this.f8830b.f13324a, 4)) {
            return true;
        }
        this.f8830b.c(14);
        int a11 = this.f8830b.a(13);
        if (a11 < 7) {
            return false;
        }
        byte[] c10 = ygVar.c();
        int e10 = ygVar.e();
        int i12 = i10 + a11;
        if (i12 >= e10) {
            return true;
        }
        byte b10 = c10[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == e10) {
                return true;
            }
            if (!a((byte) -1, c10[i13]) || ((c10[i13] & 8) >> 3) != a10) {
                return false;
            }
            return true;
        } else if (b10 != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == e10) {
                return true;
            }
            if (c10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            if (i15 == e10 || c10[i15] == 51) {
                return true;
            }
            return false;
        }
    }

    private void b(yg ygVar) {
        if (ygVar.a() != 0) {
            this.f8830b.f13324a[0] = ygVar.c()[ygVar.d()];
            this.f8830b.c(2);
            int a10 = this.f8830b.a(4);
            int i10 = this.f8842n;
            if (i10 == -1 || a10 == i10) {
                if (!this.f8840l) {
                    this.f8840l = true;
                    this.f8841m = this.f8843o;
                    this.f8842n = a10;
                }
                j();
                return;
            }
            g();
        }
    }

    private void c() {
        a1.a((Object) this.f8834f);
        yp.a((Object) this.f8848t);
        yp.a((Object) this.f8835g);
    }

    private void e() {
        this.f8830b.c(0);
        if (!this.f8844p) {
            int i10 = 2;
            int a10 = this.f8830b.a(2) + 1;
            if (a10 != 2) {
                kc.d("AdtsReader", "Detected audio object type: " + a10 + ", but assuming AAC LC.");
            } else {
                i10 = a10;
            }
            this.f8830b.d(5);
            byte[] a11 = a.a(i10, this.f8842n, this.f8830b.a(3));
            a.b a12 = a.a(a11);
            d9 a13 = new d9.b().c(this.f8833e).f("audio/mp4a-latm").a(a12.f6275c).c(a12.f6274b).n(a12.f6273a).a(Collections.singletonList(a11)).e(this.f8832d).a();
            this.f8845q = 1024000000 / ((long) a13.A);
            this.f8834f.a(a13);
            this.f8844p = true;
        } else {
            this.f8830b.d(10);
        }
        this.f8830b.d(4);
        int a14 = this.f8830b.a(13);
        int i11 = a14 - 7;
        if (this.f8839k) {
            i11 = a14 - 9;
        }
        a(this.f8834f, this.f8845q, 0, i11);
    }

    private void f() {
        this.f8835g.a(this.f8831c, 10);
        this.f8831c.f(6);
        a(this.f8835g, 0, 10, this.f8831c.v() + 10);
    }

    private void g() {
        this.f8840l = false;
        i();
    }

    private void h() {
        this.f8836h = 1;
        this.f8837i = 0;
    }

    private void i() {
        this.f8836h = 0;
        this.f8837i = 0;
        this.f8838j = 256;
    }

    private void j() {
        this.f8836h = 3;
        this.f8837i = 0;
    }

    private void k() {
        this.f8836h = 2;
        this.f8837i = f8828v.length;
        this.f8846r = 0;
        this.f8831c.f(0);
    }

    public void b() {
    }

    public long d() {
        return this.f8845q;
    }

    public k0(boolean z10, String str) {
        this.f8830b = new xg(new byte[7]);
        this.f8831c = new yg(Arrays.copyOf(f8828v, 10));
        i();
        this.f8841m = -1;
        this.f8842n = -1;
        this.f8845q = -9223372036854775807L;
        this.f8847s = -9223372036854775807L;
        this.f8829a = z10;
        this.f8832d = str;
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f8846r - this.f8837i);
        this.f8848t.a(ygVar, min);
        int i10 = this.f8837i + min;
        this.f8837i = i10;
        int i11 = this.f8846r;
        if (i10 == i11) {
            long j10 = this.f8847s;
            if (j10 != -9223372036854775807L) {
                this.f8848t.a(j10, 1, i11, 0, (ro.a) null);
                this.f8847s += this.f8849u;
            }
            i();
        }
    }

    private void c(yg ygVar) {
        byte[] c10 = ygVar.c();
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        while (d10 < e10) {
            int i10 = d10 + 1;
            byte b10 = c10[d10];
            byte b11 = b10 & 255;
            if (this.f8838j != 512 || !a((byte) -1, (byte) b11) || (!this.f8840l && !a(ygVar, d10 - 1))) {
                int i11 = this.f8838j;
                byte b12 = b11 | i11;
                if (b12 == 329) {
                    this.f8838j = 768;
                } else if (b12 == 511) {
                    this.f8838j = 512;
                } else if (b12 == 836) {
                    this.f8838j = 1024;
                } else if (b12 == 1075) {
                    k();
                    ygVar.f(i10);
                    return;
                } else if (i11 != 256) {
                    this.f8838j = 256;
                }
                d10 = i10;
            } else {
                this.f8843o = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f8839k = z10;
                if (!this.f8840l) {
                    h();
                } else {
                    j();
                }
                ygVar.f(i10);
                return;
            }
        }
        ygVar.f(d10);
    }

    private boolean b(yg ygVar, byte[] bArr, int i10) {
        if (ygVar.a() < i10) {
            return false;
        }
        ygVar.a(bArr, 0, i10);
        return true;
    }

    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int i10 = this.f8836h;
            if (i10 == 0) {
                c(ygVar);
            } else if (i10 == 1) {
                b(ygVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (a(ygVar, this.f8830b.f13324a, this.f8839k ? 7 : 5)) {
                        e();
                    }
                } else if (i10 == 4) {
                    d(ygVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(ygVar, this.f8831c.c(), 10)) {
                f();
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f8837i);
        ygVar.a(bArr, this.f8837i, min);
        int i11 = this.f8837i + min;
        this.f8837i = i11;
        return i11 == i10;
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f8833e = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 1);
        this.f8834f = a10;
        this.f8848t = a10;
        if (this.f8829a) {
            dVar.a();
            ro a11 = k8Var.a(dVar.c(), 5);
            this.f8835g = a11;
            a11.a(new d9.b().c(dVar.b()).f("application/id3").a());
            return;
        }
        this.f8835g = new g7();
    }

    private boolean a(byte b10, byte b11) {
        return a((int) ((b10 & 255) << 8) | (b11 & 255));
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f8847s = j10;
        }
    }

    public void a() {
        this.f8847s = -9223372036854775807L;
        g();
    }

    private void a(ro roVar, long j10, int i10, int i11) {
        this.f8836h = 4;
        this.f8837i = i10;
        this.f8848t = roVar;
        this.f8849u = j10;
        this.f8846r = i11;
    }
}
