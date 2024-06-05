package e7;

import b8.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o7.c;

/* compiled from: RestrictedComponentContainer */
final class g0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f0<?>> f28761a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<?>> f28762b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f0<?>> f28763c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<f0<?>> f28764d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f0<?>> f28765e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f28766f;

    /* renamed from: g  reason: collision with root package name */
    private final e f28767g;

    /* compiled from: RestrictedComponentContainer */
    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f28768a;

        /* renamed from: b  reason: collision with root package name */
        private final c f28769b;

        public a(Set<Class<?>> set, c cVar) {
            this.f28768a = set;
            this.f28769b = cVar;
        }

        public void b(o7.a<?> aVar) {
            if (this.f28768a.contains(aVar.b())) {
                this.f28769b.b(aVar);
            } else {
                throw new t(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    g0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r next : cVar.g()) {
            if (next.e()) {
                if (next.g()) {
                    hashSet4.add(next.c());
                } else {
                    hashSet.add(next.c());
                }
            } else if (next.d()) {
                hashSet3.add(next.c());
            } else if (next.g()) {
                hashSet5.add(next.c());
            } else {
                hashSet2.add(next.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(f0.b(c.class));
        }
        this.f28761a = Collections.unmodifiableSet(hashSet);
        this.f28762b = Collections.unmodifiableSet(hashSet2);
        this.f28763c = Collections.unmodifiableSet(hashSet3);
        this.f28764d = Collections.unmodifiableSet(hashSet4);
        this.f28765e = Collections.unmodifiableSet(hashSet5);
        this.f28766f = cVar.k();
        this.f28767g = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f28761a.contains(f0.b(cls))) {
            T a10 = this.f28767g.a(cls);
            if (!cls.equals(c.class)) {
                return a10;
            }
            return new a(this.f28766f, (c) a10);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> b<T> b(f0<T> f0Var) {
        if (this.f28762b.contains(f0Var)) {
            return this.f28767g.b(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{f0Var}));
    }

    public <T> b<T> c(Class<T> cls) {
        return b(f0.b(cls));
    }

    public <T> b<Set<T>> d(f0<T> f0Var) {
        if (this.f28765e.contains(f0Var)) {
            return this.f28767g.d(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{f0Var}));
    }

    public <T> Set<T> e(f0<T> f0Var) {
        if (this.f28764d.contains(f0Var)) {
            return this.f28767g.e(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{f0Var}));
    }

    public <T> T f(f0<T> f0Var) {
        if (this.f28761a.contains(f0Var)) {
            return this.f28767g.f(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{f0Var}));
    }

    public /* synthetic */ Set g(Class cls) {
        return d.f(this, cls);
    }

    public <T> b8.a<T> h(f0<T> f0Var) {
        if (this.f28763c.contains(f0Var)) {
            return this.f28767g.h(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{f0Var}));
    }

    public <T> b8.a<T> i(Class<T> cls) {
        return h(f0.b(cls));
    }
}
