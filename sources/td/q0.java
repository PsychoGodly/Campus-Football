package td;

import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: Sets.kt */
class q0 extends p0 {
    public static <T> Set<T> b() {
        return c0.f38609a;
    }

    public static final <T> Set<T> c(Set<? extends T> set) {
        m.e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return b();
        }
        if (size != 1) {
            return set;
        }
        return p0.a(set.iterator().next());
    }
}
