package t7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u7.l;

/* compiled from: MemoryEagerReferenceDelegate */
class s0 implements j1 {

    /* renamed from: a  reason: collision with root package name */
    private k1 f30516a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f30517b;

    /* renamed from: c  reason: collision with root package name */
    private Set<l> f30518c;

    s0(y0 y0Var) {
        this.f30517b = y0Var;
    }

    private boolean a(l lVar) {
        if (this.f30517b.h().k(lVar) || b(lVar)) {
            return true;
        }
        k1 k1Var = this.f30516a;
        if (k1Var == null || !k1Var.c(lVar)) {
            return false;
        }
        return true;
    }

    private boolean b(l lVar) {
        for (w0 l10 : this.f30517b.q()) {
            if (l10.l(lVar)) {
                return true;
            }
        }
        return false;
    }

    public void c(l lVar) {
        if (a(lVar)) {
            this.f30518c.remove(lVar);
        } else {
            this.f30518c.add(lVar);
        }
    }

    public void d(k1 k1Var) {
        this.f30516a = k1Var;
    }

    public void e() {
        z0 r10 = this.f30517b.g();
        ArrayList arrayList = new ArrayList();
        for (l next : this.f30518c) {
            if (!a(next)) {
                arrayList.add(next);
            }
        }
        r10.removeAll(arrayList);
        this.f30518c = null;
    }

    public void g() {
        this.f30518c = new HashSet();
    }

    public void h(i4 i4Var) {
        a1 s10 = this.f30517b.h();
        Iterator<l> it = s10.e(i4Var.h()).iterator();
        while (it.hasNext()) {
            this.f30518c.add(it.next());
        }
        s10.q(i4Var);
    }

    public void i(l lVar) {
        this.f30518c.remove(lVar);
    }

    public void j(l lVar) {
        this.f30518c.add(lVar);
    }

    public long k() {
        return -1;
    }

    public void l(l lVar) {
        this.f30518c.add(lVar);
    }
}
