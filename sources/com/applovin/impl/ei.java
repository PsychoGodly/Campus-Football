package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.ej;
import com.applovin.impl.ep;

public final class ei implements i8 {

    /* renamed from: l  reason: collision with root package name */
    public static final m8 f7429l = iw.f8605b;

    /* renamed from: a  reason: collision with root package name */
    private final io f7430a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f7431b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f7432c;

    /* renamed from: d  reason: collision with root package name */
    private final di f7433d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7434e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7435f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7436g;

    /* renamed from: h  reason: collision with root package name */
    private long f7437h;

    /* renamed from: i  reason: collision with root package name */
    private ci f7438i;

    /* renamed from: j  reason: collision with root package name */
    private k8 f7439j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7440k;

    public ei() {
        this(new io(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new ei()};
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f7439j = k8Var;
    }

    public ei(io ioVar) {
        this.f7430a = ioVar;
        this.f7432c = new yg(4096);
        this.f7431b = new SparseArray();
        this.f7433d = new di();
    }

    private void a(long j10) {
        if (!this.f7440k) {
            this.f7440k = true;
            if (this.f7433d.a() != -9223372036854775807L) {
                ci ciVar = new ci(this.f7433d.b(), this.f7433d.a(), j10);
                this.f7438i = ciVar;
                this.f7439j.a(ciVar.a());
                return;
            }
            this.f7439j.a(new ej.b(this.f7433d.a()));
        }
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final o7 f7441a;

        /* renamed from: b  reason: collision with root package name */
        private final io f7442b;

        /* renamed from: c  reason: collision with root package name */
        private final xg f7443c = new xg(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f7444d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f7445e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7446f;

        /* renamed from: g  reason: collision with root package name */
        private int f7447g;

        /* renamed from: h  reason: collision with root package name */
        private long f7448h;

        public a(o7 o7Var, io ioVar) {
            this.f7441a = o7Var;
            this.f7442b = ioVar;
        }

        private void b() {
            this.f7448h = 0;
            if (this.f7444d) {
                this.f7443c.d(4);
                this.f7443c.d(1);
                this.f7443c.d(1);
                long a10 = (((long) this.f7443c.a(3)) << 30) | ((long) (this.f7443c.a(15) << 15)) | ((long) this.f7443c.a(15));
                this.f7443c.d(1);
                if (!this.f7446f && this.f7445e) {
                    this.f7443c.d(4);
                    this.f7443c.d(1);
                    this.f7443c.d(1);
                    this.f7443c.d(1);
                    this.f7442b.b((((long) this.f7443c.a(3)) << 30) | ((long) (this.f7443c.a(15) << 15)) | ((long) this.f7443c.a(15)));
                    this.f7446f = true;
                }
                this.f7448h = this.f7442b.b(a10);
            }
        }

        public void a(yg ygVar) {
            ygVar.a(this.f7443c.f13324a, 0, 3);
            this.f7443c.c(0);
            a();
            ygVar.a(this.f7443c.f13324a, 0, this.f7447g);
            this.f7443c.c(0);
            b();
            this.f7441a.a(this.f7448h, 4);
            this.f7441a.a(ygVar);
            this.f7441a.b();
        }

        public void c() {
            this.f7446f = false;
            this.f7441a.a();
        }

        private void a() {
            this.f7443c.d(8);
            this.f7444d = this.f7443c.f();
            this.f7445e = this.f7443c.f();
            this.f7443c.d(6);
            this.f7447g = this.f7443c.a(8);
        }
    }

    public int a(j8 j8Var, qh qhVar) {
        a1.b((Object) this.f7439j);
        long a10 = j8Var.a();
        int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if (i10 != 0 && !this.f7433d.c()) {
            return this.f7433d.a(j8Var, qhVar);
        }
        a(a10);
        ci ciVar = this.f7438i;
        if (ciVar != null && ciVar.b()) {
            return this.f7438i.a(j8Var, qhVar);
        }
        j8Var.b();
        long d10 = i10 != 0 ? a10 - j8Var.d() : -1;
        if ((d10 != -1 && d10 < 4) || !j8Var.b(this.f7432c.c(), 0, 4, true)) {
            return -1;
        }
        this.f7432c.f(0);
        int j10 = this.f7432c.j();
        if (j10 == 441) {
            return -1;
        }
        if (j10 == 442) {
            j8Var.c(this.f7432c.c(), 0, 10);
            this.f7432c.f(9);
            j8Var.a((this.f7432c.w() & 7) + 14);
            return 0;
        } else if (j10 == 443) {
            j8Var.c(this.f7432c.c(), 0, 2);
            this.f7432c.f(0);
            j8Var.a(this.f7432c.C() + 6);
            return 0;
        } else if (((j10 & -256) >> 8) != 1) {
            j8Var.a(1);
            return 0;
        } else {
            int i11 = j10 & 255;
            a aVar = (a) this.f7431b.get(i11);
            if (!this.f7434e) {
                if (aVar == null) {
                    o7 o7Var = null;
                    if (i11 == 189) {
                        o7Var = new j();
                        this.f7435f = true;
                        this.f7437h = j8Var.f();
                    } else if ((j10 & 224) == 192) {
                        o7Var = new nf();
                        this.f7435f = true;
                        this.f7437h = j8Var.f();
                    } else if ((j10 & 240) == 224) {
                        o7Var = new da();
                        this.f7436g = true;
                        this.f7437h = j8Var.f();
                    }
                    if (o7Var != null) {
                        o7Var.a(this.f7439j, new ep.d(i11, 256));
                        a aVar2 = new a(o7Var, this.f7430a);
                        this.f7431b.put(i11, aVar2);
                        aVar = aVar2;
                    }
                }
                if (j8Var.f() > ((!this.f7435f || !this.f7436g) ? 1048576 : this.f7437h + 8192)) {
                    this.f7434e = true;
                    this.f7439j.c();
                }
            }
            j8Var.c(this.f7432c.c(), 0, 2);
            this.f7432c.f(0);
            int C = this.f7432c.C() + 6;
            if (aVar == null) {
                j8Var.a(C);
            } else {
                this.f7432c.d(C);
                j8Var.d(this.f7432c.c(), 0, C);
                this.f7432c.f(6);
                aVar.a(this.f7432c);
                yg ygVar = this.f7432c;
                ygVar.e(ygVar.b());
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r5 != r7) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r5 != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:0: B:16:0x0038->B:18:0x0040, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            com.applovin.impl.io r5 = r4.f7430a
            long r5 = r5.c()
            r0 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0012
            r5 = 1
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            if (r5 != 0) goto L_0x002a
            com.applovin.impl.io r5 = r4.f7430a
            long r5 = r5.a()
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0031
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0031
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0031
            goto L_0x002c
        L_0x002a:
            if (r5 == 0) goto L_0x0031
        L_0x002c:
            com.applovin.impl.io r5 = r4.f7430a
            r5.d(r7)
        L_0x0031:
            com.applovin.impl.ci r5 = r4.f7438i
            if (r5 == 0) goto L_0x0038
            r5.b(r7)
        L_0x0038:
            android.util.SparseArray r5 = r4.f7431b
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x004e
            android.util.SparseArray r5 = r4.f7431b
            java.lang.Object r5 = r5.valueAt(r0)
            com.applovin.impl.ei$a r5 = (com.applovin.impl.ei.a) r5
            r5.c()
            int r0 = r0 + 1
            goto L_0x0038
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ei.a(long, long):void");
    }

    public boolean a(j8 j8Var) {
        byte[] bArr = new byte[14];
        j8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        j8Var.c(bArr[13] & 7);
        j8Var.c(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }
}
