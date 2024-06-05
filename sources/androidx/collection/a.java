package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    f<K, V> f1950i;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    class C0020a extends f<K, V> {
        C0020a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return a.this.f1991b[(i10 << 1) + i11];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f1992c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.g(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.i(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            a.this.l(i10);
        }

        /* access modifiers changed from: protected */
        public V i(int i10, V v10) {
            return a.this.m(i10, v10);
        }
    }

    public a() {
    }

    private f<K, V> o() {
        if (this.f1950i == null) {
            this.f1950i = new C0020a();
        }
        return this.f1950i;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    public Set<K> keySet() {
        return o().m();
    }

    public boolean p(Collection<?> collection) {
        return f.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        d(this.f1992c + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return o().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }
}
