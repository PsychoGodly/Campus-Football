package g1;

import android.os.Trace;

/* compiled from: TraceApi29Impl */
final class c {
    public static void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }
}
