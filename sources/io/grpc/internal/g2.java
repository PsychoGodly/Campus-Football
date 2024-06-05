package io.grpc.internal;

import io.grpc.internal.f2;

/* compiled from: SharedResourcePool */
public final class g2<T> implements p1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f2.d<T> f35056a;

    private g2(f2.d<T> dVar) {
        this.f35056a = dVar;
    }

    public static <T> g2<T> c(f2.d<T> dVar) {
        return new g2<>(dVar);
    }

    public T a() {
        return f2.d(this.f35056a);
    }

    public T b(Object obj) {
        f2.f(this.f35056a, obj);
        return null;
    }
}
