package com.applovin.impl;

import com.applovin.impl.rd;

public final class i3 implements rd, rd.a {

    /* renamed from: a  reason: collision with root package name */
    public final rd f8412a;

    /* renamed from: b  reason: collision with root package name */
    private rd.a f8413b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f8414c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f8415d;

    /* renamed from: f  reason: collision with root package name */
    long f8416f;

    /* renamed from: g  reason: collision with root package name */
    long f8417g;

    private final class a implements yi {

        /* renamed from: a  reason: collision with root package name */
        public final yi f8418a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f8419b;

        public a(yi yiVar) {
            this.f8418a = yiVar;
        }

        public void a() {
            this.f8418a.a();
        }

        public void b() {
            this.f8419b = false;
        }

        public boolean d() {
            return !i3.this.c() && this.f8418a.d();
        }

        public int a(e9 e9Var, n5 n5Var, int i10) {
            if (i3.this.c()) {
                return -3;
            }
            if (this.f8419b) {
                n5Var.e(4);
                return -4;
            }
            int a10 = this.f8418a.a(e9Var, n5Var, i10);
            if (a10 == -5) {
                d9 d9Var = (d9) a1.a((Object) e9Var.f7378b);
                int i11 = d9Var.C;
                if (!(i11 == 0 && d9Var.D == 0)) {
                    i3 i3Var = i3.this;
                    int i12 = 0;
                    if (i3Var.f8416f != 0) {
                        i11 = 0;
                    }
                    if (i3Var.f8417g == Long.MIN_VALUE) {
                        i12 = d9Var.D;
                    }
                    e9Var.f7378b = d9Var.a().e(i11).f(i12).a();
                }
                return -5;
            }
            i3 i3Var2 = i3.this;
            long j10 = i3Var2.f8417g;
            if (j10 == Long.MIN_VALUE || ((a10 != -4 || n5Var.f9908f < j10) && (a10 != -3 || i3Var2.e() != Long.MIN_VALUE || n5Var.f9907d))) {
                return a10;
            }
            n5Var.b();
            n5Var.e(4);
            this.f8419b = true;
            return -4;
        }

        public int a(long j10) {
            if (i3.this.c()) {
                return -3;
            }
            return this.f8418a.a(j10);
        }
    }

    public i3(rd rdVar, boolean z10, long j10, long j11) {
        this.f8412a = rdVar;
        this.f8415d = z10 ? j10 : -9223372036854775807L;
        this.f8416f = j10;
        this.f8417g = j11;
    }

    private fj b(long j10, fj fjVar) {
        long b10 = yp.b(fjVar.f7807a, 0, j10 - this.f8416f);
        long j11 = fjVar.f7808b;
        long j12 = this.f8417g;
        long b11 = yp.b(j11, 0, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (b10 == fjVar.f7807a && b11 == fjVar.f7808b) {
            return fjVar;
        }
        return new fj(b10, b11);
    }

    public void a(long j10, boolean z10) {
        this.f8412a.a(j10, z10);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f8415d != -9223372036854775807L;
    }

    public long e() {
        long e10 = this.f8412a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.f8417g;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void f() {
        this.f8412a.f();
    }

    public long g() {
        long g10 = this.f8412a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f8417g;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    public long h() {
        if (c()) {
            long j10 = this.f8415d;
            this.f8415d = -9223372036854775807L;
            long h10 = h();
            return h10 != -9223372036854775807L ? h10 : j10;
        }
        long h11 = this.f8412a.h();
        if (h11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        a1.b(h11 >= this.f8416f);
        long j11 = this.f8417g;
        if (j11 != Long.MIN_VALUE && h11 > j11) {
            z10 = false;
        }
        a1.b(z10);
        return h11;
    }

    public long a(long j10, fj fjVar) {
        long j11 = this.f8416f;
        if (j10 == j11) {
            return j11;
        }
        return this.f8412a.a(j10, b(j10, fjVar));
    }

    public void c(long j10) {
        this.f8412a.c(j10);
    }

    public boolean a() {
        return this.f8412a.a();
    }

    public void a(rd rdVar) {
        ((rd.a) a1.a((Object) this.f8413b)).a(this);
    }

    public void a(rd.a aVar, long j10) {
        this.f8413b = aVar;
        this.f8412a.a((rd.a) this, j10);
    }

    public boolean b(long j10) {
        return this.f8412a.b(j10);
    }

    public qo b() {
        return this.f8412a.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f8415d = r0
            com.applovin.impl.i3$a[] r0 = r6.f8414c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.applovin.impl.rd r0 = r6.f8412a
            long r0 = r0.a(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f8416f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f8417g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.applovin.impl.a1.b((boolean) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(long):long");
    }

    /* renamed from: b */
    public void a(rd rdVar) {
        ((rd.a) a1.a((Object) this.f8413b)).a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(com.applovin.impl.f8[] r13, boolean[] r14, com.applovin.impl.yi[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.impl.i3$a[] r2 = new com.applovin.impl.i3.a[r2]
            r0.f8414c = r2
            int r2 = r1.length
            com.applovin.impl.yi[] r9 = new com.applovin.impl.yi[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            com.applovin.impl.i3$a[] r3 = r0.f8414c
            r4 = r1[r2]
            com.applovin.impl.i3$a r4 = (com.applovin.impl.i3.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            com.applovin.impl.yi r11 = r4.f8418a
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            com.applovin.impl.rd r2 = r0.f8412a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.c()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.f8416f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = a((long) r4, (com.applovin.impl.f8[]) r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f8415d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.f8416f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0061
            long r4 = r0.f8417g
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0063
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r4 = 0
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            com.applovin.impl.a1.b((boolean) r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x008d
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            com.applovin.impl.i3$a[] r4 = r0.f8414c
            r4[r10] = r11
            goto L_0x0084
        L_0x0073:
            com.applovin.impl.i3$a[] r5 = r0.f8414c
            r6 = r5[r10]
            if (r6 == 0) goto L_0x007d
            com.applovin.impl.yi r6 = r6.f8418a
            if (r6 == r4) goto L_0x0084
        L_0x007d:
            com.applovin.impl.i3$a r6 = new com.applovin.impl.i3$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0084:
            com.applovin.impl.i3$a[] r4 = r0.f8414c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i3.a(com.applovin.impl.f8[], boolean[], com.applovin.impl.yi[], boolean[], long):long");
    }

    private static boolean a(long j10, f8[] f8VarArr) {
        if (j10 != 0) {
            for (f8 f8Var : f8VarArr) {
                if (f8Var != null) {
                    d9 g10 = f8Var.g();
                    if (!df.a(g10.f7153m, g10.f7150j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long j10, long j11) {
        this.f8416f = j10;
        this.f8417g = j11;
    }
}
