package td;

import java.util.Collection;
import kotlin.jvm.internal.m;

/* compiled from: Iterables.kt */
class r extends q {
    public static <T> int j(Iterable<? extends T> iterable, int i10) {
        m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
