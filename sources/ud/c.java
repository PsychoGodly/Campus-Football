package ud;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import td.e0;

/* compiled from: MapBuilder.kt */
public final class c<K, V> implements Map<K, V>, Serializable, ge.b {

    /* renamed from: n  reason: collision with root package name */
    private static final a f38765n = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public K[] f38766a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public V[] f38767b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int[] f38768c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f38769d;

    /* renamed from: f  reason: collision with root package name */
    private int f38770f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f38771g;

    /* renamed from: h  reason: collision with root package name */
    private int f38772h;

    /* renamed from: i  reason: collision with root package name */
    private int f38773i;

    /* renamed from: j  reason: collision with root package name */
    private e<K> f38774j;

    /* renamed from: k  reason: collision with root package name */
    private f<V> f38775k;

    /* renamed from: l  reason: collision with root package name */
    private d<K, V> f38776l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f38777m;

    /* compiled from: MapBuilder.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(i.a(i10, 1) * 3);
        }

        /* access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, ge.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c<K, V> cVar) {
            super(cVar);
            m.e(cVar, "map");
        }

        /* renamed from: h */
        public C0448c<K, V> next() {
            if (a() < d().f38771g) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                C0448c<K, V> cVar = new C0448c<>(d(), b());
                e();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb2) {
            m.e(sb2, "sb");
            if (a() < d().f38771g) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object obj = d().f38766a[b()];
                if (m.a(obj, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] f10 = d().f38767b;
                m.b(f10);
                Object obj2 = f10[b()];
                if (m.a(obj2, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                e();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            if (a() < d().f38771g) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                Object obj = d().f38766a[b()];
                int i10 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] f10 = d().f38767b;
                m.b(f10);
                Object obj2 = f10[b()];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                int i11 = hashCode ^ i10;
                e();
                return i11;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: ud.c$c  reason: collision with other inner class name */
    /* compiled from: MapBuilder.kt */
    public static final class C0448c<K, V> implements Map.Entry<K, V>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private final c<K, V> f38778a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38779b;

        public C0448c(c<K, V> cVar, int i10) {
            m.e(cVar, "map");
            this.f38778a = cVar;
            this.f38779b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f38778a.f38766a[this.f38779b];
        }

        public V getValue() {
            V[] f10 = this.f38778a.f38767b;
            m.b(f10);
            return f10[this.f38779b];
        }

        public int hashCode() {
            Object key = getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            this.f38778a.k();
            V[] a10 = this.f38778a.i();
            int i10 = this.f38779b;
            V v11 = a10[i10];
            a10[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final c<K, V> f38780a;

        /* renamed from: b  reason: collision with root package name */
        private int f38781b;

        /* renamed from: c  reason: collision with root package name */
        private int f38782c = -1;

        public d(c<K, V> cVar) {
            m.e(cVar, "map");
            this.f38780a = cVar;
            e();
        }

        public final int a() {
            return this.f38781b;
        }

        public final int b() {
            return this.f38782c;
        }

        public final c<K, V> d() {
            return this.f38780a;
        }

        public final void e() {
            while (this.f38781b < this.f38780a.f38771g) {
                int[] e10 = this.f38780a.f38768c;
                int i10 = this.f38781b;
                if (e10[i10] < 0) {
                    this.f38781b = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final void f(int i10) {
            this.f38781b = i10;
        }

        public final void g(int i10) {
            this.f38782c = i10;
        }

        public final boolean hasNext() {
            return this.f38781b < this.f38780a.f38771g;
        }

        public final void remove() {
            if (this.f38782c != -1) {
                this.f38780a.k();
                this.f38780a.J(this.f38782c);
                this.f38782c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, ge.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c<K, V> cVar) {
            super(cVar);
            m.e(cVar, "map");
        }

        public K next() {
            if (a() < d().f38771g) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                K k10 = d().f38766a[b()];
                e();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, ge.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(c<K, V> cVar) {
            super(cVar);
            m.e(cVar, "map");
        }

        public V next() {
            if (a() < d().f38771g) {
                int a10 = a();
                f(a10 + 1);
                g(a10);
                V[] f10 = d().f38767b;
                m.b(f10);
                V v10 = f10[b()];
                e();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    private c(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f38766a = kArr;
        this.f38767b = vArr;
        this.f38768c = iArr;
        this.f38769d = iArr2;
        this.f38770f = i10;
        this.f38771g = i11;
        this.f38772h = f38765n.d(w());
    }

    private final int A(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * -1640531527) >>> this.f38772h;
    }

    private final boolean C(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        q(collection.size());
        for (Map.Entry D : collection) {
            if (D(D)) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean D(Map.Entry<? extends K, ? extends V> entry) {
        int h10 = h(entry.getKey());
        Object[] i10 = i();
        if (h10 >= 0) {
            i10[h10] = entry.getValue();
            return true;
        }
        int i11 = (-h10) - 1;
        if (m.a(entry.getValue(), i10[i11])) {
            return false;
        }
        i10[i11] = entry.getValue();
        return true;
    }

    private final boolean E(int i10) {
        int A = A(this.f38766a[i10]);
        int i11 = this.f38770f;
        while (true) {
            int[] iArr = this.f38769d;
            if (iArr[A] == 0) {
                iArr[A] = i10 + 1;
                this.f38768c[i10] = A;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final void F(int i10) {
        if (this.f38771g > size()) {
            l();
        }
        int i11 = 0;
        if (i10 != w()) {
            this.f38769d = new int[i10];
            this.f38772h = f38765n.d(i10);
        } else {
            l.e(this.f38769d, 0, 0, w());
        }
        while (i11 < this.f38771g) {
            int i12 = i11 + 1;
            if (E(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void H(int i10) {
        int c10 = i.c(this.f38770f * 2, w() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? w() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f38770f) {
                this.f38769d[i12] = 0;
                return;
            }
            int[] iArr = this.f38769d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((A(this.f38766a[i14]) - i10) & (w() - 1)) >= i11) {
                    this.f38769d[i12] = i13;
                    this.f38768c[i14] = i12;
                }
                c10--;
            }
            i12 = i10;
            i11 = 0;
            c10--;
        } while (c10 >= 0);
        this.f38769d[i12] = -1;
    }

    /* access modifiers changed from: private */
    public final void J(int i10) {
        b.c(this.f38766a, i10);
        H(this.f38768c[i10]);
        this.f38768c[i10] = -1;
        this.f38773i = size() - 1;
    }

    private final boolean L(int i10) {
        int u10 = u();
        int i11 = this.f38771g;
        int i12 = u10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= u() / 4;
    }

    /* access modifiers changed from: private */
    public final V[] i() {
        V[] vArr = this.f38767b;
        if (vArr != null) {
            return vArr;
        }
        V[] a10 = b.a(u());
        this.f38767b = a10;
        return a10;
    }

    private final void l() {
        int i10;
        V[] vArr = this.f38767b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f38771g;
            if (i11 >= i10) {
                break;
            }
            if (this.f38768c[i11] >= 0) {
                K[] kArr = this.f38766a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        b.d(this.f38766a, i12, i10);
        if (vArr != null) {
            b.d(vArr, i12, this.f38771g);
        }
        this.f38771g = i12;
    }

    private final boolean o(Map<?, ?> map) {
        return size() == map.size() && m(map.entrySet());
    }

    private final void p(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        } else if (i10 > u()) {
            int u10 = (u() * 3) / 2;
            if (i10 <= u10) {
                i10 = u10;
            }
            this.f38766a = b.b(this.f38766a, i10);
            V[] vArr = this.f38767b;
            this.f38767b = vArr != null ? b.b(vArr, i10) : null;
            int[] copyOf = Arrays.copyOf(this.f38768c, i10);
            m.d(copyOf, "copyOf(this, newSize)");
            this.f38768c = copyOf;
            int a10 = f38765n.c(i10);
            if (a10 > w()) {
                F(a10);
            }
        }
    }

    private final void q(int i10) {
        if (L(i10)) {
            F(w());
        } else {
            p(this.f38771g + i10);
        }
    }

    private final int s(K k10) {
        int A = A(k10);
        int i10 = this.f38770f;
        while (true) {
            int i11 = this.f38769d[A];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (m.a(this.f38766a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            A = A == 0 ? w() - 1 : A - 1;
        }
    }

    private final int t(V v10) {
        int i10 = this.f38771g;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f38768c[i10] >= 0) {
                V[] vArr = this.f38767b;
                m.b(vArr);
                if (m.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int w() {
        return this.f38769d.length;
    }

    public final e<K, V> B() {
        return new e<>(this);
    }

    public final boolean G(Map.Entry<? extends K, ? extends V> entry) {
        m.e(entry, "entry");
        k();
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f38767b;
        m.b(vArr);
        if (!m.a(vArr[s10], entry.getValue())) {
            return false;
        }
        J(s10);
        return true;
    }

    public final int I(K k10) {
        k();
        int s10 = s(k10);
        if (s10 < 0) {
            return -1;
        }
        J(s10);
        return s10;
    }

    public final boolean K(V v10) {
        k();
        int t10 = t(v10);
        if (t10 < 0) {
            return false;
        }
        J(t10);
        return true;
    }

    public final f<K, V> M() {
        return new f<>(this);
    }

    public void clear() {
        k();
        e0 g10 = new ke.c(0, this.f38771g - 1).iterator();
        while (g10.hasNext()) {
            int a10 = g10.a();
            int[] iArr = this.f38768c;
            int i10 = iArr[a10];
            if (i10 >= 0) {
                this.f38769d[i10] = 0;
                iArr[a10] = -1;
            }
        }
        b.d(this.f38766a, 0, this.f38771g);
        V[] vArr = this.f38767b;
        if (vArr != null) {
            b.d(vArr, 0, this.f38771g);
        }
        this.f38773i = 0;
        this.f38771g = 0;
    }

    public boolean containsKey(Object obj) {
        return s(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return t(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return v();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && o((Map) obj));
    }

    public V get(Object obj) {
        int s10 = s(obj);
        if (s10 < 0) {
            return null;
        }
        V[] vArr = this.f38767b;
        m.b(vArr);
        return vArr[s10];
    }

    public final int h(K k10) {
        k();
        while (true) {
            int A = A(k10);
            int c10 = i.c(this.f38770f * 2, w() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f38769d[A];
                if (i11 <= 0) {
                    if (this.f38771g >= u()) {
                        q(1);
                    } else {
                        int i12 = this.f38771g;
                        int i13 = i12 + 1;
                        this.f38771g = i13;
                        this.f38766a[i12] = k10;
                        this.f38768c[i12] = A;
                        this.f38769d[A] = i13;
                        this.f38773i = size() + 1;
                        if (i10 > this.f38770f) {
                            this.f38770f = i10;
                        }
                        return i12;
                    }
                } else if (m.a(this.f38766a[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > c10) {
                        F(w() * 2);
                        break;
                    }
                    A = A == 0 ? w() - 1 : A - 1;
                }
            }
        }
    }

    public int hashCode() {
        b r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            i10 += r10.k();
        }
        return i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map<K, V> j() {
        k();
        this.f38777m = true;
        return this;
    }

    public final void k() {
        if (this.f38777m) {
            throw new UnsupportedOperationException();
        }
    }

    public final /* bridge */ Set<K> keySet() {
        return x();
    }

    public final boolean m(Collection<?> collection) {
        m.e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!n((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry<? extends K, ? extends V> entry) {
        m.e(entry, "entry");
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f38767b;
        m.b(vArr);
        return m.a(vArr[s10], entry.getValue());
    }

    public V put(K k10, V v10) {
        k();
        int h10 = h(k10);
        V[] i10 = i();
        if (h10 < 0) {
            int i11 = (-h10) - 1;
            V v11 = i10[i11];
            i10[i11] = v10;
            return v11;
        }
        i10[h10] = v10;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m.e(map, "from");
        k();
        C(map.entrySet());
    }

    public final b<K, V> r() {
        return new b<>(this);
    }

    public V remove(Object obj) {
        int I = I(obj);
        if (I < 0) {
            return null;
        }
        V[] vArr = this.f38767b;
        m.b(vArr);
        V v10 = vArr[I];
        b.c(vArr, I);
        return v10;
    }

    public final /* bridge */ int size() {
        return y();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            r10.j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        m.d(sb3, "sb.toString()");
        return sb3;
    }

    public final int u() {
        return this.f38766a.length;
    }

    public Set<Map.Entry<K, V>> v() {
        d<K, V> dVar = this.f38776l;
        if (dVar != null) {
            return dVar;
        }
        d<K, V> dVar2 = new d<>(this);
        this.f38776l = dVar2;
        return dVar2;
    }

    public final /* bridge */ Collection<V> values() {
        return z();
    }

    public Set<K> x() {
        e<K> eVar = this.f38774j;
        if (eVar != null) {
            return eVar;
        }
        e<K> eVar2 = new e<>(this);
        this.f38774j = eVar2;
        return eVar2;
    }

    public int y() {
        return this.f38773i;
    }

    public Collection<V> z() {
        f<V> fVar = this.f38775k;
        if (fVar != null) {
            return fVar;
        }
        f<V> fVar2 = new f<>(this);
        this.f38775k = fVar2;
        return fVar2;
    }

    public c() {
        this(8);
    }

    public c(int i10) {
        this(b.a(i10), (V[]) null, new int[i10], new int[f38765n.c(i10)], 2, 0);
    }
}
