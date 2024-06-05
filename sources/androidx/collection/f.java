package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f1971a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.defpackage.c f1972b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.defpackage.e f1973c;

    /* compiled from: MapCollections */
    final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f1974a;

        /* renamed from: b  reason: collision with root package name */
        int f1975b;

        /* renamed from: c  reason: collision with root package name */
        int f1976c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1977d = false;

        a(int i10) {
            this.f1974a = i10;
            this.f1975b = f.this.d();
        }

        public boolean hasNext() {
            return this.f1976c < this.f1975b;
        }

        public T next() {
            if (hasNext()) {
                T b10 = f.this.b(this.f1976c, this.f1974a);
                this.f1976c++;
                this.f1977d = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1977d) {
                int i10 = this.f1976c - 1;
                this.f1976c = i10;
                this.f1975b--;
                this.f1977d = false;
                f.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != f.this.d();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = f.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return c.c(f.this.b(e10, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                Object b11 = f.this.b(d10, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 == null) {
                    i11 = 0;
                } else {
                    i11 = b11.hashCode();
                }
                i12 += i10 ^ i11;
            }
            return i12;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                i11 += i10;
            }
            return i11;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e10 = f.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            f.this.h(e10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f1981a;

        /* renamed from: b  reason: collision with root package name */
        int f1982b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1983c = false;

        d() {
            this.f1981a = f.this.d() - 1;
            this.f1982b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1982b++;
                this.f1983c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f1983c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.c(entry.getKey(), f.this.b(this.f1982b, 0)) || !c.c(entry.getValue(), f.this.b(this.f1982b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f1983c) {
                return f.this.b(this.f1982b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1983c) {
                return f.this.b(this.f1982b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f1982b < this.f1981a;
        }

        public int hashCode() {
            int i10;
            if (this.f1983c) {
                int i11 = 0;
                Object b10 = f.this.b(this.f1982b, 0);
                Object b11 = f.this.b(this.f1982b, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return i10 ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f1983c) {
                f.this.h(this.f1982b);
                this.f1982b--;
                this.f1981a--;
                this.f1983c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v10) {
            if (this.f1983c) {
                return f.this.i(this.f1982b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f10 = f.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            f.this.h(f10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k10, V v10);

    /* access modifiers changed from: protected */
    public abstract void h(int i10);

    /* access modifiers changed from: protected */
    public abstract V i(int i10, V v10);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1971a == null) {
            this.f1971a = new b();
        }
        return this.f1971a;
    }

    public Set<K> m() {
        if (this.f1972b == null) {
            this.f1972b = new c();
        }
        return this.f1972b;
    }

    public Collection<V> n() {
        if (this.f1973c == null) {
            this.f1973c = new e();
        }
        return this.f1973c;
    }

    public Object[] q(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
