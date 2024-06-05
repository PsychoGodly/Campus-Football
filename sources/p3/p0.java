package p3;

import j4.i;
import java.io.IOException;
import k4.a0;
import k4.n0;
import k4.v;
import n2.r1;
import n2.s1;
import q2.g;
import r2.m;
import r2.o;
import r2.w;
import r2.y;
import s2.d0;
import s2.e0;

/* compiled from: SampleQueue */
public class p0 implements e0 {
    private r1 A;
    private r1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private final n0 f21579a;

    /* renamed from: b  reason: collision with root package name */
    private final b f21580b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final v0<c> f21581c = new v0<>(o0.f36870a);

    /* renamed from: d  reason: collision with root package name */
    private final y f21582d;

    /* renamed from: e  reason: collision with root package name */
    private final w.a f21583e;

    /* renamed from: f  reason: collision with root package name */
    private d f21584f;

    /* renamed from: g  reason: collision with root package name */
    private r1 f21585g;

    /* renamed from: h  reason: collision with root package name */
    private o f21586h;

    /* renamed from: i  reason: collision with root package name */
    private int f21587i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f21588j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f21589k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f21590l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f21591m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f21592n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    private e0.a[] f21593o = new e0.a[1000];

    /* renamed from: p  reason: collision with root package name */
    private int f21594p;

    /* renamed from: q  reason: collision with root package name */
    private int f21595q;

    /* renamed from: r  reason: collision with root package name */
    private int f21596r;

    /* renamed from: s  reason: collision with root package name */
    private int f21597s;

    /* renamed from: t  reason: collision with root package name */
    private long f21598t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f21599u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f21600v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private boolean f21601w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f21602x = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f21603y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f21604z;

    /* compiled from: SampleQueue */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f21605a;

        /* renamed from: b  reason: collision with root package name */
        public long f21606b;

        /* renamed from: c  reason: collision with root package name */
        public e0.a f21607c;

