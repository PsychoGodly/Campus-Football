package dd;

import dd.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: CompressorRegistry */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final o f32316b = new o(new l.a(), l.b.f32286a);

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, n> f32317a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f32317a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f32316b;
    }

    public n b(String str) {
        return (n) this.f32317a.get(str);
    }
}
