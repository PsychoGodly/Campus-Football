package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* compiled from: FlutterEngineCache */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f33557b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f33558a = new HashMap();

    b() {
    }

    public static b b() {
        if (f33557b == null) {
            f33557b = new b();
        }
        return f33557b;
    }

    public a a(String str) {
        return this.f33558a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f33558a.put(str, aVar);
        } else {
            this.f33558a.remove(str);
        }
    }

    public void d(String str) {
        c(str, (a) null);
    }
}
