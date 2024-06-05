package k4;

import android.os.Trace;

/* compiled from: TraceUtil */
public final class k0 {
    public static void a(String str) {
        if (n0.f19738a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (n0.f19738a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
