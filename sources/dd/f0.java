package dd;

import dd.a;
import dd.r0;
import r6.o;

/* compiled from: InternalConfigSelector */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c<f0> f32213a = a.c.a("internal:io.grpc.config-selector");

    /* compiled from: InternalConfigSelector */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f32214a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f32215b;

        /* renamed from: c  reason: collision with root package name */
        public h f32216c;

        /* compiled from: InternalConfigSelector */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Object f32217a;

            /* renamed from: b  reason: collision with root package name */
            private h f32218b;

            public b a() {
                o.v(this.f32217a != null, "config is not set");
                return new b(j1.f32233f, this.f32217a, this.f32218b);
            }

            public a b(Object obj) {
                this.f32217a = o.p(obj, "config");
                return this;
            }

            private a() {
            }
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f32215b;
        }

        public h b() {
            return this.f32216c;
        }

        public j1 c() {
            return this.f32214a;
        }

        private b(j1 j1Var, Object obj, h hVar) {
            this.f32214a = (j1) o.p(j1Var, "status");
            this.f32215b = obj;
            this.f32216c = hVar;
        }
    }

    public abstract b a(r0.f fVar);
}
