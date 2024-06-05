package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PlatformViewRegistryImpl */
class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f33708a = new HashMap();

    i() {
    }

    public boolean a(String str, g gVar) {
        if (this.f33708a.containsKey(str)) {
            return false;
        }
        this.f33708a.put(str, gVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public g b(String str) {
        return this.f33708a.get(str);
    }
}
