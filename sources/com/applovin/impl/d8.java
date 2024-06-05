package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

public abstract class d8 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7137a = ("ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.15.1");

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet f7138b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static String f7139c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (d8.class) {
            str = f7139c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (d8.class) {
            if (f7138b.add(str)) {
                f7139c += ", " + str;
            }
        }
    }
}
