package td;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: _ArraysJvm.kt */
class l extends k {
    public static <T> List<T> b(T[] tArr) {
        m.e(tArr, "<this>");
        List<T> a10 = n.a(tArr);
        m.d(a10, "asList(this)");
        return a10;
    }

    public static final <T> T[] c(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        m.e(tArr, "<this>");
        m.e(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c(objArr, objArr2, i10, i11, i12);
    }

    public static void e(int[] iArr, int i10, int i11, int i12) {
        m.e(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final <T> void f(T[] tArr, T t10, int i10, int i11) {
        m.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void g(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        f(objArr, obj, i10, i11);
    }
}
