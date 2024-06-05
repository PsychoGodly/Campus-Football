package td;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: _Sets.kt */
class r0 extends q0 {
    public static <T> Set<T> d(Set<? extends T> set, T t10) {
        m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.d(set.size()));
        boolean z10 = false;
        for (T next : set) {
            boolean z11 = true;
            if (!z10 && m.a(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> e(Set<? extends T> set, T t10) {
        m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
