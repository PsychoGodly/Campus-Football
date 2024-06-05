package s6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import r6.o;

/* compiled from: ImmutableSortedSet */
public abstract class z<E> extends a0<E> implements NavigableSet<E>, a1<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient Comparator<? super E> f30287c;

    /* renamed from: d  reason: collision with root package name */
    transient z<E> f30288d;

    z(Comparator<? super E> comparator) {
        this.f30287c = comparator;
    }

    static <E> z<E> D(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return J(comparator);
        }
        o0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            E e10 = eArr[i12];
            if (comparator.compare(e10, eArr[i11 - 1]) != 0) {
                eArr[i11] = e10;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i11);
        }
        return new u0(u.o(eArr, i11), comparator);
    }

    public static <E> z<E> E(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        o.o(comparator);
        if (b1.b(comparator, iterable) && (iterable instanceof z)) {
            z<E> zVar = (z) iterable;
            if (!zVar.h()) {
                return zVar;
            }
        }
        Object[] j10 = b0.j(iterable);
        return D(comparator, j10.length, j10);
    }

    public static <E> z<E> F(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return E(comparator, collection);
    }

    static <E> u0<E> J(Comparator<? super E> comparator) {
        if (p0.c().equals(comparator)) {
            return u0.f30256g;
        }
        return new u0<>(u.y(), comparator);
    }

    static int U(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public abstract z<E> G();

    /* renamed from: H */
    public abstract d1<E> descendingIterator();

    /* renamed from: I */
    public z<E> descendingSet() {
        z<E> zVar = this.f30288d;
        if (zVar != null) {
            return zVar;
        }
        z<E> G = G();
        this.f30288d = G;
        G.f30288d = this;
        return G;
    }

    /* renamed from: K */
    public z<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* renamed from: L */
    public z<E> headSet(E e10, boolean z10) {
        return M(o.o(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract z<E> M(E e10, boolean z10);

    /* renamed from: N */
    public z<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    /* renamed from: O */
    public z<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        o.o(e10);
        o.o(e11);
        o.d(this.f30287c.compare(e10, e11) <= 0);
        return P(e10, z10, e11, z11);
    }

    /* access modifiers changed from: package-private */
    public abstract z<E> P(E e10, boolean z10, E e11, boolean z11);

    /* renamed from: Q */
    public z<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* renamed from: R */
    public z<E> tailSet(E e10, boolean z10) {
        return S(o.o(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract z<E> S(E e10, boolean z10);

    /* access modifiers changed from: package-private */
    public int T(Object obj, Object obj2) {
        return U(this.f30287c, obj, obj2);
    }

    public E ceiling(E e10) {
        return b0.c(tailSet(e10, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f30287c;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return c0.m(headSet(e10, true).descendingIterator(), null);
    }

    public E higher(E e10) {
        return b0.c(tailSet(e10, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return c0.m(headSet(e10, false).descendingIterator(), null);
    }

    /* renamed from: m */
    public abstract d1<E> iterator();

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
