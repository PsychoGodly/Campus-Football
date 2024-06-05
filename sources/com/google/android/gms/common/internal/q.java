package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import m5.u;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class q {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    public static void e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void f(String str) {
        if (!u.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void i() {
        j("Must not be called on the main application thread");
    }

    public static void j(String str) {
        if (u.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T k(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    public static <T> T l(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int m(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void n(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void p(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
