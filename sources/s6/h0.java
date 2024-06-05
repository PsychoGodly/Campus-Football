package s6;

import java.util.Collection;
import java.util.Map;

/* compiled from: Multimap */
public interface h0<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    boolean put(K k10, V v10);

    int size();

    Collection<V> values();
}
