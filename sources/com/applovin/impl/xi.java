package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.ro;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

public class xi implements ro {
    private boolean A;
    private d9 B;
    private d9 C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final wi f13376a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13377b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final nk f13378c = new nk(w70.f13020a);

    /* renamed from: d  reason: collision with root package name */
    private final z6 f13379d;

    /* renamed from: e  reason: collision with root package name */
    private final y6.a f13380e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f13381f;

    /* renamed from: g  reason: collision with root package name */
    private d f13382g;

    /* renamed from: h  reason: collision with root package name */
    private d9 f13383h;

    /* renamed from: i  reason: collision with root package name */
    private x6 f13384i;

    /* renamed from: j  reason: collision with root package name */
    private int f13385j = 1000;

    /* renamed from: k  reason: collision with root package name */
    private int[] f13386k = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private long[] f13387l = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f13388m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private int[] f13389n = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private long[] f13390o = new long[1000];

    /* renamed from: p  reason: collision with root package name */
    private ro.a[] f13391p = new ro.a[1000];

    /* renamed from: q  reason: collision with root package name */
    private int f13392q;

    /* renamed from: r  reason: collision with root package name */
    private int f13393r;

    /* renamed from: s  reason: collision with root package name */
    private int f13394s;

    /* renamed from: t  reason: collision with root package name */
    private int f13395t;

    /* renamed from: u  reason: collision with root package name */
    private long f13396u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f13397v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private long f13398w = Long.MIN_VALUE;

    /* renamed from: x  reason: collision with root package name */
    private boolean f13399x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f13400y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f13401z = true;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13402a;

        /* renamed from: b  reason: collision with root package name */
        public long f13403b;

        /* renamed from: c  reason: collision with root package name */
        public ro.a f13404c;

        b() {
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d9 f13405a;

        /* renamed from: b  reason: collision with root package name */
        public final z6.b f13406b;

        private c(d9 d9Var, z6.b bVar) {
            this.f13405a = d9Var;
            this.f13406b = bVar;
        }
    }

    public interface d {
        void a(d9 d9Var);
    }

