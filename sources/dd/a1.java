package dd;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import r6.i;
import r6.k;
import r6.o;

/* compiled from: NameResolver */
public abstract class a1 {

    /* compiled from: NameResolver */
    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f32115a;

        a(f fVar) {
            this.f32115a = fVar;
        }

        public void b(j1 j1Var) {
            this.f32115a.b(j1Var);
        }

        public void c(g gVar) {
            this.f32115a.a(gVar.a(), gVar.b());
        }
    }

    /* compiled from: NameResolver */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f32117a;

        /* renamed from: b  reason: collision with root package name */
        private final g1 f32118b;

        /* renamed from: c  reason: collision with root package name */
        private final n1 f32119c;

        /* renamed from: d  reason: collision with root package name */
        private final h f32120d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f32121e;

        /* renamed from: f  reason: collision with root package name */
        private final f f32122f;

        /* renamed from: g  reason: collision with root package name */
        private final Executor f32123g;

        /* renamed from: h  reason: collision with root package name */
        private final String f32124h;

        /* compiled from: NameResolver */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Integer f32125a;

            /* renamed from: b  reason: collision with root package name */
            private g1 f32126b;

            /* renamed from: c  reason: collision with root package name */
            private n1 f32127c;

            /* renamed from: d  reason: collision with root package name */
            private h f32128d;

            /* renamed from: e  reason: collision with root package name */
            private ScheduledExecutorService f32129e;

            /* renamed from: f  reason: collision with root package name */
            private f f32130f;

            /* renamed from: g  reason: collision with root package name */
            private Executor f32131g;

            /* renamed from: h  reason: collision with root package name */
            private String f32132h;

            a() {
            }

            public b a() {
                return new b(this.f32125a, this.f32126b, this.f32127c, this.f32128d, this.f32129e, this.f32130f, this.f32131g, this.f32132h, (a) null);
            }

            public a b(f fVar) {
                this.f32130f = (f) o.o(fVar);
                return this;
            }

            public a c(int i10) {
                this.f32125a = Integer.valueOf(i10);
                return this;
            }

            public a d(Executor executor) {
                this.f32131g = executor;
                return this;
            }

            public a e(String str) {
                this.f32132h = str;
                return this;
            }

            public a f(g1 g1Var) {
                this.f32126b = (g1) o.o(g1Var);
                return this;
            }

            public a g(ScheduledExecutorService scheduledExecutorService) {
                this.f32129e = (ScheduledExecutorService) o.o(scheduledExecutorService);
                return this;
            }

            public a h(h hVar) {
                this.f32128d = (h) o.o(hVar);
                return this;
            }

            public a i(n1 n1Var) {
                this.f32127c = (n1) o.o(n1Var);
                return this;
            }
        }

        /* synthetic */ b(Integer num, g1 g1Var, n1 n1Var, h hVar, ScheduledExecutorService scheduledExecutorService, f fVar, Executor executor, String str, a aVar) {
            this(num, g1Var, n1Var, hVar, scheduledExecutorService, fVar, executor, str);
        }

        public static a f() {
            return new a();
        }

        public int a() {
            return this.f32117a;
        }

        public Executor b() {
            return this.f32123g;
        }

        public g1 c() {
            return this.f32118b;
        }

        public h d() {
            return this.f32120d;
        }

        public n1 e() {
            return this.f32119c;
        }

        public String toString() {
            return i.c(this).b("defaultPort", this.f32117a).d("proxyDetector", this.f32118b).d("syncContext", this.f32119c).d("serviceConfigParser", this.f32120d).d("scheduledExecutorService", this.f32121e).d("channelLogger", this.f32122f).d("executor", this.f32123g).d("overrideAuthority", this.f32124h).toString();
        }

        private b(Integer num, g1 g1Var, n1 n1Var, h hVar, ScheduledExecutorService scheduledExecutorService, f fVar, Executor executor, String str) {
            this.f32117a = ((Integer) o.p(num, "defaultPort not set")).intValue();
            this.f32118b = (g1) o.p(g1Var, "proxyDetector not set");
            this.f32119c = (n1) o.p(n1Var, "syncContext not set");
            this.f32120d = (h) o.p(hVar, "serviceConfigParser not set");
            this.f32121e = scheduledExecutorService;
            this.f32122f = fVar;
            this.f32123g = executor;
            this.f32124h = str;
        }
    }

    /* compiled from: NameResolver */
    public static abstract class d {
        public abstract String a();

        public abstract a1 b(URI uri, b bVar);
    }

    /* compiled from: NameResolver */
    public static abstract class e implements f {
        @Deprecated
        public final void a(List<x> list, a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        public abstract void b(j1 j1Var);

        public abstract void c(g gVar);
    }

    /* compiled from: NameResolver */
    public interface f {
        void a(List<x> list, a aVar);

        void b(j1 j1Var);
    }

    /* compiled from: NameResolver */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f32135a;

        /* renamed from: b  reason: collision with root package name */
        private final a f32136b;

        /* renamed from: c  reason: collision with root package name */
        private final c f32137c;

        /* compiled from: NameResolver */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f32138a = Collections.emptyList();

            /* renamed from: b  reason: collision with root package name */
            private a f32139b = a.f32108c;

            /* renamed from: c  reason: collision with root package name */
            private c f32140c;

            a() {
            }

            public g a() {
                return new g(this.f32138a, this.f32139b, this.f32140c);
            }

            public a b(List<x> list) {
                this.f32138a = list;
                return this;
            }

            public a c(a aVar) {
                this.f32139b = aVar;
                return this;
            }

            public a d(c cVar) {
                this.f32140c = cVar;
                return this;
            }
        }

        g(List<x> list, a aVar, c cVar) {
            this.f32135a = Collections.unmodifiableList(new ArrayList(list));
            this.f32136b = (a) o.p(aVar, "attributes");
            this.f32137c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f32135a;
        }

        public a b() {
            return this.f32136b;
        }

        public c c() {
            return this.f32137c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!k.a(this.f32135a, gVar.f32135a) || !k.a(this.f32136b, gVar.f32136b) || !k.a(this.f32137c, gVar.f32137c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f32135a, this.f32136b, this.f32137c);
        }

        public String toString() {
            return i.c(this).d("addresses", this.f32135a).d("attributes", this.f32136b).d("serviceConfig", this.f32137c).toString();
        }
    }

    /* compiled from: NameResolver */
    public static abstract class h {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(fVar));
        }
    }

    /* compiled from: NameResolver */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f32133a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f32134b;

        private c(Object obj) {
            this.f32134b = o.p(obj, "config");
            this.f32133a = null;
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(j1 j1Var) {
            return new c(j1Var);
        }

        public Object c() {
            return this.f32134b;
        }

        public j1 d() {
            return this.f32133a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!k.a(this.f32133a, cVar.f32133a) || !k.a(this.f32134b, cVar.f32134b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f32133a, this.f32134b);
        }

        public String toString() {
            if (this.f32134b != null) {
                return i.c(this).d("config", this.f32134b).toString();
            }
            return i.c(this).d("error", this.f32133a).toString();
        }

        private c(j1 j1Var) {
            this.f32134b = null;
            this.f32133a = (j1) o.p(j1Var, "status");
            o.k(!j1Var.o(), "cannot use OK status: %s", j1Var);
        }
    }
}
