package io.grpc.internal;

import r6.o;

/* compiled from: FixedObjectPool */
public final class h0<T> implements p1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f35062a;

    public h0(T t10) {
        this.f35062a = o.p(t10, "object");
    }

    public T a() {
        return this.f35062a;
    }

    public T b(Object obj) {
        return null;
    }
}
