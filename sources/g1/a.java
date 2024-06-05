package g1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f18091a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f18092b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f18093c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f18094d;

    public static void a(String str, int i10) {
        try {
            if (f18093c == null) {
                c.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f18093c == null) {
                    f18093c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f18093c.invoke((Object) null, new Object[]{Long.valueOf(f18091a), str, Integer.valueOf(i10)});
            } catch (Exception e10) {
                g("asyncTraceBegin", e10);
            }
        }
    }

    public static void c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    public static void d(String str, int i10) {
        try {
            if (f18094d == null) {
                c.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f18094d == null) {
                    f18094d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f18094d.invoke((Object) null, new Object[]{Long.valueOf(f18091a), str, Integer.valueOf(i10)});
            } catch (Exception e10) {
                g("asyncTraceEnd", e10);
            }
        }
    }

    public static void f() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.b();
        }
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        try {
            if (f18092b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f18092b == null) {
                    f18091a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f18092b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f18092b.invoke((Object) null, new Object[]{Long.valueOf(f18091a)})).booleanValue();
            } catch (Exception e10) {
                g("isTagEnabled", e10);
            }
        }
        return false;
    }
}
