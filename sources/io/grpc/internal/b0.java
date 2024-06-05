package io.grpc.internal;

import dd.j1;
import dd.t;
import dd.v;
import dd.y0;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DelayedStream */
class b0 implements q {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f34738a;

    /* renamed from: b  reason: collision with root package name */
    private r f34739b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public q f34740c;

    /* renamed from: d  reason: collision with root package name */
    private j1 f34741d;

    /* renamed from: e  reason: collision with root package name */
    private List<Runnable> f34742e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private o f34743f;

    /* renamed from: g  reason: collision with root package name */
    private long f34744g;

    /* renamed from: h  reason: collision with root package name */
    private long f34745h;

    /* renamed from: i  reason: collision with root package name */
    private List<Runnable> f34746i = new ArrayList();

    /* compiled from: DelayedStream */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34747a;

        a(int i10) {
            this.f34747a = i10;
        }

        public void run() {
            b0.this.f34740c.h(this.f34747a);
        }
    }

    /* compiled from: DelayedStream */
    class b implements Runnable {
        b() {
        }

        public void run() {
            b0.this.f34740c.d();
        }
    }

    /* compiled from: DelayedStream */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dd.n f34750a;

        c(dd.n nVar) {
            this.f34750a = nVar;
        }

        public void run() {
            b0.this.f34740c.a(this.f34750a);
        }
    }

    /* compiled from: DelayedStream */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34752a;

        d(boolean z10) {
            this.f34752a = z10;
        }

        public void run() {
            b0.this.f34740c.r(this.f34752a);
        }
    }

    /* compiled from: DelayedStream */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f34754a;

        e(v vVar) {
            this.f34754a = vVar;
        }

        public void run() {
            b0.this.f34740c.l(this.f34754a);
        }
    }

    /* compiled from: DelayedStream */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34756a;

        f(int i10) {
            this.f34756a = i10;
        }

        public void run() {
            b0.this.f34740c.i(this.f34756a);
        }
    }

    /* compiled from: DelayedStream */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34758a;

        g(int i10) {
            this.f34758a = i10;
        }

        public void run() {
            b0.this.f34740c.j(this.f34758a);
        }
    }

    /* compiled from: DelayedStream */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f34760a;

        h(t tVar) {
            this.f34760a = tVar;
        }

        public void run() {
            b0.this.f34740c.k(this.f34760a);
        }
    }

    /* compiled from: DelayedStream */
    class i implements Runnable {
        i() {
        }

        public void run() {
            b0.this.s();
        }
    }

    /* compiled from: DelayedStream */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34763a;

        j(String str) {
            this.f34763a = str;
        }

        public void run() {
            b0.this.f34740c.m(this.f34763a);
        }
    }

    /* compiled from: DelayedStream */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f34765a;

        k(InputStream inputStream) {
            this.f34765a = inputStream;
        }

        public void run() {
            b0.this.f34740c.c(this.f34765a);
        }
    }

    /* compiled from: DelayedStream */
    class l implements Runnable {
        l() {
        }

        public void run() {
            b0.this.f34740c.flush();
        }
    }

    /* compiled from: DelayedStream */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f34768a;

        m(j1 j1Var) {
            this.f34768a = j1Var;
        }

        public void run() {
            b0.this.f34740c.b(this.f34768a);
        }
    }

    /* compiled from: DelayedStream */
    class n implements Runnable {
        n() {
        }

        public void run() {
            b0.this.f34740c.o();
        }
    }

    /* compiled from: DelayedStream */
    private static class o implements r {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r f34771a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f34772b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f34773c = new ArrayList();

        /* compiled from: DelayedStream */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k2.a f34774a;

            a(k2.a aVar) {
                this.f34774a = aVar;
            }

            public void run() {
                o.this.f34771a.a(this.f34774a);
            }
        }

        /* compiled from: DelayedStream */
        class b implements Runnable {
            b() {
            }

            public void run() {
                o.this.f34771a.c();
            }
        }

        /* compiled from: DelayedStream */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y0 f34777a;

            c(y0 y0Var) {
                this.f34777a = y0Var;
            }

            public void run() {
                o.this.f34771a.b(this.f34777a);
            }
        }

        /* compiled from: DelayedStream */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f34779a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r.a f34780b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ y0 f34781c;

            d(j1 j1Var, r.a aVar, y0 y0Var) {
                this.f34779a = j1Var;
                this.f34780b = aVar;
                this.f34781c = y0Var;
            }

            public void run() {
                o.this.f34771a.d(this.f34779a, this.f34780b, this.f34781c);
            }
        }

        public o(r rVar) {
            this.f34771a = rVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (!this.f34772b) {
                    this.f34773c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        public void a(k2.a aVar) {
            if (this.f34772b) {
                this.f34771a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        public void b(y0 y0Var) {
            f(new c(y0Var));
        }

        public void c() {
            if (this.f34772b) {
                this.f34771a.c();
            } else {
                f(new b());
            }
        }

        public void d(j1 j1Var, r.a aVar, y0 y0Var) {
            f(new d(j1Var, aVar, y0Var));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            ((java.lang.Runnable) r0.next()).run();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f34773c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f34773c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f34772b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f34773c     // Catch:{ all -> 0x0034 }
                r3.f34773c = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002f
                java.lang.Object r2 = r0.next()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r2.run()
                goto L_0x001f
            L_0x002f:
                r1.clear()
                r0 = r1
                goto L_0x0005
            L_0x0034:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.o.g():void");
        }
    }

    b0() {
    }

    private void g(Runnable runnable) {
        r6.o.v(this.f34739b != null, "May only be called after start");
        synchronized (this) {
            if (!this.f34738a) {
                this.f34742e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f34742e     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r3.f34742e = r0     // Catch:{ all -> 0x003b }
            r0 = 1
            r3.f34738a = r0     // Catch:{ all -> 0x003b }
            io.grpc.internal.b0$o r0 = r3.f34743f     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001c
            r0.g()
        L_0x001c:
            return
        L_0x001d:
            java.util.List<java.lang.Runnable> r1 = r3.f34742e     // Catch:{ all -> 0x003b }
            r3.f34742e = r0     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            java.util.Iterator r0 = r1.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0026
        L_0x0036:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.s():void");
    }

    private void t(r rVar) {
        for (Runnable run : this.f34746i) {
            run.run();
        }
        this.f34746i = null;
        this.f34740c.q(rVar);
    }

    private void v(q qVar) {
        q qVar2 = this.f34740c;
        r6.o.x(qVar2 == null, "realStream already set to %s", qVar2);
        this.f34740c = qVar;
        this.f34745h = System.nanoTime();
    }

    public void a(dd.n nVar) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        r6.o.p(nVar, "compressor");
        this.f34746i.add(new c(nVar));
    }

    public void b(j1 j1Var) {
        boolean z10 = true;
        r6.o.v(this.f34739b != null, "May only be called after start");
        r6.o.p(j1Var, "reason");
        synchronized (this) {
            if (this.f34740c == null) {
                v(o1.f35223a);
                this.f34741d = j1Var;
                z10 = false;
            }
        }
        if (z10) {
            g(new m(j1Var));
            return;
        }
        s();
        u(j1Var);
        this.f34739b.d(j1Var, r.a.PROCESSED, new y0());
    }

    public void c(InputStream inputStream) {
        r6.o.v(this.f34739b != null, "May only be called after start");
        r6.o.p(inputStream, "message");
        if (this.f34738a) {
            this.f34740c.c(inputStream);
        } else {
            g(new k(inputStream));
        }
    }

    public void d() {
        r6.o.v(this.f34739b == null, "May only be called before start");
        this.f34746i.add(new b());
    }

    public void flush() {
        r6.o.v(this.f34739b != null, "May only be called after start");
        if (this.f34738a) {
            this.f34740c.flush();
        } else {
            g(new l());
        }
    }

    public void h(int i10) {
        r6.o.v(this.f34739b != null, "May only be called after start");
        if (this.f34738a) {
            this.f34740c.h(i10);
        } else {
            g(new a(i10));
        }
    }

    public void i(int i10) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        this.f34746i.add(new f(i10));
    }

    public boolean isReady() {
        if (this.f34738a) {
            return this.f34740c.isReady();
        }
        return false;
    }

    public void j(int i10) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        this.f34746i.add(new g(i10));
    }

    public void k(t tVar) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        this.f34746i.add(new h(tVar));
    }

    public void l(v vVar) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        r6.o.p(vVar, "decompressorRegistry");
        this.f34746i.add(new e(vVar));
    }

    public void m(String str) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        r6.o.p(str, "authority");
        this.f34746i.add(new j(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(io.grpc.internal.x0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.grpc.internal.r r0 = r5.f34739b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            io.grpc.internal.q r0 = r5.f34740c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.f34745h     // Catch:{ all -> 0x0036 }
            long r3 = r5.f34744g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.b(r0, r1)     // Catch:{ all -> 0x0036 }
            io.grpc.internal.q r0 = r5.f34740c     // Catch:{ all -> 0x0036 }
            r0.n(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.f34744g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.b(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.a(r0)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.n(io.grpc.internal.x0):void");
    }

    public void o() {
        r6.o.v(this.f34739b != null, "May only be called after start");
        g(new n());
    }

    public void q(r rVar) {
        j1 j1Var;
        boolean z10;
        r6.o.p(rVar, "listener");
        r6.o.v(this.f34739b == null, "already started");
        synchronized (this) {
            j1Var = this.f34741d;
            z10 = this.f34738a;
            if (!z10) {
                o oVar = new o(rVar);
                this.f34743f = oVar;
                rVar = oVar;
            }
            this.f34739b = rVar;
            this.f34744g = System.nanoTime();
        }
        if (j1Var != null) {
            rVar.d(j1Var, r.a.PROCESSED, new y0());
        } else if (z10) {
            t(rVar);
        }
    }

    public void r(boolean z10) {
        r6.o.v(this.f34739b == null, "May only be called before start");
        this.f34746i.add(new d(z10));
    }

    /* access modifiers changed from: protected */
    public void u(j1 j1Var) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        t(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return new io.grpc.internal.b0.i(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Runnable w(io.grpc.internal.q r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            io.grpc.internal.q r0 = r2.f34740c     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0008:
            java.lang.String r0 = "stream"
            java.lang.Object r3 = r6.o.p(r3, r0)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.q r3 = (io.grpc.internal.q) r3     // Catch:{ all -> 0x0029 }
            r2.v(r3)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.r r3 = r2.f34739b     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x001c
            r2.f34742e = r1     // Catch:{ all -> 0x0029 }
            r0 = 1
            r2.f34738a = r0     // Catch:{ all -> 0x0029 }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x0020
            return r1
        L_0x0020:
            r2.t(r3)
            io.grpc.internal.b0$i r3 = new io.grpc.internal.b0$i
            r3.<init>()
            return r3
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.w(io.grpc.internal.q):java.lang.Runnable");
    }
}
