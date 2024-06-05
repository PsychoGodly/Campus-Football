package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.applovin.impl.ro;

public final class mr implements i8 {

    /* renamed from: f  reason: collision with root package name */
    public static final m8 f9828f = iz.f8608b;

    /* renamed from: a  reason: collision with root package name */
    private k8 f9829a;

    /* renamed from: b  reason: collision with root package name */
    private ro f9830b;

    /* renamed from: c  reason: collision with root package name */
    private b f9831c;

    /* renamed from: d  reason: collision with root package name */
    private int f9832d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f9833e = -1;

    private interface b {
        void a(int i10, long j10);

        void a(long j10);

        boolean a(j8 j8Var, long j10);
    }

    private void b() {
        a1.b((Object) this.f9830b);
        yp.a((Object) this.f9829a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new mr()};
    }

    public void a() {
    }

    public void a(k8 k8Var) {
        this.f9829a = k8Var;
        this.f9830b = k8Var.a(0, 1);
        k8Var.c();
    }

    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final k8 f9848a;

        /* renamed from: b  reason: collision with root package name */
        private final ro f9849b;

        /* renamed from: c  reason: collision with root package name */
        private final nr f9850c;

        /* renamed from: d  reason: collision with root package name */
        private final d9 f9851d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9852e;

        /* renamed from: f  reason: collision with root package name */
        private long f9853f;

        /* renamed from: g  reason: collision with root package name */
        private int f9854g;

        /* renamed from: h  reason: collision with root package name */
        private long f9855h;

        public c(k8 k8Var, ro roVar, nr nrVar, String str, int i10) {
            this.f9848a = k8Var;
            this.f9849b = roVar;
            this.f9850c = nrVar;
            int i11 = (nrVar.f10017b * nrVar.f10021f) / 8;
            if (nrVar.f10020e == i11) {
                int i12 = nrVar.f10018c * i11;
                int i13 = i12 * 8;
                int max = Math.max(i11, i12 / 10);
                this.f9852e = max;
                this.f9851d = new d9.b().f(str).b(i13).k(i13).i(max).c(nrVar.f10017b).n(nrVar.f10018c).j(i10).a();
                return;
            }
            throw ah.a("Expected block size: " + i11 + "; got: " + nrVar.f10020e, (Throwable) null);
        }

        public void a(int i10, long j10) {
            this.f9848a.a(new pr(this.f9850c, 1, (long) i10, j10));
            this.f9849b.a(this.f9851d);
        }

        public void a(long j10) {
            this.f9853f = j10;
            this.f9854g = 0;
            this.f9855h = 0;
        }

