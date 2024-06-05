package io.grpc.internal;

import dd.g;
import dd.j1;
import dd.r;
import dd.t;
import dd.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.o;

/* compiled from: DelayedClientCall */
public class z<ReqT, RespT> extends dd.g<ReqT, RespT> {

    /* renamed from: j  reason: collision with root package name */
    private static final Logger f35510j = Logger.getLogger(z.class.getName());

    /* renamed from: k  reason: collision with root package name */
    private static final dd.g<Object, Object> f35511k = new i();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture<?> f35512a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f35513b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r f35514c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f35515d;

    /* renamed from: e  reason: collision with root package name */
    private g.a<RespT> f35516e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public dd.g<ReqT, RespT> f35517f;

    /* renamed from: g  reason: collision with root package name */
    private j1 f35518g;

    /* renamed from: h  reason: collision with root package name */
    private List<Runnable> f35519h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private k<RespT> f35520i;

    /* compiled from: DelayedClientCall */
    class a extends x {
        a(r rVar) {
            super(rVar);
        }

        public void a() {
            z.this.m();
        }
    }

    /* compiled from: DelayedClientCall */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f35522a;

        b(StringBuilder sb2) {
            this.f35522a = sb2;
        }

        public void run() {
            z.this.k(j1.f32237j.q(this.f35522a.toString()), true);
        }
    }

    /* compiled from: DelayedClientCall */
    class c extends x {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f35524b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(z.this.f35514c);
            this.f35524b = kVar;
        }

        public void a() {
            this.f35524b.g();
        }
    }

    /* compiled from: DelayedClientCall */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.a f35526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y0 f35527b;

        d(g.a aVar, y0 y0Var) {
            this.f35526a = aVar;
            this.f35527b = y0Var;
        }

        public void run() {
            z.this.f35517f.e(this.f35526a, this.f35527b);
        }
    }

    /* compiled from: DelayedClientCall */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f35529a;

        e(j1 j1Var) {
            this.f35529a = j1Var;
        }

        public void run() {
            z.this.f35517f.a(this.f35529a.n(), this.f35529a.l());
        }
    }

    /* compiled from: DelayedClientCall */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35531a;

        f(Object obj) {
            this.f35531a = obj;
        }

        public void run() {
            z.this.f35517f.d(this.f35531a);
        }
    }

    /* compiled from: DelayedClientCall */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35533a;

        g(int i10) {
            this.f35533a = i10;
        }

        public void run() {
            z.this.f35517f.c(this.f35533a);
        }
    }

    /* compiled from: DelayedClientCall */
    class h implements Runnable {
        h() {
        }

        public void run() {
            z.this.f35517f.b();
        }
    }

    /* compiled from: DelayedClientCall */
    class i extends dd.g<Object, Object> {
        i() {
        }

        public void a(String str, Throwable th) {
        }

        public void b() {
        }

        public void c(int i10) {
        }

        public void d(Object obj) {
        }

        public void e(g.a<Object> aVar, y0 y0Var) {
        }
    }

    /* compiled from: DelayedClientCall */
    private final class j extends x {

        /* renamed from: b  reason: collision with root package name */
        final g.a<RespT> f35536b;

        /* renamed from: c  reason: collision with root package name */
        final j1 f35537c;

        j(g.a<RespT> aVar, j1 j1Var) {
            super(z.this.f35514c);
            this.f35536b = aVar;
            this.f35537c = j1Var;
        }

        public void a() {
            this.f35536b.a(this.f35537c, new y0());
        }
    }

    /* compiled from: DelayedClientCall */
    private static final class k<RespT> extends g.a<RespT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final g.a<RespT> f35539a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f35540b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f35541c = new ArrayList();

        /* compiled from: DelayedClientCall */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y0 f35542a;

            a(y0 y0Var) {
                this.f35542a = y0Var;
            }

            public void run() {
                k.this.f35539a.b(this.f35542a);
            }
        }

        /* compiled from: DelayedClientCall */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f35544a;

            b(Object obj) {
                this.f35544a = obj;
            }

            public void run() {
                k.this.f35539a.c(this.f35544a);
            }
        }

        /* compiled from: DelayedClientCall */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f35546a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ y0 f35547b;

            c(j1 j1Var, y0 y0Var) {
                this.f35546a = j1Var;
                this.f35547b = y0Var;
            }

            public void run() {
                k.this.f35539a.a(this.f35546a, this.f35547b);
            }
        }

        /* compiled from: DelayedClientCall */
        class d implements Runnable {
            d() {
            }

            public void run() {
                k.this.f35539a.d();
            }
        }

        public k(g.a<RespT> aVar) {
            this.f35539a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (!this.f35540b) {
                    this.f35541c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        public void a(j1 j1Var, y0 y0Var) {
            f(new c(j1Var, y0Var));
        }

        public void b(y0 y0Var) {
            if (this.f35540b) {
                this.f35539a.b(y0Var);
            } else {
                f(new a(y0Var));
            }
        }

        public void c(RespT respt) {
            if (this.f35540b) {
                this.f35539a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        public void d() {
            if (this.f35540b) {
                this.f35539a.d();
            } else {
                f(new d());
            }
        }

        /* access modifiers changed from: package-private */
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
                java.util.List<java.lang.Runnable> r1 = r3.f35541c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f35541c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f35540b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f35541c     // Catch:{ all -> 0x0034 }
                r3.f35541c = r0     // Catch:{ all -> 0x0034 }
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
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.k.g():void");
        }
    }

    protected z(Executor executor, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f35513b = (Executor) o.p(executor, "callExecutor");
        o.p(scheduledExecutorService, "scheduler");
        this.f35514c = r.e();
        this.f35512a = o(scheduledExecutorService, tVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r4 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        l(new io.grpc.internal.z.e(r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2.f35513b.execute(new io.grpc.internal.z.j(r2, r0, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(dd.j1 r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            dd.g<ReqT, RespT> r0 = r2.f35517f     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0010
            dd.g<java.lang.Object, java.lang.Object> r4 = f35511k     // Catch:{ all -> 0x0035 }
            r2.q(r4)     // Catch:{ all -> 0x0035 }
            r4 = 0
            dd.g$a<RespT> r0 = r2.f35516e     // Catch:{ all -> 0x0035 }
            r2.f35518g = r3     // Catch:{ all -> 0x0035 }
            goto L_0x0016
        L_0x0010:
            if (r4 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0014:
            r4 = 1
            r0 = 0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0022
            io.grpc.internal.z$e r4 = new io.grpc.internal.z$e
            r4.<init>(r3)
            r2.l(r4)
            goto L_0x0031
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            java.util.concurrent.Executor r4 = r2.f35513b
            io.grpc.internal.z$j r1 = new io.grpc.internal.z$j
            r1.<init>(r0, r3)
            r4.execute(r1)
        L_0x002e:
            r2.m()
        L_0x0031:
            r2.j()
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.k(dd.j1, boolean):void");
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            if (!this.f35515d) {
                this.f35519h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.hasNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
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
        r3.f35513b.execute(new io.grpc.internal.z.c(r3, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f35519h     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0024
            r0 = 0
            r3.f35519h = r0     // Catch:{ all -> 0x0042 }
            r0 = 1
            r3.f35515d = r0     // Catch:{ all -> 0x0042 }
            io.grpc.internal.z$k<RespT> r0 = r3.f35520i     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            java.util.concurrent.Executor r1 = r3.f35513b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L_0x0023:
            return
        L_0x0024:
            java.util.List<java.lang.Runnable> r1 = r3.f35519h     // Catch:{ all -> 0x0042 }
            r3.f35519h = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r0 = r1.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x002d
        L_0x003d:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.m():void");
    }

    private boolean n(t tVar, t tVar2) {
        if (tVar2 == null) {
            return true;
        }
        if (tVar == null) {
            return false;
        }
        return tVar.g(tVar2);
    }

    private ScheduledFuture<?> o(ScheduledExecutorService scheduledExecutorService, t tVar) {
        t g10 = this.f35514c.g();
        if (tVar == null && g10 == null) {
            return null;
        }
        long j10 = Long.MAX_VALUE;
        if (tVar != null) {
            j10 = tVar.j(TimeUnit.NANOSECONDS);
        }
        if (g10 != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g10.j(timeUnit) < j10) {
                j10 = g10.j(timeUnit);
                Logger logger = f35510j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(j10)}));
                    if (tVar == null) {
                        sb2.append(" Explicit call timeout was not set.");
                    } else {
                        sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(tVar.j(timeUnit))}));
                    }
                    logger.fine(sb2.toString());
                }
            }
        }
        long abs = Math.abs(j10);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1);
        long abs2 = Math.abs(j10) % timeUnit2.toNanos(1);
        StringBuilder sb3 = new StringBuilder();
        String str = n(g10, tVar) ? "Context" : "CallOptions";
        if (j10 < 0) {
            sb3.append("ClientCall started after ");
            sb3.append(str);
            sb3.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb3.append("Deadline ");
            sb3.append(str);
            sb3.append(" will be exceeded in ");
        }
        sb3.append(nanos);
        sb3.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        sb3.append("s. ");
        return scheduledExecutorService.schedule(new b(sb3), j10, TimeUnit.NANOSECONDS);
    }

    private void q(dd.g<ReqT, RespT> gVar) {
        dd.g<ReqT, RespT> gVar2 = this.f35517f;
        o.x(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f35512a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f35517f = gVar;
    }

    public final void a(String str, Throwable th) {
        j1 j1Var;
        j1 j1Var2 = j1.f32234g;
        if (str != null) {
            j1Var = j1Var2.q(str);
        } else {
            j1Var = j1Var2.q("Call cancelled without message");
        }
        if (th != null) {
            j1Var = j1Var.p(th);
        }
        k(j1Var, false);
    }

    public final void b() {
        l(new h());
    }

    public final void c(int i10) {
        if (this.f35515d) {
            this.f35517f.c(i10);
        } else {
            l(new g(i10));
        }
    }

    public final void d(ReqT reqt) {
        if (this.f35515d) {
            this.f35517f.d(reqt);
        } else {
            l(new f(reqt));
        }
    }

    public final void e(g.a<RespT> aVar, y0 y0Var) {
        j1 j1Var;
        boolean z10;
        o.v(this.f35516e == null, "already started");
        synchronized (this) {
            this.f35516e = (g.a) o.p(aVar, "listener");
            j1Var = this.f35518g;
            z10 = this.f35515d;
            if (!z10) {
                k<RespT> kVar = new k<>(aVar);
                this.f35520i = kVar;
                aVar = kVar;
            }
        }
        if (j1Var != null) {
            this.f35513b.execute(new j(aVar, j1Var));
        } else if (z10) {
            this.f35517f.e(aVar, y0Var);
        } else {
            l(new d(aVar, y0Var));
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    public final Runnable p(dd.g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f35517f != null) {
                return null;
            }
            q((dd.g) o.p(gVar, "call"));
            return new a(this.f35514c);
        }
    }

    public String toString() {
        return r6.i.c(this).d("realCall", this.f35517f).toString();
    }
}
