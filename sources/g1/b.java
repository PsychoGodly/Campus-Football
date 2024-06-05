package g1;

import android.os.Trace;

/* compiled from: TraceApi18Impl */
final class b {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
