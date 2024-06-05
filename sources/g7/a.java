package g7;

import g7.c;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ArraySortedMap */
public class a<K, V> extends c<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final K[] f28898a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final V[] f28899b;

    /* renamed from: c  reason: collision with root package name */
    private final Comparator<K> f28900c;

    /* renamed from: g7.a$a  reason: collision with other inner class name */
    /* compiled from: ArraySortedMap */
    class C0303a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        int f28901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28902b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f28903c;

        C0303a(int i10, boolean z10) {
            this.f28902b = i10;
            this.f28903c = z10;
            this.f28901a = i10;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Object obj = a.this.f28898a[this.f28901a];
            Object[] p10 = a.this.f28899b;
            int i10 = this.f28901a;
            Object obj2 = p10[i10];
            this.f28901a = this.f28903c ? i10 - 1 : i10 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        public boolean hasNext() {
            if (this.f28903c) {
                if (this.f28901a >= 0) {
                    return true;
                }
            } else if (this.f28901a < a.this.f28898a.length) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public a(Comparator<K> comparator) {
        this.f28898a = new Object[0];
        this.f28899b = new Object[0];
        this.f28900c = comparator;
    }

    private static <T> T[] q(T[] tArr, int i10, T t10) {
        int length = tArr.length + 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        tArr2[i10] = t10;
        System.arraycopy(tArr, i10, tArr2, i10 + 1, (length - i10) - 1);
        return tArr2;
    }

    public static <A, B, C> a<A, C> u(List<A> list, Map<B, C> map, c.a.C0304a<A, B> aVar, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        for (A next : list) {
            objArr[i10] = next;
            objArr2[i10] = map.get(aVar.a(next));
            i10++;
        }
        return new a<>(comparator, objArr, objArr2);
    }

    private int v(K k10) {
        int i10 = 0;
        for (K compare : this.f28898a) {
            if (this.f28900c.compare(k10, compare) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int w(K k10) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f28898a;
            if (i10 >= kArr.length || this.f28900c.compare(kArr[i10], k10) >= 0) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    private Iterator<Map.Entry<K, V>> x(int i10, boolean z10) {
        return new C0303a(i10, z10);
    }

    private static <T> T[] y(T[] tArr, int i10) {
        int length = tArr.length - 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        System.arraycopy(tArr, i10 + 1, tArr2, i10, length - i10);
        return tArr2;
    }

    private static <T> T[] z(T[] tArr, int i10, T t10) {
        int length = tArr.length;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i10] = t10;
        return tArr2;
    }

    public boolean b(K k10) {
        return v(k10) != -1;
    }

    public V c(K k10) {
        int v10 = v(k10);
        if (v10 != -1) {
            return this.f28899b[v10];
        }
        return null;
    }

    public Comparator<K> e() {
        return this.f28900c;
    }

    public K f() {
        K[] kArr = this.f28898a;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    public K g() {
        K[] kArr = this.f28898a;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    public c<K, V> h(K k10, V v10) {
        int v11 = v(k10);
        if (v11 != -1) {
            K[] kArr = this.f28898a;
            if (kArr[v11] == k10 && this.f28899b[v11] == v10) {
                return this;
            }
            return new a(this.f28900c, z(kArr, v11, k10), z(this.f28899b, v11, v10));
        } else if (this.f28898a.length > 25) {
            HashMap hashMap = new HashMap(this.f28898a.length + 1);
            int i10 = 0;
            while (true) {
                K[] kArr2 = this.f28898a;
                if (i10 < kArr2.length) {
                    hashMap.put(kArr2[i10], this.f28899b[i10]);
                    i10++;
                } else {
                    hashMap.put(k10, v10);
                    return k.p(hashMap, this.f28900c);
                }
            }
        } else {
            int w10 = w(k10);
            return new a(this.f28900c, q(this.f28898a, w10, k10), q(this.f28899b, w10, v10));
        }
    }

    public int indexOf(K k10) {
        return v(k10);
    }

    public boolean isEmpty() {
        return this.f28898a.length == 0;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return x(0, false);
    }

    public Iterator<Map.Entry<K, V>> m(K k10) {
        return x(w(k10), false);
    }

    public c<K, V> n(K k10) {
        int v10 = v(k10);
        if (v10 == -1) {
            return this;
        }
        return new a(this.f28900c, y(this.f28898a, v10), y(this.f28899b, v10));
    }

    public int size() {
        return this.f28898a.length;
    }

    private a(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f28898a = kArr;
        this.f28899b = vArr;
        this.f28900c = comparator;
    }
}
