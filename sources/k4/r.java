package k4;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: Log */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f19766a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f19767b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f19768c = true;

    /* renamed from: d  reason: collision with root package name */
    private static a f19769d = a.f19770a;

    /* compiled from: Log */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19770a = new C0210a();

        /* renamed from: k4.r$a$a  reason: collision with other inner class name */
        /* compiled from: Log */
        class C0210a implements a {
            C0210a() {
            }

            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            public void b(String str, String str2) {
                Log.e(str, str2);
            }

            public void c(String str, String str2) {
                Log.d(str, str2);
            }

            public void d(String str, String str2) {
                Log.i(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + 10;
    }

    public static void b(String str, String str2) {
        synchronized (f19766a) {
            if (f19767b == 0) {
                f19769d.c(str, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f19766a) {
            if (f19767b <= 3) {
                f19769d.b(str, str2);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        synchronized (f19766a) {
            if (th == null) {
                return null;
            }
            if (h(th)) {
                return "UnknownHostException (no network)";
            }
            if (!f19768c) {
                String message = th.getMessage();
                return message;
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }

    public static void f(String str, String str2) {
        synchronized (f19766a) {
            if (f19767b <= 1) {
                f19769d.d(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    private static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f19766a) {
            if (f19767b <= 2) {
                f19769d.a(str, str2);
            }
        }
    }

    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