    protected xi(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        this.f13381f = looper;
        this.f13379d = z6Var;
        this.f13380e = aVar;
        this.f13376a = new wi(n0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f13392q     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f13397v     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.d()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.b((long) r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f13393r     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.b((int) r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long):boolean");
    }

    private int b(long j10) {
        int i10 = this.f13392q;
        int d10 = d(i10 - 1);
        while (i10 > this.f13395t && this.f13390o[d10] >= j10) {
            i10--;
            d10--;
            if (d10 == -1) {
                d10 = this.f13385j - 1;
            }
        }
        return i10;
    }

    private boolean h() {
        return this.f13395t != this.f13392q;
    }

    private void m() {
        x6 x6Var = this.f13384i;
        if (x6Var != null) {
            x6Var.a(this.f13380e);
            this.f13384i = null;
            this.f13383h = null;
        }
    }

    private synchronized void o() {
        this.f13395t = 0;
        this.f13376a.c();
    }

    public /* synthetic */ int a(e5 e5Var, int i10, boolean z10) {
        return j40.a(this, e5Var, i10, z10);
    }

    public /* synthetic */ void a(yg ygVar, int i10) {
        j40.b(this, ygVar, i10);
    }

    public final synchronized long c() {
        return this.f13398w;
    }

    public final synchronized long d() {
        return Math.max(this.f13397v, c(this.f13395t));
    }

    public final int e() {
        return this.f13393r + this.f13395t;
    }

    public final synchronized d9 f() {
        return this.f13401z ? null : this.C;
    }

    public final int g() {
        return this.f13393r + this.f13392q;
    }

    public final synchronized boolean i() {
        return this.f13399x;
    }

    public void j() {
        x6 x6Var = this.f13384i;
        if (x6Var != null && x6Var.b() == 1) {
            throw ((x6.a) a1.a((Object) this.f13384i.getError()));
        }
    }

    public void k() {
        b();
        m();
    }

    public void l() {
        b(true);
        m();
    }

    public final void n() {
        b(false);
    }

    private long c(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int d10 = d(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f13390o[d10]);
            if ((this.f13389n[d10] & 1) != 0) {
                break;
            }
            d10--;
            if (d10 == -1) {
                d10 = this.f13385j - 1;
            }
        }
        return j10;
    }

    private int d(int i10) {
        int i11 = this.f13394s + i10;
        int i12 = this.f13385j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean e(int i10) {
        x6 x6Var = this.f13384i;
        return x6Var == null || x6Var.b() == 4 || ((this.f13389n[i10] & 1073741824) == 0 && this.f13384i.c());
    }

    public final synchronized void f(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f13395t + i10 <= this.f13392q) {
                    z10 = true;
                    a1.a(z10);
                    this.f13395t += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        a1.a(z10);
        this.f13395t += i10;
    }

    public final void b(long j10, boolean z10, boolean z11) {
        this.f13376a.a(a(j10, z10, z11));
    }

    private synchronized void a(long j10, int i10, long j11, int i11, ro.a aVar) {
        z6.b bVar;
        int i12 = this.f13392q;
        if (i12 > 0) {
            int d10 = d(i12 - 1);
            a1.a(this.f13387l[d10] + ((long) this.f13388m[d10]) <= j11);
        }
        this.f13399x = (536870912 & i10) != 0;
        this.f13398w = Math.max(this.f13398w, j10);
        int d11 = d(this.f13392q);
        this.f13390o[d11] = j10;
        this.f13387l[d11] = j11;
        this.f13388m[d11] = i11;
        this.f13389n[d11] = i10;
        this.f13391p[d11] = aVar;
        this.f13386k[d11] = this.D;
        if (this.f13378c.c() || !((c) this.f13378c.b()).f13405a.equals(this.C)) {
            z6 z6Var = this.f13379d;
            if (z6Var != null) {
                bVar = z6Var.b((Looper) a1.a((Object) this.f13381f), this.f13380e, this.C);
            } else {
                bVar = z6.b.f13800a;
            }
            this.f13378c.a(g(), new c((d9) a1.a((Object) this.C), bVar));
        }
        int i13 = this.f13392q + 1;
        this.f13392q = i13;
        int i14 = this.f13385j;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            ro.a[] aVarArr = new ro.a[i15];
            int i16 = this.f13394s;
            int i17 = i14 - i16;
            System.arraycopy(this.f13387l, i16, jArr, 0, i17);
            System.arraycopy(this.f13390o, this.f13394s, jArr2, 0, i17);
            System.arraycopy(this.f13389n, this.f13394s, iArr2, 0, i17);
            System.arraycopy(this.f13388m, this.f13394s, iArr3, 0, i17);
            System.arraycopy(this.f13391p, this.f13394s, aVarArr, 0, i17);
            System.arraycopy(this.f13386k, this.f13394s, iArr, 0, i17);
            int i18 = this.f13394s;
            System.arraycopy(this.f13387l, 0, jArr, i17, i18);
            System.arraycopy(this.f13390o, 0, jArr2, i17, i18);
            System.arraycopy(this.f13389n, 0, iArr2, i17, i18);
            System.arraycopy(this.f13388m, 0, iArr3, i17, i18);
            System.arraycopy(this.f13391p, 0, aVarArr, i17, i18);
            System.arraycopy(this.f13386k, 0, iArr, i17, i18);
            this.f13387l = jArr;
            this.f13390o = jArr2;
            this.f13389n = iArr2;
            this.f13388m = iArr3;
            this.f13391p = aVarArr;
            this.f13386k = iArr;
            this.f13394s = 0;
            this.f13385j = i15;
        }
    }

    public final void c(long j10) {
        this.f13396u = j10;
    }

    private synchronized boolean c(d9 d9Var) {
        this.f13401z = false;
        if (yp.a((Object) d9Var, (Object) this.C)) {
            return false;
        }
        if (this.f13378c.c() || !((c) this.f13378c.b()).f13405a.equals(d9Var)) {
            this.C = d9Var;
        } else {
            this.C = ((c) this.f13378c.b()).f13405a;
        }
        d9 d9Var2 = this.C;
        this.E = df.a(d9Var2.f7153m, d9Var2.f7150j);
        this.F = false;
        return true;
    }

    public final void b() {
        this.f13376a.a(a());
    }

    private long b(int i10) {
        int g10 = g() - i10;
        boolean z10 = false;
        a1.a(g10 >= 0 && g10 <= this.f13392q - this.f13395t);
        int i11 = this.f13392q - g10;
        this.f13392q = i11;
        this.f13398w = Math.max(this.f13397v, c(i11));
        if (g10 == 0 && this.f13399x) {
            z10 = true;
        }
        this.f13399x = z10;
        this.f13378c.a(i10);
        int i12 = this.f13392q;
        if (i12 == 0) {
            return 0;
        }
        int d10 = d(i12 - 1);
        return this.f13387l[d10] + ((long) this.f13388m[d10]);
    }

    /* access modifiers changed from: protected */
    public d9 b(d9 d9Var) {
        return (this.G == 0 || d9Var.f7157q == Long.MAX_VALUE) ? d9Var : d9Var.a().a(d9Var.f7157q + this.G).a();
    }

    public void b(boolean z10) {
        this.f13376a.b();
        this.f13392q = 0;
        this.f13393r = 0;
        this.f13394s = 0;
        this.f13395t = 0;
        this.f13400y = true;
        this.f13396u = Long.MIN_VALUE;
        this.f13397v = Long.MIN_VALUE;
        this.f13398w = Long.MIN_VALUE;
        this.f13399x = false;
        this.f13378c.a();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f13401z = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.o()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f13395t     // Catch:{ all -> 0x0040 }
            int r2 = r8.d(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.h()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f13390o     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f13398w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f13392q     // Catch:{ all -> 0x0040 }
            int r0 = r8.f13395t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f13396u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f13395t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f13395t = r9     // Catch:{ all -> 0x0040 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.b(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long a(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f13392q     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f13390o     // Catch:{ all -> 0x002f }
            int r5 = r10.f13394s     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f13395t     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.a((int) r5, (int) r6, (long) r7, (boolean) r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.a((int) r11)     // Catch:{ all -> 0x002f }
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long, boolean, boolean):long");
    }

    private synchronized long a() {
        int i10 = this.f13392q;
        if (i10 == 0) {
            return -1;
        }
        return a(i10);
    }

    private long a(int i10) {
        this.f13397v = Math.max(this.f13397v, c(i10));
        this.f13392q -= i10;
        int i11 = this.f13393r + i10;
        this.f13393r = i11;
        int i12 = this.f13394s + i10;
        this.f13394s = i12;
        int i13 = this.f13385j;
        if (i12 >= i13) {
            this.f13394s = i12 - i13;
        }
        int i14 = this.f13395t - i10;
        this.f13395t = i14;
        if (i14 < 0) {
            this.f13395t = 0;
        }
        this.f13378c.b(i11);
        if (this.f13392q != 0) {
            return this.f13387l[this.f13394s];
        }
        int i15 = this.f13394s;
        if (i15 == 0) {
            i15 = this.f13385j;
        }
        int i16 = i15 - 1;
        return this.f13387l[i16] + ((long) this.f13388m[i16]);
    }

    private int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f13390o[i10] > j10 ? 1 : (this.f13390o[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f13389n[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f13385j) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final void a(d9 d9Var) {
        d9 b10 = b(d9Var);
        this.A = false;
        this.B = d9Var;
        boolean c10 = c(b10);
        d dVar = this.f13382g;
        if (dVar != null && c10) {
            dVar.a(b10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r9 != -1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f13395t     // Catch:{ all -> 0x003b }
            int r2 = r8.d(r0)     // Catch:{ all -> 0x003b }
            boolean r0 = r8.h()     // Catch:{ all -> 0x003b }
            r7 = 0
            if (r0 == 0) goto L_0x0039
            long[] r0 = r8.f13390o     // Catch:{ all -> 0x003b }
            r3 = r0[r2]     // Catch:{ all -> 0x003b }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            long r0 = r8.f13398w     // Catch:{ all -> 0x003b }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f13392q     // Catch:{ all -> 0x003b }
            int r10 = r8.f13395t     // Catch:{ all -> 0x003b }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f13392q     // Catch:{ all -> 0x003b }
            int r0 = r8.f13395t     // Catch:{ all -> 0x003b }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x003b }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0038
            return r7
        L_0x0038:
            return r9
        L_0x0039:
            monitor-exit(r8)
            return r7
        L_0x003b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.h()     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f13399x     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0018
            com.applovin.impl.d9 r3 = r2.C     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0017
            com.applovin.impl.d9 r0 = r2.f13383h     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            com.applovin.impl.nk r3 = r2.f13378c     // Catch:{ all -> 0x003a }
            int r0 = r2.e()     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.c(r0)     // Catch:{ all -> 0x003a }
            com.applovin.impl.xi$c r3 = (com.applovin.impl.xi.c) r3     // Catch:{ all -> 0x003a }
            com.applovin.impl.d9 r3 = r3.f13405a     // Catch:{ all -> 0x003a }
            com.applovin.impl.d9 r0 = r2.f13383h     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            int r3 = r2.f13395t     // Catch:{ all -> 0x003a }
            int r3 = r2.d(r3)     // Catch:{ all -> 0x003a }
            boolean r3 = r2.e(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(boolean):boolean");
    }

    private void a(d9 d9Var, e9 e9Var) {
        w6 w6Var;
        d9 d9Var2 = this.f13383h;
        boolean z10 = d9Var2 == null;
        if (z10) {
            w6Var = null;
        } else {
            w6Var = d9Var2.f7156p;
        }
        this.f13383h = d9Var;
        w6 w6Var2 = d9Var.f7156p;
        z6 z6Var = this.f13379d;
        e9Var.f7378b = z6Var != null ? d9Var.a(z6Var.a(d9Var)) : d9Var;
        e9Var.f7377a = this.f13384i;
        if (this.f13379d != null) {
            if (z10 || !yp.a((Object) w6Var, (Object) w6Var2)) {
                x6 x6Var = this.f13384i;
                x6 a10 = this.f13379d.a((Looper) a1.a((Object) this.f13381f), this.f13380e, d9Var);
                this.f13384i = a10;
                e9Var.f7377a = a10;
                if (x6Var != null) {
                    x6Var.a(this.f13380e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int a(com.applovin.impl.e9 r5, com.applovin.impl.n5 r6, boolean r7, boolean r8, com.applovin.impl.xi.b r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f9907d = r0     // Catch:{ all -> 0x0088 }
            boolean r0 = r4.h()     // Catch:{ all -> 0x0088 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r8 != 0) goto L_0x002b
            boolean r8 = r4.f13399x     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            com.applovin.impl.d9 r6 = r4.C     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x0029
            if (r7 != 0) goto L_0x001e
            com.applovin.impl.d9 r7 = r4.f13383h     // Catch:{ all -> 0x0088 }
            if (r6 == r7) goto L_0x0029
        L_0x001e:
            java.lang.Object r6 = com.applovin.impl.a1.a((java.lang.Object) r6)     // Catch:{ all -> 0x0088 }
            com.applovin.impl.d9 r6 = (com.applovin.impl.d9) r6     // Catch:{ all -> 0x0088 }
            r4.a((com.applovin.impl.d9) r6, (com.applovin.impl.e9) r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r5 = 4
            r6.e(r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0031:
            com.applovin.impl.nk r8 = r4.f13378c     // Catch:{ all -> 0x0088 }
            int r0 = r4.e()     // Catch:{ all -> 0x0088 }
            java.lang.Object r8 = r8.c(r0)     // Catch:{ all -> 0x0088 }
            com.applovin.impl.xi$c r8 = (com.applovin.impl.xi.c) r8     // Catch:{ all -> 0x0088 }
            com.applovin.impl.d9 r8 = r8.f13405a     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0083
            com.applovin.impl.d9 r7 = r4.f13383h     // Catch:{ all -> 0x0088 }
            if (r8 == r7) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            int r5 = r4.f13395t     // Catch:{ all -> 0x0088 }
            int r5 = r4.d(r5)     // Catch:{ all -> 0x0088 }
            boolean r7 = r4.e(r5)     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0057
            r5 = 1
            r6.f9907d = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r2
        L_0x0057:
            int[] r7 = r4.f13389n     // Catch:{ all -> 0x0088 }
            r7 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.e(r7)     // Catch:{ all -> 0x0088 }
            long[] r7 = r4.f13390o     // Catch:{ all -> 0x0088 }
            r0 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.f9908f = r0     // Catch:{ all -> 0x0088 }
            long r7 = r4.f13396u     // Catch:{ all -> 0x0088 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.b(r7)     // Catch:{ all -> 0x0088 }
        L_0x006f:
            int[] r6 = r4.f13388m     // Catch:{ all -> 0x0088 }
            r6 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f13402a = r6     // Catch:{ all -> 0x0088 }
            long[] r6 = r4.f13387l     // Catch:{ all -> 0x0088 }
            r7 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f13403b = r7     // Catch:{ all -> 0x0088 }
            com.applovin.impl.ro$a[] r6 = r4.f13391p     // Catch:{ all -> 0x0088 }
            r5 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f13404c = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0083:
            r4.a((com.applovin.impl.d9) r8, (com.applovin.impl.e9) r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0088:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(com.applovin.impl.e9, com.applovin.impl.n5, boolean, boolean, com.applovin.impl.xi$b):int");
    }

    public int a(e9 e9Var, n5 n5Var, int i10, boolean z10) {
        boolean z11 = false;
        int a10 = a(e9Var, n5Var, (i10 & 2) != 0, z10, this.f13377b);
        if (a10 == -4 && !n5Var.e()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f13376a.a(n5Var, this.f13377b);
                } else {
                    this.f13376a.b(n5Var, this.f13377b);
                }
            }
            if (!z11) {
                this.f13395t++;
            }
        }
        return a10;
    }

    public final int a(e5 e5Var, int i10, boolean z10, int i11) {
        return this.f13376a.a(e5Var, i10, z10);
    }

    public final void a(yg ygVar, int i10, int i11) {
        this.f13376a.a(ygVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r12, int r14, int r15, int r16, com.applovin.impl.ro.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x0010
            com.applovin.impl.d9 r0 = r8.B
            java.lang.Object r0 = com.applovin.impl.a1.b((java.lang.Object) r0)
            com.applovin.impl.d9 r0 = (com.applovin.impl.d9) r0
            r11.a((com.applovin.impl.d9) r0)
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
            boolean r4 = r8.f13400y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f13400y = r1
        L_0x0022:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f13396u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.F
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.applovin.impl.d9 r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.impl.kc.d(r6, r0)
            r8.F = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.H
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.a((long) r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.H = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            com.applovin.impl.wi r0 = r8.f13376a
            long r0 = r0.a()
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
            r0.a((long) r1, (int) r3, (long) r4, (int) r6, (com.applovin.impl.ro.a) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xi.a(long, int, int, int, com.applovin.impl.ro$a):void");
    }

    public final void a(d dVar) {
        this.f13382g = dVar;
    }

    public static xi a(n0 n0Var, Looper looper, z6 z6Var, y6.a aVar) {
        return new xi(n0Var, (Looper) a1.a((Object) looper), (z6) a1.a((Object) z6Var), (y6.a) a1.a((Object) aVar));
    }
}
