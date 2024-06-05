package v7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p8.d0;
import u7.l;
import u7.r;
import u7.s;
import u7.t;
import y6.q;

/* compiled from: SetMutation */
public final class o extends f {

    /* renamed from: d  reason: collision with root package name */
    private final t f30721d;

    public o(l lVar, t tVar, m mVar) {
        this(lVar, tVar, mVar, new ArrayList());
    }

    public d a(s sVar, d dVar, q qVar) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map<r, d0> l10 = l(qVar, sVar);
        t c10 = this.f30721d.clone();
        c10.m(l10);
        sVar.j(sVar.getVersion(), c10).s();
        return null;
    }

    public void b(s sVar, i iVar) {
        n(sVar);
        t c10 = this.f30721d.clone();
        c10.m(m(sVar, iVar.a()));
        sVar.j(iVar.b(), c10).r();
    }

    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (!i(oVar) || !this.f30721d.equals(oVar.f30721d) || !f().equals(oVar.f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (j() * 31) + this.f30721d.hashCode();
    }

    public t o() {
        return this.f30721d;
    }

    public String toString() {
        return "SetMutation{" + k() + ", value=" + this.f30721d + "}";
    }

    public o(l lVar, t tVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f30721d = tVar;
    }
}
