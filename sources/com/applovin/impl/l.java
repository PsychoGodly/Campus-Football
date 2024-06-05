package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;

public final class l implements i8 {

    /* renamed from: d  reason: collision with root package name */
    public static final m8 f9106d = xy.f13457b;

    /* renamed from: a  reason: collision with root package name */
    private final m f9107a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final yg f9108b = new yg(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f9109c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new l()};
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f9107a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(-9223372036854775807L));
    }

    public int a(j8 j8Var, qh qhVar) {
        int a10 = j8Var.a(this.f9108b.c(), 0, 16384);
        if (a10 == -1) {
            return -1;
        }
        this.f9108b.f(0);
        this.f9108b.e(a10);
        if (!this.f9109c) {
            this.f9107a.a(0, 4);
            this.f9109c = true;
        }
        this.f9107a.a(this.f9108b);
        return 0;
    }

    public void a(long j10, long j11) {
        this.f9109c = false;
        this.f9107a.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.b();
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.impl.j8 r9) {
        /*
            r8 = this;
            com.applovin.impl.yg r0 = new com.applovin.impl.yg
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.c()
            r9.c(r4, r2, r1)
            r0.f(r2)
            int r4 = r0.z()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.b()
            r9.c(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.c()
            r6 = 7
            r9.c(r5, r2, r6)
            r0.f(r2)
            int r5 = r0.C()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.b()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.c(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.c()
            int r5 = com.applovin.impl.n.a((byte[]) r6, (int) r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.c(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.g(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l.a(com.applovin.impl.j8):boolean");
    }
}
