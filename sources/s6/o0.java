package s6;

/* compiled from: ObjectArrays */
public final class o0 {
    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return q0.b(tArr, i10);
    }
}
