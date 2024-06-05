package io.grpc.internal;

import dd.a1;
import dd.f;
import dd.j1;
import dd.p;
import dd.r0;
import dd.s0;
import dd.t0;
import io.grpc.internal.e2;
import java.util.List;
import java.util.Map;
import r6.i;
import r6.o;

/* compiled from: AutoConfiguredLoadBalancerFactory */
public final class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t0 f35106a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f35107b;

    /* compiled from: AutoConfiguredLoadBalancerFactory */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final r0.d f35108a;

        /* renamed from: b  reason: collision with root package name */
        private r0 f35109b;

        /* renamed from: c  reason: collision with root package name */
        private s0 f35110c;

        b(r0.d dVar) {
            this.f35108a = dVar;
            s0 d10 = j.this.f35106a.d(j.this.f35107b);
            this.f35110c = d10;
            if (d10 != null) {
                this.f35109b = d10.a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + j.this.f35107b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public r0 a() {
            return this.f35109b;
        }

        /* access modifiers changed from: package-private */
        public void b(j1 j1Var) {
            a().c(j1Var);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a().e();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f35109b.f();
            this.f35109b = null;
        }

        /* access modifiers changed from: package-private */
        public boolean e(r0.g gVar) {
            e2.b bVar = (e2.b) gVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new e2.b(jVar.d(jVar.f35107b, "using default policy"), (Object) null);
                } catch (f e10) {
                    this.f35108a.f(p.TRANSIENT_FAILURE, new d(j1.f32247t.q(e10.getMessage())));
                    this.f35109b.f();
                    this.f35110c = null;
                    this.f35109b = new e();
                    return true;
                }
            }
            if (this.f35110c == null || !bVar.f34878a.b().equals(this.f35110c.b())) {
                this.f35108a.f(p.CONNECTING, new c());
                this.f35109b.f();
                s0 s0Var = bVar.f34878a;
                this.f35110c = s0Var;
                r0 r0Var = this.f35109b;
                this.f35109b = s0Var.a(this.f35108a);
                this.f35108a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", r0Var.getClass().getSimpleName(), this.f35109b.getClass().getSimpleName());
            }
            Object obj = bVar.f34879b;
            if (obj != null) {
                this.f35108a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f34879b);
            }
            return a().a(r0.g.d().b(gVar.a()).c(gVar.b()).d(obj).a());
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class c extends r0.i {
        private c() {
        }

        public r0.e a(r0.f fVar) {
            return r0.e.g();
        }

        public String toString() {
            return i.b(c.class).toString();
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class d extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f35112a;

        d(j1 j1Var) {
            this.f35112a = j1Var;
        }

        public r0.e a(r0.f fVar) {
            return r0.e.f(this.f35112a);
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory */
    private static final class e extends r0 {
        private e() {
        }

        public boolean a(r0.g gVar) {
            return true;
        }

        public void c(j1 j1Var) {
        }

        @Deprecated
        public void d(r0.g gVar) {
        }

        public void f() {
        }
    }

    /* compiled from: AutoConfiguredLoadBalancerFactory */
    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public j(String str) {
        this(t0.b(), str);
    }

    /* access modifiers changed from: private */
    public s0 d(String str, String str2) throws f {
        s0 d10 = this.f35106a.d(str);
        if (d10 != null) {
            return d10;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(r0.d dVar) {
        return new b(dVar);
    }

    /* access modifiers changed from: package-private */
    public a1.c f(Map<String, ?> map) {
        List<e2.a> list;
        if (map != null) {
            try {
                list = e2.A(e2.g(map));
            } catch (RuntimeException e10) {
                return a1.c.b(j1.f32235h.q("can't parse load balancer configuration").p(e10));
            }
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return e2.y(list, this.f35106a);
    }

    j(t0 t0Var, String str) {
        this.f35106a = (t0) o.p(t0Var, "registry");
        this.f35107b = (String) o.p(str, "defaultPolicy");
    }
}
