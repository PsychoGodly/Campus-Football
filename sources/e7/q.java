package e7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector */
class q {

    /* compiled from: CycleDetector */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final c<?> f28784a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f28785b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f28786c = new HashSet();

        b(c<?> cVar) {
            this.f28784a = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f28785b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f28786c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public c<?> c() {
            return this.f28784a;
        }

        /* access modifiers changed from: package-private */
        public Set<b> d() {
            return this.f28785b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f28785b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f28786c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f28786c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final f0<?> f28787a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f28788b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f28787a.equals(this.f28787a) || cVar.f28788b != this.f28788b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f28787a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28788b).hashCode();
        }

        private c(f0<?> f0Var, boolean z10) {
            this.f28787a = f0Var;
            this.f28788b = z10;
        }
    }

    static void a(List<c<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b next2 : next.d()) {
                next2.g(next);
                if (next2.f()) {
                    b10.add(next2);
                }
            }
        }
        if (i10 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b next3 : c10) {
                if (!next3.f() && !next3.e()) {
                    arrayList.add(next3.c());
                }
            }
            throw new s(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b next : set) {
            if (next.f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (c next : list) {
            b bVar = new b(next);
            Iterator it = next.j().iterator();
            while (true) {
                if (it.hasNext()) {
                    f0 f0Var = (f0) it.next();
                    c cVar = new c(f0Var, !next.p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f28788b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{f0Var}));
                    }
                }
            }
        }
        for (Set<b> it2 : hashMap.values()) {
            for (b bVar2 : it2) {
                for (r next2 : bVar2.c().g()) {
                    if (next2.e() && (set = (Set) hashMap.get(new c(next2.c(), next2.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
