package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;

public final class j0 implements i8 {

    /* renamed from: m  reason: collision with root package name */
    public static final m8 f8621m = iy.f8607b;

    /* renamed from: a  reason: collision with root package name */
    private final int f8622a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f8623b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f8624c;

    /* renamed from: d  reason: collision with root package name */
    private final yg f8625d;

    /* renamed from: e  reason: collision with root package name */
    private final xg f8626e;

    /* renamed from: f  reason: collision with root package name */
    private k8 f8627f;

    /* renamed from: g  reason: collision with root package name */
    private long f8628g;

    /* renamed from: h  reason: collision with root package name */
    private long f8629h;

    /* renamed from: i  reason: collision with root package name */
    private int f8630i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8631j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8632k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8633l;

    public j0() {
        this(0);
    }

    private static int a(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.applovin.impl.j8 r10) {
        /*
            r9 = this;
            boolean r0 = r9.f8631j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f8630i = r0
            r10.b()
            long r1 = r10.f()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.c(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            com.applovin.impl.yg r6 = r9.f8625d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.c()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            com.applovin.impl.yg r6 = r9.f8625d     // Catch:{ EOFException -> 0x0076 }
            r6.f(r1)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.impl.yg r6 = r9.f8625d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.C()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = com.applovin.impl.k0.a((int) r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            com.applovin.impl.yg r6 = r9.f8625d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.c()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            com.applovin.impl.xg r6 = r9.f8626e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.c(r7)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.impl.xg r6 = r9.f8626e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.a((int) r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.a(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f8631j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            com.applovin.impl.ah r1 = com.applovin.impl.ah.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.b()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f8630i = r10
            goto L_0x0084
        L_0x0082:
            r9.f8630i = r0
        L_0x0084:
            r9.f8631j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j0.b(com.applovin.impl.j8):void");
    }

    private int c(j8 j8Var) {
        int i10 = 0;
        while (true) {
            j8Var.c(this.f8625d.c(), 0, 10);
            this.f8625d.f(0);
            if (this.f8625d.z() != 4801587) {
                break;
            }
            this.f8625d.g(3);
            int v10 = this.f8625d.v();
            i10 += v10 + 10;
            j8Var.c(v10);
        }
        j8Var.b();
        j8Var.c(i10);
        if (this.f8629h == -1) {
            this.f8629h = (long) i10;
        }
        return i10;
    }

    public void a() {
    }

    public j0(int i10) {
        this.f8622a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f8623b = new k0(true);
        this.f8624c = new yg(2048);
        this.f8630i = -1;
        this.f8629h = -1;
        yg ygVar = new yg(10);
        this.f8625d = ygVar;
        this.f8626e = new xg(ygVar.c());
    }

    private ej a(long j10, boolean z10) {
        return new n4(j10, this.f8629h, a(this.f8630i, this.f8623b.d()), this.f8630i, z10);
    }

    public void a(k8 k8Var) {
        this.f8627f = k8Var;
        this.f8623b.a(k8Var, new ep.d(0, 1));
        k8Var.c();
    }

    public int a(j8 j8Var, qh qhVar) {
        a1.b((Object) this.f8627f);
        long a10 = j8Var.a();
        int i10 = this.f8622a;
        if (!((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1))) {
            b(j8Var);
        }
        int a11 = j8Var.a(this.f8624c.c(), 0, 2048);
        boolean z10 = a11 == -1;
        b(a10, z10);
        if (z10) {
            return -1;
        }
        this.f8624c.f(0);
        this.f8624c.e(a11);
        if (!this.f8632k) {
            this.f8623b.a(this.f8628g, 4);
            this.f8632k = true;
        }
        this.f8623b.a(this.f8624c);
        return 0;
    }

    public void a(long j10, long j11) {
        this.f8632k = false;
        this.f8623b.a();
        this.f8628g = j11;
    }

    public boolean a(j8 j8Var) {
        int c10 = c(j8Var);
        int i10 = c10;
        int i11 = 0;
        int i12 = 0;
        do {
            j8Var.c(this.f8625d.c(), 0, 2);
            this.f8625d.f(0);
            if (!k0.a(this.f8625d.C())) {
                i10++;
                j8Var.b();
                j8Var.c(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                j8Var.c(this.f8625d.c(), 0, 4);
                this.f8626e.c(14);
                int a10 = this.f8626e.a(13);
                if (a10 <= 6) {
                    i10++;
                    j8Var.b();
                    j8Var.c(i10);
                } else {
                    j8Var.c(a10 - 6);
                    i12 += a10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - c10 < 8192);
        return false;
    }

    private void b(long j10, boolean z10) {
        if (!this.f8633l) {
            boolean z11 = false;
            boolean z12 = (this.f8622a & 1) != 0 && this.f8630i > 0;
            if (!z12 || this.f8623b.d() != -9223372036854775807L || z10) {
                if (!z12 || this.f8623b.d() == -9223372036854775807L) {
                    this.f8627f.a(new ej.b(-9223372036854775807L));
                } else {
                    k8 k8Var = this.f8627f;
                    if ((this.f8622a & 2) != 0) {
                        z11 = true;
                    }
                    k8Var.a(a(j10, z11));
                }
                this.f8633l = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new j0()};
    }
}
