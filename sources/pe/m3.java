package pe;

import kotlin.coroutines.jvm.internal.h;
import sd.w;
import ue.l;
import ue.m;
import xd.d;
import xd.g;

/* compiled from: Yield.kt */
public final class m3 {
    public static final Object a(d<? super w> dVar) {
        Object obj;
        g context = dVar.getContext();
        g2.j(context);
        d b10 = c.b(dVar);
        l lVar = b10 instanceof l ? (l) b10 : null;
        if (lVar == null) {
            obj = w.f38141a;
        } else {
            if (lVar.f38814d.Z0(context)) {
                lVar.q(context, w.f38141a);
            } else {
                l3 l3Var = new l3();
                g plus = context.plus(l3Var);
                w wVar = w.f38141a;
                lVar.q(plus, wVar);
                if (l3Var.f37360a) {
                    obj = m.d(lVar) ? d.c() : wVar;
                }
            }
            obj = d.c();
        }
        if (obj == d.c()) {
            h.c(dVar);
        }
        return obj == d.c() ? obj : w.f38141a;
    }
}
