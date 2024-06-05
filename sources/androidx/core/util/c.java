package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ObjectsCompat */
public class c {

    /* compiled from: ObjectsCompat */
    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.b(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    public static int c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T d(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T e(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
