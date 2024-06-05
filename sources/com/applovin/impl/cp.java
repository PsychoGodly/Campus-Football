package com.applovin.impl;

final class cp {

    /* renamed from: a  reason: collision with root package name */
    private final int f7021a;

    /* renamed from: b  reason: collision with root package name */
    private final io f7022b = new io(0);

    /* renamed from: c  reason: collision with root package name */
    private final yg f7023c = new yg();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7024d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7025e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7026f;

    /* renamed from: g  reason: collision with root package name */
    private long f7027g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f7028h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f7029i = -9223372036854775807L;

    cp(int i10) {
        this.f7021a = i10;
    }

    private int a(j8 j8Var) {
        this.f7023c.a(yp.f13667f);
        this.f7024d = true;
        j8Var.b();
        return 0;
    }

    public io b() {
        return this.f7022b;
    }

    public boolean c() {
        return this.f7024d;
    }

    private int b(j8 j8Var, qh qhVar, int i10) {
        int min = (int) Math.min((long) this.f7021a, j8Var.a());
        long j10 = (long) 0;
        if (j8Var.f() != j10) {
            qhVar.f10991a = j10;
            return 1;
        }
        this.f7023c.d(min);
        j8Var.b();
        j8Var.c(this.f7023c.c(), 0, min);
        this.f7027g = a(this.f7023c, i10);
        this.f7025e = true;
        return 0;
    }

    private int c(j8 j8Var, qh qhVar, int i10) {
        long a10 = j8Var.a();
        int min = (int) Math.min((long) this.f7021a, a10);
        long j10 = a10 - ((long) min);
        if (j8Var.f() != j10) {
            qhVar.f10991a = j10;
            return 1;
        }
        this.f7023c.d(min);
        j8Var.b();
        j8Var.c(this.f7023c.c(), 0, min);
        this.f7028h = b(this.f7023c, i10);
        this.f7026f = true;
        return 0;
    }

    public long a() {
        return this.f7029i;
    }

    public int a(j8 j8Var, qh qhVar, int i10) {
        if (i10 <= 0) {
            return a(j8Var);
        }
        if (!this.f7026f) {
            return c(j8Var, qhVar, i10);
        }
        if (this.f7028h == -9223372036854775807L) {
            return a(j8Var);
        }
        if (!this.f7025e) {
            return b(j8Var, qhVar, i10);
        }
        long j10 = this.f7027g;
        if (j10 == -9223372036854775807L) {
            return a(j8Var);
        }
        long b10 = this.f7022b.b(this.f7028h) - this.f7022b.b(j10);
        this.f7029i = b10;
        if (b10 < 0) {
            kc.d("TsDurationReader", "Invalid duration: " + this.f7029i + ". Using TIME_UNSET instead.");
            this.f7029i = -9223372036854775807L;
        }
        return a(j8Var);
    }

    private long b(yg ygVar, int i10) {
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        for (int i11 = e10 - 188; i11 >= d10; i11--) {
            if (fp.a(ygVar.c(), d10, e10, i11)) {
                long a10 = fp.a(ygVar, i11, i10);
                if (a10 != -9223372036854775807L) {
                    return a10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long a(yg ygVar, int i10) {
        int e10 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e10; d10++) {
            if (ygVar.c()[d10] == 71) {
                long a10 = fp.a(ygVar, d10, i10);
                if (a10 != -9223372036854775807L) {
                    return a10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
