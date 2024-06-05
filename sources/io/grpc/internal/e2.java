package io.grpc.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import dd.a1;
import dd.j1;
import dd.s0;
import dd.t0;
import io.grpc.internal.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.a0;
import r6.i;
import r6.k;
import r6.o;
import r6.z;

/* compiled from: ServiceConfigUtil */
public final class e2 {

    /* compiled from: ServiceConfigUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f34876a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, ?> f34877b;

        public a(String str, Map<String, ?> map) {
            this.f34876a = (String) o.p(str, "policyName");
            this.f34877b = (Map) o.p(map, "rawConfigValue");
        }

        public String a() {
            return this.f34876a;
        }

        public Map<String, ?> b() {
            return this.f34877b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f34876a.equals(aVar.f34876a) || !this.f34877b.equals(aVar.f34877b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f34876a, this.f34877b);
        }

        public String toString() {
            return i.c(this).d("policyName", this.f34876a).d("rawConfigValue", this.f34877b).toString();
        }
    }

    /* compiled from: ServiceConfigUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final s0 f34878a;

        /* renamed from: b  reason: collision with root package name */
        final Object f34879b;

        public b(s0 s0Var, Object obj) {
            this.f34878a = (s0) o.p(s0Var, "provider");
            this.f34879b = obj;
        }

        public Object a() {
            return this.f34879b;
        }

        public s0 b() {
            return this.f34878a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!k.a(this.f34878a, bVar.f34878a) || !k.a(this.f34879b, bVar.f34879b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f34878a, this.f34879b);
        }

        public String toString() {
            return i.c(this).d("provider", this.f34878a).d("config", this.f34879b).toString();
        }
    }

    private e2() {
    }

    public static List<a> A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> z10 : list) {
            arrayList.add(z(z10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Double a(Map<String, ?> map) {
        return b1.h(map, "backoffMultiplier");
    }

    public static Map<String, ?> b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return b1.j(map, "healthCheckConfig");
    }

    static Long c(Map<String, ?> map) {
        return b1.l(map, "hedgingDelay");
    }

    static Map<String, ?> d(Map<String, ?> map) {
        return b1.j(map, "hedgingPolicy");
    }

    static Long e(Map<String, ?> map) {
        return b1.l(map, "initialBackoff");
    }

    private static Set<j1.b> f(Map<String, ?> map, String str) {
        List<?> e10 = b1.e(map, str);
        if (e10 == null) {
            return null;
        }
        return u(e10);
    }

    public static List<Map<String, ?>> g(Map<String, ?> map) {
        String k10;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(b1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k10 = b1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k10.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Integer h(Map<String, ?> map) {
        return b1.i(map, "maxAttempts");
    }

    static Integer i(Map<String, ?> map) {
        return b1.i(map, "maxAttempts");
    }

    static Long j(Map<String, ?> map) {
        return b1.l(map, "maxBackoff");
    }

    static Integer k(Map<String, ?> map) {
        return b1.i(map, "maxRequestMessageBytes");
    }

    static Integer l(Map<String, ?> map) {
        return b1.i(map, "maxResponseMessageBytes");
    }

    static List<Map<String, ?>> m(Map<String, ?> map) {
        return b1.f(map, "methodConfig");
    }

    static String n(Map<String, ?> map) {
        return b1.k(map, "method");
    }

    static List<Map<String, ?>> o(Map<String, ?> map) {
        return b1.f(map, MediationMetaData.KEY_NAME);
    }

    static Set<j1.b> p(Map<String, ?> map) {
        Set<j1.b> f10 = f(map, "nonFatalStatusCodes");
        if (f10 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(j1.b.class));
        }
        z.a(!f10.contains(j1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f10;
    }

    static Long q(Map<String, ?> map) {
        return b1.l(map, "perAttemptRecvTimeout");
    }

    static Map<String, ?> r(Map<String, ?> map) {
        return b1.j(map, "retryPolicy");
    }

    static Set<j1.b> s(Map<String, ?> map) {
        Set<j1.b> f10 = f(map, "retryableStatusCodes");
        z.a(f10 != null, "%s is required in retry policy", "retryableStatusCodes");
        z.a(true ^ f10.contains(j1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f10;
    }

    static String t(Map<String, ?> map) {
        return b1.k(map, "service");
    }

    private static Set<j1.b> u(List<?> list) {
        j1.b bVar;
        EnumSet<E> noneOf = EnumSet.noneOf(j1.b.class);
        for (Object next : list) {
            if (next instanceof Double) {
                Double d10 = (Double) next;
                int intValue = d10.intValue();
                boolean z10 = true;
                z.a(((double) intValue) == d10.doubleValue(), "Status code %s is not integral", next);
                bVar = j1.h(intValue).m();
                if (bVar.d() != d10.intValue()) {
                    z10 = false;
                }
                z.a(z10, "Status code %s is not valid", next);
            } else if (next instanceof String) {
                try {
                    bVar = j1.b.valueOf((String) next);
                } catch (IllegalArgumentException e10) {
                    throw new a0("Status code " + next + " is not valid", e10);
                }
            } else {
                throw new a0("Can not convert status code " + next + " to Status.Code, because its type is " + next.getClass());
            }
            noneOf.add(bVar);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    static z1.c0 v(Map<String, ?> map) {
        Map<String, ?> j10;
        if (map == null || (j10 = b1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = b1.h(j10, "maxTokens").floatValue();
        float floatValue2 = b1.h(j10, "tokenRatio").floatValue();
        boolean z10 = true;
        o.v(floatValue > 0.0f, "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z10 = false;
        }
        o.v(z10, "tokenRatio should be greater than zero");
        return new z1.c0(floatValue, floatValue2);
    }

    static Long w(Map<String, ?> map) {
        return b1.l(map, "timeout");
    }

    static Boolean x(Map<String, ?> map) {
        return b1.d(map, "waitForReady");
    }

    public static a1.c y(List<a> list, t0 t0Var) {
        ArrayList arrayList = new ArrayList();
        for (a next : list) {
            String a10 = next.a();
            s0 d10 = t0Var.d(a10);
            if (d10 == null) {
                arrayList.add(a10);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(e2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                a1.c e10 = d10.e(next.b());
                if (e10.d() != null) {
                    return e10;
                }
                return a1.c.a(new b(d10, e10.c()));
            }
        }
        j1 j1Var = j1.f32235h;
        return a1.c.b(j1Var.q("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map<String, ?> map) {
        if (map.size() == 1) {
            String str = (String) map.entrySet().iterator().next().getKey();
            return new a(str, b1.j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
