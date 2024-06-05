package io.grpc.internal;

import dd.a1;
import r6.i;
import r6.o;

/* compiled from: ForwardingNameResolver */
abstract class n0 extends a1 {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f35201a;

    n0(a1 a1Var) {
        o.p(a1Var, "delegate can not be null");
        this.f35201a = a1Var;
    }

    public void b() {
        this.f35201a.b();
    }

    public void c() {
        this.f35201a.c();
    }

    public void d(a1.e eVar) {
        this.f35201a.d(eVar);
    }

    @Deprecated
    public void e(a1.f fVar) {
        this.f35201a.e(fVar);
    }

    public String toString() {
        return i.c(this).d("delegate", this.f35201a).toString();
    }
}
