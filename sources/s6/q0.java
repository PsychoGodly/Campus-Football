package s6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Platform */
final class q0 {
    static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i10) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10);
    }

    static <K, V> Map<K, V> c() {
        return k.s();
    }
}
