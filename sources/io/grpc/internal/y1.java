package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r6.t;

/* compiled from: Rescheduler */
final class y1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f35501a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f35502b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f35503c;

    /* renamed from: d  reason: collision with root package name */
    private final t f35504d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f35505e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f35506f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f35507g;

    /* compiled from: Rescheduler */
    private final class b implements Runnable {
        private b() {
        }

        public void run() {
            if (!y1.this.f35506f) {
                ScheduledFuture unused = y1.this.f35507g = null;
                return;
            }
            long e10 = y1.this.j();
            if (y1.this.f35505e - e10 > 0) {
                y1 y1Var = y1.this;
                ScheduledFuture unused2 = y1Var.f35507g = y1Var.f35501a.schedule(new c(), y1.this.f35505e - e10, TimeUnit.NANOSECONDS);
                return;
            }
            boolean unused3 = y1.this.f35506f = false;
            ScheduledFuture unused4 = y1.this.f35507g = null;
            y1.this.f35503c.run();
        }
    }

    /* compiled from: Rescheduler */
    private final class c implements Runnable {
        private c() {
        }

        public void run() {
            y1.this.f35502b.execute(new b());
        }
    }

    y1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.f35503c = runnable;
        this.f35502b = executor;
        this.f35501a = scheduledExecutorService;
        this.f35504d = tVar;
        tVar.g();
    }

    /* access modifiers changed from: private */
    public long j() {
        return this.f35504d.d(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        this.f35506f = false;
        if (z10 && (scheduledFuture = this.f35507g) != null) {
            scheduledFuture.cancel(false);
            this.f35507g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void k(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long j11 = j() + nanos;
        this.f35506f = true;
        if (j11 - this.f35505e < 0 || this.f35507g == null) {
            ScheduledFuture<?> scheduledFuture = this.f35507g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f35507g = this.f35501a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f35505e = j11;
    }
}
