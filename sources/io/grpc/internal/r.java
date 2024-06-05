package io.grpc.internal;

import dd.j1;
import dd.y0;

/* compiled from: ClientStreamListener */
public interface r extends k2 {

    /* compiled from: ClientStreamListener */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void b(y0 y0Var);

    void d(j1 j1Var, a aVar, y0 y0Var);
}
