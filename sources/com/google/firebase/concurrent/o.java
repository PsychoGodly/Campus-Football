package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DelegatingScheduledExecutorService */
class o implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f26398a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f26399b;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f26398a = executorService;
        this.f26399b = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(Runnable runnable, p.b bVar) {
        this.f26398a.execute(new l(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture p(Runnable runnable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f26399b.schedule(new i(this, runnable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Future r(Callable callable, p.b bVar) throws Exception {
        return this.f26398a.submit(new d(callable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture s(Callable callable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f26399b.schedule(new e(this, callable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(Runnable runnable, p.b bVar) {
        this.f26398a.execute(new m(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture v(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f26399b.scheduleAtFixedRate(new j(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(Runnable runnable, p.b bVar) {
        this.f26398a.execute(new n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture x(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f26399b.scheduleWithFixedDelay(new k(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f26398a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f26398a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f26398a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f26398a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f26398a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f26398a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new p(new g(this, runnable, j10, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new c(this, runnable, j10, j11, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new f(this, runnable, j10, j11, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f26398a.submit(callable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f26398a.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f26398a.invokeAny(collection, j10, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return new p(new h(this, callable, j10, timeUnit));
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f26398a.submit(runnable, t10);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f26398a.submit(runnable);
    }
}
