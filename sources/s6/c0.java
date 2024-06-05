package s6;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.o;
import r6.p;

/* compiled from: Iterators */
public final class c0 {

    /* compiled from: Iterators */
    class a extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f30128c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f30129d;

        a(Iterator it, p pVar) {
            this.f30128c = it;
            this.f30129d = pVar;
        }

        /* access modifiers changed from: protected */
        public T a() {
            while (this.f30128c.hasNext()) {
                T next = this.f30128c.next();
                if (this.f30129d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    /* compiled from: Iterators */
    class b extends d1<T> {

        /* renamed from: a  reason: collision with root package name */
        boolean f30130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f30131b;

        b(Object obj) {
            this.f30131b = obj;
        }

        public boolean hasNext() {
            return !this.f30130a;
        }

        public T next() {
            if (!this.f30130a) {
                this.f30130a = true;
                return this.f30131b;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Iterators */
    private static final class c<T> extends a<T> {

        /* renamed from: f  reason: collision with root package name */
        static final e1<Object> f30132f = new c(new Object[0], 0, 0, 0);

        /* renamed from: c  reason: collision with root package name */
        private final T[] f30133c;

        /* renamed from: d  reason: collision with root package name */
        private final int f30134d;

        c(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f30133c = tArr;
            this.f30134d = i10;
        }

        /* access modifiers changed from: protected */
        public T a(int i10) {
            return this.f30133c[this.f30134d + i10];
        }
    }

    /* compiled from: Iterators */
    private enum d implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            i.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        o.o(collection);
        o.o(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, p<? super T> pVar) {
        return n(it, pVar) != -1;
    }

    static void c(Iterator<?> it) {
        o.o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = r6.k.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c0.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    static <T> d1<T> f() {
        return g();
    }

    static <T> e1<T> g() {
        return c.f30132f;
    }

    static <T> Iterator<T> h() {
        return d.INSTANCE;
    }

    public static <T> d1<T> i(Iterator<T> it, p<? super T> pVar) {
        o.o(it);
        o.o(pVar);
        return new a(it, pVar);
    }

    public static <T> T j(Iterator<T> it, p<? super T> pVar) {
        o.o(it);
        o.o(pVar);
        while (it.hasNext()) {
            T next = it.next();
            if (pVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? k(it) : t10;
    }

    public static <T> T m(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int n(Iterator<T> it, p<? super T> pVar) {
        o.p(pVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static <T> T o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean p(Iterator<?> it, Collection<?> collection) {
        o.o(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean q(Iterator<T> it, p<? super T> pVar) {
        o.o(pVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> d1<T> r(T t10) {
        return new b(t10);
    }
}
