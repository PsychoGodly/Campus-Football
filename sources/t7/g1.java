package t7;

import g7.c;
import g7.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r7.a1;
import r7.f1;
import t7.l;
import u7.i;
import u7.l;
import u7.q;
import u7.w;
import y7.b;
import y7.v;

/* compiled from: QueryEngine */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private n f30414a;

    /* renamed from: b  reason: collision with root package name */
    private l f30415b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30416c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30417d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f30418e = 100;

    /* renamed from: f  reason: collision with root package name */
    private double f30419f = 2.0d;

    private c<l, i> a(Iterable<i> iterable, a1 a1Var, q.a aVar) {
        c<l, i> h10 = this.f30414a.h(a1Var, aVar);
        for (i next : iterable) {
            h10 = h10.h(next.getKey(), next);
        }
        return h10;
    }

    private e<i> b(a1 a1Var, c<l, i> cVar) {
        e<i> eVar = new e<>(Collections.emptyList(), a1Var.c());
        Iterator<Map.Entry<l, i>> it = cVar.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next().getValue();
            if (a1Var.u(iVar)) {
                eVar = eVar.e(iVar);
            }
        }
        return eVar;
    }

    private void c(a1 a1Var, f1 f1Var, int i10) {
        if (f1Var.a() < this.f30418e) {
            v.a("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", a1Var.toString(), Integer.valueOf(this.f30418e));
            return;
        }
        v.a("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", a1Var.toString(), Integer.valueOf(f1Var.a()), Integer.valueOf(i10));
        if (((double) f1Var.a()) > this.f30419f * ((double) i10)) {
            this.f30415b.d(a1Var.D());
            v.a("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", a1Var.toString());
        }
    }

    private c<l, i> d(a1 a1Var, f1 f1Var) {
        if (v.c()) {
            v.a("QueryEngine", "Using full collection scan to execute query: %s", a1Var.toString());
        }
        return this.f30414a.i(a1Var, q.a.f30627a, f1Var);
    }

    private boolean g(a1 a1Var, int i10, e<i> eVar, w wVar) {
        i iVar;
        if (!a1Var.p()) {
            return false;
        }
        if (i10 != eVar.size()) {
            return true;
        }
        if (a1Var.l() == a1.a.LIMIT_TO_FIRST) {
            iVar = eVar.b();
        } else {
            iVar = eVar.c();
        }
        if (iVar == null) {
            return false;
        }
        if (iVar.e() || iVar.getVersion().compareTo(wVar) > 0) {
            return true;
        }
        return false;
    }

    private c<l, i> h(a1 a1Var) {
        if (a1Var.v()) {
            return null;
        }
        f1 D = a1Var.D();
        l.a l10 = this.f30415b.l(D);
        if (l10.equals(l.a.NONE)) {
            return null;
        }
        if (a1Var.p() && l10.equals(l.a.PARTIAL)) {
            return h(a1Var.s(-1));
        }
        List<u7.l> a10 = this.f30415b.a(D);
        b.d(a10 != null, "index manager must return results for partial and full indexes.", new Object[0]);
        c<u7.l, i> d10 = this.f30414a.d(a10);
        q.a j10 = this.f30415b.j(D);
        e<i> b10 = b(a1Var, d10);
        if (g(a1Var, a10.size(), b10, j10.i())) {
            return h(a1Var.s(-1));
        }
        return a(b10, a1Var, j10);
    }

    private c<u7.l, i> i(a1 a1Var, e<u7.l> eVar, w wVar) {
        if (a1Var.v() || wVar.equals(w.f30653b)) {
            return null;
        }
        e<i> b10 = b(a1Var, this.f30414a.d(eVar));
        if (g(a1Var, eVar.size(), b10, wVar)) {
            return null;
        }
        if (v.c()) {
            v.a("QueryEngine", "Re-using previous result from %s to execute query: %s", wVar.toString(), a1Var.toString());
        }
        return a(b10, a1Var, q.a.e(wVar, -1));
    }

    public c<u7.l, i> e(a1 a1Var, w wVar, e<u7.l> eVar) {
        b.d(this.f30416c, "initialize() not called", new Object[0]);
        c<u7.l, i> h10 = h(a1Var);
        if (h10 != null) {
            return h10;
        }
        c<u7.l, i> i10 = i(a1Var, eVar, wVar);
        if (i10 != null) {
            return i10;
        }
        f1 f1Var = new f1();
        c<u7.l, i> d10 = d(a1Var, f1Var);
        if (d10 != null && this.f30417d) {
            c(a1Var, f1Var, d10.size());
        }
        return d10;
    }

    public void f(n nVar, l lVar) {
        this.f30414a = nVar;
        this.f30415b = lVar;
        this.f30416c = true;
    }
}
