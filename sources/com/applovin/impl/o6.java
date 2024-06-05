package com.applovin.impl;

import android.os.Looper;

public abstract class o6 {

    /* renamed from: a  reason: collision with root package name */
    private static final Thread f10070a = Looper.getMainLooper().getThread();

    public static void a(Throwable th) {
    }

    public static void a(Throwable th, String str, Object... objArr) {
    }

    public static boolean a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            a(str, objArr);
        }
        return z10;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
