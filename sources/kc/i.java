package kc;

import java.util.HashMap;
import lc.g;
import lc.j;
import lc.k;
import xb.b;

/* compiled from: NavigationChannel */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final k f35835a;

    /* renamed from: b  reason: collision with root package name */
    private final k.c f35836b;

    /* compiled from: NavigationChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            dVar.success((Object) null);
        }
    }

    public i(zb.a aVar) {
        a aVar2 = new a();
        this.f35836b = aVar2;
        k kVar = new k(aVar, "flutter/navigation", g.f36115a);
        this.f35835a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        b.f("NavigationChannel", "Sending message to pop route.");
        this.f35835a.c("popRoute", (Object) null);
    }

    public void b(String str) {
        b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f35835a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f35835a.c("setInitialRoute", str);
    }
}
