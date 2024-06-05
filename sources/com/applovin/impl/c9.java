package com.applovin.impl;

import com.applovin.impl.ej;

public final class c9 implements i8 {

    /* renamed from: q  reason: collision with root package name */
    public static final m8 f6933q = uv.f12638b;

    /* renamed from: a  reason: collision with root package name */
    private final yg f6934a = new yg(4);

    /* renamed from: b  reason: collision with root package name */
    private final yg f6935b = new yg(9);

    /* renamed from: c  reason: collision with root package name */
    private final yg f6936c = new yg(11);

    /* renamed from: d  reason: collision with root package name */
    private final yg f6937d = new yg();

    /* renamed from: e  reason: collision with root package name */
    private final aj f6938e = new aj();

    /* renamed from: f  reason: collision with root package name */
    private k8 f6939f;

    /* renamed from: g  reason: collision with root package name */
    private int f6940g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6941h;

    /* renamed from: i  reason: collision with root package name */
    private long f6942i;

    /* renamed from: j  reason: collision with root package name */
    private int f6943j;

    /* renamed from: k  reason: collision with root package name */
    private int f6944k;

    /* renamed from: l  reason: collision with root package name */
    private int f6945l;

    /* renamed from: m  reason: collision with root package name */
    private long f6946m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6947n;

    /* renamed from: o  reason: collision with root package name */
    private r1 f6948o;

    /* renamed from: p  reason: collision with root package name */
    private zq f6949p;

    private void b() {
        if (!this.f6947n) {
            this.f6939f.a(new ej.b(-9223372036854775807L));
            this.f6947n = true;
        }
    }

    private long c() {
        if (this.f6941h) {
            return this.f6942i + this.f6946m;
        }
        if (this.f6938e.a() == -9223372036854775807L) {
            return 0;
        }
        return this.f6946m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(com.applovin.impl.j8 r10) {
        /*
            r9 = this;
            long r0 = r9.c()
            int r2 = r9.f6944k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            com.applovin.impl.r1 r7 = r9.f6948o
            if (r7 == 0) goto L_0x0024
            r9.b()
            com.applovin.impl.r1 r2 = r9.f6948o
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            com.applovin.impl.zq r7 = r9.f6949p
            if (r7 == 0) goto L_0x003a
            r9.b()
            com.applovin.impl.zq r2 = r9.f6949p
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f6947n
            if (r2 != 0) goto L_0x006f
            com.applovin.impl.aj r2 = r9.f6938e
            com.applovin.impl.yg r10 = r9.b(r10)
            boolean r5 = r2.a(r10, r0)
            com.applovin.impl.aj r10 = r9.f6938e
            long r0 = r10.a()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            com.applovin.impl.k8 r10 = r9.f6939f
            com.applovin.impl.ib r2 = new com.applovin.impl.ib
            com.applovin.impl.aj r7 = r9.f6938e
            long[] r7 = r7.b()
            com.applovin.impl.aj r8 = r9.f6938e
            long[] r8 = r8.c()
            r2.<init>(r7, r8, r0)
            r10.a(r2)
            r9.f6947n = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f6945l
            r10.a(r0)
            r10 = 0
        L_0x0075:
            boolean r0 = r9.f6941h
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f6941h = r6
            com.applovin.impl.aj r0 = r9.f6938e
            long r0 = r0.a()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008b
            long r0 = r9.f6946m
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f6942i = r0
        L_0x008f:
            r0 = 4
            r9.f6943j = r0
            r0 = 2
            r9.f6940g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c9.d(com.applovin.impl.j8):boolean");
    }

    private boolean e(j8 j8Var) {
        if (!j8Var.a(this.f6936c.c(), 0, 11, true)) {
            return false;
        }
        this.f6936c.f(0);
        this.f6944k = this.f6936c.w();
        this.f6945l = this.f6936c.z();
        this.f6946m = (long) this.f6936c.z();
        this.f6946m = (((long) (this.f6936c.w() << 24)) | this.f6946m) * 1000;
        this.f6936c.g(3);
        this.f6940g = 4;
        return true;
    }

    private void f(j8 j8Var) {
        j8Var.a(this.f6943j);
        this.f6943j = 0;
        this.f6940g = 3;
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f6939f = k8Var;
    }

    public int a(j8 j8Var, qh qhVar) {
        a1.b((Object) this.f6939f);
        while (true) {
            int i10 = this.f6940g;
            if (i10 != 1) {
                if (i10 == 2) {
                    f(j8Var);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (d(j8Var)) {
                        return 0;
                    }
                } else if (!e(j8Var)) {
                    return -1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    private yg b(j8 j8Var) {
        if (this.f6945l > this.f6937d.b()) {
            yg ygVar = this.f6937d;
            ygVar.a(new byte[Math.max(ygVar.b() * 2, this.f6945l)], 0);
        } else {
            this.f6937d.f(0);
        }
        this.f6937d.e(this.f6945l);
        j8Var.d(this.f6937d.c(), 0, this.f6945l);
        return this.f6937d;
    }

    private boolean c(j8 j8Var) {
        boolean z10 = false;
        if (!j8Var.a(this.f6935b.c(), 0, 9, true)) {
            return false;
        }
        this.f6935b.f(0);
        this.f6935b.g(4);
        int w10 = this.f6935b.w();
        boolean z11 = (w10 & 4) != 0;
        if ((w10 & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f6948o == null) {
            this.f6948o = new r1(this.f6939f.a(8, 1));
        }
        if (z10 && this.f6949p == null) {
            this.f6949p = new zq(this.f6939f.a(9, 2));
        }
        this.f6939f.c();
        this.f6943j = this.f6935b.j() - 5;
        this.f6940g = 2;
        return true;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f6940g = 1;
            this.f6941h = false;
        } else {
            this.f6940g = 3;
        }
        this.f6943j = 0;
    }

    public boolean a(j8 j8Var) {
        j8Var.c(this.f6934a.c(), 0, 3);
        this.f6934a.f(0);
        if (this.f6934a.z() != 4607062) {
            return false;
        }
        j8Var.c(this.f6934a.c(), 0, 2);
        this.f6934a.f(0);
        if ((this.f6934a.C() & 250) != 0) {
            return false;
        }
        j8Var.c(this.f6934a.c(), 0, 4);
        this.f6934a.f(0);
        int j10 = this.f6934a.j();
        j8Var.b();
        j8Var.c(j10);
        j8Var.c(this.f6934a.c(), 0, 4);
        this.f6934a.f(0);
        if (this.f6934a.j() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new c9()};
    }
}
