package bd;

import g1.a;

/* compiled from: TraceSection */
public final class e {
    public static void a(String str) {
        a.c(c(str));
    }

    public static void b(String str, int i10) {
        a.a(c(str), i10);
    }

    private static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void d() throws RuntimeException {
        a.f();
    }

    public static void e(String str, int i10) {
        a.d(c(str), i10);
    }
}
