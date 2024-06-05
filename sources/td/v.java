package td;

import fe.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* compiled from: MutableCollections.kt */
class v extends u {
    public static <T> boolean k(Collection<? super T> collection, Iterable<? extends T> iterable) {
        m.e(collection, "<this>");
        m.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    private static final <T> boolean l(Iterable<? extends T> iterable, l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean m(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        m.e(iterable, "<this>");
        m.e(lVar, "predicate");
        return l(iterable, lVar, true);
    }
}
