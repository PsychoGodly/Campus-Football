package v7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p8.d0;
import u7.i;
import u7.l;
import u7.r;
import u7.s;
import u7.t;
import y6.q;
import y7.b;

/* compiled from: Mutation */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final l f30700a;

    /* renamed from: b  reason: collision with root package name */
    private final m f30701b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f30702c;

    f(l lVar, m mVar) {
        this(lVar, mVar, new ArrayList());
    }

    public static f c(s sVar, d dVar) {
        if (!sVar.d()) {
            return null;
        }
        if (dVar != null && dVar.c().isEmpty()) {
            return null;
        }
        if (dVar != null) {
            t data = sVar.getData();
            t tVar = new t();
            HashSet hashSet = new HashSet();
            for (r next : dVar.c()) {
                if (!hashSet.contains(next)) {
                    if (data.i(next) == null && next.k() > 1) {
                        next = (r) next.m();
                    }
                    tVar.l(next, data.i(next));
                    hashSet.add(next);
                }
            }
            return new l(sVar.getKey(), tVar, d.b(hashSet), m.f30717c);
        } else if (sVar.g()) {
            return new c(sVar.getKey(), m.f30717c);
        } else {
            return new o(sVar.getKey(), sVar.getData(), m.f30717c);
        }
    }

    public abstract d a(s sVar, d dVar, q qVar);

    public abstract void b(s sVar, i iVar);

    public t d(i iVar) {
        t tVar = null;
        for (e next : this.f30702c) {
            d0 c10 = next.b().c(iVar.h(next.a()));
            if (c10 != null) {
                if (tVar == null) {
                    tVar = new t();
                }
                tVar.l(next.a(), c10);
            }
        }
        return tVar;
    }

    public abstract d e();

    public List<e> f() {
        return this.f30702c;
    }

    public l g() {
        return this.f30700a;
    }

    public m h() {
        return this.f30701b;
    }

    /* access modifiers changed from: package-private */
    public boolean i(f fVar) {
        return this.f30700a.equals(fVar.f30700a) && this.f30701b.equals(fVar.f30701b);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return (g().hashCode() * 31) + this.f30701b.hashCode();
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return "key=" + this.f30700a + ", precondition=" + this.f30701b;
    }

    /* access modifiers changed from: protected */
    public Map<r, d0> l(q qVar, s sVar) {
        HashMap hashMap = new HashMap(this.f30702c.size());
        for (e next : this.f30702c) {
            hashMap.put(next.a(), next.b().b(sVar.h(next.a()), qVar));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public Map<r, d0> m(s sVar, List<d0> list) {
        HashMap hashMap = new HashMap(this.f30702c.size());
        b.d(this.f30702c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f30702c.size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = this.f30702c.get(i10);
            hashMap.put(eVar.a(), eVar.b().a(sVar.h(eVar.a()), list.get(i10)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void n(s sVar) {
        b.d(sVar.getKey().equals(g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    f(l lVar, m mVar, List<e> list) {
        this.f30700a = lVar;
        this.f30701b = mVar;
        this.f30702c = list;
    }
}
