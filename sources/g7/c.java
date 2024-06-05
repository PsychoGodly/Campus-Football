package g7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ImmutableSortedMap */
public abstract class c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* compiled from: ImmutableSortedMap */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final C0304a f28905a = b.f32803a;

        /* renamed from: g7.c$a$a  reason: collision with other inner class name */
        /* compiled from: ImmutableSortedMap */
        public interface C0304a<C, D> {
            D a(C c10);
        }

        public static <A, B, C> c<A, C> b(List<A> list, Map<B, C> map, C0304a<A, B> aVar, Comparator<A> comparator) {
            if (list.size() < 25) {
                return a.u(list, map, aVar, comparator);
            }
            return k.o(list, map, aVar, comparator);
        }

        public static <K, V> c<K, V> c(Comparator<K> comparator) {
            return new a(comparator);
        }

        public static <A> C0304a<A, A> d() {
            return f28905a;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Object e(Object obj) {
            return obj;
        }
    }

    public abstract boolean b(K k10);

    public abstract V c(K k10);

    public abstract Comparator<K> e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!e().equals(cVar.e()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract K f();

    public abstract K g();

    public abstract c<K, V> h(K k10, V v10);

    public int hashCode() {
        int hashCode = e().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract int indexOf(K k10);

    public abstract boolean isEmpty();

    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract Iterator<Map.Entry<K, V>> m(K k10);

    public abstract c<K, V> n(K k10);

    public abstract int size();

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        Iterator it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append("(");
            sb2.append(entry.getKey());
            sb2.append("=>");
            sb2.append(entry.getValue());
            sb2.append(")");
        }
        sb2.append("};");
        return sb2.toString();
    }
}
