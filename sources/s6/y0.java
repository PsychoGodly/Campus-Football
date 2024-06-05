package s6;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import r6.o;
import r6.p;
import r6.q;
import s6.j;

/* compiled from: Sets */
public final class y0 {

    /* compiled from: Sets */
    class a extends e<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f30283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f30284b;

        /* renamed from: s6.y0$a$a  reason: collision with other inner class name */
        /* compiled from: Sets */
        class C0340a extends b<E> {

            /* renamed from: c  reason: collision with root package name */
            final Iterator<E> f30285c;

            C0340a() {
                this.f30285c = a.this.f30283a.iterator();
            }

            /* access modifiers changed from: protected */
            public E a() {
                while (this.f30285c.hasNext()) {
                    E next = this.f30285c.next();
                    if (a.this.f30284b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super((x0) null);
            this.f30283a = set;
            this.f30284b = set2;
        }

        /* renamed from: b */
        public d1<E> iterator() {
            return new C0340a();
        }

        public boolean contains(Object obj) {
            return this.f30283a.contains(obj) && this.f30284b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f30283a.containsAll(collection) && this.f30284b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f30284b, this.f30283a);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f30283a) {
                if (this.f30284b.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* compiled from: Sets */
    private static class b<E> extends j.a<E> implements Set<E> {
        b(Set<E> set, p<? super E> pVar) {
            super(set, pVar);
        }

        public boolean equals(Object obj) {
            return y0.a(this, obj);
        }

        public int hashCode() {
            return y0.d(this);
        }
    }

    /* compiled from: Sets */
    private static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, p<? super E> pVar) {
            super(sortedSet, pVar);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f30183a).comparator();
        }

        public E first() {
            return c0.j(this.f30183a.iterator(), this.f30184b);
        }

        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f30183a).headSet(e10), this.f30184b);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f30183a;
            while (true) {
                E last = sortedSet.last();
                if (this.f30184b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f30183a).subSet(e10, e11), this.f30184b);
        }

        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f30183a).tailSet(e10), this.f30184b);
        }
    }

    /* compiled from: Sets */
    static abstract class d<E> extends AbstractSet<E> {
        d() {
        }

        public boolean removeAll(Collection<?> collection) {
            return y0.i(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) o.o(collection));
        }
    }

    /* compiled from: Sets */
    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(x0 x0Var) {
            this();
        }

        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, p<? super E> pVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, pVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) o.o(set), (p) o.o(pVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f30183a, q.b(bVar.f30184b, pVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, p<? super E> pVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) o.o(sortedSet), (p) o.o(pVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f30183a, q.b(bVar.f30184b, pVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        o.p(set, "set1");
        o.p(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(g0.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(g0.f());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        o.o(collection);
        if (collection instanceof l0) {
            collection = ((l0) collection).j();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return j(set, collection.iterator());
        }
        return c0.p(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
