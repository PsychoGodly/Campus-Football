package io.grpc.internal;

import dd.c;
import dd.j0;
import dd.j1;
import dd.k;
import dd.y0;
import dd.z0;
import io.grpc.internal.r;
import r6.o;

/* compiled from: FailingClientTransport */
class g0 implements s {

    /* renamed from: a  reason: collision with root package name */
    final j1 f34920a;

    /* renamed from: b  reason: collision with root package name */
    private final r.a f34921b;

    g0(j1 j1Var, r.a aVar) {
        o.e(!j1Var.o(), "error must not be OK");
        this.f34920a = j1Var;
        this.f34921b = aVar;
    }

    public q c(z0<?, ?> z0Var, y0 y0Var, c cVar, k[] kVarArr) {
        return new f0(this.f34920a, this.f34921b, kVarArr);
    }

    public j0 g() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
