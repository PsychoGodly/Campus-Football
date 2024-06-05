package u7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import r7.f1;
import r7.p;
import r7.q;
import r7.z0;
import u7.q;

/* compiled from: TargetIndexMatcher */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final String f30655a;

    /* renamed from: b  reason: collision with root package name */
    private final SortedSet<p> f30656b;

    /* renamed from: c  reason: collision with root package name */
    private final List<p> f30657c;

    /* renamed from: d  reason: collision with root package name */
    private final List<z0> f30658d;

    public y(f1 f1Var) {
        String str;
        if (f1Var.d() != null) {
            str = f1Var.d();
        } else {
            str = f1Var.n().g();
        }
        this.f30655a = str;
        this.f30658d = f1Var.m();
        this.f30656b = new TreeSet(x.f38738a);
        this.f30657c = new ArrayList();
        Iterator<q> it = f1Var.h().iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar.i()) {
                this.f30656b.add(pVar);
            } else {
                this.f30657c.add(pVar);
            }
        }
    }

    private boolean c(q.c cVar) {
        for (p f10 : this.f30657c) {
            if (f(f10, cVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(p pVar, q.c cVar) {
        if (pVar == null || !pVar.f().equals(cVar.d())) {
            return false;
        }
        if (cVar.e().equals(q.c.a.CONTAINS) == (pVar.g().equals(p.b.ARRAY_CONTAINS) || pVar.g().equals(p.b.ARRAY_CONTAINS_ANY))) {
            return true;
        }
        return false;
    }

    private boolean g(z0 z0Var, q.c cVar) {
        if (!z0Var.c().equals(cVar.d())) {
            return false;
        }
        if ((!cVar.e().equals(q.c.a.ASCENDING) || !z0Var.b().equals(z0.a.ASCENDING)) && (!cVar.e().equals(q.c.a.DESCENDING) || !z0Var.b().equals(z0.a.DESCENDING))) {
            return false;
        }
        return true;
    }

    public q b() {
        q.c.a aVar;
        if (d()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (p next : this.f30657c) {
            if (!next.f().r()) {
                if (next.g().equals(p.b.ARRAY_CONTAINS) || next.g().equals(p.b.ARRAY_CONTAINS_ANY)) {
                    arrayList.add(q.c.c(next.f(), q.c.a.CONTAINS));
                } else if (!hashSet.contains(next.f())) {
                    hashSet.add(next.f());
                    arrayList.add(q.c.c(next.f(), q.c.a.ASCENDING));
                }
            }
        }
        for (z0 next2 : this.f30658d) {
            if (!next2.c().r() && !hashSet.contains(next2.c())) {
                hashSet.add(next2.c());
                r c10 = next2.c();
                if (next2.b() == z0.a.ASCENDING) {
                    aVar = q.c.a.ASCENDING;
                } else {
                    aVar = q.c.a.DESCENDING;
                }
                arrayList.add(q.c.c(c10, aVar));
            }
        }
        return q.b(-1, this.f30655a, arrayList, q.f30625a);
    }

    public boolean d() {
        return this.f30656b.size() > 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(u7.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d()
            java.lang.String r1 = r7.f30655a
            boolean r0 = r0.equals(r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Collection IDs do not match"
            y7.b.d(r0, r3, r2)
            boolean r0 = r7.d()
            if (r0 == 0) goto L_0x0019
            return r1
        L_0x0019:
            u7.q$c r0 = r8.c()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r7.c(r0)
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            java.util.List<r7.z0> r0 = r7.f30658d
            java.util.Iterator r0 = r0.iterator()
            java.util.List r8 = r8.e()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = 0
        L_0x0036:
            int r4 = r8.size()
            if (r3 >= r4) goto L_0x005c
            java.lang.Object r4 = r8.get(r3)
            u7.q$c r4 = (u7.q.c) r4
            boolean r4 = r7.c(r4)
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r8.get(r3)
            u7.q$c r4 = (u7.q.c) r4
            u7.r r4 = r4.d()
            java.lang.String r4 = r4.d()
            r2.add(r4)
            int r3 = r3 + 1
            goto L_0x0036
        L_0x005c:
            int r4 = r8.size()
            r5 = 1
            if (r3 != r4) goto L_0x0064
            return r5
        L_0x0064:
            java.util.SortedSet<r7.p> r4 = r7.f30656b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x009d
            java.util.SortedSet<r7.p> r4 = r7.f30656b
            java.lang.Object r4 = r4.first()
            r7.p r4 = (r7.p) r4
            u7.r r6 = r4.f()
            java.lang.String r6 = r6.d()
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r8.get(r3)
            u7.q$c r2 = (u7.q.c) r2
            boolean r4 = r7.f(r4, r2)
            if (r4 == 0) goto L_0x009a
            java.lang.Object r4 = r0.next()
            r7.z0 r4 = (r7.z0) r4
            boolean r2 = r7.g(r4, r2)
            if (r2 != 0) goto L_0x009b
        L_0x009a:
            return r1
        L_0x009b:
            int r3 = r3 + 1
        L_0x009d:
            int r2 = r8.size()
            if (r3 >= r2) goto L_0x00bc
            java.lang.Object r2 = r8.get(r3)
            u7.q$c r2 = (u7.q.c) r2
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00bb
            java.lang.Object r4 = r0.next()
            r7.z0 r4 = (r7.z0) r4
            boolean r2 = r7.g(r4, r2)
            if (r2 != 0) goto L_0x009b
        L_0x00bb:
            return r1
        L_0x00bc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.y.h(u7.q):boolean");
    }
}
