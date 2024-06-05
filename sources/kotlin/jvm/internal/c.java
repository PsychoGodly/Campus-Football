package kotlin.jvm.internal;

import java.util.Iterator;

/* compiled from: ArrayIterator.kt */
public final class c {
    public static final <T> Iterator<T> a(T[] tArr) {
        m.e(tArr, "array");
        return new b(tArr);
    }
}
