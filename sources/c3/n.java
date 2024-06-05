package c3;

import c3.i0;
import java.util.Arrays;
import k4.a0;
import k4.w;
import s2.e0;

/* compiled from: H262Reader */
public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f5785q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f5786a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f5787b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f5788c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f5789d;

    /* renamed from: e  reason: collision with root package name */
    private final u f5790e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f5791f;

    /* renamed from: g  reason: collision with root package name */
    private final a f5792g;

    /* renamed from: h  reason: collision with root package name */
    private long f5793h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5794i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5795j;

    /* renamed from: k  reason: collision with root package name */
    private long f5796k;

    /* renamed from: l  reason: collision with root package name */
    private long f5797l;

    /* renamed from: m  reason: collision with root package name */
    private long f5798m;

    /* renamed from: n  reason: collision with root package name */
    private long f5799n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5800o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5801p;

    /* compiled from: H262Reader */
    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f5802e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f5803a;

        /* renamed from: b  reason: collision with root package name */
        public int f5804b;

        /* renamed from: c  reason: collision with root package name */
        public int f5805c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f5806d;

        public a(int i10) {
            this.f5806d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f5803a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f5806d;
                int length = bArr2.length;
                int i13 = this.f5804b;
                if (length < i13 + i12) {
                    this.f5806d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f5806d, this.f5804b, i12);
                this.f5804b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f5803a) {
                int i12 = this.f5804b - i11;
                this.f5804b = i12;
                if (this.f5805c == 0 && i10 == 181) {
                    this.f5805c = i12;
                } else {
                    this.f5803a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f5803a = true;
            }
            byte[] bArr = f5802e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f5803a = false;
            this.f5804b = 0;
            this.f5805c = 0;
        }
    }

    public n() {
        this((k0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<n2.r1, java.lang.Long> a(c3.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f5806d
            int r1 = r8.f5804b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            n2.r1$b r6 = new n2.r1$b
            r6.<init>()
            n2.r1$b r9 = r6.U(r9)
            java.lang.String r6 = "video/mpeg2"
            n2.r1$b r9 = r9.g0(r6)
            n2.r1$b r9 = r9.n0(r2)
            n2.r1$b r9 = r9.S(r4)
            n2.r1$b r9 = r9.c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            n2.r1$b r9 = r9.V(r1)
            n2.r1 r9 = r9.G()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x009d
            double[] r5 = f5785q
            int r6 = r5.length
            if (r4 >= r6) goto L_0x009d
            r1 = r5[r4]
            int r8 = r8.f5805c
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x0096
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0096:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x009d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.n.a(c3.n$a, java.lang.String):android.util.Pair");
    }

    public void b() {
        w.a(this.f5791f);
        this.f5792g.c();
        u uVar = this.f5790e;
        if (uVar != null) {
            uVar.d();
        }
        this.f5793h = 0;
        this.f5794i = false;
        this.f5797l = -9223372036854775807L;
        this.f5799n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(k4.a0 r21) {
        /*
            r20 = this;
            r0 = r20
            s2.e0 r1 = r0.f5787b
            k4.a.h(r1)
            int r1 = r21.f()
            int r2 = r21.g()
            byte[] r3 = r21.e()
            long r4 = r0.f5793h
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f5793h = r4
            s2.e0 r4 = r0.f5787b
            int r5 = r21.a()
            r6 = r21
            r4.d(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f5791f
            int r4 = k4.w.c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f5795j
            if (r4 != 0) goto L_0x0039
            c3.n$a r4 = r0.f5792g
            r4.a(r3, r1, r2)
        L_0x0039:
            c3.u r4 = r0.f5790e
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.e()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f5795j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            c3.n$a r9 = r0.f5792g
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            c3.n$a r12 = r0.f5792g
            boolean r9 = r12.b(r5, r9)
            if (r9 == 0) goto L_0x008a
            c3.n$a r9 = r0.f5792g
            java.lang.String r12 = r0.f5786a
            java.lang.Object r12 = k4.a.e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = a(r9, r12)
            s2.e0 r12 = r0.f5787b
            java.lang.Object r13 = r9.first
            n2.r1 r13 = (n2.r1) r13
            r12.a(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f5796k = r12
            r0.f5795j = r11
        L_0x008a:
            c3.u r9 = r0.f5790e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = 0
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            c3.u r8 = r0.f5790e
            boolean r1 = r8.b(r1)
            if (r1 == 0) goto L_0x00c6
            c3.u r1 = r0.f5790e
            byte[] r8 = r1.f5951d
            int r1 = r1.f5952e
            int r1 = k4.w.q(r8, r1)
            k4.a0 r8 = r0.f5789d
            java.lang.Object r8 = k4.n0.j(r8)
            k4.a0 r8 = (k4.a0) r8
            c3.u r9 = r0.f5790e
            byte[] r9 = r9.f5951d
            r8.R(r9, r1)
            c3.k0 r1 = r0.f5788c
            java.lang.Object r1 = k4.n0.j(r1)
            c3.k0 r1 = (c3.k0) r1
            long r8 = r0.f5799n
            k4.a0 r12 = r0.f5789d
            r1.a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.e()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            c3.u r1 = r0.f5790e
            r1.e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f5800o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f5801p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f5795j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f5799n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f5800o
            long r11 = r0.f5793h
            r19 = r5
            long r4 = r0.f5798m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            s2.e0 r12 = r0.f5787b
            r18 = 0
            r17 = r1
            r12.b(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f5794i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f5801p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f5793h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f5798m = r4
            long r4 = r0.f5797l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f5799n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f5796k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f5799n = r4
            r0.f5800o = r10
            r0.f5797l = r8
            r1 = 1
            r0.f5794i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = 1
        L_0x0143:
            r0.f5801p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.n.c(k4.a0):void");
    }

    public void d() {
    }

    public void e(s2.n nVar, i0.d dVar) {
        dVar.a();
        this.f5786a = dVar.b();
        this.f5787b = nVar.e(dVar.c(), 2);
        k0 k0Var = this.f5788c;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    public void f(long j10, int i10) {
        this.f5797l = j10;
    }

    n(k0 k0Var) {
        this.f5788c = k0Var;
        this.f5791f = new boolean[4];
        this.f5792g = new a(128);
        if (k0Var != null) {
            this.f5790e = new u(178, 128);
            this.f5789d = new a0();
        } else {
            this.f5790e = null;
            this.f5789d = null;
        }
        this.f5797l = -9223372036854775807L;
        this.f5799n = -9223372036854775807L;
    }
}
