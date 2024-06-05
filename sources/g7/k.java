package g7;

import g7.c;
import g7.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: RBTreeSortedMap */
public class k<K, V> extends c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private h<K, V> f28919a;

    /* renamed from: b  reason: collision with root package name */
    private Comparator<K> f28920b;

    /* compiled from: RBTreeSortedMap */
    private static class b<A, B, C> {

        /* renamed from: a  reason: collision with root package name */
        private final List<A> f28921a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<B, C> f28922b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a.C0304a<A, B> f28923c;

        /* renamed from: d  reason: collision with root package name */
        private j<A, C> f28924d;

        /* renamed from: e  reason: collision with root package name */
        private j<A, C> f28925e;

        /* compiled from: RBTreeSortedMap */
        static class a implements Iterable<C0306b> {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f28926a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final int f28927b;

            /* renamed from: g7.k$b$a$a  reason: collision with other inner class name */
            /* compiled from: RBTreeSortedMap */
            class C0305a implements Iterator<C0306b> {

                /* renamed from: a  reason: collision with root package name */
                private int f28928a;

                C0305a() {
                    this.f28928a = a.this.f28927b - 1;
                }

                /* renamed from: a */
                public C0306b next() {
                    C0306b bVar = new C0306b();
                    bVar.f28930a = (a.this.f28926a & ((long) (1 << this.f28928a))) == 0;
                    bVar.f28931b = (int) Math.pow(2.0d, (double) this.f28928a);
                    this.f28928a--;
                    return bVar;
                }

                public boolean hasNext() {
                    return this.f28928a >= 0;
                }

                public void remove() {
                }
            }

            public a(int i10) {
                int i11 = i10 + 1;
                int floor = (int) Math.floor(Math.log((double) i11) / Math.log(2.0d));
                this.f28927b = floor;
                this.f28926a = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i11);
            }

            public Iterator<C0306b> iterator() {
                return new C0305a();
            }
        }

        /* renamed from: g7.k$b$b  reason: collision with other inner class name */
        /* compiled from: RBTreeSortedMap */
        static class C0306b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f28930a;

            /* renamed from: b  reason: collision with root package name */
            public int f28931b;

            C0306b() {
            }
        }

        private b(List<A> list, Map<B, C> map, c.a.C0304a<A, B> aVar) {
            this.f28921a = list;
            this.f28922b = map;
            this.f28923c = aVar;
        }

        private h<A, C> a(int i10, int i11) {
            if (i11 == 0) {
                return g.i();
            }
            if (i11 == 1) {
                A a10 = this.f28921a.get(i10);
                return new f(a10, d(a10), (h) null, (h) null);
            }
            int i12 = i11 / 2;
            int i13 = i10 + i12;
            h a11 = a(i10, i12);
            h a12 = a(i13 + 1, i12);
            A a13 = this.f28921a.get(i13);
            return new f(a13, d(a13), a11, a12);
        }

        public static <A, B, C> k<A, C> b(List<A> list, Map<B, C> map, c.a.C0304a<A, B> aVar, Comparator<A> comparator) {
            b bVar = new b(list, map, aVar);
            Collections.sort(list, comparator);
            Iterator<C0306b> it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0306b next = it.next();
                int i10 = next.f28931b;
                size -= i10;
                if (next.f28930a) {
                    bVar.c(h.a.BLACK, i10, size);
                } else {
                    bVar.c(h.a.BLACK, i10, size);
                    int i11 = next.f28931b;
                    size -= i11;
                    bVar.c(h.a.RED, i11, size);
                }
            }
            h hVar = bVar.f28924d;
            if (hVar == null) {
                hVar = g.i();
            }
            return new k<>(hVar, comparator);
        }

        private void c(h.a aVar, int i10, int i11) {
            j<A, C> jVar;
            h a10 = a(i11 + 1, i10 - 1);
            A a11 = this.f28921a.get(i11);
            if (aVar == h.a.RED) {
                jVar = new i<>(a11, d(a11), (h) null, a10);
            } else {
                jVar = new f<>(a11, d(a11), (h) null, a10);
            }
            if (this.f28924d == null) {
                this.f28924d = jVar;
                this.f28925e = jVar;
                return;
            }
            this.f28925e.t(jVar);
            this.f28925e = jVar;
        }

        private C d(A a10) {
            return this.f28922b.get(this.f28923c.a(a10));
        }
    }

    public static <A, B, C> k<A, C> o(List<A> list, Map<B, C> map, c.a.C0304a<A, B> aVar, Comparator<A> comparator) {
        return b.b(list, map, aVar, comparator);
    }

    public static <A, B> k<A, B> p(Map<A, B> map, Comparator<A> comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.d(), comparator);
    }

    private h<K, V> q(K k10) {
        h<K, V> hVar = this.f28919a;
        while (!hVar.isEmpty()) {
            int compare = this.f28920b.compare(k10, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.a();
            } else if (compare == 0) {
                return hVar;
            } else {
                hVar = hVar.f();
            }
        }
        return null;
    }

    public boolean b(K k10) {
        return q(k10) != null;
    }

    public V c(K k10) {
        h q10 = q(k10);
        if (q10 != null) {
            return q10.getValue();
        }
        return null;
    }

    public Comparator<K> e() {
        return this.f28920b;
    }

    public K f() {
        return this.f28919a.h().getKey();
    }

    public K g() {
        return this.f28919a.g().getKey();
    }

    public c<K, V> h(K k10, V v10) {
        return new k(this.f28919a.b(k10, v10, this.f28920b).c(null, null, h.a.BLACK, (h) null, (h) null), this.f28920b);
    }

    public int indexOf(K k10) {
        h<K, V> hVar = this.f28919a;
        int i10 = 0;
        while (!hVar.isEmpty()) {
            int compare = this.f28920b.compare(k10, hVar.getKey());
            if (compare == 0) {
                return i10 + hVar.a().size();
            }
            if (compare < 0) {
                hVar = hVar.a();
            } else {
                i10 += hVar.a().size() + 1;
                hVar = hVar.f();
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f28919a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new d(this.f28919a, null, this.f28920b, false);
    }

    public Iterator<Map.Entry<K, V>> m(K k10) {
        return new d(this.f28919a, k10, this.f28920b, false);
    }

    public c<K, V> n(K k10) {
        if (!b(k10)) {
            return this;
        }
        return new k(this.f28919a.d(k10, this.f28920b).c(null, null, h.a.BLACK, (h) null, (h) null), this.f28920b);
    }

    public int size() {
        return this.f28919a.size();
    }

    private k(h<K, V> hVar, Comparator<K> comparator) {
        this.f28919a = hVar;
        this.f28920b = comparator;
    }
}
