package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledFuture<?> f26400i;

    /* compiled from: DelegatingScheduledFuture */
    class a implements b<V> {
        a() {
        }

        public void a(Throwable th) {
            boolean unused = p.this.r(th);
        }

        public void set(V v10) {
            boolean unused = p.this.q(v10);
        }
    }

    /* compiled from: DelegatingScheduledFuture */
    interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* compiled from: DelegatingScheduledFuture */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f26400i = cVar.a(new a());
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f26400i.cancel(t());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f26400i.getDelay(timeUnit);
    }

    /* renamed from: w */
    public int compareTo(Delayed delayed) {
        return this.f26400i.compareTo(delayed);
    }
}
