package s6;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import r6.o;
import r6.p;

/* compiled from: Iterables */
public final class b0 {
    public static <T> boolean a(Iterable<T> iterable, p<? super T> pVar) {
        return c0.b(iterable.iterator(), pVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return e0.i(iterable.iterator());
    }

    public static <T> T c(Iterable<? extends T> iterable, T t10) {
        return c0.m(iterable.iterator(), t10);
    }

    public static <T> T d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return c0.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return f(list);
        }
        throw new NoSuchElementException();
    }

    public static <T> T e(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return f(e0.a(iterable));
            }
        }
        return c0.l(iterable.iterator(), t10);
    }

    private static <T> T f(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> boolean g(Iterable<T> iterable, p<? super T> pVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return c0.q(iterable.iterator(), pVar);
        }
        return h((List) iterable, (p) o.o(pVar));
    }

    private static <T> boolean h(List<T> list, p<? super T> pVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!pVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (UnsupportedOperationException unused) {
                        i(list, pVar, i11, i10);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        i(list, pVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        if (i10 != i11) {
            return true;
        }
        return false;
    }

    private static <T> void i(List<T> list, p<? super T> pVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (pVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] j(Iterable<?> iterable) {
        return b(iterable).toArray();
    }
}
