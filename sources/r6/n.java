package r6;

import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: Platform */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f29816a = Logger.getLogger(n.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final m f29817b = b();

    /* compiled from: Platform */
    private static final class b implements m {
        private b() {
        }
    }

    private n() {
    }

    static String a(double d10) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d10)});
    }

    private static m b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    static long d() {
        return System.nanoTime();
    }
}
