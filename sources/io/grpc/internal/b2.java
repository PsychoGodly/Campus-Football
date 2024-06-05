package io.grpc.internal;

import dd.a1;
import dd.j1;
import java.util.Map;
import r6.o;

/* compiled from: ScParser */
public final class b2 extends a1.h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34784a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34785b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34786c;

    /* renamed from: d  reason: collision with root package name */
    private final j f34787d;

    public b2(boolean z10, int i10, int i11, j jVar) {
        this.f34784a = z10;
        this.f34785b = i10;
        this.f34786c = i11;
        this.f34787d = (j) o.p(jVar, "autoLoadBalancerFactory");
    }

    public a1.c a(Map<String, ?> map) {
        Object obj;
        try {
            a1.c f10 = this.f34787d.f(map);
            if (f10 == null) {
                obj = null;
            } else if (f10.d() != null) {
                return a1.c.b(f10.d());
            } else {
                obj = f10.c();
            }
            return a1.c.a(j1.b(map, this.f34784a, this.f34785b, this.f34786c, obj));
        } catch (RuntimeException e10) {
            return a1.c.b(j1.f32235h.q("failed to parse service config").p(e10));
        }
    }
}
