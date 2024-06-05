package com.google.protobuf;

/* compiled from: MapFieldSchemas */
final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final q0 f27209a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final q0 f27210b = new r0();

    static q0 a() {
        return f27209a;
    }

    static q0 b() {
        return f27210b;
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
