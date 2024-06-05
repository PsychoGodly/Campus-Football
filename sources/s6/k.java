package s6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import r6.o;

/* compiled from: CompactHashMap */
class k<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f30189k = new Object();

    /* renamed from: a  reason: collision with root package name */
    private transient Object f30190a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f30191b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f30192c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f30193d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public transient int f30194f;

    /* renamed from: g  reason: collision with root package name */
    private transient int f30195g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set<K> f30196h;

    /* renamed from: i  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f30197i;

    /* renamed from: j  reason: collision with root package name */
    private transient Collection<V> f30198j;

    /* compiled from: CompactHashMap */
    class a extends k<K, V>.defpackage.e<K> {
        a() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public K b(int i10) {
            return k.this.H(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class b extends k<K, V>.defpackage.e<Map.Entry<K, V>> {
        b() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class c extends k<K, V>.defpackage.e<V> {
        c() {
            super(k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public V b(int i10) {
            return k.this.X(i10);
        }
    }

    /* compiled from: CompactHashMap */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object obj) {
            Map x10 = k.this.x();
            if (x10 != null) {
                return x10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int j10 = k.this.E(entry.getKey());
            if (j10 == -1 || !r6.k.a(k.this.X(j10), entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return k.this.z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = s6.k.l(r9.f30202a);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                s6.k r0 = s6.k.this
                java.util.Map r0 = r0.x()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                s6.k r0 = s6.k.this
                boolean r0 = r0.K()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                s6.k r0 = s6.k.this
                int r0 = r0.C()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                s6.k r10 = s6.k.this
                java.lang.Object r5 = r10.O()
                s6.k r10 = s6.k.this
                int[] r6 = r10.M()
                s6.k r10 = s6.k.this
                java.lang.Object[] r7 = r10.N()
                s6.k r10 = s6.k.this
                java.lang.Object[] r8 = r10.P()
                r4 = r0
                int r10 = s6.l.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                s6.k r1 = s6.k.this
                r1.J(r10, r0)
                s6.k r10 = s6.k.this
                s6.k.f(r10)
                s6.k r10 = s6.k.this
                r10.D()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: s6.k.d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap */
    class f extends AbstractSet<K> {
        f() {
        }

        public void clear() {
            k.this.clear();
        }

        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return k.this.I();
        }

        public boolean remove(Object obj) {
            Map x10 = k.this.x();
            if (x10 != null) {
                return x10.keySet().remove(obj);
            }
            return k.this.L(obj) != k.f30189k;
        }

        public int size() {
            return k.this.size();
        }
    }

    /* compiled from: CompactHashMap */
    final class g extends e<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f30208a;

        /* renamed from: b  reason: collision with root package name */
        private int f30209b;

        g(int i10) {
            this.f30208a = k.this.H(i10);
            this.f30209b = i10;
        }

        private void a() {
            int i10 = this.f30209b;
            if (i10 == -1 || i10 >= k.this.size() || !r6.k.a(this.f30208a, k.this.H(this.f30209b))) {
                this.f30209b = k.this.E(this.f30208a);
            }
        }

        public K getKey() {
            return this.f30208a;
        }

        public V getValue() {
            Map x10 = k.this.x();
            if (x10 != null) {
                return n0.a(x10.get(this.f30208a));
            }
            a();
            int i10 = this.f30209b;
            return i10 == -1 ? n0.b() : k.this.X(i10);
        }

        public V setValue(V v10) {
            Map x10 = k.this.x();
            if (x10 != null) {
                return n0.a(x10.put(this.f30208a, v10));
            }
            a();
            int i10 = this.f30209b;
            if (i10 == -1) {
                k.this.put(this.f30208a, v10);
                return n0.b();
            }
            V k10 = k.this.X(i10);
            k.this.W(this.f30209b, v10);
            return k10;
        }
    }

    /* compiled from: CompactHashMap */
    class h extends AbstractCollection<V> {
        h() {
        }

        public void clear() {
            k.this.clear();
        }

        public Iterator<V> iterator() {
            return k.this.Y();
        }

        public int size() {
            return k.this.size();
        }
    }

    k() {
        F(3);
    }

    /* access modifiers changed from: private */
    public int C() {
        return (1 << (this.f30194f & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int c10 = r.c(obj);
        int C = C();
        int h10 = l.h(O(), c10 & C);
        if (h10 == 0) {
            return -1;
        }
        int b10 = l.b(c10, C);
        do {
            int i10 = h10 - 1;
            int y10 = y(i10);
            if (l.b(y10, C) == b10 && r6.k.a(obj, H(i10))) {
                return i10;
            }
            h10 = l.c(y10, C);
        } while (h10 != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    public K H(int i10) {
        return N()[i10];
    }

    /* access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return f30189k;
        }
        int C = C();
        int f10 = l.f(obj, (Object) null, C, O(), M(), N(), (Object[]) null);
        if (f10 == -1) {
            return f30189k;
        }
        Object X = X(f10);
        J(f10, C);
        this.f30195g--;
        D();
        return X;
    }

    /* access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.f30191b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f30192c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object O() {
        Object obj = this.f30190a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f30193d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i10) {
        int min;
        int length = M().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            Q(min);
        }
    }

    private int S(int i10, int i11, int i12, int i13) {
        Object a10 = l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.i(a10, i12 & i14, i13 + 1);
        }
        Object O = O();
        int[] M = M();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = l.h(O, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = M[i16];
                int b10 = l.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = l.h(a10, i18);
                l.i(a10, i18, h10);
                M[i16] = l.d(b10, h11, i14);
                h10 = l.c(i17, i10);
            }
        }
        this.f30190a = a10;
        U(i14);
        return i14;
    }

    private void T(int i10, int i11) {
        M()[i10] = i11;
    }

    private void U(int i10) {
        this.f30194f = l.d(this.f30194f, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void V(int i10, K k10) {
        N()[i10] = k10;
    }

    /* access modifiers changed from: private */
    public void W(int i10, V v10) {
        P()[i10] = v10;
    }

    /* access modifiers changed from: private */
    public V X(int i10) {
        return P()[i10];
    }

    static /* synthetic */ int f(k kVar) {
        int i10 = kVar.f30195g;
        kVar.f30195g = i10 - 1;
        return i10;
    }

    public static <K, V> k<K, V> s() {
        return new k<>();
    }

    private int y(int i10) {
        return M()[i10];
    }

    /* access modifiers changed from: package-private */
    public int A() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public int B(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f30195g) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.f30194f += 32;
    }

    /* access modifiers changed from: package-private */
    public void F(int i10) {
        o.e(i10 >= 0, "Expected size must be >= 0");
        this.f30194f = v6.e.f(i10, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public void G(int i10, K k10, V v10, int i11, int i12) {
        T(i10, l.d(i11, 0, i12));
        V(i10, k10);
        W(i10, v10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<K> I() {
        Map x10 = x();
        if (x10 != null) {
            return x10.keySet().iterator();
        }
        return new a();
    }

    /* access modifiers changed from: package-private */
    public void J(int i10, int i11) {
        Object O = O();
        int[] M = M();
        Object[] N = N();
        Object[] P = P();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = N[size];
            N[i10] = obj;
            P[i10] = P[size];
            N[size] = null;
            P[size] = null;
            M[i10] = M[size];
            M[size] = 0;
            int c10 = r.c(obj) & i11;
            int h10 = l.h(O, c10);
            int i12 = size + 1;
            if (h10 == i12) {
                l.i(O, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = M[i13];
                int c11 = l.c(i14, i11);
                if (c11 == i12) {
                    M[i13] = l.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            N[i10] = null;
            P[i10] = null;
            M[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return this.f30190a == null;
    }

    /* access modifiers changed from: package-private */
    public void Q(int i10) {
        this.f30191b = Arrays.copyOf(M(), i10);
        this.f30192c = Arrays.copyOf(N(), i10);
        this.f30193d = Arrays.copyOf(P(), i10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> Y() {
        Map x10 = x();
        if (x10 != null) {
            return x10.values().iterator();
        }
        return new c();
    }

    public void clear() {
        if (!K()) {
            D();
            Map x10 = x();
            if (x10 != null) {
                this.f30194f = v6.e.f(size(), 3, 1073741823);
                x10.clear();
                this.f30190a = null;
                this.f30195g = 0;
                return;
            }
            Arrays.fill(N(), 0, this.f30195g, (Object) null);
            Arrays.fill(P(), 0, this.f30195g, (Object) null);
            l.g(O());
            Arrays.fill(M(), 0, this.f30195g, 0);
            this.f30195g = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.containsKey(obj);
        }
        return E(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f30195g; i10++) {
            if (r6.k.a(obj, X(i10))) {
                return true;
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f30197i;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> t10 = t();
        this.f30197i = t10;
        return t10;
    }

    public V get(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.get(obj);
        }
        int E = E(obj);
        if (E == -1) {
            return null;
        }
        o(E);
        return X(E);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f30196h;
        if (set != null) {
            return set;
        }
        Set<K> v10 = v();
        this.f30196h = v10;
        return v10;
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
    }

    /* access modifiers changed from: package-private */
    public int p(int i10, int i11) {
        return i10 - 1;
    }

    public V put(K k10, V v10) {
        int i10;
        int S;
        if (K()) {
            q();
        }
        Map x10 = x();
        if (x10 != null) {
            return x10.put(k10, v10);
        }
        int[] M = M();
        Object[] N = N();
        V[] P = P();
        int i11 = this.f30195g;
        int i12 = i11 + 1;
        int c10 = r.c(k10);
        int C = C();
        int i13 = c10 & C;
        int h10 = l.h(O(), i13);
        if (h10 != 0) {
            int b10 = l.b(c10, C);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = M[i15];
                if (l.b(i16, C) != b10 || !r6.k.a(k10, N[i15])) {
                    int c11 = l.c(i16, C);
                    i14++;
                    if (c11 != 0) {
                        h10 = c11;
                    } else if (i14 >= 9) {
                        return r().put(k10, v10);
                    } else {
                        if (i12 > C) {
                            S = S(C, l.e(C), c10, i11);
                        } else {
                            M[i15] = l.d(i16, i12, C);
                        }
                    }
                } else {
                    V v11 = P[i15];
                    P[i15] = v10;
                    o(i15);
                    return v11;
                }
            }
            i10 = C;
            R(i12);
            G(i11, k10, v10, c10, i10);
            this.f30195g = i12;
            D();
            return null;
        } else if (i12 > C) {
            S = S(C, l.e(C), c10, i11);
        } else {
            l.i(O(), i13, i12);
            i10 = C;
            R(i12);
            G(i11, k10, v10, c10, i10);
            this.f30195g = i12;
            D();
            return null;
        }
        i10 = S;
        R(i12);
        G(i11, k10, v10, c10, i10);
        this.f30195g = i12;
        D();
        return null;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        o.v(K(), "Arrays already allocated");
        int i10 = this.f30194f;
        int j10 = l.j(i10);
        this.f30190a = l.a(j10);
        U(j10 - 1);
        this.f30191b = new int[i10];
        this.f30192c = new Object[i10];
        this.f30193d = new Object[i10];
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> r() {
        Map<K, V> u10 = u(C() + 1);
        int A = A();
        while (A >= 0) {
            u10.put(H(A), X(A));
            A = B(A);
        }
        this.f30190a = u10;
        this.f30191b = null;
        this.f30192c = null;
        this.f30193d = null;
        D();
        return u10;
    }

    public V remove(Object obj) {
        Map x10 = x();
        if (x10 != null) {
            return x10.remove(obj);
        }
        V L = L(obj);
        if (L == f30189k) {
            return null;
        }
        return L;
    }

    public int size() {
        Map x10 = x();
        return x10 != null ? x10.size() : this.f30195g;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> t() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public Set<K> v() {
        return new f();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f30198j;
        if (collection != null) {
            return collection;
        }
        Collection<V> w10 = w();
        this.f30198j = w10;
        return w10;
    }

    /* access modifiers changed from: package-private */
    public Collection<V> w() {
        return new h();
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> x() {
        Object obj = this.f30190a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> z() {
        Map x10 = x();
        if (x10 != null) {
            return x10.entrySet().iterator();
        }
        return new b();
    }

    /* compiled from: CompactHashMap */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        int f30203a;

        /* renamed from: b  reason: collision with root package name */
        int f30204b;

        /* renamed from: c  reason: collision with root package name */
        int f30205c;

        private e() {
            this.f30203a = k.this.f30194f;
            this.f30204b = k.this.A();
            this.f30205c = -1;
        }

        private void a() {
            if (k.this.f30194f != this.f30203a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract T b(int i10);

        /* access modifiers changed from: package-private */
        public void c() {
            this.f30203a += 32;
        }

        public boolean hasNext() {
            return this.f30204b >= 0;
        }

        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f30204b;
                this.f30205c = i10;
                T b10 = b(i10);
                this.f30204b = k.this.B(this.f30204b);
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            i.c(this.f30205c >= 0);
            c();
            k kVar = k.this;
            kVar.remove(kVar.H(this.f30205c));
            this.f30204b = k.this.p(this.f30204b, this.f30205c);
            this.f30205c = -1;
        }

        /* synthetic */ e(k kVar, a aVar) {
            this();
        }
    }
}
