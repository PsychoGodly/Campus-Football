package k4;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: Assertions */
public final class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 >= i11 && i10 < i12) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T h(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    public static <T> T i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
