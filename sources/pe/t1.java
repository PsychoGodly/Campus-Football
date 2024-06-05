package pe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import sd.w;
import ue.d;
import xd.g;

/* compiled from: Executors.kt */
public final class t1 extends s1 implements z0 {

    /* renamed from: c  reason: collision with root package name */
    private final Executor f37403c;

    public t1(Executor executor) {
        this.f37403c = executor;
        d.a(b1());
    }

    private final void c1(g gVar, RejectedExecutionException rejectedExecutionException) {
        g2.c(gVar, r1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> d1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            c1(gVar, e10);
            return null;
        }
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        Executor b12 = b1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = b12 instanceof ScheduledExecutorService ? (ScheduledExecutorService) b12 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = d1(scheduledExecutorService, runnable, gVar, j10);
        }
        if (scheduledFuture != null) {
            return new h1(scheduledFuture);
        }
        return v0.f37406i.C0(j10, runnable, gVar);
    }

    public void X0(g gVar, Runnable runnable) {
        try {
            Executor b12 = b1();
            c.a();
            b12.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            c1(gVar, e10);
            g1.b().X0(gVar, runnable);
        }
    }

    public Executor b1() {
        return this.f37403c;
    }

    public void close() {
        Executor b12 = b1();
        ExecutorService executorService = b12 instanceof ExecutorService ? (ExecutorService) b12 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).b1() == b1();
    }

    public int hashCode() {
        return System.identityHashCode(b1());
    }

    public void q(long j10, o<? super w> oVar) {
        Executor b12 = b1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = b12 instanceof ScheduledExecutorService ? (ScheduledExecutorService) b12 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = d1(scheduledExecutorService, new w2(this, oVar), oVar.getContext(), j10);
        }
        if (scheduledFuture != null) {
            g2.g(oVar, scheduledFuture);
        } else {
            v0.f37406i.q(j10, oVar);
        }
    }

    public String toString() {
        return b1().toString();
    }
}
