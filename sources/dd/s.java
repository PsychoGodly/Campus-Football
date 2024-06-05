package dd;

import dd.j1;
import java.util.concurrent.TimeoutException;
import r6.o;

/* compiled from: Contexts */
public final class s {
    public static j1 a(r rVar) {
        o.p(rVar, "context must not be null");
        if (!rVar.h()) {
            return null;
        }
        Throwable c10 = rVar.c();
        if (c10 == null) {
            return j1.f32234g.q("io.grpc.Context was cancelled without error");
        }
        if (c10 instanceof TimeoutException) {
            return j1.f32237j.q(c10.getMessage()).p(c10);
        }
        j1 k10 = j1.k(c10);
        if (!j1.b.UNKNOWN.equals(k10.m()) || k10.l() != c10) {
            return k10.p(c10);
        }
        return j1.f32234g.q("Context cancelled").p(c10);
    }
}
