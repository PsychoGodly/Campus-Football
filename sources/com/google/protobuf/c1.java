package com.google.protobuf;

/* compiled from: NewInstanceSchemas */
final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private static final a1 f26977a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final a1 f26978b = new b1();

    static a1 a() {
        return f26977a;
    }

    static a1 b() {
        return f26978b;
    }

    private static a1 c() {
        try {
            return (a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
