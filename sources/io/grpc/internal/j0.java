package io.grpc.internal;

import dd.j1;
import dd.y0;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import r6.i;

/* compiled from: ForwardingClientStreamListener */
abstract class j0 implements r {
    j0() {
    }

    public void a(k2.a aVar) {
        e().a(aVar);
    }

    public void b(y0 y0Var) {
        e().b(y0Var);
    }

    public void c() {
        e().c();
    }

    public void d(j1 j1Var, r.a aVar, y0 y0Var) {
        e().d(j1Var, aVar, y0Var);
    }

    /* access modifiers changed from: protected */
    public abstract r e();

    public String toString() {
        return i.c(this).d("delegate", e()).toString();
    }
}
