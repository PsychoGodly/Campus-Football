package d2;

import java.util.Objects;

/* compiled from: Preconditions */
public final class d {
    public static <T> void a(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
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
}
