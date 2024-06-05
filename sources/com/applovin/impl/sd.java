package com.applovin.impl;

import com.applovin.impl.wd;

final class sd {

    /* renamed from: a  reason: collision with root package name */
    public final rd f11360a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11361b;

    /* renamed from: c  reason: collision with root package name */
    public final yi[] f11362c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11363d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11364e;

    /* renamed from: f  reason: collision with root package name */
    public ud f11365f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11366g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f11367h;

    /* renamed from: i  reason: collision with root package name */
    private final mi[] f11368i;

    /* renamed from: j  reason: collision with root package name */
    private final wo f11369j;

    /* renamed from: k  reason: collision with root package name */
    private final ae f11370k;

    /* renamed from: l  reason: collision with root package name */
    private sd f11371l;

    /* renamed from: m  reason: collision with root package name */
    private qo f11372m = qo.f11064d;

    /* renamed from: n  reason: collision with root package name */
    private xo f11373n;

    /* renamed from: o  reason: collision with root package name */
    private long f11374o;

    public sd(mi[] miVarArr, long j10, wo woVar, n0 n0Var, ae aeVar, ud udVar, xo xoVar) {
        this.f11368i = miVarArr;
        this.f11374o = j10;
        this.f11369j = woVar;
        this.f11370k = aeVar;
        wd.a aVar = udVar.f12551a;
        this.f11361b = aVar.f12394a;
        this.f11365f = udVar;
        this.f11373n = xoVar;
        this.f11362c = new yi[miVarArr.length];
        this.f11367h = new boolean[miVarArr.length];
        this.f11360a = a(aVar, aeVar, n0Var, udVar.f12552b, udVar.f12554d);
    }

    private void b(yi[] yiVarArr) {
        int i10 = 0;
        while (true) {
            mi[] miVarArr = this.f11368i;
            if (i10 < miVarArr.length) {
                if (miVarArr[i10].e() == -2) {
                    yiVarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private boolean k() {
        return this.f11371l == null;
    }

    public long a(xo xoVar, long j10, boolean z10) {
        return a(xoVar, j10, z10, new boolean[this.f11368i.length]);
    }

    public long c() {
        if (!this.f11363d) {
            return this.f11365f.f12552b;
        }
        long e10 = this.f11364e ? this.f11360a.e() : Long.MIN_VALUE;
        return e10 == Long.MIN_VALUE ? this.f11365f.f12555e : e10;
    }

    public sd d() {
        return this.f11371l;
    }

    public long e() {
        if (!this.f11363d) {
            return 0;
        }
        return this.f11360a.g();
    }

    public long f() {
        return this.f11374o;
    }

    public long g() {
        return this.f11365f.f12552b + this.f11374o;
    }

    public qo h() {
        return this.f11372m;
    }

    public xo i() {
        return this.f11373n;
    }

    public boolean j() {
        return this.f11363d && (!this.f11364e || this.f11360a.e() == Long.MIN_VALUE);
    }

    public void l() {
        a();
        a(this.f11370k, this.f11360a);
    }

    public void m() {
        rd rdVar = this.f11360a;
        if (rdVar instanceof i3) {
            long j10 = this.f11365f.f12554d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((i3) rdVar).a(0, j10);
        }
    }

    public long a(xo xoVar, long j10, boolean z10, boolean[] zArr) {
        xo xoVar2 = xoVar;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xoVar2.f13432a) {
                break;
            }
            boolean[] zArr2 = this.f11367h;
            if (z10 || !xoVar.a(this.f11373n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        b(this.f11362c);
        a();
        this.f11373n = xoVar2;
        b();
        long a10 = this.f11360a.a(xoVar2.f13434c, this.f11367h, this.f11362c, zArr, j10);
        a(this.f11362c);
        this.f11364e = false;
        int i11 = 0;
        while (true) {
            yi[] yiVarArr = this.f11362c;
            if (i11 >= yiVarArr.length) {
                return a10;
            }
            if (yiVarArr[i11] != null) {
                a1.b(xoVar.a(i11));
                if (this.f11368i[i11].e() != -2) {
                    this.f11364e = true;
                }
            } else {
                a1.b(xoVar2.f13434c[i11] == null);
            }
            i11++;
        }
    }

    public long d(long j10) {
        return j10 - f();
    }

    public long e(long j10) {
        return j10 + f();
    }

    private void b() {
        if (k()) {
            int i10 = 0;
            while (true) {
                xo xoVar = this.f11373n;
                if (i10 < xoVar.f13432a) {
                    boolean a10 = xoVar.a(i10);
                    f8 f8Var = this.f11373n.f13434c[i10];
                    if (a10 && f8Var != null) {
                        f8Var.i();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void c(long j10) {
        this.f11374o = j10;
    }

    public void b(long j10) {
        a1.b(k());
        if (this.f11363d) {
            this.f11360a.c(d(j10));
        }
    }

    public xo b(float f10, go goVar) {
        xo a10 = this.f11369j.a(this.f11368i, h(), this.f11365f.f12551a, goVar);
        for (f8 f8Var : a10.f13434c) {
            if (f8Var != null) {
                f8Var.a(f10);
            }
        }
        return a10;
    }

    private void a(yi[] yiVarArr) {
        int i10 = 0;
        while (true) {
            mi[] miVarArr = this.f11368i;
            if (i10 < miVarArr.length) {
                if (miVarArr[i10].e() == -2 && this.f11373n.a(i10)) {
                    yiVarArr[i10] = new q7();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void a(long j10) {
        a1.b(k());
        this.f11360a.b(d(j10));
    }

    private static rd a(wd.a aVar, ae aeVar, n0 n0Var, long j10, long j11) {
        rd a10 = aeVar.a(aVar, n0Var, j10);
        return j11 != -9223372036854775807L ? new i3(a10, true, 0, j11) : a10;
    }

    private void a() {
        if (k()) {
            int i10 = 0;
            while (true) {
                xo xoVar = this.f11373n;
                if (i10 < xoVar.f13432a) {
                    boolean a10 = xoVar.a(i10);
                    f8 f8Var = this.f11373n.f13434c[i10];
                    if (a10 && f8Var != null) {
                        f8Var.f();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void a(float f10, go goVar) {
        this.f11363d = true;
        this.f11372m = this.f11360a.b();
        xo b10 = b(f10, goVar);
        ud udVar = this.f11365f;
        long j10 = udVar.f12552b;
        long j11 = udVar.f12555e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long a10 = a(b10, j10, false);
        long j12 = this.f11374o;
        ud udVar2 = this.f11365f;
        this.f11374o = j12 + (udVar2.f12552b - a10);
        this.f11365f = udVar2.b(a10);
    }

    private static void a(ae aeVar, rd rdVar) {
        try {
            if (rdVar instanceof i3) {
                aeVar.a(((i3) rdVar).f8412a);
            } else {
                aeVar.a(rdVar);
            }
        } catch (RuntimeException e10) {
            kc.a("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void a(sd sdVar) {
        if (sdVar != this.f11371l) {
            a();
            this.f11371l = sdVar;
            b();
        }
    }
}
