package y7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p8.d0;
import r7.k;
import r7.p;
import r7.p0;
import r7.q;

/* compiled from: LogicUtils */
public class w {
    protected static q a(q qVar) {
        f(qVar);
        if (m(qVar)) {
            return qVar;
        }
        k kVar = (k) qVar;
        List<q> b10 = kVar.b();
        if (b10.size() == 1) {
            return a(b10.get(0));
        }
        if (kVar.h()) {
            return kVar;
        }
        ArrayList<q> arrayList = new ArrayList<>();
        for (q a10 : b10) {
            arrayList.add(a(a10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (q qVar2 : arrayList) {
            if (qVar2 instanceof p) {
                arrayList2.add(qVar2);
            } else if (qVar2 instanceof k) {
                k kVar2 = (k) qVar2;
                if (kVar2.e().equals(kVar.e())) {
                    arrayList2.addAll(kVar2.b());
                } else {
                    arrayList2.add(kVar2);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (q) arrayList2.get(0);
        }
        return new k(arrayList2, kVar.e());
    }

    private static q b(k kVar, k kVar2) {
        b.d(!kVar.b().isEmpty() && !kVar2.b().isEmpty(), "Found an empty composite filter", new Object[0]);
        if (kVar.f() && kVar2.f()) {
            return kVar.j(kVar2.b());
        }
        k kVar3 = kVar.g() ? kVar : kVar2;
        if (kVar.g()) {
            kVar = kVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (q e10 : kVar3.b()) {
            arrayList.add(e(e10, kVar));
        }
        return new k(arrayList, k.a.OR);
    }

    private static q c(p pVar, k kVar) {
        if (kVar.f()) {
            return kVar.j(Collections.singletonList(pVar));
        }
        ArrayList arrayList = new ArrayList();
        for (q e10 : kVar.b()) {
            arrayList.add(e(pVar, e10));
        }
        return new k(arrayList, k.a.OR);
    }

    private static q d(p pVar, p pVar2) {
        return new k(Arrays.asList(new q[]{pVar, pVar2}), k.a.AND);
    }

    protected static q e(q qVar, q qVar2) {
        q qVar3;
        f(qVar);
        f(qVar2);
        boolean z10 = qVar instanceof p;
        if (z10 && (qVar2 instanceof p)) {
            qVar3 = d((p) qVar, (p) qVar2);
        } else if (z10 && (qVar2 instanceof k)) {
            qVar3 = c((p) qVar, (k) qVar2);
        } else if (!(qVar instanceof k) || !(qVar2 instanceof p)) {
            qVar3 = b((k) qVar, (k) qVar2);
        } else {
            qVar3 = c((p) qVar2, (k) qVar);
        }
        return a(qVar3);
    }

    private static void f(q qVar) {
        b.d((qVar instanceof p) || (qVar instanceof k), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    protected static q g(q qVar) {
        f(qVar);
        if (qVar instanceof p) {
            return qVar;
        }
        k kVar = (k) qVar;
        if (kVar.b().size() == 1) {
            return g(qVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        for (q g10 : kVar.b()) {
            arrayList.add(g(g10));
        }
        q a10 = a(new k(arrayList, kVar.e()));
        if (k(a10)) {
            return a10;
        }
        b.d(a10 instanceof k, "field filters are already in DNF form.", new Object[0]);
        k kVar2 = (k) a10;
        b.d(kVar2.f(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        b.d(kVar2.b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        q qVar2 = kVar2.b().get(0);
        for (int i10 = 1; i10 < kVar2.b().size(); i10++) {
            qVar2 = e(qVar2, kVar2.b().get(i10));
        }
        return qVar2;
    }

    protected static q h(q qVar) {
        f(qVar);
        ArrayList arrayList = new ArrayList();
        if (!(qVar instanceof p)) {
            k kVar = (k) qVar;
            for (q h10 : kVar.b()) {
                arrayList.add(h(h10));
            }
            return new k(arrayList, kVar.e());
        } else if (!(qVar instanceof p0)) {
            return qVar;
        } else {
            p0 p0Var = (p0) qVar;
            for (d0 e10 : p0Var.h().q0().g()) {
                arrayList.add(p.e(p0Var.f(), p.b.EQUAL, e10));
            }
            return new k(arrayList, k.a.OR);
        }
    }

    public static List<q> i(k kVar) {
        if (kVar.b().isEmpty()) {
            return Collections.emptyList();
        }
        q g10 = g(h(kVar));
        b.d(k(g10), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        if (m(g10) || l(g10)) {
            return Collections.singletonList(g10);
        }
        return g10.b();
    }

    private static boolean j(q qVar) {
        if (qVar instanceof k) {
            k kVar = (k) qVar;
            if (kVar.g()) {
                for (q next : kVar.b()) {
                    if (!m(next) && !l(next)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean k(q qVar) {
        return m(qVar) || l(qVar) || j(qVar);
    }

    private static boolean l(q qVar) {
        return (qVar instanceof k) && ((k) qVar).i();
    }

    private static boolean m(q qVar) {
        return qVar instanceof p;
    }
}
