package v7;

import u7.l;
import u7.s;
import y6.q;
import y7.b;

/* compiled from: DeleteMutation */
public final class c extends f {
    public c(l lVar, m mVar) {
        super(lVar, mVar);
    }

    public d a(s sVar, d dVar, q qVar) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        sVar.k(sVar.getVersion()).s();
        return null;
    }

    public void b(s sVar, i iVar) {
        n(sVar);
        b.d(iVar.a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        sVar.k(iVar.b()).r();
    }

    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return i((c) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "DeleteMutation{" + k() + "}";
    }
}
