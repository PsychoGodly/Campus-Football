package s6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap */
public abstract class p<K, V> extends q implements Map<K, V> {
    protected p() {
    }

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    /* access modifiers changed from: protected */
    public boolean d(Object obj) {
        return g0.b(this, obj);
    }

    /* access modifiers changed from: protected */
    public boolean e(Object obj) {
        return g0.c(this, obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    /* access modifiers changed from: protected */
    public int f() {
        return y0.d(entrySet());
    }

    public V get(Object obj) {
        return b().get(obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set<K> keySet() {
        return b().keySet();
    }

    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    public V remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    public Collection<V> values() {
        return b().values();
    }
}
