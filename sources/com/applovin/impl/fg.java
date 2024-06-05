package com.applovin.impl;

final class fg {

    /* renamed from: a  reason: collision with root package name */
    public int f7776a;

    /* renamed from: b  reason: collision with root package name */
    public int f7777b;

    /* renamed from: c  reason: collision with root package name */
    public long f7778c;

    /* renamed from: d  reason: collision with root package name */
    public long f7779d;

    /* renamed from: e  reason: collision with root package name */
    public long f7780e;

    /* renamed from: f  reason: collision with root package name */
    public long f7781f;

    /* renamed from: g  reason: collision with root package name */
    public int f7782g;

    /* renamed from: h  reason: collision with root package name */
    public int f7783h;

    /* renamed from: i  reason: collision with root package name */
    public int f7784i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f7785j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final yg f7786k = new yg(255);

    fg() {
    }

    public boolean a(j8 j8Var, boolean z10) {
        a();
        this.f7786k.d(27);
        if (!l8.a(j8Var, this.f7786k.c(), 0, 27, z10) || this.f7786k.y() != 1332176723) {
            return false;
        }
        int w10 = this.f7786k.w();
        this.f7776a = w10;
        if (w10 == 0) {
            this.f7777b = this.f7786k.w();
            this.f7778c = this.f7786k.n();
            this.f7779d = this.f7786k.p();
            this.f7780e = this.f7786k.p();
            this.f7781f = this.f7786k.p();
            int w11 = this.f7786k.w();
            this.f7782g = w11;
            this.f7783h = w11 + 27;
            this.f7786k.d(w11);
            if (!l8.a(j8Var, this.f7786k.c(), 0, this.f7782g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f7782g; i10++) {
                this.f7785j[i10] = this.f7786k.w();
                this.f7784i += this.f7785j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw ah.a("unsupported bit stream revision");
        }
    }

    public void a() {
        this.f7776a = 0;
        this.f7777b = 0;
        this.f7778c = 0;
        this.f7779d = 0;
        this.f7780e = 0;
        this.f7781f = 0;
        this.f7782g = 0;
        this.f7783h = 0;
        this.f7784i = 0;
    }

    public boolean a(j8 j8Var) {
        return a(j8Var, -1);
    }

    public boolean a(j8 j8Var, long j10) {
        int i10;
        a1.a(j8Var.f() == j8Var.d());
        this.f7786k.d(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || j8Var.f() + 4 < j10) && l8.a(j8Var, this.f7786k.c(), 0, 4, true)) {
                this.f7786k.f(0);
                if (this.f7786k.y() == 1332176723) {
                    j8Var.b();
                    return true;
                }
                j8Var.a(1);
            }
        }
        do {
            if ((i10 != 0 && j8Var.f() >= j10) || j8Var.b(1) == -1) {
                return false;
            }
            break;
        } while (j8Var.b(1) == -1);
        return false;
    }
}
