package t7;

import g7.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import r7.a1;
import u7.i;
import u7.j;
import u7.l;
import u7.q;
import u7.s;
import u7.u;
import v7.d;
import v7.f;
import v7.g;
import v7.k;
import y6.q;
import y7.b;

/* compiled from: LocalDocumentsView */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final l1 f30484a;

    /* renamed from: b  reason: collision with root package name */
    private final b1 f30485b;

    /* renamed from: c  reason: collision with root package name */
    private final b f30486c;

    /* renamed from: d  reason: collision with root package name */
    private final l f30487d;

    n(l1 l1Var, b1 b1Var, b bVar, l lVar) {
        this.f30484a = l1Var;
        this.f30485b = b1Var;
        this.f30486c = bVar;
        this.f30487d = lVar;
    }

    private Map<l, d1> a(Map<l, s> map, Map<l, k> map2, Set<l> set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (s next : map.values()) {
            k kVar = map2.get(next.getKey());
            if (set.contains(next.getKey()) && (kVar == null || (kVar.d() instanceof v7.l))) {
                hashMap.put(next.getKey(), next);
            } else if (kVar != null) {
                hashMap2.put(next.getKey(), kVar.d().e());
                kVar.d().a(next, kVar.d().e(), q.e());
            } else {
                hashMap2.put(next.getKey(), d.f30696b);
            }
        }
        hashMap2.putAll(n(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry next2 : map.entrySet()) {
            hashMap3.put((l) next2.getKey(), new d1((i) next2.getValue(), (d) hashMap2.get(next2.getKey())));
        }
        return hashMap3;
    }

    private s b(l lVar, k kVar) {
        if (kVar == null || (kVar.d() instanceof v7.l)) {
            return this.f30484a.b(lVar);
        }
        return s.o(lVar);
    }

    private c<l, i> e(a1 a1Var, q.a aVar, f1 f1Var) {
        b.d(a1Var.n().i(), "Currently we only support collection group queries at the root.", new Object[0]);
        String f10 = a1Var.f();
        c<l, i> a10 = j.a();
        for (u a11 : this.f30487d.g(f10)) {
            Iterator<Map.Entry<l, i>> it = f(a1Var.a((u) a11.a(f10)), aVar, f1Var).iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                a10 = a10.h((l) next.getKey(), (i) next.getValue());
            }
        }
        return a10;
    }

    private c<l, i> f(a1 a1Var, q.a aVar, f1 f1Var) {
        Map<l, k> a10 = this.f30486c.a(a1Var.n(), aVar.h());
        Map<l, s> a11 = this.f30484a.a(a1Var, aVar, a10.keySet(), f1Var);
        for (Map.Entry next : a10.entrySet()) {
            if (!a11.containsKey(next.getKey())) {
                a11.put((l) next.getKey(), s.o((l) next.getKey()));
            }
        }
        c<l, i> a12 = j.a();
        for (Map.Entry next2 : a11.entrySet()) {
            k kVar = a10.get(next2.getKey());
            if (kVar != null) {
                kVar.d().a((s) next2.getValue(), d.f30696b, y6.q.e());
            }
            if (a1Var.u((i) next2.getValue())) {
                a12 = a12.h((l) next2.getKey(), (i) next2.getValue());
            }
        }
        return a12;
    }

    private c<l, i> g(u uVar) {
        c<l, i> a10 = j.a();
        i c10 = c(l.g(uVar));
        return c10.b() ? a10.h(c10.getKey(), c10) : a10;
    }

    private void m(Map<l, k> map, Set<l> set) {
        TreeSet treeSet = new TreeSet();
        for (l next : set) {
            if (!map.containsKey(next)) {
                treeSet.add(next);
            }
        }
        map.putAll(this.f30486c.c(treeSet));
    }

    private Map<l, d> n(Map<l, s> map) {
        List<g> b10 = this.f30485b.b(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (g next : b10) {
            for (l next2 : next.f()) {
                s sVar = map.get(next2);
                if (sVar != null) {
                    hashMap.put(next2, next.b(sVar, hashMap.containsKey(next2) ? (d) hashMap.get(next2) : d.f30696b));
                    int e10 = next.e();
                    if (!treeMap.containsKey(Integer.valueOf(e10))) {
                        treeMap.put(Integer.valueOf(e10), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(e10))).add(next2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (l lVar : (Set) entry.getValue()) {
                if (!hashSet.contains(lVar)) {
                    f c10 = f.c(map.get(lVar), (d) hashMap.get(lVar));
                    if (c10 != null) {
                        hashMap2.put(lVar, c10);
                    }
                    hashSet.add(lVar);
                }
            }
            this.f30486c.e(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public i c(l lVar) {
        k b10 = this.f30486c.b(lVar);
        s b11 = b(lVar, b10);
        if (b10 != null) {
            b10.d().a(b11, d.f30696b, y6.q.e());
        }
        return b11;
    }

    /* access modifiers changed from: package-private */
    public c<l, i> d(Iterable<l> iterable) {
        return j(this.f30484a.d(iterable), new HashSet());
    }

    /* access modifiers changed from: package-private */
    public c<l, i> h(a1 a1Var, q.a aVar) {
        return i(a1Var, aVar, (f1) null);
    }

    /* access modifiers changed from: package-private */
    public c<l, i> i(a1 a1Var, q.a aVar, f1 f1Var) {
        u n10 = a1Var.n();
        if (a1Var.r()) {
            return g(n10);
        }
        if (a1Var.q()) {
            return e(a1Var, aVar, f1Var);
        }
        return f(a1Var, aVar, f1Var);
    }

    /* access modifiers changed from: package-private */
    public c<l, i> j(Map<l, s> map, Set<l> set) {
        HashMap hashMap = new HashMap();
        m(hashMap, map.keySet());
        c<l, i> a10 = j.a();
        for (Map.Entry next : a(map, hashMap, set).entrySet()) {
            a10 = a10.h((l) next.getKey(), ((d1) next.getValue()).a());
        }
        return a10;
    }

    /* access modifiers changed from: package-private */
    public m k(String str, q.a aVar, int i10) {
        Map<l, k> map;
        Map<l, s> c10 = this.f30484a.c(str, aVar, i10);
        if (i10 - c10.size() > 0) {
            map = this.f30486c.f(str, aVar.h(), i10 - c10.size());
        } else {
            map = Collections.emptyMap();
        }
        int i11 = -1;
        for (k next : map.values()) {
            if (!c10.containsKey(next.b())) {
                c10.put(next.b(), b(next.b(), next));
            }
            i11 = Math.max(i11, next.c());
        }
        m(map, c10.keySet());
        return m.a(i11, a(c10, map, Collections.emptySet()));
    }

    /* access modifiers changed from: package-private */
    public Map<l, d1> l(Map<l, s> map) {
        HashMap hashMap = new HashMap();
        m(hashMap, map.keySet());
        return a(map, hashMap, new HashSet());
    }

    /* access modifiers changed from: package-private */
    public void o(Set<l> set) {
        n(this.f30484a.d(set));
    }
}
