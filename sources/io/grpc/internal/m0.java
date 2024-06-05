package io.grpc.internal;

import dd.c;
import dd.g;
import dd.p;
import dd.u0;
import dd.z0;
import java.util.concurrent.TimeUnit;
import r6.i;

/* compiled from: ForwardingManagedChannel */
abstract class m0 extends u0 {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f35178a;

    m0(u0 u0Var) {
        this.f35178a = u0Var;
    }

    public String a() {
        return this.f35178a.a();
    }

    public <RequestT, ResponseT> g<RequestT, ResponseT> f(z0<RequestT, ResponseT> z0Var, c cVar) {
        return this.f35178a.f(z0Var, cVar);
    }

    public boolean i(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f35178a.i(j10, timeUnit);
    }

    public void j() {
        this.f35178a.j();
    }

    public p k(boolean z10) {
        return this.f35178a.k(z10);
    }

    public void l(p pVar, Runnable runnable) {
        this.f35178a.l(pVar, runnable);
    }

    public u0 m() {
        return this.f35178a.m();
    }

    public u0 n() {
        return this.f35178a.n();
    }

    public String toString() {
        return i.c(this).d("delegate", this.f35178a).toString();
    }
}
