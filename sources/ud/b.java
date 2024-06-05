package ud;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* compiled from: ListBuilder.kt */
public final class b {
    public static final <E> E[] a(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] b(T[] tArr, int i10) {
        m.e(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i10);
        m.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final <E> void c(E[] eArr, int i10) {
        m.e(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void d(E[] eArr, int i10, int i11) {
        m.e(eArr, "<this>");
        while (i10 < i11) {
            c(eArr, i10);
            i10++;
        }
    }
}
