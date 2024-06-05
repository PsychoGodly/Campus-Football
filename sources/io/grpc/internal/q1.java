package io.grpc.internal;

import dd.c;
import dd.f0;
import dd.g;
import dd.i0;
import dd.j0;
import dd.j1;
import dd.u0;
import dd.z0;
import io.grpc.internal.p;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import r6.i;

/* compiled from: OobChannel */
final class q1 extends u0 implements i0<Object> {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f35284k = Logger.getLogger(q1.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private y0 f35285a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f35286b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35287c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f35288d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f35289e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f35290f;

    /* renamed from: g  reason: collision with root package name */
    private final CountDownLatch f35291g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f35292h;

    /* renamed from: i  reason: collision with root package name */
    private final m f35293i;

    /* renamed from: j  reason: collision with root package name */
    private final p.e f35294j;

    public String a() {
        return this.f35287c;
    }

    public <RequestT, ResponseT> g<RequestT, ResponseT> f(z0<RequestT, ResponseT> z0Var, c cVar) {
        return new p(z0Var, cVar.e() == null ? this.f35289e : cVar.e(), cVar, this.f35294j, this.f35290f, this.f35293i, (f0) null);
    }

    public j0 g() {
        return this.f35286b;
    }

    public boolean i(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f35291g.await(j10, timeUnit);
    }

    public dd.p k(boolean z10) {
        y0 y0Var = this.f35285a;
        if (y0Var == null) {
            return dd.p.IDLE;
        }
        return y0Var.M();
    }

    public u0 m() {
        this.f35292h = true;
        this.f35288d.b(j1.f32248u.q("OobChannel.shutdown() called"));
        return this;
    }

    public u0 n() {
        this.f35292h = true;
        this.f35288d.d(j1.f32248u.q("OobChannel.shutdownNow() called"));
        return this;
    }

    /* access modifiers changed from: package-private */
    public y0 o() {
        return this.f35285a;
    }

    public String toString() {
        return i.c(this).c("logId", this.f35286b.d()).d("authority", this.f35287c).toString();
    }
}
