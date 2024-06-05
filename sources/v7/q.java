package v7;

import u7.l;
import u7.s;
import y7.b;

/* compiled from: VerifyMutation */
public final class q extends f {
    public q(l lVar, m mVar) {
        super(lVar, mVar);
    }

    public d a(s sVar, d dVar, y6.q qVar) {
        throw b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    public void b(s sVar, i iVar) {
        throw b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return i((q) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "VerifyMutation{" + k() + "}";
    }
}
