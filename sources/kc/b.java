package kc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: DeferredComponentChannel */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final k f35802a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ac.a f35803b = xb.a.e().a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<k.d>> f35804c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final k.c f35805d;

    /* compiled from: DeferredComponentChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (b.this.f35803b != null) {
                String str = jVar.f36116a;
                Map map = (Map) jVar.b();
                xb.b.f("DeferredComponentChannel", "Received '" + str + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str2 = (String) map.get("componentName");
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1004447972:
                        if (str.equals("uninstallDeferredComponent")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str.equals("getDeferredComponentInstallState")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str.equals("installDeferredComponent")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        b.this.f35803b.c(intValue, str2);
                        dVar.success((Object) null);
                        return;
                    case 1:
                        dVar.success(b.this.f35803b.b(intValue, str2));
                        return;
                    case 2:
                        b.this.f35803b.a(intValue, str2);
                        if (!b.this.f35804c.containsKey(str2)) {
                            b.this.f35804c.put(str2, new ArrayList());
                        }
                        ((List) b.this.f35804c.get(str2)).add(dVar);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    public b(zb.a aVar) {
        a aVar2 = new a();
        this.f35805d = aVar2;
        k kVar = new k(aVar, "flutter/deferredcomponent", s.f36131b);
        this.f35802a = kVar;
        kVar.e(aVar2);
    }

    public void c(ac.a aVar) {
        this.f35803b = aVar;
    }
}
