package io.grpc.internal;

import dd.c;
import dd.r0;
import dd.y0;
import dd.z0;
import r6.k;
import r6.o;

/* compiled from: PickSubchannelArgsImpl */
public final class t1 extends r0.f {

    /* renamed from: a  reason: collision with root package name */
    private final c f35389a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f35390b;

    /* renamed from: c  reason: collision with root package name */
    private final z0<?, ?> f35391c;

    public t1(z0<?, ?> z0Var, y0 y0Var, c cVar) {
        this.f35391c = (z0) o.p(z0Var, "method");
        this.f35390b = (y0) o.p(y0Var, "headers");
        this.f35389a = (c) o.p(cVar, "callOptions");
    }

    public c a() {
        return this.f35389a;
    }

    public y0 b() {
        return this.f35390b;
    }

    public z0<?, ?> c() {
        return this.f35391c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1.class != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (!k.a(this.f35389a, t1Var.f35389a) || !k.a(this.f35390b, t1Var.f35390b) || !k.a(this.f35391c, t1Var.f35391c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f35389a, this.f35390b, this.f35391c);
    }

    public final String toString() {
        return "[method=" + this.f35391c + " headers=" + this.f35390b + " callOptions=" + this.f35389a + "]";
    }
}
