package pe;

import fe.l;
import fe.p;
import kotlin.jvm.internal.m;
import sd.w;
import ue.h0;
import ue.p0;
import ve.a;
import ve.b;
import xd.d;
import xd.e;
import xd.g;
import xd.h;

/* compiled from: Builders.common.kt */
final /* synthetic */ class k {
    public static final <T> x0<T> a(p0 p0Var, g gVar, r0 r0Var, p<? super p0, ? super d<? super T>, ? extends Object> pVar) {
        y0 y0Var;
        g d10 = j0.d(p0Var, gVar);
        if (r0Var.d()) {
            y0Var = new m2(d10, pVar);
        } else {
            y0Var = new y0(d10, true);
        }
        y0Var.T0(r0Var, y0Var, pVar);
        return y0Var;
    }

    public static /* synthetic */ x0 b(p0 p0Var, g gVar, r0 r0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f39347a;
        }
        if ((i10 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.a(p0Var, gVar, r0Var, pVar);
    }

    public static final c2 c(p0 p0Var, g gVar, r0 r0Var, p<? super p0, ? super d<? super w>, ? extends Object> pVar) {
        a aVar;
        g d10 = j0.d(p0Var, gVar);
        if (r0Var.d()) {
            aVar = new n2(d10, pVar);
        } else {
            aVar = new x2(d10, true);
        }
        aVar.T0(r0Var, aVar, pVar);
        return aVar;
    }

    public static /* synthetic */ c2 d(p0 p0Var, g gVar, r0 r0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f39347a;
        }
        if ((i10 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.c(p0Var, gVar, r0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object e(g gVar, p<? super p0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object obj;
        g context = dVar.getContext();
        g e10 = j0.e(context, gVar);
        g2.j(e10);
        if (e10 == context) {
            h0 h0Var = new h0(e10, dVar);
            obj = b.b(h0Var, h0Var, pVar);
        } else {
            e.b bVar = e.E1;
            if (m.a(e10.get(bVar), context.get(bVar))) {
                i3 i3Var = new i3(e10, dVar);
                g context2 = i3Var.getContext();
                Object c10 = p0.c(context2, (Object) null);
                try {
                    Object b10 = b.b(i3Var, i3Var, pVar);
                    p0.a(context2, c10);
                    obj = b10;
                } catch (Throwable th) {
                    p0.a(context2, c10);
                    throw th;
                }
            } else {
                c1 c1Var = new c1(e10, dVar);
                a.d(pVar, c1Var, c1Var, (l) null, 4, (Object) null);
                obj = c1Var.U0();
            }
        }
        if (obj == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj;
    }
}
