package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f20011f = new HashMap<>();

    /* access modifiers changed from: protected */
    public b.c<K, V> c(K k10) {
        return this.f20011f.get(k10);
    }

    public boolean contains(K k10) {
        return this.f20011f.containsKey(k10);
    }

    public V h(K k10, V v10) {
        b.c c10 = c(k10);
        if (c10 != null) {
            return c10.f20017b;
        }
        this.f20011f.put(k10, g(k10, v10));
        return null;
    }

    public V m(K k10) {
        V m10 = super.m(k10);
        this.f20011f.remove(k10);
        return m10;
    }

    public Map.Entry<K, V> n(K k10) {
        if (contains(k10)) {
            return this.f20011f.get(k10).f20019d;
        }
        return null;
    }
}
