package com.applovin.impl;

import com.applovin.impl.ep;
import java.util.Arrays;

public final class da implements o7 {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f7195q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f7196a;

    /* renamed from: b  reason: collision with root package name */
    private ro f7197b;

    /* renamed from: c  reason: collision with root package name */
    private final wp f7198c;

    /* renamed from: d  reason: collision with root package name */
    private final yg f7199d;

    /* renamed from: e  reason: collision with root package name */
    private final tf f7200e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f7201f;

    /* renamed from: g  reason: collision with root package name */
    private final a f7202g;

    /* renamed from: h  reason: collision with root package name */
    private long f7203h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7204i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7205j;

    /* renamed from: k  reason: collision with root package name */
    private long f7206k;

    /* renamed from: l  reason: collision with root package name */
    private long f7207l;

    /* renamed from: m  reason: collision with root package name */
    private long f7208m;

    /* renamed from: n  reason: collision with root package name */
    private long f7209n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7210o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7211p;

    public da() {
        this((wp) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.yg r21) {
        /*
            r20 = this;
            r0 = r20
            com.applovin.impl.ro r1 = r0.f7197b
            com.applovin.impl.a1.b((java.lang.Object) r1)
            int r1 = r21.d()
            int r2 = r21.e()
            byte[] r3 = r21.c()
            long r4 = r0.f7203h
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f7203h = r4
            com.applovin.impl.ro r4 = r0.f7197b
            int r5 = r21.a()
            r6 = r21
            r4.a(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f7201f
            int r4 = com.applovin.impl.uf.a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f7205j
            if (r4 != 0) goto L_0x0039
            com.applovin.impl.da$a r4 = r0.f7202g
            r4.a(r3, r1, r2)
        L_0x0039:
            com.applovin.impl.tf r4 = r0.f7200e
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.c()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f7205j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            com.applovin.impl.da$a r9 = r0.f7202g
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            com.applovin.impl.da$a r12 = r0.f7202g
            boolean r9 = r12.a(r5, r9)
            if (r9 == 0) goto L_0x008a
            com.applovin.impl.da$a r9 = r0.f7202g
            java.lang.String r12 = r0.f7196a
            java.lang.Object r12 = com.applovin.impl.a1.a((java.lang.Object) r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = a((com.applovin.impl.da.a) r9, (java.lang.String) r12)
            com.applovin.impl.ro r12 = r0.f7197b
            java.lang.Object r13 = r9.first
            com.applovin.impl.d9 r13 = (com.applovin.impl.d9) r13
            r12.a(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f7206k = r12
            r0.f7205j = r11
        L_0x008a:
            com.applovin.impl.tf r9 = r0.f7200e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = 0
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            com.applovin.impl.tf r8 = r0.f7200e
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L_0x00c6
            com.applovin.impl.tf r1 = r0.f7200e
            byte[] r8 = r1.f12406d
            int r1 = r1.f12407e
            int r1 = com.applovin.impl.uf.c(r8, r1)
            com.applovin.impl.yg r8 = r0.f7199d
            java.lang.Object r8 = com.applovin.impl.yp.a((java.lang.Object) r8)
            com.applovin.impl.yg r8 = (com.applovin.impl.yg) r8
            com.applovin.impl.tf r9 = r0.f7200e
            byte[] r9 = r9.f12406d
            r8.a((byte[]) r9, (int) r1)
            com.applovin.impl.wp r1 = r0.f7198c
            java.lang.Object r1 = com.applovin.impl.yp.a((java.lang.Object) r1)
            com.applovin.impl.wp r1 = (com.applovin.impl.wp) r1
            long r8 = r0.f7209n
            com.applovin.impl.yg r12 = r0.f7199d
            r1.a((long) r8, (com.applovin.impl.yg) r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.c()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            com.applovin.impl.tf r1 = r0.f7200e
            r1.b(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f7210o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f7211p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f7205j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f7209n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f7210o
            long r11 = r0.f7203h
            r19 = r5
            long r4 = r0.f7208m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            com.applovin.impl.ro r12 = r0.f7197b
            r18 = 0
            r17 = r1
            r12.a(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f7204i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f7211p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f7203h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f7208m = r4
            long r4 = r0.f7207l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f7209n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f7206k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f7209n = r4
            r0.f7210o = r10
            r0.f7207l = r8
            r1 = 1
            r0.f7204i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = 1
        L_0x0143:
            r0.f7211p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.yg):void");
    }

    public void b() {
    }

    da(wp wpVar) {
        this.f7198c = wpVar;
        this.f7201f = new boolean[4];
        this.f7202g = new a(128);
        if (wpVar != null) {
            this.f7200e = new tf(178, 128);
            this.f7199d = new yg();
        } else {
            this.f7200e = null;
            this.f7199d = null;
        }
        this.f7207l = -9223372036854775807L;
        this.f7209n = -9223372036854775807L;
    }

    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f7212e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f7213a;

        /* renamed from: b  reason: collision with root package name */
        public int f7214b;

        /* renamed from: c  reason: collision with root package name */
        public int f7215c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f7216d;

        public a(int i10) {
            this.f7216d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7213a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f7216d;
                int length = bArr2.length;
                int i13 = this.f7214b + i12;
                if (length < i13) {
                    this.f7216d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f7216d, this.f7214b, i12);
                this.f7214b += i12;
            }
        }

        public boolean a(int i10, int i11) {
            if (this.f7213a) {
                int i12 = this.f7214b - i11;
                this.f7214b = i12;
                if (this.f7215c == 0 && i10 == 181) {
                    this.f7215c = i12;
                } else {
                    this.f7213a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f7213a = true;
            }
            byte[] bArr = f7212e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f7213a = false;
            this.f7214b = 0;
            this.f7215c = 0;
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7196a = dVar.b();
        this.f7197b = k8Var.a(dVar.c(), 2);
        wp wpVar = this.f7198c;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    public void a(long j10, int i10) {
        this.f7207l = j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair a(com.applovin.impl.da.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f7216d
            int r1 = r8.f7214b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003c
            r7 = 3
            if (r6 == r7) goto L_0x0036
            if (r6 == r1) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0043
        L_0x0030:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0041
        L_0x0036:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0041
        L_0x003c:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0041:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0043:
            com.applovin.impl.d9$b r6 = new com.applovin.impl.d9$b
            r6.<init>()
            com.applovin.impl.d9$b r9 = r6.c((java.lang.String) r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.impl.d9$b r9 = r9.f((java.lang.String) r6)
            com.applovin.impl.d9$b r9 = r9.q((int) r2)
            com.applovin.impl.d9$b r9 = r9.g((int) r4)
            com.applovin.impl.d9$b r9 = r9.b((float) r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.impl.d9$b r9 = r9.a((java.util.List) r1)
            com.applovin.impl.d9 r9 = r9.a()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0099
            double[] r5 = f7195q
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0099
            r1 = r5[r4]
            int r8 = r8.f7215c
            int r8 = r8 + 9
            byte r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L_0x0092
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0092:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x0099:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.da$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        uf.a(this.f7201f);
        this.f7202g.a();
        tf tfVar = this.f7200e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f7203h = 0;
        this.f7204i = false;
        this.f7207l = -9223372036854775807L;
        this.f7209n = -9223372036854775807L;
    }
}
