package s6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import r6.o;
import s6.f;
import s6.g0;

/* compiled from: AbstractMapBasedMultimap */
abstract class d<K, V> extends f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public transient Map<K, Collection<V>> f30138d;

    /* renamed from: f  reason: collision with root package name */
    private transient int f30139f;

    /* compiled from: AbstractMapBasedMultimap */
    class a extends d<K, V>.defpackage.c<V> {
        a(d dVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        public V a(K k10, V v10) {
            return v10;
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class b extends g0.f<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        final transient Map<K, Collection<V>> f30140c;

        /* compiled from: AbstractMapBasedMultimap */
        class a extends g0.c<K, Collection<V>> {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map<K, Collection<V>> b() {
                return b.this;
            }

            public boolean contains(Object obj) {
                return j.c(b.this.f30140c.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0335b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.t(entry.getKey());
                return true;
            }
        }

        /* renamed from: s6.d$b$b  reason: collision with other inner class name */
        /* compiled from: AbstractMapBasedMultimap */
        class C0335b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f30143a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f30144b;

            C0335b() {
                this.f30143a = b.this.f30140c.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f30143a.next();
                this.f30144b = (Collection) next.getValue();
                return b.this.f(next);
            }

            public boolean hasNext() {
                return this.f30143a.hasNext();
            }

            public void remove() {
                o.v(this.f30144b != null, "no calls to next() since the last call to remove()");
                this.f30143a.remove();
                d.m(d.this, this.f30144b.size());
                this.f30144b.clear();
                this.f30144b = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f30140c = map;
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        public void clear() {
            if (this.f30140c == d.this.f30138d) {
                d.this.clear();
            } else {
                c0.c(new C0335b());
            }
        }

        public boolean containsKey(Object obj) {
            return g0.g(this.f30140c, obj);
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) g0.h(this.f30140c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.v(obj, collection);
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f30140c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o10 = d.this.o();
            o10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return o10;
        }

        public boolean equals(Object obj) {
            return this == obj || this.f30140c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return g0.d(key, d.this.v(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f30140c.hashCode();
        }

        public Set<K> keySet() {
            return d.this.f();
        }

        public int size() {
            return this.f30140c.size();
        }

        public String toString() {
            return this.f30140c.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private abstract class c<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f30146a;

        /* renamed from: b  reason: collision with root package name */
        K f30147b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f30148c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator<V> f30149d = c0.h();

        c() {
            this.f30146a = d.this.f30138d.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract T a(K k10, V v10);

        public boolean hasNext() {
            return this.f30146a.hasNext() || this.f30149d.hasNext();
        }

        public T next() {
            if (!this.f30149d.hasNext()) {
                Map.Entry next = this.f30146a.next();
                this.f30147b = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f30148c = collection;
                this.f30149d = collection.iterator();
            }
            return a(n0.a(this.f30147b), this.f30149d.next());
        }

        public void remove() {
            this.f30149d.remove();
            Collection<V> collection = this.f30148c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f30146a.remove();
            }
            d.k(d.this);
        }
    }

    /* renamed from: s6.d$d  reason: collision with other inner class name */
    /* compiled from: AbstractMapBasedMultimap */
    private class C0336d extends g0.d<K, Collection<V>> {

        /* renamed from: s6.d$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        class a implements Iterator<K> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f30152a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f30153b;

            a(Iterator it) {
                this.f30153b = it;
            }

            public boolean hasNext() {
                return this.f30153b.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f30153b.next();
                this.f30152a = entry;
                return entry.getKey();
            }

            public void remove() {
                o.v(this.f30152a != null, "no calls to next() since the last call to remove()");
                Collection value = this.f30152a.getValue();
                this.f30153b.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f30152a = null;
            }
        }

        C0336d(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            c0.c(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        public int hashCode() {
            return b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new a(b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry ceilingEntry = i().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return f(ceilingEntry);
        }

        public K ceilingKey(K k10) {
            return i().ceilingKey(k10);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(i().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry floorEntry = i().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return f(floorEntry);
        }

        public K floorKey(K k10) {
            return i().floorKey(k10);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry higherEntry = i().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return f(higherEntry);
        }

        public K higherKey(K k10) {
            return i().higherKey(k10);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public NavigableSet<K> g() {
            return new f(i());
        }

        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry lowerEntry = i().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return f(lowerEntry);
        }

        public K lowerKey(K k10) {
            return i().lowerKey(k10);
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection o10 = d.this.o();
            o10.addAll((Collection) next.getValue());
            it.remove();
            return g0.d(next.getKey(), d.this.u(o10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(i().headMap(k10, z10));
        }

        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(i().subMap(k10, z10, k11, z11));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(i().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k10) {
            return c().ceilingKey(k10);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new f(c().descendingMap());
        }

        /* renamed from: e */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) super.c();
        }

        public K floor(K k10) {
            return c().floorKey(k10);
        }

        /* renamed from: g */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        /* renamed from: h */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        public K higher(K k10) {
            return c().higherKey(k10);
        }

        public K lower(K k10) {
            return c().lowerKey(k10);
        }

        public K pollFirst() {
            return c0.o(iterator());
        }

        public K pollLast() {
            return c0.o(descendingIterator());
        }

        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(c().headMap(k10, z10));
        }

        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(c().subMap(k10, z10, k11, z11));
        }

        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(c().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: f  reason: collision with root package name */
        SortedSet<K> f30157f;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        public K firstKey() {
            return i().firstKey();
        }

        /* access modifiers changed from: package-private */
        public SortedSet<K> g() {
            return new i(i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f30157f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g10 = g();
            this.f30157f = g10;
            return g10;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(i().headMap(k10));
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f30140c;
        }

        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(i().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    private class i extends d<K, V>.d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> c() {
            return (SortedMap) super.b();
        }

        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        public K first() {
            return c().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(c().headMap(k10));
        }

        public K last() {
            return c().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(c().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(c().tailMap(k10));
        }
    }

    protected d(Map<K, Collection<V>> map) {
        o.d(map.isEmpty());
        this.f30138d = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i10 = dVar.f30139f;
        dVar.f30139f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int k(d dVar) {
        int i10 = dVar.f30139f;
        dVar.f30139f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int l(d dVar, int i10) {
        int i11 = dVar.f30139f + i10;
        dVar.f30139f = i11;
        return i11;
    }

    static /* synthetic */ int m(d dVar, int i10) {
        int i11 = dVar.f30139f - i10;
        dVar.f30139f = i11;
        return i11;
    }

    /* access modifiers changed from: private */
    public static <E> Iterator<E> s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    public void t(Object obj) {
        Collection collection = (Collection) g0.i(this.f30138d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f30139f -= size;
        }
    }

    public void clear() {
        for (Collection<V> clear : this.f30138d.values()) {
            clear.clear();
        }
        this.f30138d.clear();
        this.f30139f = 0;
    }

    /* access modifiers changed from: package-private */
    public Collection<V> e() {
        return new f.a();
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> g() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> o();

    /* access modifiers changed from: package-private */
    public Collection<V> p(K k10) {
        return o();
    }

    public boolean put(K k10, V v10) {
        Collection collection = this.f30138d.get(k10);
        if (collection == null) {
            Collection p10 = p(k10);
            if (p10.add(v10)) {
                this.f30139f++;
                this.f30138d.put(k10, p10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v10)) {
            return false;
        } else {
            this.f30139f++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.f30138d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f30138d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f30138d);
        }
        return new b(this.f30138d);
    }

    /* access modifiers changed from: package-private */
    public final Set<K> r() {
        Map<K, Collection<V>> map = this.f30138d;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f30138d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f30138d);
        }
        return new C0336d(this.f30138d);
    }

    public int size() {
        return this.f30139f;
    }

    /* access modifiers changed from: package-private */
    public abstract <E> Collection<E> u(Collection<E> collection);

    /* access modifiers changed from: package-private */
    public abstract Collection<V> v(K k10, Collection<V> collection);

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public final List<V> w(K k10, List<V> list, d<K, V>.j jVar) {
        if (list instanceof RandomAccess) {
            return new g(this, k10, list, jVar);
        }
        return new k(k10, list, jVar);
    }

    /* compiled from: AbstractMapBasedMultimap */
    class j extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f30160a;

        /* renamed from: b  reason: collision with root package name */
        Collection<V> f30161b;

        /* renamed from: c  reason: collision with root package name */
        final d<K, V>.j f30162c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<V> f30163d;

        j(K k10, Collection<V> collection, d<K, V>.j jVar) {
            Collection<V> collection2;
            this.f30160a = k10;
            this.f30161b = collection;
            this.f30162c = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.e();
            }
            this.f30163d = collection2;
        }

        public boolean add(V v10) {
            g();
            boolean isEmpty = this.f30161b.isEmpty();
            boolean add = this.f30161b.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f30161b.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f30161b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d<K, V>.j jVar = this.f30162c;
            if (jVar != null) {
                jVar.b();
            } else {
                d.this.f30138d.put(this.f30160a, this.f30161b);
            }
        }

        /* access modifiers changed from: package-private */
        public d<K, V>.j c() {
            return this.f30162c;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f30161b.clear();
                d.m(d.this, size);
                h();
            }
        }

        public boolean contains(Object obj) {
            g();
            return this.f30161b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            g();
            return this.f30161b.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> e() {
            return this.f30161b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            g();
            return this.f30161b.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public K f() {
            return this.f30160a;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f30162c;
            if (jVar != null) {
                jVar.g();
                if (this.f30162c.e() != this.f30163d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f30161b.isEmpty() && (collection = (Collection) d.this.f30138d.get(this.f30160a)) != null) {
                this.f30161b = collection;
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            d<K, V>.j jVar = this.f30162c;
            if (jVar != null) {
                jVar.h();
            } else if (this.f30161b.isEmpty()) {
                d.this.f30138d.remove(this.f30160a);
            }
        }

        public int hashCode() {
            g();
            return this.f30161b.hashCode();
        }

        public Iterator<V> iterator() {
            g();
            return new a();
        }

        public boolean remove(Object obj) {
            g();
            boolean remove = this.f30161b.remove(obj);
            if (remove) {
                d.k(d.this);
                h();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f30161b.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f30161b.size() - size);
                h();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            o.o(collection);
            int size = size();
            boolean retainAll = this.f30161b.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f30161b.size() - size);
                h();
            }
            return retainAll;
        }

        public int size() {
            g();
            return this.f30161b.size();
        }

        public String toString() {
            g();
            return this.f30161b.toString();
        }

        /* compiled from: AbstractMapBasedMultimap */
        class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f30165a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f30166b;

            a() {
                Collection<V> collection = j.this.f30161b;
                this.f30166b = collection;
                this.f30165a = d.s(collection);
            }

            /* access modifiers changed from: package-private */
            public Iterator<V> a() {
                b();
                return this.f30165a;
            }

            /* access modifiers changed from: package-private */
            public void b() {
                j.this.g();
                if (j.this.f30161b != this.f30166b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                b();
                return this.f30165a.hasNext();
            }

            public V next() {
                b();
                return this.f30165a.next();
            }

            public void remove() {
                this.f30165a.remove();
                d.k(d.this);
                j.this.h();
            }

            a(Iterator<V> it) {
                this.f30166b = j.this.f30161b;
                this.f30165a = it;
            }
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    class k extends d<K, V>.j implements List<V> {

        /* compiled from: AbstractMapBasedMultimap */
        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [s6.d$k$a, s6.d$j$a] */
            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                c().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.b();
                }
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public V previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(V v10) {
                c().set(v10);
            }

            public a(int i10) {
                super(k.this.m().listIterator(i10));
            }
        }

        k(K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        public void add(int i10, V v10) {
            g();
            boolean isEmpty = e().isEmpty();
            m().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                b();
            }
        }

        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, e().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        public V get(int i10) {
            g();
            return m().get(i10);
        }

        public int indexOf(Object obj) {
            g();
            return m().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            g();
            return m().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            g();
            return new a();
        }

        /* access modifiers changed from: package-private */
        public List<V> m() {
            return (List) e();
        }

        public V remove(int i10) {
            g();
            V remove = m().remove(i10);
            d.k(d.this);
            h();
            return remove;
        }

        public V set(int i10, V v10) {
            g();
            return m().set(i10, v10);
        }

        public List<V> subList(int i10, int i11) {
            g();
            return d.this.w(f(), m().subList(i10, i11), c() == null ? this : c());
        }

        public ListIterator<V> listIterator(int i10) {
            g();
            return new a(i10);
        }
    }
}
