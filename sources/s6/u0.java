package s6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.o;

/* compiled from: RegularImmutableSortedSet */
final class u0<E> extends z<E> {

    /* renamed from: g  reason: collision with root package name */
    static final u0<Comparable> f30256g = new u0<>(u.y(), p0.c());

    /* renamed from: f  reason: collision with root package name */
    final transient u<E> f30257f;

    u0(u<E> uVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f30257f = uVar;
    }

    private int Y(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f30257f, obj, Z());
    }

    /* access modifiers changed from: package-private */
    public z<E> G() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f30287c);
        if (isEmpty()) {
            return z.J(reverseOrder);
        }
        return new u0(this.f30257f.E(), reverseOrder);
    }

    /* renamed from: H */
    public d1<E> descendingIterator() {
        return this.f30257f.E().iterator();
    }

    /* access modifiers changed from: package-private */
    public z<E> M(E e10, boolean z10) {
        return V(0, W(e10, z10));
    }

    /* access modifiers changed from: package-private */
    public z<E> P(E e10, boolean z10, E e11, boolean z11) {
        return S(e10, z10).M(e11, z11);
    }

    /* access modifiers changed from: package-private */
    public z<E> S(E e10, boolean z10) {
        return V(X(e10, z10), size());
    }

    /* access modifiers changed from: package-private */
    public u0<E> V(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        if (i10 < i11) {
            return new u0<>(this.f30257f.subList(i10, i11), this.f30287c);
        }
        return z.J(this.f30287c);
    }

    /* access modifiers changed from: package-private */
    public int W(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f30257f, o.o(e10), comparator());
        if (binarySearch >= 0) {
            return z10 ? binarySearch + 1 : binarySearch;
        }
        return ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public int X(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f30257f, o.o(e10), comparator());
        if (binarySearch >= 0) {
            return z10 ? binarySearch : binarySearch + 1;
        }
        return ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public Comparator<Object> Z() {
        return this.f30287c;
    }

    public u<E> b() {
        return this.f30257f;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        return this.f30257f.c(objArr, i10);
    }

    public E ceiling(E e10) {
        int X = X(e10, true);
        if (X == size()) {
            return null;
        }
        return this.f30257f.get(X);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Y(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof l0) {
            collection = ((l0) collection).j();
        }
        if (!b1.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        d1 m10 = iterator();
        Iterator<?> it = collection.iterator();
        if (!m10.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = m10.next();
        while (true) {
            try {
                int T = T(next2, next);
                if (T < 0) {
                    if (!m10.hasNext()) {
                        return false;
                    }
                    next2 = m10.next();
                } else if (T == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (T > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return this.f30257f.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f30287c
            boolean r1 = s6.b1.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            s6.d1 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.T(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.u0.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f30257f.f();
    }

    public E first() {
        if (!isEmpty()) {
            return this.f30257f.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e10) {
        int W = W(e10, true) - 1;
        if (W == -1) {
            return null;
        }
        return this.f30257f.get(W);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f30257f.g();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f30257f.h();
    }

    public E higher(E e10) {
        int X = X(e10, false);
        if (X == size()) {
            return null;
        }
        return this.f30257f.get(X);
    }

    public E last() {
        if (!isEmpty()) {
            return this.f30257f.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e10) {
        int W = W(e10, false) - 1;
        if (W == -1) {
            return null;
        }
        return this.f30257f.get(W);
    }

    /* renamed from: m */
    public d1<E> iterator() {
        return this.f30257f.iterator();
    }

    public int size() {
        return this.f30257f.size();
    }
}