        b() {
        }
    }

    /* compiled from: SampleQueue */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final r1 f21608a;

        /* renamed from: b  reason: collision with root package name */
        public final y.b f21609b;

        private c(r1 r1Var, y.b bVar) {
            this.f21608a = r1Var;
            this.f21609b = bVar;
        }
    }

    /* compiled from: SampleQueue */
    public interface d {
        void a(r1 r1Var);
    }

    protected p0(j4.b bVar, y yVar, w.a aVar) {
        this.f21582d = yVar;
        this.f21583e = aVar;
        this.f21579a = new n0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D2 = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f21592n[D2]);
            if ((this.f21591m[D2] & 1) != 0) {
                break;
            }
            D2--;
            if (D2 == -1) {
                D2 = this.f21587i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f21596r + i10;
        int i12 = this.f21587i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f21597s != this.f21594p;
    }

    private boolean M(int i10) {
        o oVar = this.f21586h;
        return oVar == null || oVar.getState() == 4 || ((this.f21591m[i10] & 1073741824) == 0 && this.f21586h.c());
    }

    private void O(r1 r1Var, s1 s1Var) {
        m mVar;
        r1 r1Var2 = this.f21585g;
        boolean z10 = r1Var2 == null;
        if (z10) {
            mVar = null;
        } else {
            mVar = r1Var2.f20657p;
        }
        this.f21585g = r1Var;
        m mVar2 = r1Var.f20657p;
        y yVar = this.f21582d;
        s1Var.f20721b = yVar != null ? r1Var.c(yVar.b(r1Var)) : r1Var;
        s1Var.f20720a = this.f21586h;
        if (this.f21582d != null) {
            if (z10 || !n0.c(mVar, mVar2)) {
                o oVar = this.f21586h;
                o e10 = this.f21582d.e(this.f21583e, r1Var);
                this.f21586h = e10;
                s1Var.f20720a = e10;
                if (oVar != null) {
                    oVar.e(this.f21583e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int P(n2.s1 r6, q2.g r7, boolean r8, boolean r9, p3.p0.b r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f21756d = r0     // Catch:{ all -> 0x009a }
            boolean r0 = r5.H()     // Catch:{ all -> 0x009a }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r9 != 0) goto L_0x002b
            boolean r9 = r5.f21601w     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            n2.r1 r7 = r5.B     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x0029
            if (r8 != 0) goto L_0x001e
            n2.r1 r8 = r5.f21585g     // Catch:{ all -> 0x009a }
            if (r7 == r8) goto L_0x0029
        L_0x001e:
            java.lang.Object r7 = k4.a.e(r7)     // Catch:{ all -> 0x009a }
            n2.r1 r7 = (n2.r1) r7     // Catch:{ all -> 0x009a }
            r5.O(r7, r6)     // Catch:{ all -> 0x009a }
            monitor-exit(r5)
            return r1
        L_0x0029:
            monitor-exit(r5)
            return r2
        L_0x002b:
            r6 = 4
            r7.p(r6)     // Catch:{ all -> 0x009a }
            monitor-exit(r5)
            return r3
        L_0x0031:
            p3.v0<p3.p0$c> r0 = r5.f21581c     // Catch:{ all -> 0x009a }
            int r4 = r5.C()     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r0.e(r4)     // Catch:{ all -> 0x009a }
            p3.p0$c r0 = (p3.p0.c) r0     // Catch:{ all -> 0x009a }
            n2.r1 r0 = r0.f21608a     // Catch:{ all -> 0x009a }
            if (r8 != 0) goto L_0x0095
            n2.r1 r8 = r5.f21585g     // Catch:{ all -> 0x009a }
            if (r0 == r8) goto L_0x0046
            goto L_0x0095
        L_0x0046:
            int r6 = r5.f21597s     // Catch:{ all -> 0x009a }
            int r6 = r5.D(r6)     // Catch:{ all -> 0x009a }
            boolean r8 = r5.M(r6)     // Catch:{ all -> 0x009a }
            r0 = 1
            if (r8 != 0) goto L_0x0057
            r7.f21756d = r0     // Catch:{ all -> 0x009a }
            monitor-exit(r5)
            return r2
        L_0x0057:
            int[] r8 = r5.f21591m     // Catch:{ all -> 0x009a }
            r8 = r8[r6]     // Catch:{ all -> 0x009a }
            r7.p(r8)     // Catch:{ all -> 0x009a }
            int r8 = r5.f21597s     // Catch:{ all -> 0x009a }
            int r1 = r5.f21594p     // Catch:{ all -> 0x009a }
            int r1 = r1 - r0
            if (r8 != r1) goto L_0x0070
            if (r9 != 0) goto L_0x006b
            boolean r8 = r5.f21601w     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x0070
        L_0x006b:
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            r7.f(r8)     // Catch:{ all -> 0x009a }
        L_0x0070:
            long[] r8 = r5.f21592n     // Catch:{ all -> 0x009a }
            r0 = r8[r6]     // Catch:{ all -> 0x009a }
            r7.f21757f = r0     // Catch:{ all -> 0x009a }
            long r8 = r5.f21598t     // Catch:{ all -> 0x009a }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.f(r8)     // Catch:{ all -> 0x009a }
        L_0x0081:
            int[] r7 = r5.f21590l     // Catch:{ all -> 0x009a }
            r7 = r7[r6]     // Catch:{ all -> 0x009a }
            r10.f21605a = r7     // Catch:{ all -> 0x009a }
            long[] r7 = r5.f21589k     // Catch:{ all -> 0x009a }
            r8 = r7[r6]     // Catch:{ all -> 0x009a }
            r10.f21606b = r8     // Catch:{ all -> 0x009a }
            s2.e0$a[] r7 = r5.f21593o     // Catch:{ all -> 0x009a }
            r6 = r7[r6]     // Catch:{ all -> 0x009a }
            r10.f21607c = r6     // Catch:{ all -> 0x009a }
            monitor-exit(r5)
            return r3
        L_0x0095:
            r5.O(r0, r6)     // Catch:{ all -> 0x009a }
            monitor-exit(r5)
            return r1
        L_0x009a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.P(n2.s1, q2.g, boolean, boolean, p3.p0$b):int");
    }

    private void U() {
        o oVar = this.f21586h;
        if (oVar != null) {
            oVar.e(this.f21583e);
            this.f21586h = null;
            this.f21585g = null;
        }
    }

    private synchronized void X() {
        this.f21597s = 0;
        this.f21579a.o();
    }

    private synchronized boolean c0(r1 r1Var) {
        this.f21603y = false;
        if (n0.c(r1Var, this.B)) {
            return false;
        }
        if (this.f21581c.g() || !this.f21581c.f().f21608a.equals(r1Var)) {
            this.B = r1Var;
        } else {
            this.B = this.f21581c.f().f21608a;
        }
        r1 r1Var2 = this.B;
        this.D = v.a(r1Var2.f20654m, r1Var2.f20651j);
        this.E = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f21594p     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f21599u     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.A()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.j(r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f21595q     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.t(r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.h(long):boolean");
    }

    private synchronized void i(long j10, int i10, long j11, int i11, e0.a aVar) {
        y.b bVar;
        int i12 = this.f21594p;
        if (i12 > 0) {
            int D2 = D(i12 - 1);
            k4.a.a(this.f21589k[D2] + ((long) this.f21590l[D2]) <= j11);
        }
        this.f21601w = (536870912 & i10) != 0;
        this.f21600v = Math.max(this.f21600v, j10);
        int D3 = D(this.f21594p);
        this.f21592n[D3] = j10;
        this.f21589k[D3] = j11;
        this.f21590l[D3] = i11;
        this.f21591m[D3] = i10;
        this.f21593o[D3] = aVar;
        this.f21588j[D3] = this.C;
        if (this.f21581c.g() || !this.f21581c.f().f21608a.equals(this.B)) {
            y yVar = this.f21582d;
            if (yVar != null) {
                bVar = yVar.d(this.f21583e, this.B);
            } else {
                bVar = y.b.f22099a;
            }
            this.f21581c.a(G(), new c((r1) k4.a.e(this.B), bVar));
        }
        int i13 = this.f21594p + 1;
        this.f21594p = i13;
        int i14 = this.f21587i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            e0.a[] aVarArr = new e0.a[i15];
            int i16 = this.f21596r;
            int i17 = i14 - i16;
            System.arraycopy(this.f21589k, i16, jArr, 0, i17);
            System.arraycopy(this.f21592n, this.f21596r, jArr2, 0, i17);
            System.arraycopy(this.f21591m, this.f21596r, iArr2, 0, i17);
            System.arraycopy(this.f21590l, this.f21596r, iArr3, 0, i17);
            System.arraycopy(this.f21593o, this.f21596r, aVarArr, 0, i17);
            System.arraycopy(this.f21588j, this.f21596r, iArr, 0, i17);
            int i18 = this.f21596r;
            System.arraycopy(this.f21589k, 0, jArr, i17, i18);
            System.arraycopy(this.f21592n, 0, jArr2, i17, i18);
            System.arraycopy(this.f21591m, 0, iArr2, i17, i18);
            System.arraycopy(this.f21590l, 0, iArr3, i17, i18);
            System.arraycopy(this.f21593o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f21588j, 0, iArr, i17, i18);
            this.f21589k = jArr;
            this.f21592n = jArr2;
            this.f21591m = iArr2;
            this.f21590l = iArr3;
            this.f21593o = aVarArr;
            this.f21588j = iArr;
            this.f21596r = 0;
            this.f21587i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f21594p;
        int D2 = D(i10 - 1);
        while (i10 > this.f21597s && this.f21592n[D2] >= j10) {
            i10--;
            D2--;
            if (D2 == -1) {
                D2 = this.f21587i - 1;
            }
        }
        return i10;
    }

    public static p0 k(j4.b bVar, y yVar, w.a aVar) {
        return new p0(bVar, (y) k4.a.e(yVar), (w.a) k4.a.e(aVar));
    }

    public static p0 l(j4.b bVar) {
        return new p0(bVar, (y) null, (w.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f21594p     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f21592n     // Catch:{ all -> 0x002f }
            int r5 = r10.f21596r     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f21597s     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.v(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.p(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.m(long, boolean, boolean):long");
    }

    private synchronized long n() {
        int i10 = this.f21594p;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f21599u = Math.max(this.f21599u, B(i10));
        this.f21594p -= i10;
        int i11 = this.f21595q + i10;
        this.f21595q = i11;
        int i12 = this.f21596r + i10;
        this.f21596r = i12;
        int i13 = this.f21587i;
        if (i12 >= i13) {
            this.f21596r = i12 - i13;
        }
        int i14 = this.f21597s - i10;
        this.f21597s = i14;
        if (i14 < 0) {
            this.f21597s = 0;
        }
        this.f21581c.d(i11);
        if (this.f21594p != 0) {
            return this.f21589k[this.f21596r];
        }
        int i15 = this.f21596r;
        if (i15 == 0) {
            i15 = this.f21587i;
        }
        int i16 = i15 - 1;
        return this.f21589k[i16] + ((long) this.f21590l[i16]);
    }

    private long t(int i10) {
        int G2 = G() - i10;
        boolean z10 = false;
        k4.a.a(G2 >= 0 && G2 <= this.f21594p - this.f21597s);
        int i11 = this.f21594p - G2;
        this.f21594p = i11;
        this.f21600v = Math.max(this.f21599u, B(i11));
        if (G2 == 0 && this.f21601w) {
            z10 = true;
        }
        this.f21601w = z10;
        this.f21581c.c(i10);
        int i12 = this.f21594p;
        if (i12 == 0) {
            return 0;
        }
        int D2 = D(i12 - 1);
        return this.f21589k[D2] + ((long) this.f21590l[D2]);
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f21592n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f21591m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f21587i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f21599u, B(this.f21597s));
    }

    public final int C() {
        return this.f21595q + this.f21597s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int E(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f21597s     // Catch:{ all -> 0x003c }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.H()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f21592n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f21600v     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f21594p     // Catch:{ all -> 0x003c }
            int r10 = r8.f21597s     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f21594p     // Catch:{ all -> 0x003c }
            int r0 = r8.f21597s     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.E(long, boolean):int");
    }

    public final synchronized r1 F() {
        return this.f21603y ? null : this.B;
    }

    public final int G() {
        return this.f21595q + this.f21594p;
    }

    /* access modifiers changed from: protected */
    public final void I() {
        this.f21604z = true;
    }

    public final synchronized boolean J() {
        return this.f21601w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean K(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.H()     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f21601w     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0018
            n2.r1 r3 = r2.B     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0017
            n2.r1 r0 = r2.f21585g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            p3.v0<p3.p0$c> r3 = r2.f21581c     // Catch:{ all -> 0x003a }
            int r0 = r2.C()     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ all -> 0x003a }
            p3.p0$c r3 = (p3.p0.c) r3     // Catch:{ all -> 0x003a }
            n2.r1 r3 = r3.f21608a     // Catch:{ all -> 0x003a }
            n2.r1 r0 = r2.f21585g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            int r3 = r2.f21597s     // Catch:{ all -> 0x003a }
            int r3 = r2.D(r3)     // Catch:{ all -> 0x003a }
            boolean r3 = r2.M(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.K(boolean):boolean");
    }

    public void N() throws IOException {
        o oVar = this.f21586h;
        if (oVar != null && oVar.getState() == 1) {
            throw ((o.a) k4.a.e(this.f21586h.getError()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f21588j[D(this.f21597s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(s1 s1Var, g gVar, int i10, boolean z10) {
        boolean z11 = false;
        int P = P(s1Var, gVar, (i10 & 2) != 0, z10, this.f21580b);
        if (P == -4 && !gVar.l()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f21579a.f(gVar, this.f21580b);
                } else {
                    this.f21579a.m(gVar, this.f21580b);
                }
            }
            if (!z11) {
                this.f21597s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f21579a.n();
        this.f21594p = 0;
        this.f21595q = 0;
        this.f21596r = 0;
        this.f21597s = 0;
        this.f21602x = true;
        this.f21598t = Long.MIN_VALUE;
        this.f21599u = Long.MIN_VALUE;
        this.f21600v = Long.MIN_VALUE;
        this.f21601w = false;
        this.f21581c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f21603y = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        X();
        int i11 = this.f21595q;
        if (i10 >= i11) {
            if (i10 <= this.f21594p + i11) {
                this.f21598t = Long.MIN_VALUE;
                this.f21597s = i10 - i11;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean Z(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.X()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f21597s     // Catch:{ all -> 0x0040 }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.H()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f21592n     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f21600v     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f21594p     // Catch:{ all -> 0x0040 }
            int r0 = r8.f21597s     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f21598t = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f21597s     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f21597s = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.Z(long, boolean):boolean");
    }

    public final void a(r1 r1Var) {
        r1 w10 = w(r1Var);
        this.f21604z = false;
        this.A = r1Var;
        boolean c02 = c0(w10);
        d dVar = this.f21584f;
        if (dVar != null && c02) {
            dVar.a(w10);
        }
    }

    public final void a0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(long r12, int r14, int r15, int r16, s2.e0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f21604z
            if (r0 == 0) goto L_0x0010
            n2.r1 r0 = r8.A
            java.lang.Object r0 = k4.a.h(r0)
            n2.r1 r0 = (n2.r1) r0
            r11.a(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.f21602x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f21602x = r1
        L_0x0022:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f21598t
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            n2.r1 r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            k4.r.i(r6, r0)
            r8.E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            p3.n0 r0 = r8.f21579a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p0.b(long, int, int, int, s2.e0$a):void");
    }

    public final void b0(long j10) {
        this.f21598t = j10;
    }

    public final int c(i iVar, int i10, boolean z10, int i11) throws IOException {
        return this.f21579a.p(iVar, i10, z10);
    }

    public /* synthetic */ void d(a0 a0Var, int i10) {
        d0.b(this, a0Var, i10);
    }

    public final void d0(d dVar) {
        this.f21584f = dVar;
    }

    public /* synthetic */ int e(i iVar, int i10, boolean z10) {
        return d0.a(this, iVar, i10, z10);
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f21597s + i10 <= this.f21594p) {
                    z10 = true;
                    k4.a.a(z10);
                    this.f21597s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        k4.a.a(z10);
        this.f21597s += i10;
    }

    public final void f(a0 a0Var, int i10, int i11) {
        this.f21579a.q(a0Var, i10);
    }

    public final void f0(int i10) {
        this.C = i10;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f21597s;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f21579a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f21579a.b(n());
    }

    public final void s() {
        this.f21579a.b(o());
    }

    public final void u(int i10) {
        this.f21579a.c(t(i10));
    }

    /* access modifiers changed from: protected */
    public r1 w(r1 r1Var) {
        return (this.F == 0 || r1Var.f20658q == Long.MAX_VALUE) ? r1Var : r1Var.b().k0(r1Var.f20658q + this.F).G();
    }

    public final int x() {
        return this.f21595q;
    }

    public final synchronized long y() {
        return this.f21594p == 0 ? Long.MIN_VALUE : this.f21592n[this.f21596r];
    }

    public final synchronized long z() {
        return this.f21600v;
    }
}
