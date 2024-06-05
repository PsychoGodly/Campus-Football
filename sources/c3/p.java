package c3;

import android.util.SparseArray;
import c3.i0;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import k4.a0;
import k4.b0;
import k4.e;
import k4.n0;
import k4.w;
import n2.r1;
import s2.e0;
import s2.n;

/* compiled from: H264Reader */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f5833a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5834b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5835c;

    /* renamed from: d  reason: collision with root package name */
    private final u f5836d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f5837e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f5838f = new u(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f5839g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f5840h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f5841i;

    /* renamed from: j  reason: collision with root package name */
    private e0 f5842j;

    /* renamed from: k  reason: collision with root package name */
    private b f5843k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5844l;

    /* renamed from: m  reason: collision with root package name */
    private long f5845m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5846n;

    /* renamed from: o  reason: collision with root package name */
    private final a0 f5847o = new a0();

    /* compiled from: H264Reader */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final e0 f5848a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5849b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5850c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<w.c> f5851d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<w.b> f5852e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        private final b0 f5853f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f5854g;

        /* renamed from: h  reason: collision with root package name */
        private int f5855h;

        /* renamed from: i  reason: collision with root package name */
        private int f5856i;

        /* renamed from: j  reason: collision with root package name */
        private long f5857j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f5858k;

        /* renamed from: l  reason: collision with root package name */
        private long f5859l;

        /* renamed from: m  reason: collision with root package name */
        private a f5860m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f5861n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f5862o;

        /* renamed from: p  reason: collision with root package name */
        private long f5863p;

        /* renamed from: q  reason: collision with root package name */
        private long f5864q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f5865r;

        /* compiled from: H264Reader */
        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f5866a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f5867b;

            /* renamed from: c  reason: collision with root package name */
            private w.c f5868c;

            /* renamed from: d  reason: collision with root package name */
            private int f5869d;

            /* renamed from: e  reason: collision with root package name */
            private int f5870e;

            /* renamed from: f  reason: collision with root package name */
            private int f5871f;

            /* renamed from: g  reason: collision with root package name */
            private int f5872g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f5873h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f5874i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f5875j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f5876k;

            /* renamed from: l  reason: collision with root package name */
            private int f5877l;

            /* renamed from: m  reason: collision with root package name */
            private int f5878m;

            /* renamed from: n  reason: collision with root package name */
            private int f5879n;

            /* renamed from: o  reason: collision with root package name */
            private int f5880o;

            /* renamed from: p  reason: collision with root package name */
            private int f5881p;

            private a() {
            }

            /* access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f5866a) {
                    return false;
                }
                if (!aVar.f5866a) {
                    return true;
                }
                w.c cVar = (w.c) k4.a.h(this.f5868c);
                w.c cVar2 = (w.c) k4.a.h(aVar.f5868c);
                if (this.f5871f == aVar.f5871f && this.f5872g == aVar.f5872g && this.f5873h == aVar.f5873h && ((!this.f5874i || !aVar.f5874i || this.f5875j == aVar.f5875j) && (((i10 = this.f5869d) == (i11 = aVar.f5869d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f19811l) != 0 || cVar2.f19811l != 0 || (this.f5878m == aVar.f5878m && this.f5879n == aVar.f5879n)) && ((i12 != 1 || cVar2.f19811l != 1 || (this.f5880o == aVar.f5880o && this.f5881p == aVar.f5881p)) && (z10 = this.f5876k) == aVar.f5876k && (!z10 || this.f5877l == aVar.f5877l)))))) {
                    return false;
                }
                return true;
            }

            public void b() {
                this.f5867b = false;
                this.f5866a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f5870e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f5867b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f5870e
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
                throw new UnsupportedOperationException("Method not decompiled: c3.p.b.a.d():boolean");
            }

            public void e(w.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f5868c = cVar;
                this.f5869d = i10;
                this.f5870e = i11;
                this.f5871f = i12;
                this.f5872g = i13;
                this.f5873h = z10;
                this.f5874i = z11;
                this.f5875j = z12;
                this.f5876k = z13;
                this.f5877l = i14;
                this.f5878m = i15;
                this.f5879n = i16;
                this.f5880o = i17;
                this.f5881p = i18;
                this.f5866a = true;
                this.f5867b = true;
            }

            public void f(int i10) {
                this.f5870e = i10;
                this.f5867b = true;
            }
        }

        public b(e0 e0Var, boolean z10, boolean z11) {
            this.f5848a = e0Var;
            this.f5849b = z10;
            this.f5850c = z11;
            byte[] bArr = new byte[128];
            this.f5854g = bArr;
            this.f5853f = new b0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f5864q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f5865r;
                this.f5848a.b(j10, z10 ? 1 : 0, (int) (this.f5857j - this.f5863p), i10, (e0.a) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f5858k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f5854g
                int r4 = r3.length
                int r5 = r0.f5855h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f5854g = r3
            L_0x001e:
                byte[] r3 = r0.f5854g
                int r4 = r0.f5855h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f5855h
                int r1 = r1 + r2
                r0.f5855h = r1
                k4.b0 r2 = r0.f5853f
                byte[] r3 = r0.f5854g
                r4 = 0
                r2.i(r3, r4, r1)
                k4.b0 r1 = r0.f5853f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                k4.b0 r1 = r0.f5853f
                r1.k()
                k4.b0 r1 = r0.f5853f
                int r10 = r1.e(r7)
                k4.b0 r1 = r0.f5853f
                r2 = 5
                r1.l(r2)
                k4.b0 r1 = r0.f5853f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                k4.b0 r1 = r0.f5853f
                r1.h()
                k4.b0 r1 = r0.f5853f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                k4.b0 r1 = r0.f5853f
                int r11 = r1.h()
                boolean r1 = r0.f5850c
                if (r1 != 0) goto L_0x0079
                r0.f5858k = r4
                c3.p$b$a r1 = r0.f5861n
                r1.f(r11)
                return
            L_0x0079:
                k4.b0 r1 = r0.f5853f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                k4.b0 r1 = r0.f5853f
                int r13 = r1.h()
                android.util.SparseArray<k4.w$b> r1 = r0.f5852e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f5858k = r4
                return
            L_0x0093:
                android.util.SparseArray<k4.w$b> r1 = r0.f5852e
                java.lang.Object r1 = r1.get(r13)
                k4.w$b r1 = (k4.w.b) r1
                android.util.SparseArray<k4.w$c> r3 = r0.f5851d
                int r5 = r1.f19798b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                k4.w$c r9 = (k4.w.c) r9
                boolean r3 = r9.f19808i
                if (r3 == 0) goto L_0x00b8
                k4.b0 r3 = r0.f5853f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                k4.b0 r3 = r0.f5853f
                r3.l(r7)
            L_0x00b8:
                k4.b0 r3 = r0.f5853f
                int r5 = r9.f19810k
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                k4.b0 r3 = r0.f5853f
                int r5 = r9.f19810k
                int r12 = r3.e(r5)
                boolean r3 = r9.f19809j
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                k4.b0 r3 = r0.f5853f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                k4.b0 r3 = r0.f5853f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f5
                k4.b0 r6 = r0.f5853f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                k4.b0 r6 = r0.f5853f
                boolean r6 = r6.d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f5856i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                k4.b0 r2 = r0.f5853f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                k4.b0 r2 = r0.f5853f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f19811l
                if (r2 != 0) goto L_0x014e
                k4.b0 r2 = r0.f5853f
                int r3 = r9.f19812m
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                k4.b0 r2 = r0.f5853f
                int r3 = r9.f19812m
                int r2 = r2.e(r3)
                boolean r1 = r1.f19799c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                k4.b0 r1 = r0.f5853f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                k4.b0 r1 = r0.f5853f
                int r1 = r1.g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.f19813n
                if (r2 != 0) goto L_0x0188
                k4.b0 r2 = r0.f5853f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                k4.b0 r2 = r0.f5853f
                int r2 = r2.g()
                boolean r1 = r1.f19799c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                k4.b0 r1 = r0.f5853f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                k4.b0 r1 = r0.f5853f
                int r1 = r1.g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                c3.p$b$a r8 = r0.f5861n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f5858k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f5856i == 9 || (this.f5850c && this.f5861n.c(this.f5860m))) {
                if (z10 && this.f5862o) {
                    d(i10 + ((int) (j10 - this.f5857j)));
                }
                this.f5863p = this.f5857j;
                this.f5864q = this.f5859l;
                this.f5865r = false;
                this.f5862o = true;
            }
            if (this.f5849b) {
                z11 = this.f5861n.d();
            }
            boolean z13 = this.f5865r;
            int i11 = this.f5856i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f5865r = z14;
            return z14;
        }

        public boolean c() {
            return this.f5850c;
        }

        public void e(w.b bVar) {
            this.f5852e.append(bVar.f19797a, bVar);
        }

        public void f(w.c cVar) {
            this.f5851d.append(cVar.f19803d, cVar);
        }

        public void g() {
            this.f5858k = false;
            this.f5862o = false;
            this.f5861n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f5856i = i10;
            this.f5859l = j11;
            this.f5857j = j10;
            if (!this.f5849b || i10 != 1) {
                if (!this.f5850c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f5860m;
            this.f5860m = this.f5861n;
            this.f5861n = aVar;
            aVar.b();
            this.f5855h = 0;
            this.f5858k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f5833a = d0Var;
        this.f5834b = z10;
        this.f5835c = z11;
    }

    private void a() {
        k4.a.h(this.f5842j);
        n0.j(this.f5843k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f5844l || this.f5843k.c()) {
            this.f5836d.b(i11);
            this.f5837e.b(i11);
            if (!this.f5844l) {
                if (this.f5836d.c() && this.f5837e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f5836d;
                    arrayList.add(Arrays.copyOf(uVar.f5951d, uVar.f5952e));
                    u uVar2 = this.f5837e;
                    arrayList.add(Arrays.copyOf(uVar2.f5951d, uVar2.f5952e));
                    u uVar3 = this.f5836d;
                    w.c l10 = w.l(uVar3.f5951d, 3, uVar3.f5952e);
                    u uVar4 = this.f5837e;
                    w.b j12 = w.j(uVar4.f5951d, 3, uVar4.f5952e);
                    this.f5842j.a(new r1.b().U(this.f5841i).g0(MimeTypes.VIDEO_H264).K(e.a(l10.f19800a, l10.f19801b, l10.f19802c)).n0(l10.f19805f).S(l10.f19806g).c0(l10.f19807h).V(arrayList).G());
                    this.f5844l = true;
                    this.f5843k.f(l10);
                    this.f5843k.e(j12);
                    this.f5836d.d();
                    this.f5837e.d();
                }
            } else if (this.f5836d.c()) {
                u uVar5 = this.f5836d;
                this.f5843k.f(w.l(uVar5.f5951d, 3, uVar5.f5952e));
                this.f5836d.d();
            } else if (this.f5837e.c()) {
                u uVar6 = this.f5837e;
                this.f5843k.e(w.j(uVar6.f5951d, 3, uVar6.f5952e));
                this.f5837e.d();
            }
        }
        if (this.f5838f.b(i11)) {
            u uVar7 = this.f5838f;
            this.f5847o.R(this.f5838f.f5951d, w.q(uVar7.f5951d, uVar7.f5952e));
            this.f5847o.T(4);
            this.f5833a.a(j11, this.f5847o);
        }
        if (this.f5843k.b(j10, i10, this.f5844l, this.f5846n)) {
            this.f5846n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f5844l || this.f5843k.c()) {
            this.f5836d.a(bArr, i10, i11);
            this.f5837e.a(bArr, i10, i11);
        }
        this.f5838f.a(bArr, i10, i11);
        this.f5843k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f5844l || this.f5843k.c()) {
            this.f5836d.e(i10);
            this.f5837e.e(i10);
        }
        this.f5838f.e(i10);
        this.f5843k.h(j10, i10, j11);
    }

    public void b() {
        this.f5839g = 0;
        this.f5846n = false;
        this.f5845m = -9223372036854775807L;
        w.a(this.f5840h);
        this.f5836d.d();
        this.f5837e.d();
        this.f5838f.d();
        b bVar = this.f5843k;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void c(a0 a0Var) {
        a();
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        byte[] e10 = a0Var.e();
        this.f5839g += (long) a0Var.a();
        this.f5842j.d(a0Var, a0Var.a());
        while (true) {
            int c10 = w.c(e10, f10, g10, this.f5840h);
            if (c10 == g10) {
                h(e10, f10, g10);
                return;
            }
            int f11 = w.f(e10, c10);
            int i10 = c10 - f10;
            if (i10 > 0) {
                h(e10, f10, c10);
            }
            int i11 = g10 - c10;
            long j10 = this.f5839g - ((long) i11);
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f5845m);
            i(j10, f11, this.f5845m);
            f10 = c10 + 3;
        }
    }

    public void d() {
    }

    public void e(n nVar, i0.d dVar) {
        dVar.a();
        this.f5841i = dVar.b();
        e0 e10 = nVar.e(dVar.c(), 2);
        this.f5842j = e10;
        this.f5843k = new b(e10, this.f5834b, this.f5835c);
        this.f5833a.b(nVar, dVar);
    }

    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5845m = j10;
        }
        this.f5846n |= (i10 & 2) != 0;
    }
}
