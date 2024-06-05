package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf */
final class i1 {

    /* renamed from: c  reason: collision with root package name */
    private static final i1 f27056c = new i1();

    /* renamed from: a  reason: collision with root package name */
    private final o1 f27057a = new n0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, n1<?>> f27058b = new ConcurrentHashMap();

    private i1() {
    }

    public static i1 a() {
        return f27056c;
    }

    public n1<?> b(Class<?> cls, n1<?> n1Var) {
        d0.b(cls, "messageType");
        d0.b(n1Var, "schema");
        return this.f27058b.putIfAbsent(cls, n1Var);
    }

    public <T> n1<T> c(Class<T> cls) {
        d0.b(cls, "messageType");
        n1<T> n1Var = (n1) this.f27058b.get(cls);
        if (n1Var != null) {
            return n1Var;
        }
        n1<T> a10 = this.f27057a.a(cls);
        n1<?> b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public <T> n1<T> d(T t10) {
        return c(t10.getClass());
    }
}
