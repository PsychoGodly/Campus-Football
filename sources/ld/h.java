package ld;

import dd.a;
import dd.j1;
import dd.p;
import dd.q;
import dd.r0;
import dd.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r6.i;
import r6.k;
import r6.o;

/* compiled from: RoundRobinLoadBalancer */
final class h extends r0 {

    /* renamed from: h  reason: collision with root package name */
    static final a.c<d<q>> f36218h = a.c.a("state-info");

    /* renamed from: i  reason: collision with root package name */
    private static final j1 f36219i = j1.f32233f.q("no subchannels ready");

    /* renamed from: c  reason: collision with root package name */
    private final r0.d f36220c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<x, r0.h> f36221d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Random f36222e;

    /* renamed from: f  reason: collision with root package name */
    private p f36223f;

    /* renamed from: g  reason: collision with root package name */
    private e f36224g = new b(f36219i);

    /* compiled from: RoundRobinLoadBalancer */
    class a implements r0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.h f36225a;

        a(r0.h hVar) {
            this.f36225a = hVar;
        }

        public void a(q qVar) {
            h.this.l(this.f36225a, qVar);
        }
    }

    /* compiled from: RoundRobinLoadBalancer */
    static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f36227a;

        b(j1 j1Var) {
            super((a) null);
            this.f36227a = (j1) o.p(j1Var, "status");
        }

        public r0.e a(r0.f fVar) {
            return this.f36227a.o() ? r0.e.g() : r0.e.f(this.f36227a);
        }

        /* access modifiers changed from: package-private */
        public boolean c(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (k.a(this.f36227a, bVar.f36227a) || (this.f36227a.o() && bVar.f36227a.o())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return i.b(b.class).d("status", this.f36227a).toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer */
    static final class c extends e {

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater<c> f36228c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a  reason: collision with root package name */
        private final List<r0.h> f36229a;

        /* renamed from: b  reason: collision with root package name */
        private volatile int f36230b;

        c(List<r0.h> list, int i10) {
            super((a) null);
            o.e(!list.isEmpty(), "empty list");
            this.f36229a = list;
            this.f36230b = i10 - 1;
        }

        private r0.h d() {
            int size = this.f36229a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f36228c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i10 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i10);
                incrementAndGet = i10;
            }
            return this.f36229a.get(incrementAndGet);
        }

        public r0.e a(r0.f fVar) {
            return r0.e.h(d());
        }

        /* access modifiers changed from: package-private */
        public boolean c(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            if (cVar == this || (this.f36229a.size() == cVar.f36229a.size() && new HashSet(this.f36229a).containsAll(cVar.f36229a))) {
                return true;
            }
            return false;
        }

        public String toString() {
            return i.b(c.class).d("list", this.f36229a).toString();
        }
    }

    /* compiled from: RoundRobinLoadBalancer */
    static final class d<T> {

        /* renamed from: a  reason: collision with root package name */
        T f36231a;

        d(T t10) {
            this.f36231a = t10;
        }
    }

    /* compiled from: RoundRobinLoadBalancer */
    private static abstract class e extends r0.i {
        private e() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean c(e eVar);

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    h(r0.d dVar) {
        this.f36220c = (r0.d) o.p(dVar, "helper");
        this.f36222e = new Random();
    }

    private static List<r0.h> h(Collection<r0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (r0.h next : collection) {
            if (k(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static d<q> i(r0.h hVar) {
        return (d) o.p((d) hVar.c().b(f36218h), "STATE_INFO");
    }

    static boolean k(r0.h hVar) {
        return ((q) i(hVar).f36231a).c() == p.READY;
    }

    /* access modifiers changed from: private */
    public void l(r0.h hVar, q qVar) {
        if (this.f36221d.get(o(hVar.a())) == hVar) {
            p c10 = qVar.c();
            p pVar = p.TRANSIENT_FAILURE;
            if (c10 == pVar || qVar.c() == p.IDLE) {
                this.f36220c.e();
            }
            p c11 = qVar.c();
            p pVar2 = p.IDLE;
            if (c11 == pVar2) {
                hVar.e();
            }
            d<q> i10 = i(hVar);
            if (!((q) i10.f36231a).c().equals(pVar) || (!qVar.c().equals(p.CONNECTING) && !qVar.c().equals(pVar2))) {
                i10.f36231a = qVar;
                q();
            }
        }
    }

    private static <T> Set<T> m(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    private void n(r0.h hVar) {
        hVar.f();
        i(hVar).f36231a = q.a(p.SHUTDOWN);
    }

    private static x o(x xVar) {
        return new x(xVar.a());
    }

    private static Map<x, x> p(List<x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (x next : list) {
            hashMap.put(o(next), next);
        }
        return hashMap;
    }

    private void q() {
        List<r0.h> h10 = h(j());
        if (h10.isEmpty()) {
            boolean z10 = false;
            j1 j1Var = f36219i;
            for (r0.h i10 : j()) {
                q qVar = (q) i(i10).f36231a;
                if (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) {
                    z10 = true;
                }
                if (j1Var == f36219i || !j1Var.o()) {
                    j1Var = qVar.d();
                }
            }
            r(z10 ? p.CONNECTING : p.TRANSIENT_FAILURE, new b(j1Var));
            return;
        }
        r(p.READY, new c(h10, this.f36222e.nextInt(h10.size())));
    }

    private void r(p pVar, e eVar) {
        if (pVar != this.f36223f || !eVar.c(this.f36224g)) {
            this.f36220c.f(pVar, eVar);
            this.f36223f = pVar;
            this.f36224g = eVar;
        }
    }

    public boolean a(r0.g gVar) {
        if (gVar.a().isEmpty()) {
            j1 j1Var = j1.f32248u;
            c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        List<x> a10 = gVar.a();
        Set<x> keySet = this.f36221d.keySet();
        Map<x, x> p10 = p(a10);
        Set<T> m10 = m(keySet, p10.keySet());
        for (Map.Entry next : p10.entrySet()) {
            x xVar = (x) next.getKey();
            x xVar2 = (x) next.getValue();
            r0.h hVar = this.f36221d.get(xVar);
            if (hVar != null) {
                hVar.h(Collections.singletonList(xVar2));
            } else {
                r0.h hVar2 = (r0.h) o.p(this.f36220c.a(r0.b.c().d(xVar2).f(dd.a.c().d(f36218h, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new a(hVar2));
                this.f36221d.put(xVar, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T remove : m10) {
            arrayList.add(this.f36221d.remove(remove));
        }
        q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n((r0.h) it.next());
        }
        return true;
    }

    public void c(j1 j1Var) {
        if (this.f36223f != p.READY) {
            r(p.TRANSIENT_FAILURE, new b(j1Var));
        }
    }

    public void f() {
        for (r0.h n10 : j()) {
            n(n10);
        }
        this.f36221d.clear();
    }

    /* access modifiers changed from: package-private */
    public Collection<r0.h> j() {
        return this.f36221d.values();
    }
}
