package td;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: SetsJVM.kt */
class p0 {
    public static <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        m.d(singleton, "singleton(element)");
        return singleton;
    }
}
