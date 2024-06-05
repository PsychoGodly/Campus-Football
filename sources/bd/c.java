package bd;

import java.util.Objects;

/* compiled from: Preconditions */
public final class c {
    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
