package s6;

import java.util.Comparator;
import java.util.Map;
import r6.g;

/* compiled from: Ordering */
public abstract class p0<T> implements Comparator<T> {
    protected p0() {
    }

    public static <T> p0<T> a(Comparator<T> comparator) {
        if (comparator instanceof p0) {
            return (p0) comparator;
        }
        return new m(comparator);
    }

    public static <C extends Comparable> p0<C> c() {
        return m0.f30214a;
    }

    public <E extends T> u<E> b(Iterable<E> iterable) {
        return u.F(this, iterable);
    }

    public abstract int compare(T t10, T t11);

    /* access modifiers changed from: package-private */
    public <T2 extends T> p0<Map.Entry<T2, ?>> d() {
        return e(g0.e());
    }

    public <F> p0<F> e(g<F, ? extends T> gVar) {
        return new h(gVar, this);
    }

    public <S extends T> p0<S> f() {
        return new w0(this);
    }
}
