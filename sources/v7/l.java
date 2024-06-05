package v7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p8.d0;
import u7.r;
import u7.s;
import u7.t;
import y6.q;

/* compiled from: PatchMutation */
public final class l extends f {

    /* renamed from: d  reason: collision with root package name */
    private final t f30715d;

    /* renamed from: e  reason: collision with root package name */
    private final d f30716e;

    public l(u7.l lVar, t tVar, d dVar, m mVar) {
        this(lVar, tVar, dVar, mVar, new ArrayList());
    }

    private List<r> o() {
        ArrayList arrayList = new ArrayList();
        for (e a10 : f()) {
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    private Map<r, d0> p() {
        HashMap hashMap = new HashMap();
        for (r next : this.f30716e.c()) {
            if (!next.i()) {
                hashMap.put(next, this.f30715d.i(next));
            }
        }
        return hashMap;
    }

    public d a(s sVar, d dVar, q qVar) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map<r, d0> l10 = l(qVar, sVar);
        Map<r, d0> p10 = p();
        t data = sVar.getData();
        data.m(p10);
        data.m(l10);
        sVar.j(sVar.getVersion(), sVar.getData()).s();
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.c());
        hashSet.addAll(this.f30716e.c());
        hashSet.addAll(o());
        return d.b(hashSet);
    }

    public void b(s sVar, i iVar) {
        n(sVar);
        if (!h().e(sVar)) {
            sVar.l(iVar.b());
            return;
        }
        Map<r, d0> m10 = m(sVar, iVar.a());
        t data = sVar.getData();
        data.m(p());
        data.m(m10);
        sVar.j(iVar.b(), sVar.getData()).r();
    }

    public d e() {
        return this.f30716e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!i(lVar) || !this.f30715d.equals(lVar.f30715d) || !f().equals(lVar.f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (j() * 31) + this.f30715d.hashCode();
    }

    public t q() {
        return this.f30715d;
    }

    public String toString() {
        return "PatchMutation{" + k() + ", mask=" + this.f30716e + ", value=" + this.f30715d + "}";
    }

    public l(u7.l lVar, t tVar, d dVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f30715d = tVar;
        this.f30716e = dVar;
    }
}
