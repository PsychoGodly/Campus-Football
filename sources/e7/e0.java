package e7;

import java.util.Objects;

/* compiled from: Preconditions */
public final class e0 {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static void d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
