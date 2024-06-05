package n2;

import android.os.Looper;
import k4.d;

/* compiled from: PlayerMessage */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    private final b f20509a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20510b;

    /* renamed from: c  reason: collision with root package name */
    private final d f20511c;

    /* renamed from: d  reason: collision with root package name */
    private final c4 f20512d;

    /* renamed from: e  reason: collision with root package name */
    private int f20513e;

    /* renamed from: f  reason: collision with root package name */
    private Object f20514f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f20515g;

    /* renamed from: h  reason: collision with root package name */
    private int f20516h;

    /* renamed from: i  reason: collision with root package name */
    private long f20517i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20518j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20519k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20520l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20521m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20522n;

    /* compiled from: PlayerMessage */
    public interface a {
        void a(k3 k3Var);
    }

    /* compiled from: PlayerMessage */
    public interface b {
        void p(int i10, Object obj) throws q;
    }

    public k3(a aVar, b bVar, c4 c4Var, int i10, d dVar, Looper looper) {
        this.f20510b = aVar;
        this.f20509a = bVar;
        this.f20512d = c4Var;
        this.f20515g = looper;
        this.f20511c = dVar;
        this.f20516h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC, Splitter:B:16:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f20519k     // Catch:{ all -> 0x0048 }
            k4.a.f(r0)     // Catch:{ all -> 0x0048 }
            android.os.Looper r0 = r6.f20515g     // Catch:{ all -> 0x0048 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0048 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            k4.a.f(r0)     // Catch:{ all -> 0x0048 }
            k4.d r0 = r6.f20511c     // Catch:{ all -> 0x0048 }
            long r0 = r0.b()     // Catch:{ all -> 0x0048 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f20521m     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
            k4.d r2 = r6.f20511c     // Catch:{ all -> 0x0048 }
            r2.e()     // Catch:{ all -> 0x0048 }
            r6.wait(r7)     // Catch:{ all -> 0x0048 }
            k4.d r7 = r6.f20511c     // Catch:{ all -> 0x0048 }
            long r7 = r7.b()     // Catch:{ all -> 0x0048 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            boolean r7 = r6.f20520l     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: n2.k3.a(long):boolean");
    }

    public boolean b() {
        return this.f20518j;
    }

    public Looper c() {
        return this.f20515g;
    }

    public int d() {
        return this.f20516h;
    }

    public Object e() {
        return this.f20514f;
    }

    public long f() {
        return this.f20517i;
    }

    public b g() {
        return this.f20509a;
    }

    public c4 h() {
        return this.f20512d;
    }

    public int i() {
        return this.f20513e;
    }

    public synchronized boolean j() {
        return this.f20522n;
    }

    public synchronized void k(boolean z10) {
        this.f20520l = z10 | this.f20520l;
        this.f20521m = true;
        notifyAll();
    }

    public k3 l() {
        k4.a.f(!this.f20519k);
        if (this.f20517i == -9223372036854775807L) {
            k4.a.a(this.f20518j);
        }
        this.f20519k = true;
        this.f20510b.a(this);
        return this;
    }

    public k3 m(Object obj) {
        k4.a.f(!this.f20519k);
        this.f20514f = obj;
        return this;
    }

    public k3 n(int i10) {
        k4.a.f(!this.f20519k);
        this.f20513e = i10;
        return this;
    }
}
