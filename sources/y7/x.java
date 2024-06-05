package y7;

import java.util.Locale;
import java.util.Objects;

/* compiled from: Preconditions */
public class x {
    public static void a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T c(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T d(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }

    public static void e(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
