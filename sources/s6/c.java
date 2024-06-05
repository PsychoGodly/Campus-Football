package s6;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractListMultimap */
abstract class c<K, V> extends d<K, V> implements d0<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> a() {
        return super.a();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> v(K k10, Collection<V> collection) {
        return w(k10, (List) collection, (d<K, V>.j) null);
    }
}
