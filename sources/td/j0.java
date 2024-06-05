package td;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.m;
import sd.n;
import ud.c;

/* compiled from: MapsJVM.kt */
class j0 extends i0 {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        m.e(map, "builder");
        return ((c) map).j();
    }

    public static <K, V> Map<K, V> c() {
        return new c();
    }

    public static int d(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> e(n<? extends K, ? extends V> nVar) {
        m.e(nVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(nVar.c(), nVar.d());
        m.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> f(Map<? extends K, ? extends V> map) {
        m.e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        m.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
