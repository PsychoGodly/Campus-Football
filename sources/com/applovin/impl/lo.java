package com.applovin.impl;

import android.os.Trace;

public abstract class lo {
    public static void a(String str) {
        if (yp.f13662a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    private static void b() {
        Trace.endSection();
    }

    public static void a() {
        if (yp.f13662a >= 18) {
            b();
        }
    }
}
