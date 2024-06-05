package td;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import sd.n;

/* compiled from: Maps.kt */
class k0 extends j0 {
    public static <K, V> Map<K, V> g() {
        b0 b0Var = b0.f38601a;
        m.c(b0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return b0Var;
    }

    public static <K, V> V h(Map<K, ? extends V> map, K k10) {
        m.e(map, "<this>");
        return i0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> i(n<? extends K, ? extends V>... nVarArr) {
        m.e(nVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(j0.d(nVarArr.length));
        q(hashMap, nVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> j(n<? extends K, ? extends V>... nVarArr) {
        m.e(nVarArr, "pairs");
        return nVarArr.length > 0 ? u(nVarArr, new LinkedHashMap(j0.d(nVarArr.length))) : g();
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map, K k10) {
        m.e(map, "<this>");
        Map<? extends K, ? extends V> v10 = v(map);
        v10.remove(k10);
        return m(v10);
    }

    public static <K, V> Map<K, V> l(n<? extends K, ? extends V>... nVarArr) {
        m.e(nVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.d(nVarArr.length));
        q(linkedHashMap, nVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> m(Map<K, ? extends V> map) {
        m.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return map;
        }
        return j0.f(map);
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        m.e(map, "<this>");
        m.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map, n<? extends K, ? extends V> nVar) {
        m.e(map, "<this>");
        m.e(nVar, "pair");
        if (map.isEmpty()) {
            return j0.e(nVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(nVar.c(), nVar.d());
        return linkedHashMap;
    }

    public static final <K, V> void p(Map<? super K, ? super V> map, Iterable<? extends n<? extends K, ? extends V>> iterable) {
        m.e(map, "<this>");
        m.e(iterable, "pairs");
        for (n nVar : iterable) {
            map.put(nVar.a(), nVar.b());
        }
    }

    public static final <K, V> void q(Map<? super K, ? super V> map, n<? extends K, ? extends V>[] nVarArr) {
        m.e(map, "<this>");
        m.e(nVarArr, "pairs");
        for (n<? extends K, ? extends V> nVar : nVarArr) {
            map.put(nVar.a(), nVar.b());
        }
    }

    public static <K, V> Map<K, V> r(Iterable<? extends n<? extends K, ? extends V>> iterable) {
        m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(j0.d(collection.size())));
        }
        return j0.e((n) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(Iterable<? extends n<? extends K, ? extends V>> iterable, M m10) {
        m.e(iterable, "<this>");
        m.e(m10, "destination");
        p(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        m.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return v(map);
        }
        return j0.f(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M u(n<? extends K, ? extends V>[] nVarArr, M m10) {
        m.e(nVarArr, "<this>");
        m.e(m10, "destination");
        q(m10, nVarArr);
        return m10;
    }

    public static final <K, V> Map<K, V> v(Map<? extends K, ? extends V> map) {
        m.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
