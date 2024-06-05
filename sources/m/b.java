package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f20012a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f20013b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f20014c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f20015d = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f20019d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f20018c;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    private static class C0213b<K, V> extends e<K, V> {
        C0213b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f20018c;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f20019d;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f20016a;

        /* renamed from: b  reason: collision with root package name */
        final V f20017b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f20018c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f20019d;

        c(K k10, V v10) {
            this.f20016a = k10;
            this.f20017b = v10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f20016a.equals(cVar.f20016a) || !this.f20017b.equals(cVar.f20017b)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f20016a;
        }

        public V getValue() {
            return this.f20017b;
        }

        public int hashCode() {
            return this.f20016a.hashCode() ^ this.f20017b.hashCode();
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20016a + "=" + this.f20017b;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f20020a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20021b = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f20020a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f20019d;
                this.f20020a = cVar3;
                this.f20021b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f20021b) {
                this.f20021b = false;
                this.f20020a = b.this.f20012a;
            } else {
                c<K, V> cVar = this.f20020a;
                this.f20020a = cVar != null ? cVar.f20018c : null;
            }
            return this.f20020a;
        }

        public boolean hasNext() {
            if (!this.f20021b) {
                c<K, V> cVar = this.f20020a;
                if (cVar == null || cVar.f20018c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f20012a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f20023a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f20024b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f20023a = cVar2;
            this.f20024b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f20024b;
            c<K, V> cVar2 = this.f20023a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f20023a == cVar && cVar == this.f20024b) {
                this.f20024b = null;
                this.f20023a = null;
            }
            c<K, V> cVar2 = this.f20023a;
            if (cVar2 == cVar) {
                this.f20023a = b(cVar2);
            }
            if (this.f20024b == cVar) {
                this.f20024b = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f20024b;
            this.f20024b = e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f20024b != null;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class f<K, V> {
        /* access modifiers changed from: package-private */
        public abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> b() {
        return this.f20012a;
    }

    /* access modifiers changed from: protected */
    public c<K, V> c(K k10) {
        c<K, V> cVar = this.f20012a;
        while (cVar != null && !cVar.f20016a.equals(k10)) {
            cVar = cVar.f20018c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0213b bVar = new C0213b(this.f20013b, this.f20012a);
        this.f20014c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f20014c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public Map.Entry<K, V> f() {
        return this.f20013b;
    }

    /* access modifiers changed from: package-private */
    public c<K, V> g(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f20015d++;
        c<K, V> cVar2 = this.f20013b;
        if (cVar2 == null) {
            this.f20012a = cVar;
            this.f20013b = cVar;
            return cVar;
        }
        cVar2.f20018c = cVar;
        cVar.f20019d = cVar2;
        this.f20013b = cVar;
        return cVar;
    }

    public V h(K k10, V v10) {
        c c10 = c(k10);
        if (c10 != null) {
            return c10.f20017b;
        }
        g(k10, v10);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f20012a, this.f20013b);
        this.f20014c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V m(K k10) {
        c c10 = c(k10);
        if (c10 == null) {
            return null;
        }
        this.f20015d--;
        if (!this.f20014c.isEmpty()) {
            for (f<K, V> a10 : this.f20014c.keySet()) {
                a10.a(c10);
            }
        }
        c<K, V> cVar = c10.f20019d;
        if (cVar != null) {
            cVar.f20018c = c10.f20018c;
        } else {
            this.f20012a = c10.f20018c;
        }
        c<K, V> cVar2 = c10.f20018c;
        if (cVar2 != null) {
            cVar2.f20019d = cVar;
        } else {
            this.f20013b = cVar;
        }
        c10.f20018c = null;
        c10.f20019d = null;
        return c10.f20017b;
    }

    public int size() {
        return this.f20015d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
