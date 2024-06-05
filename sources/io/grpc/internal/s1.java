package io.grpc.internal;

import dd.a1;
import dd.r0;
import dd.s0;
import java.util.Map;

/* compiled from: PickFirstLoadBalancerProvider */
public final class s1 extends s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f35381b = 0;

    public r0 a(r0.d dVar) {
        return new r1(dVar);
    }

    public String b() {
        return "pick_first";
    }

    public int c() {
        return 5;
    }

    public boolean d() {
        return true;
    }

    public a1.c e(Map<String, ?> map) {
        return a1.c.a("no service config");
    }
}
