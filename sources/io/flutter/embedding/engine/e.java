package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* compiled from: FlutterEngineGroupCache */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f33594b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f33595a = new HashMap();

    e() {
    }

    public static e b() {
        if (f33594b == null) {
            synchronized (e.class) {
                if (f33594b == null) {
                    f33594b = new e();
                }
            }
        }
        return f33594b;
    }

    public d a(String str) {
        return this.f33595a.get(str);
    }
}
