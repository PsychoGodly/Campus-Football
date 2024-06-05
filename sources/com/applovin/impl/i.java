package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;

public final class i implements i8 {

    /* renamed from: d  reason: collision with root package name */
    public static final m8 f8378d = wx.f13189b;

    /* renamed from: a  reason: collision with root package name */
    private final j f8379a = new j();

    /* renamed from: b  reason: collision with root package name */
    private final yg f8380b = new yg(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f8381c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new i()};
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f8379a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(-9223372036854775807L));
    }

    public int a(j8 j8Var, qh qhVar) {
        int a10 = j8Var.a(this.f8380b.c(), 0, 2786);
        if (a10 == -1) {
            return -1;
        }
        this.f8380b.f(0);
        this.f8380b.e(a10);
        if (!this.f8381c) {
            this.f8379a.a(0, 4);
            this.f8381c = true;
        }
        this.f8379a.a(this.f8380b);
        return 0;
    }

    public void a(long j10, long j11) {
        this.f8381c = false;
        this.f8379a.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.b();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.impl.j8 r8) {
        /*
            r7 = this;
            com.applovin.impl.yg r0 = new com.applovin.impl.yg
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.c()
            r8.c(r4, r2, r1)
            r0.f(r2)
            int r4 = r0.z()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.b()
            r8.c(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.c()
            r6 = 6
            r8.c(r5, r2, r6)
            r0.f(r2)
            int r5 = r0.C()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.b()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.c(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.c()
            int r5 = com.applovin.impl.k.a((byte[]) r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.c(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.g(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i.a(com.applovin.impl.j8):boolean");
    }
}
