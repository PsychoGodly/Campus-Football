package io.grpc.internal;

import dd.c;
import dd.f0;
import dd.j1;
import dd.r0;
import dd.z0;
import io.grpc.internal.z1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r6.i;
import r6.k;
import r6.o;
import r6.u;

/* compiled from: ManagedChannelServiceConfig */
final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f35113a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f35114b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f35115c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.c0 f35116d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f35117e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, ?> f35118f;

    /* compiled from: ManagedChannelServiceConfig */
    static final class b {

        /* renamed from: g  reason: collision with root package name */
        static final c.C0363c<b> f35119g = c.C0363c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a  reason: collision with root package name */
        final Long f35120a;

        /* renamed from: b  reason: collision with root package name */
        final Boolean f35121b;

        /* renamed from: c  reason: collision with root package name */
        final Integer f35122c;

        /* renamed from: d  reason: collision with root package name */
        final Integer f35123d;

        /* renamed from: e  reason: collision with root package name */
        final a2 f35124e;

        /* renamed from: f  reason: collision with root package name */
        final t0 f35125f;

        b(Map<String, ?> map, boolean z10, int i10, int i11) {
            a2 a2Var;
            this.f35120a = e2.w(map);
            this.f35121b = e2.x(map);
            Integer l10 = e2.l(map);
            this.f35122c = l10;
            boolean z11 = true;
            if (l10 != null) {
                o.k(l10.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l10);
            }
            Integer k10 = e2.k(map);
            this.f35123d = k10;
            if (k10 != null) {
                o.k(k10.intValue() < 0 ? false : z11, "maxOutboundMessageSize %s exceeds bounds", k10);
            }
            t0 t0Var = null;
            Map<String, ?> r10 = z10 ? e2.r(map) : null;
            if (r10 == null) {
                a2Var = null;
            } else {
                a2Var = b(r10, i10);
            }
            this.f35124e = a2Var;
            Map<String, ?> d10 = z10 ? e2.d(map) : null;
            this.f35125f = d10 != null ? a(d10, i11) : t0Var;
        }

        private static t0 a(Map<String, ?> map, int i10) {
            int intValue = ((Integer) o.p(e2.h(map), "maxAttempts cannot be empty")).intValue();
            boolean z10 = true;
            o.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) o.p(e2.c(map), "hedgingDelay cannot be empty")).longValue();
            if (longValue < 0) {
                z10 = false;
            }
            o.j(z10, "hedgingDelay must not be negative: %s", longValue);
            return new t0(min, longValue, e2.p(map));
        }

        private static a2 b(Map<String, ?> map, int i10) {
            int intValue = ((Integer) o.p(e2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z10 = true;
            o.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) o.p(e2.e(map), "initialBackoff cannot be empty")).longValue();
            o.j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) o.p(e2.j(map), "maxBackoff cannot be empty")).longValue();
            o.j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) o.p(e2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            o.k(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q10 = e2.q(map);
            o.k(q10 == null || q10.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q10);
            Set<j1.b> s10 = e2.s(map);
            if (q10 == null && s10.isEmpty()) {
                z10 = false;
            }
            o.e(z10, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new a2(min, longValue, longValue2, doubleValue, q10, s10);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!k.a(this.f35120a, bVar.f35120a) || !k.a(this.f35121b, bVar.f35121b) || !k.a(this.f35122c, bVar.f35122c) || !k.a(this.f35123d, bVar.f35123d) || !k.a(this.f35124e, bVar.f35124e) || !k.a(this.f35125f, bVar.f35125f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f35120a, this.f35121b, this.f35122c, this.f35123d, this.f35124e, this.f35125f);
        }

        public String toString() {
            return i.c(this).d("timeoutNanos", this.f35120a).d("waitForReady", this.f35121b).d("maxInboundMessageSize", this.f35122c).d("maxOutboundMessageSize", this.f35123d).d("retryPolicy", this.f35124e).d("hedgingPolicy", this.f35125f).toString();
        }
    }

    /* compiled from: ManagedChannelServiceConfig */
    static final class c extends f0 {

        /* renamed from: b  reason: collision with root package name */
        final j1 f35126b;

        public f0.b a(r0.f fVar) {
            return f0.b.d().b(this.f35126b).a();
        }

        private c(j1 j1Var) {
            this.f35126b = j1Var;
        }
    }

    j1(b bVar, Map<String, b> map, Map<String, b> map2, z1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f35113a = bVar;
        this.f35114b = Collections.unmodifiableMap(new HashMap(map));
        this.f35115c = Collections.unmodifiableMap(new HashMap(map2));
        this.f35116d = c0Var;
        this.f35117e = obj;
        this.f35118f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static j1 a() {
        return new j1((b) null, new HashMap(), new HashMap(), (z1.c0) null, (Object) null, (Map<String, ?>) null);
    }

    static j1 b(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        boolean z11 = z10;
        z1.c0 v10 = z11 ? e2.v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b10 = e2.b(map);
        List<Map<String, ?>> m10 = e2.m(map);
        if (m10 == null) {
            return new j1((b) null, hashMap, hashMap2, v10, obj, b10);
        }
        b bVar = null;
        for (Map next : m10) {
            b bVar2 = new b(next, z11, i10, i11);
            List<Map<String, ?>> o10 = e2.o(next);
            if (o10 != null && !o10.isEmpty()) {
                for (Map next2 : o10) {
                    String t10 = e2.t(next2);
                    String n10 = e2.n(next2);
                    boolean z12 = true;
                    if (u.a(t10)) {
                        o.k(u.a(n10), "missing service name for method %s", n10);
                        if (bVar != null) {
                            z12 = false;
                        }
                        o.k(z12, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else {
                        Map<String, ?> map2 = map;
                        if (u.a(n10)) {
                            o.k(!hashMap2.containsKey(t10), "Duplicate service %s", t10);
                            hashMap2.put(t10, bVar2);
                        } else {
                            String b11 = z0.b(t10, n10);
                            o.k(!hashMap.containsKey(b11), "Duplicate method name %s", b11);
                            hashMap.put(b11, bVar2);
                        }
                    }
                }
            }
            Map<String, ?> map3 = map;
        }
        return new j1(bVar, hashMap, hashMap2, v10, obj, b10);
    }

    /* access modifiers changed from: package-private */
    public f0 c() {
        if (!this.f35115c.isEmpty() || !this.f35114b.isEmpty() || this.f35113a != null) {
            return new c();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Map<String, ?> d() {
        return this.f35118f;
    }

    /* access modifiers changed from: package-private */
    public Object e() {
        return this.f35117e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (!k.a(this.f35113a, j1Var.f35113a) || !k.a(this.f35114b, j1Var.f35114b) || !k.a(this.f35115c, j1Var.f35115c) || !k.a(this.f35116d, j1Var.f35116d) || !k.a(this.f35117e, j1Var.f35117e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public b f(z0<?, ?> z0Var) {
        b bVar = this.f35114b.get(z0Var.c());
        if (bVar == null) {
            bVar = this.f35115c.get(z0Var.d());
        }
        return bVar == null ? this.f35113a : bVar;
    }

    /* access modifiers changed from: package-private */
    public z1.c0 g() {
        return this.f35116d;
    }

    public int hashCode() {
        return k.b(this.f35113a, this.f35114b, this.f35115c, this.f35116d, this.f35117e);
    }

    public String toString() {
        return i.c(this).d("defaultMethodConfig", this.f35113a).d("serviceMethodMap", this.f35114b).d("serviceMap", this.f35115c).d("retryThrottling", this.f35116d).d("loadBalancingConfig", this.f35117e).toString();
    }
}
