package pa;

import java.util.HashMap;
import java.util.Map;
import lc.c;
import lc.k;

/* compiled from: PlacementChannelManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, k> f29661a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final c f29662b;

    public a(c cVar) {
        this.f29662b = cVar;
    }

    public void a(String str, String str2) {
        c(str, str2, new HashMap());
    }

    public void b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str3);
        hashMap.put("errorMessage", str4);
        c(str, str2, hashMap);
    }

    public void c(String str, String str2, Map<String, String> map) {
        map.put("placementId", str2);
        k kVar = this.f29661a.get(str2);
        if (kVar == null) {
            c cVar = this.f29662b;
            kVar = new k(cVar, "com.rebeloid.unity_ads/videoAd_" + str2);
            this.f29661a.put(str2, kVar);
        }
        kVar.c(str, map);
    }
}
