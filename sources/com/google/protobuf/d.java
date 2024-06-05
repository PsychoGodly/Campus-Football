package com.google.protobuf;

/* compiled from: Android */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26982a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f26983b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f26984c = (!f26982a && a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f26983b;
    }

    static boolean c() {
        return f26982a || (f26983b != null && !f26984c);
    }
}
