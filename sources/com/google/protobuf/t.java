package com.google.protobuf;

/* compiled from: ExtensionSchemas */
final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final r<?> f27212a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final r<?> f27213b = c();

    static r<?> a() {
        r<?> rVar = f27213b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static r<?> b() {
        return f27212a;
    }

    private static r<?> c() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
