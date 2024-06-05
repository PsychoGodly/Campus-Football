package com.startapp;

import java.lang.Comparable;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class p9<T extends Comparable<T>> implements Comparable<p9<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static Pattern f16262c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d  reason: collision with root package name */
    public static Pattern f16263d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a  reason: collision with root package name */
    public final String f16264a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16265b;

    public p9(String str, T t10) {
        this.f16264a = str;
        this.f16265b = t10;
    }

    public static boolean a(String str) {
        return f16262c.matcher(str).matches();
    }

    public static Integer b(String str) {
        String[] split = str.split(":");
        if (split.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int compareTo(Object obj) {
        return this.f16265b.compareTo(((p9) obj).f16265b);
    }
}
