package s6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r6.k;
import r6.o;
import v6.e;

/* compiled from: Lists */
public final class e0 {
    static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        i.b(i10, "arraySize");
        return e.k(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List<?> list, Object obj) {
        if (obj == o.o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return c0.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!k.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (k.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (k.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> h10 = h();
        c0.a(h10, it);
        return h10;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        o.o(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
