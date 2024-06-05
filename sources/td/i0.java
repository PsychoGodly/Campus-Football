package td;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: MapWithDefault.kt */
class i0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        m.e(map, "<this>");
        if (map instanceof g0) {
            return ((g0) map).c(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
