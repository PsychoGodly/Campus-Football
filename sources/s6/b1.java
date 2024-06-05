package s6;

import java.util.Comparator;
import java.util.SortedSet;
import r6.o;

/* compiled from: SortedIterables */
final class b1 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? p0.c() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        o.o(comparator);
        o.o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof a1)) {
            return false;
        } else {
            comparator2 = ((a1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
