package td;

import java.lang.reflect.Array;
import kotlin.jvm.internal.m;

/* compiled from: ArraysJVM.kt */
class j {
    public static final <T> T[] a(T[] tArr, int i10) {
        m.e(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        m.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
