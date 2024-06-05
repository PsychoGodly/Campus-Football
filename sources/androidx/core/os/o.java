package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* compiled from: TraceCompat */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static long f2982a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2983b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2984c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2985d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2986e;

    /* compiled from: TraceCompat */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18 && i10 < 29) {
            try {
                f2982a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f2983b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f2984c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f2985d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f2986e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            a.b();
        }
    }
}
