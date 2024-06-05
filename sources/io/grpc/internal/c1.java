package io.grpc.internal;

import dd.j1;
import io.grpc.internal.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r6.o;
import r6.t;
import w6.g;

/* compiled from: KeepAliveManager */
public class c1 {

    /* renamed from: l  reason: collision with root package name */
    private static final long f34824l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m  reason: collision with root package name */
    private static final long f34825m = TimeUnit.MILLISECONDS.toNanos(10);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f34826a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f34827b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f34828c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34829d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f34830e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ScheduledFuture<?> f34831f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f34832g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f34833h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f34834i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final long f34835j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final long f34836k;

    /* compiled from: KeepAliveManager */
    class a implements Runnable {
        a() {
        }

        public void run() {
            boolean z10;
            synchronized (c1.this) {
                e a10 = c1.this.f34830e;
                e eVar = e.DISCONNECTED;
                if (a10 != eVar) {
                    e unused = c1.this.f34830e = eVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c1.this.f34828c.a();
            }
        }
    }

    /* compiled from: KeepAliveManager */
    class b implements Runnable {
        b() {
        }

        public void run() {
            boolean z10;
            synchronized (c1.this) {
                ScheduledFuture unused = c1.this.f34832g = null;
                e a10 = c1.this.f34830e;
                e eVar = e.PING_SCHEDULED;
                if (a10 == eVar) {
                    z10 = true;
                    e unused2 = c1.this.f34830e = e.PING_SENT;
                    c1 c1Var = c1.this;
                    ScheduledFuture unused3 = c1Var.f34831f = c1Var.f34826a.schedule(c1.this.f34833h, c1.this.f34836k, TimeUnit.NANOSECONDS);
                } else {
                    if (c1.this.f34830e == e.PING_DELAYED) {
                        c1 c1Var2 = c1.this;
                        ScheduledExecutorService h10 = c1Var2.f34826a;
                        Runnable i10 = c1.this.f34834i;
                        long j10 = c1.this.f34835j;
                        t k10 = c1.this.f34827b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        ScheduledFuture unused4 = c1Var2.f34832g = h10.schedule(i10, j10 - k10.d(timeUnit), timeUnit);
                        e unused5 = c1.this.f34830e = eVar;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                c1.this.f34828c.b();
            }
        }
    }

    /* compiled from: KeepAliveManager */
    public static final class c implements d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final v f34839a;

        /* compiled from: KeepAliveManager */
        class a implements s.a {
            a() {
            }

            public void a(Throwable th) {
                c.this.f34839a.d(j1.f32248u.q("Keepalive failed. The connection is likely gone"));
            }

            public void b(long j10) {
            }
        }

        public c(v vVar) {
            this.f34839a = vVar;
        }

        public void a() {
            this.f34839a.d(j1.f32248u.q("Keepalive failed. The connection is likely gone"));
        }

        public void b() {
            this.f34839a.h(new a(), g.a());
        }
    }

    /* compiled from: KeepAliveManager */
    public interface d {
        void a();

        void b();
    }

    /* compiled from: KeepAliveManager */
    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public c1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, t.c(), j10, j11, z10);
    }

    public static long l(long j10) {
        return Math.max(j10, f34824l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m() {
        /*
            r5 = this;
            monitor-enter(r5)
            r6.t r0 = r5.f34827b     // Catch:{ all -> 0x004d }
            r6.t r0 = r0.f()     // Catch:{ all -> 0x004d }
            r0.g()     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r0 = r5.f34830e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r1 = io.grpc.internal.c1.e.PING_SCHEDULED     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x0015
            io.grpc.internal.c1$e r0 = io.grpc.internal.c1.e.PING_DELAYED     // Catch:{ all -> 0x004d }
            r5.f34830e = r0     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x0015:
            io.grpc.internal.c1$e r2 = io.grpc.internal.c1.e.PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 == r2) goto L_0x001d
            io.grpc.internal.c1$e r2 = io.grpc.internal.c1.e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r2) goto L_0x004b
        L_0x001d:
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f34831f     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0.cancel(r2)     // Catch:{ all -> 0x004d }
        L_0x0025:
            io.grpc.internal.c1$e r0 = r5.f34830e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r3 = io.grpc.internal.c1.e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r3) goto L_0x0031
            io.grpc.internal.c1$e r0 = io.grpc.internal.c1.e.IDLE     // Catch:{ all -> 0x004d }
            r5.f34830e = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0031:
            r5.f34830e = r1     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f34832g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            java.lang.String r0 = "There should be no outstanding pingFuture"
            r6.o.v(r2, r0)     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledExecutorService r0 = r5.f34826a     // Catch:{ all -> 0x004d }
            java.lang.Runnable r1 = r5.f34834i     // Catch:{ all -> 0x004d }
            long r2 = r5.f34835j     // Catch:{ all -> 0x004d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004d }
            r5.f34832g = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c1.m():void");
    }

    public synchronized void n() {
        e eVar = this.f34830e;
        if (eVar == e.IDLE) {
            this.f34830e = e.PING_SCHEDULED;
            if (this.f34832g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f34826a;
                Runnable runnable = this.f34834i;
                long j10 = this.f34835j;
                t tVar = this.f34827b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f34832g = scheduledExecutorService.schedule(runnable, j10 - tVar.d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f34830e = e.PING_SENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f34829d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            io.grpc.internal.c1$e r0 = r2.f34830e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = io.grpc.internal.c1.e.PING_SCHEDULED     // Catch:{ all -> 0x0021 }
            if (r0 == r1) goto L_0x0011
            io.grpc.internal.c1$e r1 = io.grpc.internal.c1.e.PING_DELAYED     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x0015
        L_0x0011:
            io.grpc.internal.c1$e r0 = io.grpc.internal.c1.e.IDLE     // Catch:{ all -> 0x0021 }
            r2.f34830e = r0     // Catch:{ all -> 0x0021 }
        L_0x0015:
            io.grpc.internal.c1$e r0 = r2.f34830e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = io.grpc.internal.c1.e.PING_SENT     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x001f
            io.grpc.internal.c1$e r0 = io.grpc.internal.c1.e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x0021 }
            r2.f34830e = r0     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c1.o():void");
    }

    public synchronized void p() {
        if (this.f34829d) {
            n();
        }
    }

    public synchronized void q() {
        e eVar = this.f34830e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f34830e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f34831f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f34832g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f34832g = null;
            }
        }
    }

    c1(d dVar, ScheduledExecutorService scheduledExecutorService, t tVar, long j10, long j11, boolean z10) {
        this.f34830e = e.IDLE;
        this.f34833h = new d1(new a());
        this.f34834i = new d1(new b());
        this.f34828c = (d) o.p(dVar, "keepAlivePinger");
        this.f34826a = (ScheduledExecutorService) o.p(scheduledExecutorService, "scheduler");
        this.f34827b = (t) o.p(tVar, "stopwatch");
        this.f34835j = j10;
        this.f34836k = j11;
        this.f34829d = z10;
        tVar.f().g();
    }
}
