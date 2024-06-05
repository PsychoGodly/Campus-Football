package pe;

import fe.l;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.h;
import sd.o;
import sd.p;
import sd.w;
import ue.k0;
import xd.d;

/* compiled from: CompletionState.kt */
public final class g0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof c0) {
            o.a aVar = o.f38128b;
            Throwable th = ((c0) obj).f37280a;
            if (t0.d() && (dVar instanceof e)) {
                th = k0.i(th, (e) dVar);
            }
            return o.b(p.a(th));
        }
        o.a aVar2 = o.f38128b;
        return o.b(obj);
    }

    public static final <T> Object b(Object obj, l<? super Throwable, w> lVar) {
        Throwable d10 = o.d(obj);
        if (d10 != null) {
            return new c0(d10, false, 2, (h) null);
        }
        if (lVar != null) {
            return new d0(obj, lVar);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, o<?> oVar) {
        Throwable d10 = o.d(obj);
        if (d10 != null) {
            if (t0.d() && (oVar instanceof e)) {
                d10 = k0.i(d10, (e) oVar);
            }
            obj = new c0(d10, false, 2, (h) null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
