package t7;

import java.util.HashMap;
import java.util.Map;
import q7.e;
import q7.j;

/* compiled from: MemoryBundleCache */
class q0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, e> f30512a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, j> f30513b = new HashMap();

    q0() {
    }

    public e a(String str) {
        return this.f30512a.get(str);
    }

    public void b(j jVar) {
        this.f30513b.put(jVar.b(), jVar);
    }

    public void c(e eVar) {
        this.f30512a.put(eVar.a(), eVar);
    }

    public j d(String str) {
        return this.f30513b.get(str);
    }
}
