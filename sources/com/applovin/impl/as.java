package com.applovin.impl;

import java.util.regex.Pattern;

public abstract class as {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f6580a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yg ygVar) {
        String l10 = ygVar.l();
        return l10 != null && l10.startsWith("WEBVTT");
    }

    public static long b(String str) {
        String[] b10 = yp.b(str, "\\.");
        long j10 = 0;
        for (String parseLong : yp.a(b10[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(parseLong);
        }
        long j11 = j10 * 1000;
        if (b10.length == 2) {
            j11 += Long.parseLong(b10[1]);
        }
        return j11 * 1000;
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void b(yg ygVar) {
        int d10 = ygVar.d();
        if (!a(ygVar)) {
            ygVar.f(d10);
            throw ah.a("Expected WEBVTT. Got " + ygVar.l(), (Throwable) null);
        }
    }
}
