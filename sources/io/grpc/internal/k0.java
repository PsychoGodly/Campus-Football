package io.grpc.internal;

import dd.c;
import dd.j0;
import dd.j1;
import dd.k;
import dd.y0;
import dd.z0;
import io.grpc.internal.k1;
import io.grpc.internal.s;
import java.util.concurrent.Executor;
import r6.i;

/* compiled from: ForwardingConnectionClientTransport */
abstract class k0 implements v {
    k0() {
    }

    /* access modifiers changed from: protected */
    public abstract v a();

    public void b(j1 j1Var) {
        a().b(j1Var);
    }

    public q c(z0<?, ?> z0Var, y0 y0Var, c cVar, k[] kVarArr) {
        return a().c(z0Var, y0Var, cVar, kVarArr);
    }

    public void d(j1 j1Var) {
        a().d(j1Var);
    }

    public Runnable e(k1.a aVar) {
        return a().e(aVar);
    }

    public j0 g() {
        return a().g();
    }

    public void h(s.a aVar, Executor executor) {
        a().h(aVar, executor);
    }

    public String toString() {
        return i.c(this).d("delegate", a()).toString();
    }
}
