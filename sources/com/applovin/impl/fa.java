package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import com.applovin.impl.uf;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class fa implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final jj f7655a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7656b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7657c;

    /* renamed from: d  reason: collision with root package name */
    private final tf f7658d = new tf(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final tf f7659e = new tf(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final tf f7660f = new tf(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f7661g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f7662h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f7663i;

    /* renamed from: j  reason: collision with root package name */
    private ro f7664j;

    /* renamed from: k  reason: collision with root package name */
    private b f7665k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7666l;

    /* renamed from: m  reason: collision with root package name */
    private long f7667m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7668n;

    /* renamed from: o  reason: collision with root package name */
    private final yg f7669o = new yg();

    public fa(jj jjVar, boolean z10, boolean z11) {
        this.f7655a = jjVar;
        this.f7656b = z10;
        this.f7657c = z11;
    }

    private void c() {
        a1.b((Object) this.f7664j);
        yp.a((Object) this.f7665k);
    }

    public void a(yg ygVar) {
        c();
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        byte[] c10 = ygVar.c();
        this.f7661g += (long) ygVar.a();
        this.f7664j.a(ygVar, ygVar.a());
        while (true) {
            int a10 = uf.a(c10, d10, e10, this.f7662h);
            if (a10 == e10) {
                a(c10, d10, e10);
                return;
            }
            int b10 = uf.b(c10, a10);
            int i10 = a10 - d10;
            if (i10 > 0) {
                a(c10, d10, a10);
            }
            int i11 = e10 - a10;
            long j10 = this.f7661g - ((long) i11);
            a(j10, i11, i10 < 0 ? -i10 : 0, this.f7667m);
            a(j10, b10, this.f7667m);
            d10 = a10 + 3;
        }
    }

    public void b() {
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7663i = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f7664j = a10;
        this.f7665k = new b(a10, this.f7656b, this.f7657c);
        this.f7655a.a(k8Var, dVar);
    }

    private void a(long j10, int i10, int i11, long j11) {
        if (!this.f7666l || this.f7665k.a()) {
            this.f7658d.a(i11);
            this.f7659e.a(i11);
            if (!this.f7666l) {
                if (this.f7658d.a() && this.f7659e.a()) {
                    ArrayList arrayList = new ArrayList();
                    tf tfVar = this.f7658d;
                    arrayList.add(Arrays.copyOf(tfVar.f12406d, tfVar.f12407e));
                    tf tfVar2 = this.f7659e;
                    arrayList.add(Arrays.copyOf(tfVar2.f12406d, tfVar2.f12407e));
                    tf tfVar3 = this.f7658d;
                    uf.b c10 = uf.c(tfVar3.f12406d, 3, tfVar3.f12407e);
                    tf tfVar4 = this.f7659e;
                    uf.a b10 = uf.b(tfVar4.f12406d, 3, tfVar4.f12407e);
                    this.f7664j.a(new d9.b().c(this.f7663i).f(MimeTypes.VIDEO_H264).a(m3.a(c10.f12568a, c10.f12569b, c10.f12570c)).q(c10.f12572e).g(c10.f12573f).b(c10.f12574g).a((List) arrayList).a());
                    this.f7666l = true;
                    this.f7665k.a(c10);
                    this.f7665k.a(b10);
                    this.f7658d.b();
                    this.f7659e.b();
                }
            } else if (this.f7658d.a()) {
                tf tfVar5 = this.f7658d;
                this.f7665k.a(uf.c(tfVar5.f12406d, 3, tfVar5.f12407e));
                this.f7658d.b();
            } else if (this.f7659e.a()) {
                tf tfVar6 = this.f7659e;
                this.f7665k.a(uf.b(tfVar6.f12406d, 3, tfVar6.f12407e));
                this.f7659e.b();
            }
        }
        if (this.f7660f.a(i11)) {
            tf tfVar7 = this.f7660f;
            this.f7669o.a(this.f7660f.f12406d, uf.c(tfVar7.f12406d, tfVar7.f12407e));
            this.f7669o.f(4);
            this.f7655a.a(j11, this.f7669o);
        }
        if (this.f7665k.a(j10, i10, this.f7666l, this.f7668n)) {
            this.f7668n = false;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ro f7670a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7671b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f7672c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray f7673d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray f7674e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        private final zg f7675f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f7676g;

        /* renamed from: h  reason: collision with root package name */
        private int f7677h;

        /* renamed from: i  reason: collision with root package name */
        private int f7678i;

        /* renamed from: j  reason: collision with root package name */
        private long f7679j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7680k;

        /* renamed from: l  reason: collision with root package name */
        private long f7681l;

        /* renamed from: m  reason: collision with root package name */
        private a f7682m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f7683n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f7684o;

        /* renamed from: p  reason: collision with root package name */
        private long f7685p;

        /* renamed from: q  reason: collision with root package name */
        private long f7686q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f7687r;

        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f7688a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f7689b;

            /* renamed from: c  reason: collision with root package name */
            private uf.b f7690c;

            /* renamed from: d  reason: collision with root package name */
            private int f7691d;

            /* renamed from: e  reason: collision with root package name */
            private int f7692e;

            /* renamed from: f  reason: collision with root package name */
            private int f7693f;

            /* renamed from: g  reason: collision with root package name */
            private int f7694g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f7695h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f7696i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f7697j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f7698k;

            /* renamed from: l  reason: collision with root package name */
            private int f7699l;

            /* renamed from: m  reason: collision with root package name */
            private int f7700m;

            /* renamed from: n  reason: collision with root package name */
            private int f7701n;

            /* renamed from: o  reason: collision with root package name */
            private int f7702o;

            /* renamed from: p  reason: collision with root package name */
            private int f7703p;

            private a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f7692e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean b() {
                /*
                    r2 = this;
                    boolean r0 = r2.f7689b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f7692e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.b.a.b():boolean");
            }

            public void a() {
                this.f7689b = false;
                this.f7688a = false;
            }

            /* access modifiers changed from: private */
            public boolean a(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f7688a) {
                    return false;
                }
                if (!aVar.f7688a) {
                    return true;
                }
                uf.b bVar = (uf.b) a1.b((Object) this.f7690c);
                uf.b bVar2 = (uf.b) a1.b((Object) aVar.f7690c);
                if (this.f7693f == aVar.f7693f && this.f7694g == aVar.f7694g && this.f7695h == aVar.f7695h && ((!this.f7696i || !aVar.f7696i || this.f7697j == aVar.f7697j) && (((i10 = this.f7691d) == (i11 = aVar.f7691d) || (i10 != 0 && i11 != 0)) && (((i12 = bVar.f12578k) != 0 || bVar2.f12578k != 0 || (this.f7700m == aVar.f7700m && this.f7701n == aVar.f7701n)) && ((i12 != 1 || bVar2.f12578k != 1 || (this.f7702o == aVar.f7702o && this.f7703p == aVar.f7703p)) && (z10 = this.f7698k) == aVar.f7698k && (!z10 || this.f7699l == aVar.f7699l)))))) {
                    return false;
                }
                return true;
            }

            public void a(uf.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f7690c = bVar;
                this.f7691d = i10;
                this.f7692e = i11;
                this.f7693f = i12;
                this.f7694g = i13;
                this.f7695h = z10;
                this.f7696i = z11;
                this.f7697j = z12;
                this.f7698k = z13;
                this.f7699l = i14;
                this.f7700m = i15;
                this.f7701n = i16;
                this.f7702o = i17;
                this.f7703p = i18;
                this.f7688a = true;
                this.f7689b = true;
            }

            public void a(int i10) {
                this.f7692e = i10;
                this.f7689b = true;
            }
        }

        public b(ro roVar, boolean z10, boolean z11) {
            this.f7670a = roVar;
            this.f7671b = z10;
            this.f7672c = z11;
            byte[] bArr = new byte[128];
            this.f7676g = bArr;
            this.f7675f = new zg(bArr, 0, 0);
            b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r23, int r24, int r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r24
                boolean r2 = r0.f7680k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r25 - r1
                byte[] r3 = r0.f7676g
                int r4 = r3.length
                int r5 = r0.f7677h
                int r5 = r5 + r2
                r6 = 2
                if (r4 >= r5) goto L_0x001c
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f7676g = r3
            L_0x001c:
                byte[] r3 = r0.f7676g
                int r4 = r0.f7677h
                r5 = r23
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f7677h
                int r1 = r1 + r2
                r0.f7677h = r1
                com.applovin.impl.zg r2 = r0.f7675f
                byte[] r3 = r0.f7676g
                r4 = 0
                r2.a(r3, r4, r1)
                com.applovin.impl.zg r1 = r0.f7675f
                r2 = 8
                boolean r1 = r1.a(r2)
                if (r1 != 0) goto L_0x003d
                return
            L_0x003d:
                com.applovin.impl.zg r1 = r0.f7675f
                r1.g()
                com.applovin.impl.zg r1 = r0.f7675f
                int r9 = r1.b(r6)
                com.applovin.impl.zg r1 = r0.f7675f
                r2 = 5
                r1.d(r2)
                com.applovin.impl.zg r1 = r0.f7675f
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x0057
                return
            L_0x0057:
                com.applovin.impl.zg r1 = r0.f7675f
                r1.f()
                com.applovin.impl.zg r1 = r0.f7675f
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x0065
                return
            L_0x0065:
                com.applovin.impl.zg r1 = r0.f7675f
                int r10 = r1.f()
                boolean r1 = r0.f7672c
                if (r1 != 0) goto L_0x0077
                r0.f7680k = r4
                com.applovin.impl.fa$b$a r1 = r0.f7683n
                r1.a((int) r10)
                return
            L_0x0077:
                com.applovin.impl.zg r1 = r0.f7675f
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x0080
                return
            L_0x0080:
                com.applovin.impl.zg r1 = r0.f7675f
                int r12 = r1.f()
                android.util.SparseArray r1 = r0.f7674e
                int r1 = r1.indexOfKey(r12)
                if (r1 >= 0) goto L_0x0091
                r0.f7680k = r4
                return
            L_0x0091:
                android.util.SparseArray r1 = r0.f7674e
                java.lang.Object r1 = r1.get(r12)
                com.applovin.impl.uf$a r1 = (com.applovin.impl.uf.a) r1
                android.util.SparseArray r3 = r0.f7673d
                int r5 = r1.f12566b
                java.lang.Object r3 = r3.get(r5)
                r8 = r3
                com.applovin.impl.uf$b r8 = (com.applovin.impl.uf.b) r8
                boolean r3 = r8.f12575h
                if (r3 == 0) goto L_0x00b6
                com.applovin.impl.zg r3 = r0.f7675f
                boolean r3 = r3.a(r6)
                if (r3 != 0) goto L_0x00b1
                return
            L_0x00b1:
                com.applovin.impl.zg r3 = r0.f7675f
                r3.d(r6)
            L_0x00b6:
                com.applovin.impl.zg r3 = r0.f7675f
                int r5 = r8.f12577j
                boolean r3 = r3.a(r5)
                if (r3 != 0) goto L_0x00c1
                return
            L_0x00c1:
                com.applovin.impl.zg r3 = r0.f7675f
                int r5 = r8.f12577j
                int r11 = r3.b(r5)
                boolean r3 = r8.f12576i
                r5 = 1
                if (r3 != 0) goto L_0x00f4
                com.applovin.impl.zg r3 = r0.f7675f
                boolean r3 = r3.a(r5)
                if (r3 != 0) goto L_0x00d7
                return
            L_0x00d7:
                com.applovin.impl.zg r3 = r0.f7675f
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x00f2
                com.applovin.impl.zg r6 = r0.f7675f
                boolean r6 = r6.a(r5)
                if (r6 != 0) goto L_0x00e8
                return
            L_0x00e8:
                com.applovin.impl.zg r6 = r0.f7675f
                boolean r6 = r6.c()
                r13 = r3
                r15 = r6
                r14 = 1
                goto L_0x00f7
            L_0x00f2:
                r13 = r3
                goto L_0x00f5
            L_0x00f4:
                r13 = 0
            L_0x00f5:
                r14 = 0
                r15 = 0
            L_0x00f7:
                int r3 = r0.f7678i
                if (r3 != r2) goto L_0x00fe
                r16 = 1
                goto L_0x0100
            L_0x00fe:
                r16 = 0
            L_0x0100:
                if (r16 == 0) goto L_0x0114
                com.applovin.impl.zg r2 = r0.f7675f
                boolean r2 = r2.b()
                if (r2 != 0) goto L_0x010b
                return
            L_0x010b:
                com.applovin.impl.zg r2 = r0.f7675f
                int r2 = r2.f()
                r17 = r2
                goto L_0x0116
            L_0x0114:
                r17 = 0
            L_0x0116:
                int r2 = r8.f12578k
                if (r2 != 0) goto L_0x014a
                com.applovin.impl.zg r2 = r0.f7675f
                int r3 = r8.f12579l
                boolean r2 = r2.a(r3)
                if (r2 != 0) goto L_0x0125
                return
            L_0x0125:
                com.applovin.impl.zg r2 = r0.f7675f
                int r3 = r8.f12579l
                int r2 = r2.b(r3)
                boolean r1 = r1.f12567c
                if (r1 == 0) goto L_0x0147
                if (r13 != 0) goto L_0x0147
                com.applovin.impl.zg r1 = r0.f7675f
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x013c
                return
            L_0x013c:
                com.applovin.impl.zg r1 = r0.f7675f
                int r1 = r1.e()
                r19 = r1
                r18 = r2
                goto L_0x0188
            L_0x0147:
                r18 = r2
                goto L_0x0186
            L_0x014a:
                if (r2 != r5) goto L_0x0184
                boolean r2 = r8.f12580m
                if (r2 != 0) goto L_0x0184
                com.applovin.impl.zg r2 = r0.f7675f
                boolean r2 = r2.b()
                if (r2 != 0) goto L_0x0159
                return
            L_0x0159:
                com.applovin.impl.zg r2 = r0.f7675f
                int r2 = r2.e()
                boolean r1 = r1.f12567c
                if (r1 == 0) goto L_0x017d
                if (r13 != 0) goto L_0x017d
                com.applovin.impl.zg r1 = r0.f7675f
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x016e
                return
            L_0x016e:
                com.applovin.impl.zg r1 = r0.f7675f
                int r1 = r1.e()
                r21 = r1
                r20 = r2
                r18 = 0
                r19 = 0
                goto L_0x018c
            L_0x017d:
                r20 = r2
                r18 = 0
                r19 = 0
                goto L_0x018a
            L_0x0184:
                r18 = 0
            L_0x0186:
                r19 = 0
            L_0x0188:
                r20 = 0
            L_0x018a:
                r21 = 0
            L_0x018c:
                com.applovin.impl.fa$b$a r7 = r0.f7683n
                r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r0.f7680k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.b.a(byte[], int, int):void");
        }

        public void b() {
            this.f7680k = false;
            this.f7684o = false;
            this.f7683n.a();
        }

        public boolean a(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f7678i == 9 || (this.f7672c && this.f7683n.a(this.f7682m))) {
                if (z10 && this.f7684o) {
                    a(i10 + ((int) (j10 - this.f7679j)));
                }
                this.f7685p = this.f7679j;
                this.f7686q = this.f7681l;
                this.f7687r = false;
                this.f7684o = true;
            }
            if (this.f7671b) {
                z11 = this.f7683n.b();
            }
            boolean z13 = this.f7687r;
            int i11 = this.f7678i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f7687r = z14;
            return z14;
        }

        public boolean a() {
            return this.f7672c;
        }

        private void a(int i10) {
            long j10 = this.f7686q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f7687r;
                this.f7670a.a(j10, z10 ? 1 : 0, (int) (this.f7679j - this.f7685p), i10, (ro.a) null);
            }
        }

        public void a(uf.a aVar) {
            this.f7674e.append(aVar.f12565a, aVar);
        }

        public void a(uf.b bVar) {
            this.f7673d.append(bVar.f12571d, bVar);
        }

        public void a(long j10, int i10, long j11) {
            this.f7678i = i10;
            this.f7681l = j11;
            this.f7679j = j10;
            if (!this.f7671b || i10 != 1) {
                if (!this.f7672c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f7682m;
            this.f7682m = this.f7683n;
            this.f7683n = aVar;
            aVar.a();
            this.f7677h = 0;
            this.f7680k = true;
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (!this.f7666l || this.f7665k.a()) {
            this.f7658d.a(bArr, i10, i11);
            this.f7659e.a(bArr, i10, i11);
        }
        this.f7660f.a(bArr, i10, i11);
        this.f7665k.a(bArr, i10, i11);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7667m = j10;
        }
        this.f7668n |= (i10 & 2) != 0;
    }

    public void a() {
        this.f7661g = 0;
        this.f7668n = false;
        this.f7667m = -9223372036854775807L;
        uf.a(this.f7662h);
        this.f7658d.b();
        this.f7659e.b();
        this.f7660f.b();
        b bVar = this.f7665k;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(long j10, int i10, long j11) {
        if (!this.f7666l || this.f7665k.a()) {
            this.f7658d.b(i10);
            this.f7659e.b(i10);
        }
        this.f7660f.b(i10);
        this.f7665k.a(j10, i10, j11);
    }
}
