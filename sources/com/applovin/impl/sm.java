package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class sm {

    /* renamed from: o  reason: collision with root package name */
    private static final ExecutorService f12119o = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f12120a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f12121b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12122c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12123d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12124e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12125f;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12126g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12127h;

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f12128i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f12129j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final List f12130k = new ArrayList(5);

    /* renamed from: l  reason: collision with root package name */
    private final Object f12131l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f12132m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12133n;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.applovin.impl.sm$b[] r0 = com.applovin.impl.sm.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12134a = r0
                com.applovin.impl.sm$b r1 = com.applovin.impl.sm.b.CORE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.impl.sm$b r1 = com.applovin.impl.sm.b.CACHING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.applovin.impl.sm$b r1 = com.applovin.impl.sm.b.MEDIATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.applovin.impl.sm$b r1 = com.applovin.impl.sm.b.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sm.a.<clinit>():void");
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private class c implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f12141a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                t unused = sm.this.f12121b;
                if (t.a()) {
                    sm.this.f12121b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        c(String str) {
            this.f12141a = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f12141a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) sm.this.f12120a.a(oj.R)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    private static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final k f12144a;

        /* renamed from: b  reason: collision with root package name */
        private final String f12145b;

        /* renamed from: c  reason: collision with root package name */
        private final t f12146c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final xl f12147d;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final b f12148f;

        public d(k kVar, xl xlVar, b bVar) {
            this.f12144a = kVar;
            this.f12146c = kVar.L();
            this.f12145b = xlVar.c();
            this.f12147d = xlVar;
            this.f12148f = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.x3.a()     // Catch:{ all -> 0x0080 }
                com.applovin.impl.sdk.k r1 = r6.f12144a     // Catch:{ all -> 0x0080 }
                boolean r1 = r1.A0()     // Catch:{ all -> 0x0080 }
                if (r1 == 0) goto L_0x0035
                com.applovin.impl.xl r1 = r6.f12147d     // Catch:{ all -> 0x0080 }
                boolean r1 = r1.d()     // Catch:{ all -> 0x0080 }
                if (r1 == 0) goto L_0x0016
                goto L_0x0035
            L_0x0016:
                boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0080 }
                if (r1 == 0) goto L_0x0025
                com.applovin.impl.sdk.t r1 = r6.f12146c     // Catch:{ all -> 0x0080 }
                java.lang.String r2 = r6.f12145b     // Catch:{ all -> 0x0080 }
                java.lang.String r3 = "Task re-scheduled..."
                r1.d(r2, r3)     // Catch:{ all -> 0x0080 }
            L_0x0025:
                com.applovin.impl.sdk.k r1 = r6.f12144a     // Catch:{ all -> 0x0080 }
                com.applovin.impl.sm r1 = r1.l0()     // Catch:{ all -> 0x0080 }
                com.applovin.impl.xl r2 = r6.f12147d     // Catch:{ all -> 0x0080 }
                com.applovin.impl.sm$b r3 = r6.f12148f     // Catch:{ all -> 0x0080 }
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a((com.applovin.impl.xl) r2, (com.applovin.impl.sm.b) r3, (long) r4)     // Catch:{ all -> 0x0080 }
                goto L_0x0058
            L_0x0035:
                com.applovin.impl.xl r1 = r6.f12147d     // Catch:{ all -> 0x0080 }
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0080 }
                com.applovin.impl.sdk.k r3 = r6.f12144a     // Catch:{ all -> 0x0080 }
                com.applovin.impl.oj r4 = com.applovin.impl.oj.L     // Catch:{ all -> 0x0080 }
                java.lang.Object r3 = r3.a((com.applovin.impl.oj) r4)     // Catch:{ all -> 0x0080 }
                java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0080 }
                long r3 = r3.longValue()     // Catch:{ all -> 0x0080 }
                java.util.concurrent.ScheduledFuture r1 = r1.b(r2, r3)     // Catch:{ all -> 0x0080 }
                com.applovin.impl.xl r2 = r6.f12147d     // Catch:{ all -> 0x0080 }
                r2.run()     // Catch:{ all -> 0x0080 }
                if (r1 == 0) goto L_0x0058
                r2 = 0
                r1.cancel(r2)     // Catch:{ all -> 0x0080 }
            L_0x0058:
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto L_0x00bc
                com.applovin.impl.sdk.t r1 = r6.f12146c
                java.lang.String r2 = r6.f12145b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f12148f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f12147d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
                goto L_0x00bc
            L_0x0080:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00bd }
                if (r2 == 0) goto L_0x0090
                com.applovin.impl.sdk.t r2 = r6.f12146c     // Catch:{ all -> 0x00bd }
                java.lang.String r3 = r6.f12145b     // Catch:{ all -> 0x00bd }
                java.lang.String r4 = "Task failed execution"
                r2.a(r3, r4, r1)     // Catch:{ all -> 0x00bd }
            L_0x0090:
                com.applovin.impl.xl r2 = r6.f12147d     // Catch:{ all -> 0x00bd }
                r2.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x00bd }
                boolean r1 = com.applovin.impl.sdk.t.a()
                if (r1 == 0) goto L_0x00bc
                com.applovin.impl.sdk.t r1 = r6.f12146c
                java.lang.String r2 = r6.f12145b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.sm$b r4 = r6.f12148f
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.xl r0 = r6.f12147d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
            L_0x00bc:
                return
            L_0x00bd:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.t.a()
                if (r2 == 0) goto L_0x00e5
                com.applovin.impl.sdk.t r2 = r6.f12146c
                java.lang.String r3 = r6.f12145b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sm$b r5 = r6.f12148f
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.xl r0 = r6.f12147d
                java.lang.String r0 = r0.c()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.d(r3, r0)
            L_0x00e5:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sm.d.run():void");
        }
    }

    public sm(k kVar) {
        this.f12120a = kVar;
        this.f12121b = kVar.L();
        this.f12133n = ((Boolean) kVar.a(oj.U)).booleanValue();
        this.f12122c = b("auxiliary_operations", ((Integer) kVar.a(oj.P)).intValue());
        this.f12123d = b("shared_thread_pool", ((Integer) kVar.a(oj.O)).intValue());
        this.f12124e = b("core", ((Integer) kVar.a(oj.V)).intValue());
        this.f12126g = b("caching", ((Integer) kVar.a(oj.W)).intValue());
        this.f12127h = b("mediation", ((Integer) kVar.a(oj.X)).intValue());
        this.f12125f = b("timeout", ((Integer) kVar.a(oj.Y)).intValue());
        this.f12128i = b("other", ((Integer) kVar.a(oj.Z)).intValue());
    }

    public Executor c() {
        return this.f12133n ? this.f12124e : this.f12123d;
    }

    public boolean d() {
        return this.f12132m;
    }

    public void e() {
        synchronized (this.f12131l) {
            this.f12132m = true;
            for (d dVar : this.f12130k) {
                a(dVar.f12147d, dVar.f12148f);
            }
            this.f12130k.clear();
        }
    }

    public void f() {
        synchronized (this.f12131l) {
            this.f12132m = false;
        }
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new c(str));
    }

    public ExecutorService b() {
        return this.f12133n ? this.f12126g : f12119o;
    }

    private boolean b(d dVar) {
        if (dVar.f12147d.d()) {
            return false;
        }
        synchronized (this.f12131l) {
            if (this.f12132m) {
                return false;
            }
            this.f12130k.add(dVar);
            return true;
        }
    }

    public void a(xl xlVar, b bVar) {
        a(xlVar, bVar, 0);
    }

    public void a(xl xlVar, b bVar, long j10) {
        a(xlVar, bVar, j10, false);
    }

    public void a(xl xlVar, b bVar, long j10, boolean z10) {
        if (xlVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j10 >= 0) {
            d dVar = new d(this.f12120a, xlVar, bVar);
            if (!b(dVar)) {
                a(dVar, j10, z10);
            } else if (t.a()) {
                this.f12121b.d(xlVar.c(), "Task execution delayed until after init");
            }
        } else {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
        }
    }

    public ScheduledFuture b(xl xlVar, b bVar, long j10) {
        if (this.f12133n) {
            return a(new d(this.f12120a, xlVar, bVar)).schedule(xlVar, j10, TimeUnit.MILLISECONDS);
        }
        return this.f12122c.schedule(xlVar, j10, TimeUnit.MILLISECONDS);
    }

    public void a(xl xlVar, ke keVar) {
        String b10 = keVar.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f12129j.get(b10);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b10, 1);
            this.f12129j.put(b10, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new d(this.f12120a, xlVar, b.MEDIATION));
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new c(str));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f12133n) {
            k kVar = this.f12120a;
            d dVar = new d(kVar, new kn(kVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f12122c.submit(runnable);
    }

    public void a(xl xlVar) {
        if (xlVar != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f12133n ? this.f12124e : this.f12123d;
            try {
                if (zp.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f12120a, xlVar, b.CORE));
                    return;
                }
                ScheduledFuture b10 = xlVar.b(Thread.currentThread(), ((Long) this.f12120a.a(oj.L)).longValue());
                xlVar.run();
                if (b10 != null) {
                    b10.cancel(false);
                }
            } catch (Throwable th) {
                if (t.a()) {
                    this.f12121b.a(xlVar.c(), "Task failed execution", th);
                }
                xlVar.a(th);
            }
        } else {
            throw new IllegalArgumentException("No task specified");
        }
    }

    public ExecutorService a() {
        return this.f12133n ? this.f12128i : this.f12122c;
    }

    private void a(d dVar, long j10, boolean z10) {
        ScheduledThreadPoolExecutor a10 = this.f12133n ? a(dVar) : this.f12123d;
        if (j10 <= 0) {
            a10.submit(dVar);
        } else if (z10) {
            w1.a(j10, this.f12120a, new b50(a10, dVar));
        } else {
            a10.schedule(dVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i10 = a.f12134a[dVar.f12148f.ordinal()];
        if (i10 == 1) {
            return this.f12124e;
        }
        if (i10 == 2) {
            return this.f12126g;
        }
        if (i10 == 3) {
            return this.f12127h;
        }
        if (i10 != 4) {
            return this.f12128i;
        }
        return this.f12125f;
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (t.a()) {
                t tVar = this.f12121b;
                tVar.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!t.a()) {
                return null;
            }
            this.f12121b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
