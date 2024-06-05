package j4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HttpDataSource */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f19299a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f19300b;

    public synchronized void a(Map<String, String> map) {
        this.f19300b = null;
        this.f19299a.clear();
        this.f19299a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f19300b == null) {
            this.f19300b = Collections.unmodifiableMap(new HashMap(this.f19299a));
        }
        return this.f19300b;
    }
}
