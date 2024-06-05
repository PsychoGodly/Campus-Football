package qb;

import java.util.ArrayList;
import java.util.HashMap;
import lc.a;
import lc.c;
import lc.i;
import qb.a;

/* compiled from: Messages */
public final /* synthetic */ class d {
    public static i<Object> c() {
        return a.d.f37478d;
    }

    public static /* synthetic */ void d(a.c cVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.b bVar = (a.b) ((ArrayList) obj).get(0);
            if (bVar != null) {
                cVar.a(bVar);
                hashMap.put("result", (Object) null);
                eVar.a(hashMap);
                return;
            }
            throw new NullPointerException("msgArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
    }

    public static /* synthetic */ void e(a.c cVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", cVar.isEnabled());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
        eVar.a(hashMap);
    }

    public static void f(c cVar, a.c cVar2) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.WakelockApi.toggle", c());
        if (cVar2 != null) {
            aVar.e(new c(cVar2));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.WakelockApi.isEnabled", c());
        if (cVar2 != null) {
            aVar2.e(new b(cVar2));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
