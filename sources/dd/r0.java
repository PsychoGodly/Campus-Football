package dd;

import dd.a;
import dd.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import r6.o;

/* compiled from: LoadBalancer */
public abstract class r0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a.c<Map<String, ?>> f32339b = a.c.a("internal:health-checking-config");

    /* renamed from: a  reason: collision with root package name */
    private int f32340a;

    /* compiled from: LoadBalancer */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f32341a;

        /* renamed from: b  reason: collision with root package name */
        private final a f32342b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[][] f32343c;

        /* compiled from: LoadBalancer */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f32344a;

            /* renamed from: b  reason: collision with root package name */
            private a f32345b = a.f32108c;

            /* renamed from: c  reason: collision with root package name */
            private Object[][] f32346c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

            a() {
            }

            /* access modifiers changed from: private */
            public <T> a c(Object[][] objArr) {
                int length = objArr.length;
                int[] iArr = new int[2];
                iArr[1] = 2;
                iArr[0] = length;
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
                this.f32346c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public b b() {
                return new b(this.f32344a, this.f32345b, this.f32346c);
            }

            public a d(x xVar) {
                this.f32344a = Collections.singletonList(xVar);
                return this;
            }

            public a e(List<x> list) {
                o.e(!list.isEmpty(), "addrs is empty");
                this.f32344a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(a aVar) {
                this.f32345b = (a) o.p(aVar, "attrs");
                return this;
            }
        }

        public static a c() {
            return new a();
        }

        public List<x> a() {
            return this.f32341a;
        }

        public a b() {
            return this.f32342b;
        }

        public a d() {
            return c().e(this.f32341a).f(this.f32342b).c(this.f32343c);
        }

        public String toString() {
            return r6.i.c(this).d("addrs", this.f32341a).d("attrs", this.f32342b).d("customOptions", Arrays.deepToString(this.f32343c)).toString();
        }

        private b(List<x> list, a aVar, Object[][] objArr) {
            this.f32341a = (List) o.p(list, "addresses are not set");
            this.f32342b = (a) o.p(aVar, "attrs");
            this.f32343c = (Object[][]) o.p(objArr, "customOptions");
        }
    }

    /* compiled from: LoadBalancer */
    public static abstract class c {
        public abstract r0 a(d dVar);
    }

    /* compiled from: LoadBalancer */
    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public f b() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService c() {
            throw new UnsupportedOperationException();
        }

        public n1 d() {
            throw new UnsupportedOperationException();
        }

        public void e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f(p pVar, i iVar);
    }

    /* compiled from: LoadBalancer */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        private static final e f32347e = new e((h) null, (k.a) null, j1.f32233f, false);

        /* renamed from: a  reason: collision with root package name */
        private final h f32348a;

        /* renamed from: b  reason: collision with root package name */
        private final k.a f32349b;

        /* renamed from: c  reason: collision with root package name */
        private final j1 f32350c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f32351d;

        private e(h hVar, k.a aVar, j1 j1Var, boolean z10) {
            this.f32348a = hVar;
            this.f32349b = aVar;
            this.f32350c = (j1) o.p(j1Var, "status");
            this.f32351d = z10;
        }

        public static e e(j1 j1Var) {
            o.e(!j1Var.o(), "drop status shouldn't be OK");
            return new e((h) null, (k.a) null, j1Var, true);
        }

        public static e f(j1 j1Var) {
            o.e(!j1Var.o(), "error status shouldn't be OK");
            return new e((h) null, (k.a) null, j1Var, false);
        }

        public static e g() {
            return f32347e;
        }

        public static e h(h hVar) {
            return i(hVar, (k.a) null);
        }

        public static e i(h hVar, k.a aVar) {
            return new e((h) o.p(hVar, "subchannel"), aVar, j1.f32233f, false);
        }

        public j1 a() {
            return this.f32350c;
        }

        public k.a b() {
            return this.f32349b;
        }

        public h c() {
            return this.f32348a;
        }

        public boolean d() {
            return this.f32351d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!r6.k.a(this.f32348a, eVar.f32348a) || !r6.k.a(this.f32350c, eVar.f32350c) || !r6.k.a(this.f32349b, eVar.f32349b) || this.f32351d != eVar.f32351d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return r6.k.b(this.f32348a, this.f32350c, this.f32349b, Boolean.valueOf(this.f32351d));
        }

        public String toString() {
            return r6.i.c(this).d("subchannel", this.f32348a).d("streamTracerFactory", this.f32349b).d("status", this.f32350c).e("drop", this.f32351d).toString();
        }
    }

    /* compiled from: LoadBalancer */
    public static abstract class f {
        public abstract c a();

        public abstract y0 b();

        public abstract z0<?, ?> c();
    }

    /* compiled from: LoadBalancer */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f32352a;

        /* renamed from: b  reason: collision with root package name */
        private final a f32353b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f32354c;

        /* compiled from: LoadBalancer */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f32355a;

            /* renamed from: b  reason: collision with root package name */
            private a f32356b = a.f32108c;

            /* renamed from: c  reason: collision with root package name */
            private Object f32357c;

            a() {
            }

            public g a() {
                return new g(this.f32355a, this.f32356b, this.f32357c);
            }

            public a b(List<x> list) {
                this.f32355a = list;
                return this;
            }

            public a c(a aVar) {
                this.f32356b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f32357c = obj;
                return this;
            }
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f32352a;
        }

        public a b() {
            return this.f32353b;
        }

        public Object c() {
            return this.f32354c;
        }

        public a e() {
            return d().b(this.f32352a).c(this.f32353b).d(this.f32354c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (!r6.k.a(this.f32352a, gVar.f32352a) || !r6.k.a(this.f32353b, gVar.f32353b) || !r6.k.a(this.f32354c, gVar.f32354c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return r6.k.b(this.f32352a, this.f32353b, this.f32354c);
        }

        public String toString() {
            return r6.i.c(this).d("addresses", this.f32352a).d("attributes", this.f32353b).d("loadBalancingPolicyConfig", this.f32354c).toString();
        }

        private g(List<x> list, a aVar, Object obj) {
            this.f32352a = Collections.unmodifiableList(new ArrayList((Collection) o.p(list, "addresses")));
            this.f32353b = (a) o.p(aVar, "attributes");
            this.f32354c = obj;
        }
    }

    /* compiled from: LoadBalancer */
    public static abstract class h {
        public final x a() {
            List<x> b10 = b();
            boolean z10 = true;
            if (b10.size() != 1) {
                z10 = false;
            }
            o.x(z10, "%s does not have exactly one group", b10);
            return b10.get(0);
        }

        public List<x> b() {
            throw new UnsupportedOperationException();
        }

        public abstract a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LoadBalancer */
    public static abstract class i {
        public abstract e a(f fVar);

        @Deprecated
        public void b() {
        }
    }

    /* compiled from: LoadBalancer */
    public interface j {
        void a(q qVar);
    }

    public boolean a(g gVar) {
        if (!gVar.a().isEmpty() || b()) {
            int i10 = this.f32340a;
            this.f32340a = i10 + 1;
            if (i10 == 0) {
                d(gVar);
            }
            this.f32340a = 0;
            return true;
        }
        j1 j1Var = j1.f32248u;
        c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(j1 j1Var);

    public void d(g gVar) {
        int i10 = this.f32340a;
        this.f32340a = i10 + 1;
        if (i10 == 0) {
            a(gVar);
        }
        this.f32340a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
