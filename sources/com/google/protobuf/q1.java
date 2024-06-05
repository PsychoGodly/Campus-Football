package com.google.protobuf;

import com.google.protobuf.v;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class q1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f27182a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<q1<K, V>.defpackage.e> f27183b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f27184c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27185d;

    /* renamed from: f  reason: collision with root package name */
    private volatile q1<K, V>.defpackage.g f27186f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map<K, V> f27187g;

    /* renamed from: h  reason: collision with root package name */
    private volatile q1<K, V>.defpackage.c f27188h;

    /* compiled from: SmallSortedMap */
    class a extends q1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return q1.super.put((Comparable) obj, obj2);
        }

        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry k10 = k(i10);
                    if (((v.b) k10.getKey()).J()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry entry : n()) {
                    if (((v.b) entry.getKey()).J()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            q1.super.q();
        }
    }

    /* compiled from: SmallSortedMap */
    private class c extends q1<K, V>.defpackage.g {
        private c() {
            super(q1.this, (a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(q1.this, (a) null);
        }

        /* synthetic */ c(q1 q1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f27193a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f27194b = new b();

        /* compiled from: SmallSortedMap */
        class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap */
        class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.f27193a;
            }
        }

        static <T> Iterable<T> b() {
            return f27194b;
        }
    }

    /* compiled from: SmallSortedMap */
    private class e implements Map.Entry<K, V>, Comparable<q1<K, V>.defpackage.e> {

        /* renamed from: a  reason: collision with root package name */
        private final K f27195a;

        /* renamed from: b  reason: collision with root package name */
        private V f27196b;

        e(q1 q1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(q1<K, V>.defpackage.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public K getKey() {
            return this.f27195a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!c(this.f27195a, entry.getKey()) || !c(this.f27196b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f27196b;
        }

        public int hashCode() {
            K k10 = this.f27195a;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f27196b;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            q1.this.h();
            V v11 = this.f27196b;
            this.f27196b = v10;
            return v11;
        }

        public String toString() {
            return this.f27195a + "=" + this.f27196b;
        }

        e(K k10, V v10) {
            this.f27195a = k10;
            this.f27196b = v10;
        }
    }

    /* compiled from: SmallSortedMap */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            q1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            q1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(q1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return q1.this.size();
        }

        /* synthetic */ g(q1 q1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ q1(int i10, a aVar) {
        this(i10);
    }

    private int g(K k10) {
        int size = this.f27183b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f27183b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f27183b.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f27185d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (this.f27183b.isEmpty() && !(this.f27183b instanceof ArrayList)) {
            this.f27183b = new ArrayList(this.f27182a);
        }
    }

    private SortedMap<K, V> o() {
        h();
        if (this.f27184c.isEmpty() && !(this.f27184c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f27184c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f27187g = treeMap.descendingMap();
        }
        return (SortedMap) this.f27184c;
    }

    static <FieldDescriptorType extends v.b<FieldDescriptorType>> q1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public V t(int i10) {
        h();
        V value = this.f27183b.remove(i10).getValue();
        if (!this.f27184c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f27183b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        h();
        if (!this.f27183b.isEmpty()) {
            this.f27183b.clear();
        }
        if (!this.f27184c.isEmpty()) {
            this.f27184c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f27184c.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f27186f == null) {
            this.f27186f = new g(this, (a) null);
        }
        return this.f27186f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return super.equals(obj);
        }
        q1 q1Var = (q1) obj;
        int size = size();
        if (size != q1Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != q1Var.l()) {
            return entrySet().equals(q1Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!k(i10).equals(q1Var.k(i10))) {
                return false;
            }
        }
        if (l10 != size) {
            return this.f27184c.equals(q1Var.f27184c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        if (g10 >= 0) {
            return this.f27183b.get(g10).getValue();
        }
        return this.f27184c.get(comparable);
    }

    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f27183b.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.f27184c.hashCode() : i10;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> i() {
        if (this.f27188h == null) {
            this.f27188h = new c(this, (a) null);
        }
        return this.f27188h;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f27183b.get(i10);
    }

    public int l() {
        return this.f27183b.size();
    }

    public int m() {
        return this.f27184c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        if (this.f27184c.isEmpty()) {
            return d.b();
        }
        return this.f27184c.entrySet();
    }

    public boolean p() {
        return this.f27185d;
    }

    public void q() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f27185d) {
            if (this.f27184c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f27184c);
            }
            this.f27184c = map;
            if (this.f27187g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f27187g);
            }
            this.f27187g = map2;
            this.f27185d = true;
        }
    }

    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g10 = g(comparable);
        if (g10 >= 0) {
            return t(g10);
        }
        if (this.f27184c.isEmpty()) {
            return null;
        }
        return this.f27184c.remove(comparable);
    }

    /* renamed from: s */
    public V put(K k10, V v10) {
        h();
        int g10 = g(k10);
        if (g10 >= 0) {
            return this.f27183b.get(g10).setValue(v10);
        }
        j();
        int i10 = -(g10 + 1);
        if (i10 >= this.f27182a) {
            return o().put(k10, v10);
        }
        int size = this.f27183b.size();
        int i11 = this.f27182a;
        if (size == i11) {
            e remove = this.f27183b.remove(i11 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f27183b.add(i10, new e(k10, v10));
        return null;
    }

    public int size() {
        return this.f27183b.size() + this.f27184c.size();
    }

    /* compiled from: SmallSortedMap */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f27189a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f27190b;

        private b() {
            this.f27189a = q1.this.f27183b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f27190b == null) {
                this.f27190b = q1.this.f27187g.entrySet().iterator();
            }
            return this.f27190b;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b10 = q1.this.f27183b;
            int i10 = this.f27189a - 1;
            this.f27189a = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f27189a;
            return (i10 > 0 && i10 <= q1.this.f27183b.size()) || a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(q1 q1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f27198a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f27199b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f27200c;

        private f() {
            this.f27198a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f27200c == null) {
                this.f27200c = q1.this.f27184c.entrySet().iterator();
            }
            return this.f27200c;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f27199b = true;
            int i10 = this.f27198a + 1;
            this.f27198a = i10;
            if (i10 < q1.this.f27183b.size()) {
                return (Map.Entry) q1.this.f27183b.get(this.f27198a);
            }
            return (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f27198a + 1 < q1.this.f27183b.size()) {
                return true;
            }
            if (q1.this.f27184c.isEmpty() || !a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f27199b) {
                this.f27199b = false;
                q1.this.h();
                if (this.f27198a < q1.this.f27183b.size()) {
                    q1 q1Var = q1.this;
                    int i10 = this.f27198a;
                    this.f27198a = i10 - 1;
                    Object unused = q1Var.t(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(q1 q1Var, a aVar) {
            this();
        }
    }

    private q1(int i10) {
        this.f27182a = i10;
        this.f27183b = Collections.emptyList();
        this.f27184c = Collections.emptyMap();
        this.f27187g = Collections.emptyMap();
    }
}