        public boolean a(j8 j8Var, long j10) {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f9854g) >= (i12 = this.f9852e)) {
                    nr nrVar = this.f9850c;
                    int i13 = nrVar.f10020e;
                    int i14 = this.f9854g / i13;
                } else {
                    int a10 = this.f9849b.a((e5) j8Var, (int) Math.min((long) (i12 - i11), j11), true);
                    if (a10 == -1) {
                        j11 = 0;
                    } else {
                        this.f9854g += a10;
                        j11 -= (long) a10;
                    }
                }
            }
            nr nrVar2 = this.f9850c;
            int i132 = nrVar2.f10020e;
            int i142 = this.f9854g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f9854g - i15;
                this.f9849b.a(this.f9853f + yp.c(this.f9855h, 1000000, (long) nrVar2.f10018c), 1, i15, i16, (ro.a) null);
                this.f9855h += (long) i142;
                this.f9854g = i16;
            }
            if (i10 <= 0) {
                return true;
            }
            return false;
        }
    }

    public int a(j8 j8Var, qh qhVar) {
        b();
        if (this.f9831c == null) {
            nr a10 = or.a(j8Var);
            if (a10 != null) {
                int i10 = a10.f10016a;
                if (i10 == 17) {
                    this.f9831c = new a(this.f9829a, this.f9830b, a10);
                } else if (i10 == 6) {
                    this.f9831c = new c(this.f9829a, this.f9830b, a10, "audio/g711-alaw", -1);
                } else if (i10 == 7) {
                    this.f9831c = new c(this.f9829a, this.f9830b, a10, "audio/g711-mlaw", -1);
                } else {
                    int a11 = qr.a(i10, a10.f10021f);
                    if (a11 != 0) {
                        this.f9831c = new c(this.f9829a, this.f9830b, a10, "audio/raw", a11);
                    } else {
                        throw ah.a("Unsupported WAV format type: " + a10.f10016a);
                    }
                }
            } else {
                throw ah.a("Unsupported or unrecognized wav header.", (Throwable) null);
            }
        }
        if (this.f9832d == -1) {
            Pair b10 = or.b(j8Var);
            this.f9832d = ((Long) b10.first).intValue();
            long longValue = ((Long) b10.second).longValue();
            this.f9833e = longValue;
            this.f9831c.a(this.f9832d, longValue);
        } else if (j8Var.f() == 0) {
            j8Var.a(this.f9832d);
        }
        a1.b(this.f9833e != -1);
        if (this.f9831c.a(j8Var, this.f9833e - j8Var.f())) {
            return -1;
        }
        return 0;
    }

    private static final class a implements b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f9834m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f9835n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final k8 f9836a;

        /* renamed from: b  reason: collision with root package name */
        private final ro f9837b;

        /* renamed from: c  reason: collision with root package name */
        private final nr f9838c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9839d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f9840e;

        /* renamed from: f  reason: collision with root package name */
        private final yg f9841f;

        /* renamed from: g  reason: collision with root package name */
        private final int f9842g;

        /* renamed from: h  reason: collision with root package name */
        private final d9 f9843h;

        /* renamed from: i  reason: collision with root package name */
        private int f9844i;

        /* renamed from: j  reason: collision with root package name */
        private long f9845j;

        /* renamed from: k  reason: collision with root package name */
        private int f9846k;

        /* renamed from: l  reason: collision with root package name */
        private long f9847l;

        public a(k8 k8Var, ro roVar, nr nrVar) {
            this.f9836a = k8Var;
            this.f9837b = roVar;
            this.f9838c = nrVar;
            int max = Math.max(1, nrVar.f10018c / 10);
            this.f9842g = max;
            yg ygVar = new yg(nrVar.f10022g);
            ygVar.r();
            int r10 = ygVar.r();
            this.f9839d = r10;
            int i10 = nrVar.f10017b;
            int i11 = (((nrVar.f10020e - (i10 * 4)) * 8) / (nrVar.f10021f * i10)) + 1;
            if (r10 == i11) {
                int a10 = yp.a(max, r10);
                this.f9840e = new byte[(nrVar.f10020e * a10)];
                this.f9841f = new yg(a10 * a(r10, i10));
                int i12 = ((nrVar.f10018c * nrVar.f10020e) * 8) / r10;
                this.f9843h = new d9.b().f("audio/raw").b(i12).k(i12).i(a(max, i10)).c(nrVar.f10017b).n(nrVar.f10018c).j(2).a();
                return;
            }
            throw ah.a("Expected frames per block: " + i11 + "; got: " + r10, (Throwable) null);
        }

        private static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void a(byte[] bArr, int i10, yg ygVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f9838c.f10017b; i12++) {
                    a(bArr, i11, i12, ygVar.c());
                }
            }
            int b10 = b(this.f9839d * i10);
            ygVar.f(0);
            ygVar.e(b10);
        }

        private int b(int i10) {
            return a(i10, this.f9838c.f10017b);
        }

        private void c(int i10) {
            long c10 = this.f9845j + yp.c(this.f9847l, 1000000, (long) this.f9838c.f10018c);
            int b10 = b(i10);
            this.f9837b.a(c10, 1, b10, this.f9846k - b10, (ro.a) null);
            this.f9847l += (long) i10;
            this.f9846k -= b10;
        }

        private void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
            nr nrVar = this.f9838c;
            int i12 = nrVar.f10020e;
            int i13 = nrVar.f10017b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f9835n[min];
            int i19 = ((i10 * this.f9839d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b10 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)];
                int i21 = i20 % 2 == 0 ? b10 & Ascii.SI : (b10 & 255) >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = yp.a(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + f9834m[i21];
                int[] iArr = f9835n;
                min = yp.a(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        public void a(int i10, long j10) {
            this.f9836a.a(new pr(this.f9838c, this.f9839d, (long) i10, j10));
            this.f9837b.a(this.f9843h);
        }

        private int a(int i10) {
            return i10 / (this.f9838c.f10017b * 2);
        }

        public void a(long j10) {
            this.f9844i = 0;
            this.f9845j = j10;
            this.f9846k = 0;
            this.f9847l = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[EDGE_INSN: B:23:0x0040->B:11:0x0040 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(com.applovin.impl.j8 r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f9842g
                int r1 = r6.f9846k
                int r1 = r6.a((int) r1)
                int r0 = r0 - r1
                int r1 = r6.f9839d
                int r0 = com.applovin.impl.yp.a((int) r0, (int) r1)
                com.applovin.impl.nr r1 = r6.f9838c
                int r1 = r1.f10020e
                int r0 = r0 * r1
                r1 = 0
                int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r3 != 0) goto L_0x001d
                r2 = r6
                goto L_0x0038
            L_0x001d:
                r1 = 0
                r2 = r6
            L_0x001f:
                if (r1 != 0) goto L_0x0040
                int r3 = r2.f9844i
                if (r3 >= r0) goto L_0x0040
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r2.f9840e
                int r5 = r2.f9844i
                int r3 = r7.a(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x003a
            L_0x0038:
                r1 = 1
                goto L_0x001f
            L_0x003a:
                int r4 = r2.f9844i
                int r4 = r4 + r3
                r2.f9844i = r4
                goto L_0x001f
            L_0x0040:
                int r7 = r2.f9844i
                com.applovin.impl.nr r8 = r2.f9838c
                int r8 = r8.f10020e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0078
                byte[] r8 = r2.f9840e
                com.applovin.impl.yg r9 = r2.f9841f
                r2.a(r8, r7, r9)
                int r8 = r2.f9844i
                com.applovin.impl.nr r9 = r2.f9838c
                int r9 = r9.f10020e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r2.f9844i = r8
                com.applovin.impl.yg r7 = r2.f9841f
                int r7 = r7.e()
                com.applovin.impl.ro r8 = r2.f9837b
                com.applovin.impl.yg r9 = r2.f9841f
                r8.a(r9, r7)
                int r8 = r2.f9846k
                int r8 = r8 + r7
                r2.f9846k = r8
                int r7 = r2.a((int) r8)
                int r8 = r2.f9842g
                if (r7 < r8) goto L_0x0078
                r2.c(r8)
            L_0x0078:
                if (r1 == 0) goto L_0x0085
                int r7 = r2.f9846k
                int r7 = r2.a((int) r7)
                if (r7 <= 0) goto L_0x0085
                r2.c(r7)
            L_0x0085:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mr.a.a(com.applovin.impl.j8, long):boolean");
        }
    }

    public void a(long j10, long j11) {
        b bVar = this.f9831c;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    public boolean a(j8 j8Var) {
        return or.a(j8Var) != null;
    }
}
