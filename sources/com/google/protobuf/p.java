package com.google.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f27169a = c();

    public static q a() {
        q b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : q.f27178d;
    }

    private static final q b(String str) {
        Class<?> cls = f27169a;
        if (cls == null) {
            return null;
        }
        try {
            return (q) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
