package com.applovin.impl;

import android.os.Looper;

public final class oh {

    /* renamed from: a  reason: collision with root package name */
    private final b f10244a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10245b;

    /* renamed from: c  reason: collision with root package name */
    private final j3 f10246c;

    /* renamed from: d  reason: collision with root package name */
    private final go f10247d;

    /* renamed from: e  reason: collision with root package name */
    private int f10248e;

    /* renamed from: f  reason: collision with root package name */
    private Object f10249f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f10250g;

    /* renamed from: h  reason: collision with root package name */
    private int f10251h;

    /* renamed from: i  reason: collision with root package name */
    private long f10252i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10253j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10254k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10255l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10256m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10257n;

    public interface a {
        void a(oh ohVar);
    }

    public interface b {
        void a(int i10, Object obj);
    }

    public oh(a aVar, b bVar, go goVar, int i10, j3 j3Var, Looper looper) {
        this.f10245b = aVar;
        this.f10244a = bVar;
        this.f10247d = goVar;
        this.f10250g = looper;
        this.f10246c = j3Var;
        this.f10251h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC, Splitter:B:16:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f10254k     // Catch:{ all -> 0x0048 }
            com.applovin.impl.a1.b((boolean) r0)     // Catch:{ all -> 0x0048 }
            android.os.Looper r0 = r6.f10250g     // Catch:{ all -> 0x0048 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0048 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.applovin.impl.a1.b((boolean) r0)     // Catch:{ all -> 0x0048 }
            com.applovin.impl.j3 r0 = r6.f10246c     // Catch:{ all -> 0x0048 }
            long r0 = r0.c()     // Catch:{ all -> 0x0048 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f10256m     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
            com.applovin.impl.j3 r2 = r6.f10246c     // Catch:{ all -> 0x0048 }
            r2.b()     // Catch:{ all -> 0x0048 }
            r6.wait(r7)     // Catch:{ all -> 0x0048 }
            com.applovin.impl.j3 r7 = r6.f10246c     // Catch:{ all -> 0x0048 }
            long r7 = r7.c()     // Catch:{ all -> 0x0048 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            boolean r7 = r6.f10255l     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return r7
        L_0x0040:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0048 }
            throw r7     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.oh.a(long):boolean");
    }

    public Looper b() {
        return this.f10250g;
    }

    public Object c() {
        return this.f10249f;
    }

    public long d() {
        return this.f10252i;
    }

    public b e() {
        return this.f10244a;
    }

    public go f() {
        return this.f10247d;
    }

    public int g() {
        return this.f10248e;
    }

    public int h() {
        return this.f10251h;
    }

    public synchronized boolean i() {
        return this.f10257n;
    }

    public oh j() {
        a1.b(!this.f10254k);
        if (this.f10252i == -9223372036854775807L) {
            a1.a(this.f10253j);
        }
        this.f10254k = true;
        this.f10245b.a(this);
        return this;
    }

    public boolean a() {
        return this.f10253j;
    }

    public synchronized void a(boolean z10) {
        this.f10255l = z10 | this.f10255l;
        this.f10256m = true;
        notifyAll();
    }

    public oh a(Object obj) {
        a1.b(!this.f10254k);
        this.f10249f = obj;
        return this;
    }

    public oh a(int i10) {
        a1.b(!this.f10254k);
        this.f10248e = i10;
        return this;
    }
}
