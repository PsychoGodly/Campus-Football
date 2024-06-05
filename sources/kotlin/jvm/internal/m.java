package kotlin.jvm.internal;

import java.util.Arrays;
import sd.v;

/* compiled from: Intrinsics */
public class m {
    private m() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static int f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int g(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = m.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void i() {
        q();
    }

    public static void j(int i10, String str) {
        q();
    }

    private static <T extends Throwable> T k(T t10) {
        return l(t10, m.class.getName());
    }

    static <T extends Throwable> T l(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    private static void p(String str) {
        throw ((NullPointerException) k(new NullPointerException(h(str))));
    }

    public static void q() {
        r("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void s(String str) {
        throw ((v) k(new v(str)));
    }

    public static void t(String str) {
        s("lateinit property " + str + " has not been initialized");
    }
}
