package s6;

import com.google.android.gms.common.api.a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r6.g;
import r6.k;
import r6.o;
import s6.y0;

/* compiled from: Maps */
public final class g0 {

    /* compiled from: Maps */
    class a extends c1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* compiled from: Maps */
    private enum b implements g<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* compiled from: Maps */
    static abstract class c<K, V> extends y0.d<Map.Entry<K, V>> {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> b();

        public void clear() {
            b().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) o.o(collection));
            } catch (UnsupportedOperationException unused) {
                return y0.j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = y0.g(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        g10.add(((Map.Entry) next).getKey());
                    }
                }
                return b().keySet().retainAll(g10);
            }
        }

        public int size() {
            return b().size();
        }
    }

    /* compiled from: Maps */
    static class d<K, V> extends y0.d<K> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f30177a;

        d(Map<K, V> map) {
            this.f30177a = (Map) o.o(map);
        }

        /* access modifiers changed from: package-private */
        public Map<K, V> b() {
            return this.f30177a;
        }

        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public int size() {
            return b().size();
        }
    }

    /* compiled from: Maps */
    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f30178a;

        e(Map<K, V> map) {
            this.f30178a = (Map) o.o(map);
        }

        /* access modifiers changed from: package-private */
        public final Map<K, V> b() {
            return this.f30178a;
        }

        public void clear() {
            b().clear();
        }

        public boolean contains(Object obj) {
            return b().containsValue(obj);
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public Iterator<V> iterator() {
            return g0.l(b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : b().entrySet()) {
                    if (k.a(obj, entry.getValue())) {
                        b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = y0.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return b().keySet().removeAll(f10);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = y0.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return b().keySet().retainAll(f10);
            }
        }

        public int size() {
            return b().size();
        }
    }

    /* compiled from: Maps */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f30179a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection<V> f30180b;

        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        /* access modifiers changed from: package-private */
        public Collection<V> b() {
            return new e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f30179a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a10 = a();
            this.f30179a = a10;
            return a10;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f30180b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b10 = b();
            this.f30180b = b10;
            return b10;
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        i.b(i10, "expectedSize");
        return i10 + 1;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return c0.d(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new t(k10, v10);
    }

    static <K> g<Map.Entry<K, ?>, K> e() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap<>();
    }

    static boolean g(Map<?, ?> map, Object obj) {
        o.o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        o.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        o.o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map<?, ?> map) {
        StringBuilder b10 = j.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            z10 = false;
            b10.append(next.getKey());
            b10.append('=');
            b10.append(next.getValue());
        }
        b10.append('}');
        return b10.toString();
    }

    static <V> g<Map.Entry<?, V>, V> k() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
