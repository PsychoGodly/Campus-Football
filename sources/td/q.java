package td;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: Collections.kt */
class q extends p {
    public static final <T> Collection<T> c(T[] tArr) {
        m.e(tArr, "<this>");
        return new g(tArr, false);
    }

    public static <T> List<T> d() {
        return a0.f38597a;
    }

    public static <T> int e(List<? extends T> list) {
        m.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> f(T... tArr) {
        m.e(tArr, "elements");
        return tArr.length > 0 ? l.b(tArr) : d();
    }

    public static <T> List<T> g(T... tArr) {
        m.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new g(tArr, true));
    }

    public static <T> List<T> h(List<? extends T> list) {
        m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return list;
        }
        return p.b(list.get(0));
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
