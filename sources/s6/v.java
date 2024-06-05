package s6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import s6.s;

/* compiled from: ImmutableMap */
public abstract class v<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f30258d = new Map.Entry[0];

    /* renamed from: a  reason: collision with root package name */
    private transient x<Map.Entry<K, V>> f30259a;

    /* renamed from: b  reason: collision with root package name */
    private transient x<K> f30260b;

    /* renamed from: c  reason: collision with root package name */
    private transient s<V> f30261c;

    /* compiled from: ImmutableMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f30262a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f30263b;

        /* renamed from: c  reason: collision with root package name */
        int f30264c;

        /* renamed from: d  reason: collision with root package name */
        boolean f30265d;

        /* renamed from: e  reason: collision with root package name */
        C0339a f30266e;

        /* renamed from: s6.v$a$a  reason: collision with other inner class name */
        /* compiled from: ImmutableMap */
        static final class C0339a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f30267a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f30268b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f30269c;

            C0339a(Object obj, Object obj2, Object obj3) {
                this.f30267a = obj;
                this.f30268b = obj2;
                this.f30269c = obj3;
            }

            /* access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f30267a);
                String valueOf2 = String.valueOf(this.f30268b);
                String valueOf3 = String.valueOf(this.f30267a);
                String valueOf4 = String.valueOf(this.f30269c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        private v<K, V> b(boolean z10) {
            Object[] objArr;
            C0339a aVar;
            C0339a aVar2;
            if (!z10 || (aVar2 = this.f30266e) == null) {
                int i10 = this.f30264c;
                if (this.f30262a == null) {
                    objArr = this.f30263b;
                } else {
                    if (this.f30265d) {
                        this.f30263b = Arrays.copyOf(this.f30263b, i10 * 2);
                    }
                    objArr = this.f30263b;
                    if (!z10) {
                        objArr = e(objArr, this.f30264c);
                        if (objArr.length < this.f30263b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    i(objArr, i10, this.f30262a);
                }
                this.f30265d = true;
                s0 m10 = s0.m(i10, objArr, this);
                if (!z10 || (aVar = this.f30266e) == null) {
                    return m10;
                }
                throw aVar.a();
            }
            throw aVar2.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f30263b;
            if (i11 > objArr.length) {
                this.f30263b = Arrays.copyOf(objArr, s.b.c(objArr.length, i11));
                this.f30265d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i10 - bitSet.cardinality()) * 2)];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, p0.a(comparator).e(g0.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public v<K, V> a() {
            return c();
        }

        public v<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f30264c + 1);
            i.a(k10, v10);
            Object[] objArr = this.f30263b;
            int i10 = this.f30264c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f30264c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f30264c + ((Collection) iterable).size());
            }
            for (Map.Entry g10 : iterable) {
                g(g10);
            }
            return this;
        }

        a(int i10) {
            this.f30263b = new Object[(i10 * 2)];
            this.f30264c = 0;
            this.f30265d = false;
        }
    }

    v() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> v<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> v<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof v) && !(map instanceof SortedMap)) {
            v<K, V> vVar = (v) map;
            if (!vVar.i()) {
                return vVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> v<K, V> k() {
        return s0.f30227i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract x<Map.Entry<K, V>> e();

    public boolean equals(Object obj) {
        return g0.c(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract x<K> f();

    /* access modifiers changed from: package-private */
    public abstract s<V> g();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    /* renamed from: h */
    public x<Map.Entry<K, V>> entrySet() {
        x<Map.Entry<K, V>> xVar = this.f30259a;
        if (xVar != null) {
            return xVar;
        }
        x<Map.Entry<K, V>> e10 = e();
        this.f30259a = e10;
        return e10;
    }

    public int hashCode() {
        return y0.d(entrySet());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public x<K> keySet() {
        x<K> xVar = this.f30260b;
        if (xVar != null) {
            return xVar;
        }
        x<K> f10 = f();
        this.f30260b = f10;
        return f10;
    }

    /* renamed from: l */
    public s<V> values() {
        s<V> sVar = this.f30261c;
        if (sVar != null) {
            return sVar;
        }
        s<V> g10 = g();
        this.f30261c = g10;
        return g10;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return g0.j(this);
    }
}
