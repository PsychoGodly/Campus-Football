package e7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f28738a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<? super T>> f28739b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f28740c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28741d;

    /* renamed from: e  reason: collision with root package name */
    private final int f28742e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f28743f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f28744g;

    public static <T> b<T> c(f0<T> f0Var) {
        return new b<>((f0) f0Var, new f0[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(f0<T> f0Var, f0<? super T>... f0VarArr) {
        return new b<>((f0) f0Var, (f0[]) f0VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>((Class) cls, (Class[]) clsArr);
    }

    public static <T> c<T> l(T t10, Class<T> cls) {
        return m(cls).f(new a(t10)).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new b(t10)).d();
    }

    public Set<r> g() {
        return this.f28740c;
    }

    public h<T> h() {
        return this.f28743f;
    }

    public String i() {
        return this.f28738a;
    }

    public Set<f0<? super T>> j() {
        return this.f28739b;
    }

    public Set<Class<?>> k() {
        return this.f28744g;
    }

    public boolean n() {
        return this.f28741d == 1;
    }

    public boolean o() {
        return this.f28741d == 2;
    }

    public boolean p() {
        return this.f28742e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c(this.f28738a, this.f28739b, this.f28740c, this.f28741d, this.f28742e, hVar, this.f28744g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f28739b.toArray()) + ">{" + this.f28741d + ", type=" + this.f28742e + ", deps=" + Arrays.toString(this.f28740c.toArray()) + "}";
    }

    /* compiled from: Component */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f28745a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<f0<? super T>> f28746b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f28747c;

        /* renamed from: d  reason: collision with root package name */
        private int f28748d;

        /* renamed from: e  reason: collision with root package name */
        private int f28749e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f28750f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f28751g;

        /* access modifiers changed from: private */
        public b<T> g() {
            this.f28749e = 1;
            return this;
        }

        private b<T> i(int i10) {
            e0.d(this.f28748d == 0, "Instantiation type has already been set.");
            this.f28748d = i10;
            return this;
        }

        private void j(f0<?> f0Var) {
            e0.a(!this.f28746b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            e0.c(rVar, "Null dependency");
            j(rVar.c());
            this.f28747c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            e0.d(this.f28750f != null, "Missing required property: factory.");
            return new c(this.f28745a, new HashSet(this.f28746b), new HashSet(this.f28747c), this.f28748d, this.f28749e, this.f28750f, this.f28751g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(h<T> hVar) {
            this.f28750f = (h) e0.c(hVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f28745a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f28745a = null;
            HashSet hashSet = new HashSet();
            this.f28746b = hashSet;
            this.f28747c = new HashSet();
            this.f28748d = 0;
            this.f28749e = 0;
            this.f28751g = new HashSet();
            e0.c(cls, "Null interface");
            hashSet.add(f0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                e0.c(cls2, "Null interface");
                this.f28746b.add(f0.b(cls2));
            }
        }

        @SafeVarargs
        private b(f0<T> f0Var, f0<? super T>... f0VarArr) {
            this.f28745a = null;
            HashSet hashSet = new HashSet();
            this.f28746b = hashSet;
            this.f28747c = new HashSet();
            this.f28748d = 0;
            this.f28749e = 0;
            this.f28751g = new HashSet();
            e0.c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (f0<? super T> c10 : f0VarArr) {
                e0.c(c10, "Null interface");
            }
            Collections.addAll(this.f28746b, f0VarArr);
        }
    }

    private c(String str, Set<f0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f28738a = str;
        this.f28739b = Collections.unmodifiableSet(set);
        this.f28740c = Collections.unmodifiableSet(set2);
        this.f28741d = i10;
        this.f28742e = i11;
        this.f28743f = hVar;
        this.f28744g = Collections.unmodifiableSet(set3);
    }
}
