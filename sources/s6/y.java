package s6;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import s6.v;
import s6.w;

/* compiled from: ImmutableSetMultimap */
public class y<K, V> extends w<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final transient x<V> f30282g;

    /* compiled from: ImmutableSetMultimap */
    public static final class a<K, V> extends w.b<K, V> {
        public y<K, V> a() {
            Collection entrySet = this.f30276a.entrySet();
            Comparator comparator = this.f30277b;
            if (comparator != null) {
                entrySet = p0.a(comparator).d().b(entrySet);
            }
            return y.m(entrySet, this.f30278c);
        }
    }

    y(v<K, x<V>> vVar, int i10, Comparator<? super V> comparator) {
        super(vVar, i10);
        this.f30282g = l(comparator);
    }

    private static <V> x<V> l(Comparator<? super V> comparator) {
        if (comparator == null) {
            return x.w();
        }
        return z.J(comparator);
    }

    static <K, V> y<K, V> m(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return n();
        }
        v.a aVar = new v.a(collection.size());
        int i10 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            x<V> o10 = o(comparator, (Collection) entry.getValue());
            if (!o10.isEmpty()) {
                aVar.f(key, o10);
                i10 += o10.size();
            }
        }
        return new y<>(aVar.c(), i10, comparator);
    }

    public static <K, V> y<K, V> n() {
        return o.f30219h;
    }

    private static <V> x<V> o(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return x.p(collection);
        }
        return z.F(comparator, collection);
    }
}
