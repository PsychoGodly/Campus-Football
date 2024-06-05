package pe;

import sd.o;
import sd.p;
import ue.l;
import xd.d;

/* compiled from: DebugStrings.kt */
public final class u0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        Object obj;
        if (dVar instanceof l) {
            return dVar.toString();
        }
        try {
            o.a aVar = o.f38128b;
            obj = o.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            o.a aVar2 = o.f38128b;
            obj = o.b(p.a(th));
        }
        Throwable d10 = o.d(obj);
        String str = obj;
        if (d10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
