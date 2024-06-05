package ld;

import dd.a1;
import dd.r0;
import dd.s0;
import java.util.Map;

/* compiled from: SecretRoundRobinLoadBalancerProvider */
public final class i extends s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f36232b = 0;

    public r0 a(r0.d dVar) {
        return new h(dVar);
    }

    public String b() {
        return "round_robin";
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
