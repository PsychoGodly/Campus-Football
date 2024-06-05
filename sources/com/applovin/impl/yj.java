package com.applovin.impl;

import java.util.ArrayDeque;

public abstract class yj implements k5 {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f13628a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13629b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque f13630c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque f13631d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final n5[] f13632e;

    /* renamed from: f  reason: collision with root package name */
    private final wg[] f13633f;

    /* renamed from: g  reason: collision with root package name */
    private int f13634g;

    /* renamed from: h  reason: collision with root package name */
    private int f13635h;

    /* renamed from: i  reason: collision with root package name */
    private n5 f13636i;

    /* renamed from: j  reason: collision with root package name */
    private m5 f13637j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13638k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13639l;

    /* renamed from: m  reason: collision with root package name */
    private int f13640m;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            yj.this.m();
        }
    }

    protected yj(n5[] n5VarArr, wg[] wgVarArr) {
        this.f13632e = n5VarArr;
        this.f13634g = n5VarArr.length;
        for (int i10 = 0; i10 < this.f13634g; i10++) {
            this.f13632e[i10] = f();
        }
        this.f13633f = wgVarArr;
        this.f13635h = wgVarArr.length;
        for (int i11 = 0; i11 < this.f13635h; i11++) {
            this.f13633f[i11] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f13628a = aVar;
        aVar.start();
    }

    private boolean e() {
        return !this.f13630c.isEmpty() && this.f13635h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.e() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.d() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.b(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r0 = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = a((java.lang.Throwable) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13629b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f13639l     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.e()     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f13629b     // Catch:{ all -> 0x0090 }
            r1.wait()     // Catch:{ all -> 0x0090 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f13639l     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r2
        L_0x001a:
            java.util.ArrayDeque r1 = r6.f13630c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0090 }
            com.applovin.impl.n5 r1 = (com.applovin.impl.n5) r1     // Catch:{ all -> 0x0090 }
            com.applovin.impl.wg[] r3 = r6.f13633f     // Catch:{ all -> 0x0090 }
            int r4 = r6.f13635h     // Catch:{ all -> 0x0090 }
            r5 = 1
            int r4 = r4 - r5
            r6.f13635h = r4     // Catch:{ all -> 0x0090 }
            r3 = r3[r4]     // Catch:{ all -> 0x0090 }
            boolean r4 = r6.f13638k     // Catch:{ all -> 0x0090 }
            r6.f13638k = r2     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.e()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.b(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.d()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.b(r0)
        L_0x0047:
            com.applovin.impl.m5 r0 = r6.a(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0052, OutOfMemoryError -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r0 = move-exception
            com.applovin.impl.m5 r0 = r6.a((java.lang.Throwable) r0)
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            com.applovin.impl.m5 r0 = r6.a((java.lang.Throwable) r0)
        L_0x0057:
            if (r0 == 0) goto L_0x0063
            java.lang.Object r4 = r6.f13629b
            monitor-enter(r4)
            r6.f13637j = r0     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0063:
            java.lang.Object r4 = r6.f13629b
            monitor-enter(r4)
            boolean r0 = r6.f13638k     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006e
            r3.g()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x006e:
            boolean r0 = r3.d()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x007d
            int r0 = r6.f13640m     // Catch:{ all -> 0x008d }
            int r0 = r0 + r5
            r6.f13640m = r0     // Catch:{ all -> 0x008d }
            r3.g()     // Catch:{ all -> 0x008d }
            goto L_0x0088
        L_0x007d:
            int r0 = r6.f13640m     // Catch:{ all -> 0x008d }
            r3.f13063c = r0     // Catch:{ all -> 0x008d }
            r6.f13640m = r2     // Catch:{ all -> 0x008d }
            java.util.ArrayDeque r0 = r6.f13631d     // Catch:{ all -> 0x008d }
            r0.addLast(r3)     // Catch:{ all -> 0x008d }
        L_0x0088:
            r6.b((com.applovin.impl.n5) r1)     // Catch:{ all -> 0x008d }
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            return r5
        L_0x008d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            throw r0
        L_0x0090:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yj.h():boolean");
    }

    private void k() {
        if (e()) {
            this.f13629b.notify();
        }
    }

    private void l() {
        m5 m5Var = this.f13637j;
        if (m5Var != null) {
            throw m5Var;
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (h());
    }

    /* access modifiers changed from: protected */
    public abstract m5 a(n5 n5Var, wg wgVar, boolean z10);

    /* access modifiers changed from: protected */
    public abstract m5 a(Throwable th);

    public final void b() {
        synchronized (this.f13629b) {
            this.f13638k = true;
            this.f13640m = 0;
            n5 n5Var = this.f13636i;
            if (n5Var != null) {
                b(n5Var);
                this.f13636i = null;
            }
            while (!this.f13630c.isEmpty()) {
                b((n5) this.f13630c.removeFirst());
            }
            while (!this.f13631d.isEmpty()) {
                ((wg) this.f13631d.removeFirst()).g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract n5 f();

    /* access modifiers changed from: protected */
    public abstract wg g();

    /* renamed from: i */
    public final n5 d() {
        n5 n5Var;
        synchronized (this.f13629b) {
            l();
            a1.b(this.f13636i == null);
            int i10 = this.f13634g;
            if (i10 == 0) {
                n5Var = null;
            } else {
                n5[] n5VarArr = this.f13632e;
                int i11 = i10 - 1;
                this.f13634g = i11;
                n5Var = n5VarArr[i11];
            }
            this.f13636i = n5Var;
        }
        return n5Var;
    }

    /* renamed from: j */
    public final wg c() {
        synchronized (this.f13629b) {
            l();
            if (this.f13631d.isEmpty()) {
                return null;
            }
            wg wgVar = (wg) this.f13631d.removeFirst();
            return wgVar;
        }
    }

    public final void a(n5 n5Var) {
        synchronized (this.f13629b) {
            l();
            a1.a(n5Var == this.f13636i);
            this.f13630c.addLast(n5Var);
            k();
            this.f13636i = null;
        }
    }

    public void a() {
        synchronized (this.f13629b) {
            this.f13639l = true;
            this.f13629b.notify();
        }
        try {
            this.f13628a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(n5 n5Var) {
        n5Var.b();
        n5[] n5VarArr = this.f13632e;
        int i10 = this.f13634g;
        this.f13634g = i10 + 1;
        n5VarArr[i10] = n5Var;
    }

    private void b(wg wgVar) {
        wgVar.b();
        wg[] wgVarArr = this.f13633f;
        int i10 = this.f13635h;
        this.f13635h = i10 + 1;
        wgVarArr[i10] = wgVar;
    }

    /* access modifiers changed from: protected */
    public void a(wg wgVar) {
        synchronized (this.f13629b) {
            b(wgVar);
            k();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i10) {
        a1.b(this.f13634g == this.f13632e.length);
        for (n5 g10 : this.f13632e) {
            g10.g(i10);
        }
    }
}
