package e7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o7.c;
import o7.d;

/* compiled from: ComponentRuntime */
public class o implements e, i7.a {

    /* renamed from: i  reason: collision with root package name */
    private static final b8.b<Set<Object>> f28771i = l.f32478a;

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, b8.b<?>> f28772a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<f0<?>, b8.b<?>> f28773b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<f0<?>, y<?>> f28774c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b8.b<ComponentRegistrar>> f28775d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f28776e;

    /* renamed from: f  reason: collision with root package name */
    private final v f28777f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<Boolean> f28778g;

    /* renamed from: h  reason: collision with root package name */
    private final j f28779h;

    /* compiled from: ComponentRuntime */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f28780a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b8.b<ComponentRegistrar>> f28781b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f28782c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f28783d = j.f28770a;

        b(Executor executor) {
            this.f28780a = executor;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f28782c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f28781b.add(new p(componentRegistrar));
            return this;
        }

        public b d(Collection<b8.b<ComponentRegistrar>> collection) {
            this.f28781b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f28780a, this.f28781b, this.f28782c, this.f28783d);
        }

        public b g(j jVar) {
            this.f28783d = jVar;
            return this;
        }
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<b8.b<ComponentRegistrar>> it = this.f28775d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f28779h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f28776e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f28776e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f28772a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f28772a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (c next : list) {
                this.f28772a.put(next, new x(new k(this, next)));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        u();
    }

    private void o(Map<c<?>, b8.b<?>> map, boolean z10) {
        for (Map.Entry next : map.entrySet()) {
            c cVar = (c) next.getKey();
            b8.b bVar = (b8.b) next.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                bVar.get();
            }
        }
        this.f28777f.f();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new g0(cVar, this));
    }

    private void u() {
        Boolean bool = this.f28778g.get();
        if (bool != null) {
            o(this.f28772a, bool.booleanValue());
        }
    }

    private void v() {
        for (c next : this.f28772a.keySet()) {
            Iterator<r> it = next.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    r next2 = it.next();
                    if (next2.g() && !this.f28774c.containsKey(next2.c())) {
                        this.f28774c.put(next2.c(), y.b(Collections.emptySet()));
                    } else if (this.f28773b.containsKey(next2.c())) {
                        continue;
                    } else if (next2.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.c()}));
                    } else if (!next2.g()) {
                        this.f28773b.put(next2.c(), d0.e());
                    }
                }
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c next : list) {
            if (next.p()) {
                b8.b bVar = this.f28772a.get(next);
                for (f0 f0Var : next.j()) {
                    if (!this.f28773b.containsKey(f0Var)) {
                        this.f28773b.put(f0Var, bVar);
                    } else {
                        arrayList.add(new n((d0) this.f28773b.get(f0Var), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f28772a.entrySet()) {
            c cVar = (c) next.getKey();
            if (!cVar.p()) {
                b8.b bVar = (b8.b) next.getValue();
                for (f0 f0Var : cVar.j()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f28774c.containsKey(entry.getKey())) {
                this.f28774c.put((f0) entry.getKey(), y.b((Collection) entry.getValue()));
            } else {
                y yVar = this.f28774c.get(entry.getKey());
                for (b8.b mVar : (Set) entry.getValue()) {
                    arrayList.add(new m(yVar, mVar));
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    public synchronized <T> b8.b<T> b(f0<T> f0Var) {
        e0.c(f0Var, "Null interface requested.");
        return this.f28773b.get(f0Var);
    }

    public /* synthetic */ b8.b c(Class cls) {
        return d.d(this, cls);
    }

    public synchronized <T> b8.b<Set<T>> d(f0<T> f0Var) {
        y yVar = this.f28774c.get(f0Var);
        if (yVar != null) {
            return yVar;
        }
        return f28771i;
    }

    public /* synthetic */ Set e(f0 f0Var) {
        return d.e(this, f0Var);
    }

    public /* synthetic */ Object f(f0 f0Var) {
        return d.a(this, f0Var);
    }

    public /* synthetic */ Set g(Class cls) {
        return d.f(this, cls);
    }

    public <T> b8.a<T> h(f0<T> f0Var) {
        b8.b<T> b10 = b(f0Var);
        if (b10 == null) {
            return d0.e();
        }
        if (b10 instanceof d0) {
            return (d0) b10;
        }
        return d0.i(b10);
    }

    public /* synthetic */ b8.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z10) {
        HashMap hashMap;
        if (this.f28778g.compareAndSet((Object) null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f28772a);
            }
            o(hashMap, z10);
        }
    }

    private o(Executor executor, Iterable<b8.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f28772a = new HashMap();
        this.f28773b = new HashMap();
        this.f28774c = new HashMap();
        this.f28776e = new HashSet();
        this.f28778g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f28777f = vVar;
        this.f28779h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, d.class, c.class));
        arrayList.add(c.s(this, i7.a.class, new Class[0]));
        for (c next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f28775d = q(iterable);
        n(arrayList);
    }
}
