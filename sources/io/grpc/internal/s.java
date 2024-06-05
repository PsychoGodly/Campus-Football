package io.grpc.internal;

import dd.c;
import dd.i0;
import dd.k;
import dd.y0;
import dd.z0;
import java.util.concurrent.Executor;

/* compiled from: ClientTransport */
public interface s extends i0<Object> {

    /* compiled from: ClientTransport */
    public interface a {
        void a(Throwable th);

        void b(long j10);
    }

    q c(z0<?, ?> z0Var, y0 y0Var, c cVar, k[] kVarArr);

    void h(a aVar, Executor executor);
}
