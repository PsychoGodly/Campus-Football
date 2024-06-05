package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ro;
import com.applovin.impl.u8;
import com.applovin.impl.v8;

public final class t8 implements i8 {

    /* renamed from: o  reason: collision with root package name */
    public static final m8 f12272o = d50.f7121b;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12273a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f12274b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12275c;

    /* renamed from: d  reason: collision with root package name */
    private final u8.a f12276d;

    /* renamed from: e  reason: collision with root package name */
    private k8 f12277e;

    /* renamed from: f  reason: collision with root package name */
    private ro f12278f;

    /* renamed from: g  reason: collision with root package name */
    private int f12279g;

    /* renamed from: h  reason: collision with root package name */
    private we f12280h;

    /* renamed from: i  reason: collision with root package name */
    private y8 f12281i;

    /* renamed from: j  reason: collision with root package name */
    private int f12282j;

    /* renamed from: k  reason: collision with root package name */
    private int f12283k;

    /* renamed from: l  reason: collision with root package name */
    private s8 f12284l;

    /* renamed from: m  reason: collision with root package name */
    private int f12285m;

    /* renamed from: n  reason: collision with root package name */
    private long f12286n;

    public t8() {
        this(0);
    }

    private long a(yg ygVar, boolean z10) {
        boolean z11;
        a1.a((Object) this.f12281i);
        int d10 = ygVar.d();
        while (d10 <= ygVar.e() - 16) {
            ygVar.f(d10);
            if (u8.a(ygVar, this.f12281i, this.f12283k, this.f12276d)) {
                ygVar.f(d10);
                return this.f12276d.f12543a;
            }
            d10++;
        }
        if (z10) {
            while (d10 <= ygVar.e() - this.f12282j) {
                ygVar.f(d10);
                try {
                    z11 = u8.a(ygVar, this.f12281i, this.f12283k, this.f12276d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (ygVar.d() <= ygVar.e() && z11) {
                    ygVar.f(d10);
                    return this.f12276d.f12543a;
                }
                d10++;
            }
            ygVar.f(ygVar.e());
            return -1;
        }
        ygVar.f(d10);
        return -1;
    }

    private void b(j8 j8Var) {
        this.f12283k = v8.b(j8Var);
        ((k8) yp.a((Object) this.f12277e)).a(b(j8Var.f(), j8Var.a()));
        this.f12279g = 5;
    }

    private void c(j8 j8Var) {
        byte[] bArr = this.f12273a;
        j8Var.c(bArr, 0, bArr.length);
        j8Var.b();
        this.f12279g = 2;
    }

    private void d(j8 j8Var) {
        this.f12280h = v8.b(j8Var, !this.f12275c);
        this.f12279g = 1;
    }

    private void e(j8 j8Var) {
        v8.a aVar = new v8.a(this.f12281i);
        boolean z10 = false;
        while (!z10) {
            z10 = v8.a(j8Var, aVar);
            this.f12281i = (y8) yp.a((Object) aVar.f12717a);
        }
        a1.a((Object) this.f12281i);
        this.f12282j = Math.max(this.f12281i.f13541c, 6);
        ((ro) yp.a((Object) this.f12278f)).a(this.f12281i.a(this.f12273a, this.f12280h));
        this.f12279g = 4;
    }

    private void f(j8 j8Var) {
        v8.d(j8Var);
        this.f12279g = 3;
    }

    public void a() {
    }

    public t8(int i10) {
        this.f12273a = new byte[42];
        this.f12274b = new yg(new byte[32768], 0);
        this.f12275c = (i10 & 1) == 0 ? false : true;
        this.f12276d = new u8.a();
        this.f12279g = 0;
    }

    private void c() {
        ((ro) yp.a((Object) this.f12278f)).a((this.f12286n * 1000000) / ((long) ((y8) yp.a((Object) this.f12281i)).f13543e), 1, this.f12285m, 0, (ro.a) null);
    }

    private ej b(long j10, long j11) {
        a1.a((Object) this.f12281i);
        y8 y8Var = this.f12281i;
        if (y8Var.f13549k != null) {
            return new x8(y8Var, j10);
        }
        if (j11 == -1 || y8Var.f13548j <= 0) {
            return new ej.b(y8Var.b());
        }
        s8 s8Var = new s8(y8Var, this.f12283k, j10, j11);
        this.f12284l = s8Var;
        return s8Var.a();
    }

    private int b(j8 j8Var, qh qhVar) {
        boolean z10;
        a1.a((Object) this.f12278f);
        a1.a((Object) this.f12281i);
        s8 s8Var = this.f12284l;
        if (s8Var != null && s8Var.b()) {
            return this.f12284l.a(j8Var, qhVar);
        }
        if (this.f12286n == -1) {
            this.f12286n = u8.a(j8Var, this.f12281i);
            return 0;
        }
        int e10 = this.f12274b.e();
        if (e10 < 32768) {
            int a10 = j8Var.a(this.f12274b.c(), e10, 32768 - e10);
            z10 = a10 == -1;
            if (!z10) {
                this.f12274b.e(e10 + a10);
            } else if (this.f12274b.a() == 0) {
                c();
                return -1;
            }
        } else {
            z10 = false;
        }
        int d10 = this.f12274b.d();
        int i10 = this.f12285m;
        int i11 = this.f12282j;
        if (i10 < i11) {
            yg ygVar = this.f12274b;
            ygVar.g(Math.min(i11 - i10, ygVar.a()));
        }
        long a11 = a(this.f12274b, z10);
        int d11 = this.f12274b.d() - d10;
        this.f12274b.f(d10);
        this.f12278f.a(this.f12274b, d11);
        this.f12285m += d11;
        if (a11 != -1) {
            c();
            this.f12285m = 0;
            this.f12286n = a11;
        }
        if (this.f12274b.a() < 16) {
            int a12 = this.f12274b.a();
            System.arraycopy(this.f12274b.c(), this.f12274b.d(), this.f12274b.c(), 0, a12);
            this.f12274b.f(0);
            this.f12274b.e(a12);
        }
        return 0;
    }

    public void a(k8 k8Var) {
        this.f12277e = k8Var;
        this.f12278f = k8Var.a(0, 1);
        k8Var.c();
    }

    public int a(j8 j8Var, qh qhVar) {
        int i10 = this.f12279g;
        if (i10 == 0) {
            d(j8Var);
            return 0;
        } else if (i10 == 1) {
            c(j8Var);
            return 0;
        } else if (i10 == 2) {
            f(j8Var);
            return 0;
        } else if (i10 == 3) {
            e(j8Var);
            return 0;
        } else if (i10 == 4) {
            b(j8Var);
            return 0;
        } else if (i10 == 5) {
            return b(j8Var, qhVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void a(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f12279g = 0;
        } else {
            s8 s8Var = this.f12284l;
            if (s8Var != null) {
                s8Var.b(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f12286n = j12;
        this.f12285m = 0;
        this.f12274b.d(0);
    }

    public boolean a(j8 j8Var) {
        v8.a(j8Var, false);
        return v8.a(j8Var);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new t8()};
    }
}
