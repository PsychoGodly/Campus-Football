package pe;

import kotlin.coroutines.jvm.internal.h;
import sd.w;
import xd.d;
import xd.e;
import xd.g;

/* compiled from: Delay.kt */
public final class a1 {
    public static final Object a(long j10, d<? super w> dVar) {
        if (j10 <= 0) {
            return w.f38141a;
        }
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        if (j10 < Long.MAX_VALUE) {
            b(pVar.getContext()).q(j10, pVar);
        }
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        if (z10 == d.c()) {
            return z10;
        }
        return w.f38141a;
    }

    public static final z0 b(g gVar) {
        g.b bVar = gVar.get(e.E1);
        z0 z0Var = bVar instanceof z0 ? (z0) bVar : null;
        return z0Var == null ? w0.a() : z0Var;
    }
}
