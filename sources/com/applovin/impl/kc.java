package com.applovin.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class kc {

    /* renamed from: a  reason: collision with root package name */
    private static int f8943a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8944b = true;

    private static String a(String str, Throwable th) {
        String a10 = a(th);
        if (TextUtils.isEmpty(a10)) {
            return str;
        }
        return str + "\n  " + a10.replace("\n", "\n  ") + 10;
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        if (f8943a <= 2) {
            Log.w(str, str2);
        }
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (f8943a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void b(String str, String str2) {
        if (f8943a <= 3) {
            Log.e(str, str2);
        }
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f8944b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (f8943a == 0) {
            Log.d(str, str2);
        }
    }
}
