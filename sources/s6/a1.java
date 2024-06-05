package s6;

import java.util.Comparator;

/* compiled from: SortedIterable */
interface a1<T> extends Iterable<T> {
    Comparator<? super T> comparator();
}
