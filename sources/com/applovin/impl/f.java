package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.h;
import com.applovin.impl.qc;
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
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class f extends h implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public transient Map f7525d;

    /* renamed from: f  reason: collision with root package name */
    private transient int f7526f;

    class a extends c {
        a() {
            super();
        }

        /* access modifiers changed from: package-private */
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    private class b extends qc.f {

        /* renamed from: c  reason: collision with root package name */
        final transient Map f7528c;

        class a extends qc.c {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map a() {
                return b.this;
            }

            public boolean contains(Object obj) {
                return o3.a(b.this.f7528c.entrySet(), obj);
            }

            public Iterator iterator() {
                return new C0118b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                f.this.c(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b  reason: collision with other inner class name */
        class C0118b implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            final Iterator f7531a;

            /* renamed from: b  reason: collision with root package name */
            Collection f7532b;

            C0118b() {
                this.f7531a = b.this.f7528c.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f7531a.next();
                this.f7532b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            public boolean hasNext() {
                return this.f7531a.hasNext();
            }

            public void remove() {
                n3.a(this.f7532b != null);
                this.f7531a.remove();
                f.b(f.this, this.f7532b.size());
                this.f7532b.clear();
                this.f7532b = null;
            }
        }

        b(Map map) {
            this.f7528c = map;
        }

        /* access modifiers changed from: package-private */
        public Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return qc.a(key, (Object) f.this.a(key, (Collection) entry.getValue()));
        }

        public void clear() {
            if (this.f7528c == f.this.f7525d) {
                f.this.clear();
            } else {
                sb.a((Iterator) new C0118b());
            }
        }

        public boolean containsKey(Object obj) {
            return qc.b(this.f7528c, obj);
        }

        public boolean equals(Object obj) {
            return this == obj || this.f7528c.equals(obj);
        }

        public int hashCode() {
            return this.f7528c.hashCode();
        }

        public Set keySet() {
            return f.this.e();
        }

        public int size() {
            return this.f7528c.size();
        }

        public String toString() {
            return this.f7528c.toString();
        }

        public Collection get(Object obj) {
            Collection collection = (Collection) qc.c(this.f7528c, obj);
            if (collection == null) {
                return null;
            }
            return f.this.a(obj, collection);
        }

        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f7528c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection g10 = f.this.g();
            g10.addAll(collection);
            f.b(f.this, collection.size());
            collection.clear();
            return g10;
        }

        /* access modifiers changed from: protected */
        public Set a() {
            return new a();
        }
    }

    private abstract class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final Iterator f7534a;

        /* renamed from: b  reason: collision with root package name */
        Object f7535b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection f7536c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator f7537d = sb.c();

        c() {
            this.f7534a = f.this.f7525d.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract Object a(Object obj, Object obj2);

        public boolean hasNext() {
            return this.f7534a.hasNext() || this.f7537d.hasNext();
        }

        public Object next() {
            if (!this.f7537d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f7534a.next();
                this.f7535b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f7536c = collection;
                this.f7537d = collection.iterator();
            }
            return a(this.f7535b, this.f7537d.next());
        }

        public void remove() {
            this.f7537d.remove();
            if (this.f7536c.isEmpty()) {
                this.f7534a.remove();
            }
            f.c(f.this);
        }
    }

    private class d extends qc.d {

        class a implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry f7540a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f7541b;

            a(Iterator it) {
                this.f7541b = it;
            }

            public boolean hasNext() {
                return this.f7541b.hasNext();
            }

            public Object next() {
                Map.Entry entry = (Map.Entry) this.f7541b.next();
                this.f7540a = entry;
                return entry.getKey();
            }

            public void remove() {
                n3.a(this.f7540a != null);
                Collection collection = (Collection) this.f7540a.getValue();
                this.f7541b.remove();
                f.b(f.this, collection.size());
                collection.clear();
                this.f7540a = null;
            }
        }

        d(Map map) {
            super(map);
        }

        public void clear() {
            sb.a(iterator());
        }

        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        public int hashCode() {
            return a().keySet().hashCode();
        }

        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                f.b(f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    class e extends h implements NavigableMap {
        e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* renamed from: a */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        /* renamed from: b */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = d().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public Object ceilingKey(Object obj) {
            return d().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return new e(d().descendingMap());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public NavigableSet c() {
            return new C0119f(d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        public Map.Entry firstEntry() {
            Map.Entry firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = d().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public Object floorKey(Object obj) {
            return d().floorKey(obj);
        }

        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = d().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public Object higherKey(Object obj) {
            return d().higherKey(obj);
        }

        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry lastEntry() {
            Map.Entry lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = d().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        public Object lowerKey(Object obj) {
            return d().lowerKey(obj);
        }

        public NavigableSet navigableKeySet() {
            return keySet();
        }

        public Map.Entry pollFirstEntry() {
            return a(entrySet().iterator());
        }

        public Map.Entry pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        /* access modifiers changed from: package-private */
        public Map.Entry a(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection g10 = f.this.g();
            g10.addAll((Collection) entry.getValue());
            it.remove();
            return qc.a(entry.getKey(), (Object) f.this.c(g10));
        }

        public NavigableMap headMap(Object obj, boolean z10) {
            return new e(d().headMap(obj, z10));
        }

        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return new e(d().subMap(obj, z10, obj2, z11));
        }

        public NavigableMap tailMap(Object obj, boolean z10) {
            return new e(d().tailMap(obj, z10));
        }

        /* renamed from: a */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* renamed from: com.applovin.impl.f$f  reason: collision with other inner class name */
    class C0119f extends i implements NavigableSet {
        C0119f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* renamed from: a */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return new C0119f(b().descendingMap());
        }

        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        public Object pollFirst() {
            return sb.c(iterator());
        }

        public Object pollLast() {
            return sb.c(descendingIterator());
        }

        /* renamed from: a */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        /* renamed from: b */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public NavigableSet headSet(Object obj, boolean z10) {
            return new C0119f(b().headMap(obj, z10));
        }

        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new C0119f(b().subMap(obj, z10, obj2, z11));
        }

        public NavigableSet tailSet(Object obj, boolean z10) {
            return new C0119f(b().tailMap(obj, z10));
        }
    }

    private class g extends k implements RandomAccess {
        g(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    private class h extends b implements SortedMap {

        /* renamed from: f  reason: collision with root package name */
        SortedSet f7546f;

        h(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedSet c() {
            return new i(d());
        }

        public Comparator comparator() {
            return d().comparator();
        }

        /* access modifiers changed from: package-private */
        public SortedMap d() {
            return (SortedMap) this.f7528c;
        }

        public Object firstKey() {
            return d().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new h(d().headMap(obj));
        }

        public Object lastKey() {
            return d().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new h(d().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new h(d().tailMap(obj));
        }

        public SortedSet keySet() {
            SortedSet sortedSet = this.f7546f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet c10 = c();
            this.f7546f = c10;
            return c10;
        }
    }

    private class i extends d implements SortedSet {
        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap b() {
            return (SortedMap) super.a();
        }

        public Comparator comparator() {
            return b().comparator();
        }

        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new i(b().headMap(obj));
        }

        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new i(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new i(b().tailMap(obj));
        }
    }

    protected f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f7525d = map;
    }

    static /* synthetic */ int b(f fVar) {
        int i10 = fVar.f7526f;
        fVar.f7526f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int c(f fVar) {
        int i10 = fVar.f7526f;
        fVar.f7526f = i10 - 1;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public abstract Collection a(Object obj, Collection collection);

    /* access modifiers changed from: package-private */
    public abstract Collection c(Collection collection);

    public void clear() {
        for (Collection clear : this.f7525d.values()) {
            clear.clear();
        }
        this.f7525d.clear();
        this.f7526f = 0;
    }

    /* access modifiers changed from: package-private */
    public Collection d() {
        return new h.a();
    }

    /* access modifiers changed from: package-private */
    public Iterator f() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public abstract Collection g();

    /* access modifiers changed from: package-private */
    public final Map h() {
        Map map = this.f7525d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f7525d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f7525d);
        }
        return new b(this.f7525d);
    }

    /* access modifiers changed from: package-private */
    public final Set i() {
        Map map = this.f7525d;
        if (map instanceof NavigableMap) {
            return new C0119f((NavigableMap) this.f7525d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f7525d);
        }
        return new d(this.f7525d);
    }

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7525d.get(obj);
        if (collection == null) {
            Collection b10 = b(obj);
            if (b10.add(obj2)) {
                this.f7526f++;
                this.f7525d.put(obj, b10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f7526f++;
            return true;
        }
    }

    public int size() {
        return this.f7526f;
    }

    public Collection values() {
        return super.values();
    }

    class j extends AbstractCollection {

        /* renamed from: a  reason: collision with root package name */
        final Object f7549a;

        /* renamed from: b  reason: collision with root package name */
        Collection f7550b;

        /* renamed from: c  reason: collision with root package name */
        final j f7551c;

        /* renamed from: d  reason: collision with root package name */
        final Collection f7552d;

        j(Object obj, Collection collection, j jVar) {
            Collection collection2;
            this.f7549a = obj;
            this.f7550b = collection;
            this.f7551c = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.c();
            }
            this.f7552d = collection2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            j jVar = this.f7551c;
            if (jVar != null) {
                jVar.a();
            } else {
                f.this.f7525d.put(this.f7549a, this.f7550b);
            }
        }

        public boolean add(Object obj) {
            e();
            boolean isEmpty = this.f7550b.isEmpty();
            boolean add = this.f7550b.add(obj);
            if (add) {
                f.b(f.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f7550b.addAll(collection);
            if (addAll) {
                f.a(f.this, this.f7550b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public j b() {
            return this.f7551c;
        }

        /* access modifiers changed from: package-private */
        public Collection c() {
            return this.f7550b;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f7550b.clear();
                f.b(f.this, size);
                f();
            }
        }

        public boolean contains(Object obj) {
            e();
            return this.f7550b.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            e();
            return this.f7550b.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        public Object d() {
            return this.f7549a;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            Collection collection;
            j jVar = this.f7551c;
            if (jVar != null) {
                jVar.e();
                if (this.f7551c.c() != this.f7552d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f7550b.isEmpty() && (collection = (Collection) f.this.f7525d.get(this.f7549a)) != null) {
                this.f7550b = collection;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f7550b.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public void f() {
            j jVar = this.f7551c;
            if (jVar != null) {
                jVar.f();
            } else if (this.f7550b.isEmpty()) {
                f.this.f7525d.remove(this.f7549a);
            }
        }

        public int hashCode() {
            e();
            return this.f7550b.hashCode();
        }

        public Iterator iterator() {
            e();
            return new a();
        }

        public boolean remove(Object obj) {
            e();
            boolean remove = this.f7550b.remove(obj);
            if (remove) {
                f.c(f.this);
                f();
            }
            return remove;
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f7550b.removeAll(collection);
            if (removeAll) {
                f.a(f.this, this.f7550b.size() - size);
                f();
            }
            return removeAll;
        }

        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f7550b.retainAll(collection);
            if (retainAll) {
                f.a(f.this, this.f7550b.size() - size);
                f();
            }
            return retainAll;
        }

        public int size() {
            e();
            return this.f7550b.size();
        }

        public String toString() {
            e();
            return this.f7550b.toString();
        }

        class a implements Iterator {

            /* renamed from: a  reason: collision with root package name */
            final Iterator f7554a;

            /* renamed from: b  reason: collision with root package name */
            final Collection f7555b;

            a() {
                Collection collection = j.this.f7550b;
                this.f7555b = collection;
                this.f7554a = f.b(collection);
            }

            /* access modifiers changed from: package-private */
            public Iterator a() {
                b();
                return this.f7554a;
            }

            /* access modifiers changed from: package-private */
            public void b() {
                j.this.e();
                if (j.this.f7550b != this.f7555b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                b();
                return this.f7554a.hasNext();
            }

            public Object next() {
                b();
                return this.f7554a.next();
            }

            public void remove() {
                this.f7554a.remove();
                f.c(f.this);
                j.this.f();
            }

            a(Iterator it) {
                this.f7555b = j.this.f7550b;
                this.f7554a = it;
            }
        }
    }

    class k extends j implements List {

        private class a extends j.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            public void add(Object obj) {
                boolean isEmpty = k.this.isEmpty();
                c().add(obj);
                f.b(f.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public Object previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(k.this.g().listIterator(i10));
            }
        }

        k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        public void add(int i10, Object obj) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i10, obj);
            f.b(f.this);
            if (isEmpty) {
                a();
            }
        }

        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i10, collection);
            if (addAll) {
                f.a(f.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public List g() {
            return (List) c();
        }

        public Object get(int i10) {
            e();
            return g().get(i10);
        }

        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        public ListIterator listIterator() {
            e();
            return new a();
        }

        public Object remove(int i10) {
            e();
            Object remove = g().remove(i10);
            f.c(f.this);
            f();
            return remove;
        }

        public Object set(int i10, Object obj) {
            e();
            return g().set(i10, obj);
        }

        public List subList(int i10, int i11) {
            e();
            return f.this.a(d(), g().subList(i10, i11), b() == null ? this : b());
        }

        public ListIterator listIterator(int i10) {
            e();
            return new a(i10);
        }
    }

    static /* synthetic */ int b(f fVar, int i10) {
        int i11 = fVar.f7526f - i10;
        fVar.f7526f = i11;
        return i11;
    }

    /* access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) qc.d(this.f7525d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f7526f -= size;
        }
    }

    static /* synthetic */ int a(f fVar, int i10) {
        int i11 = fVar.f7526f + i10;
        fVar.f7526f = i11;
        return i11;
    }

    /* access modifiers changed from: package-private */
    public Collection b(Object obj) {
        return g();
    }

    /* access modifiers changed from: private */
    public static Iterator b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: package-private */
    public final List a(Object obj, List list, j jVar) {
        if (list instanceof RandomAccess) {
            return new g(obj, list, jVar);
        }
        return new k(obj, list, jVar);
    }
}
