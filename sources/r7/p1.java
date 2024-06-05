package r7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u7.r;
import u7.t;
import v7.d;
import v7.e;
import v7.p;

/* compiled from: UserData */
public class p1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t1 f29997a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<r> f29998b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<e> f29999c = new ArrayList<>();

    public p1(t1 t1Var) {
        this.f29997a = t1Var;
    }

    /* access modifiers changed from: package-private */
    public void b(r rVar) {
        this.f29998b.add(rVar);
    }

    /* access modifiers changed from: package-private */
    public void c(r rVar, p pVar) {
        this.f29999c.add(new e(rVar, pVar));
    }

    public boolean d(r rVar) {
        for (r j10 : this.f29998b) {
            if (rVar.j(j10)) {
                return true;
            }
        }
        Iterator<e> it = this.f29999c.iterator();
        while (it.hasNext()) {
            if (rVar.j(it.next().a())) {
                return true;
            }
        }
        return false;
    }

    public List<e> e() {
        return this.f29999c;
    }

    public q1 f() {
        return new q1(this, r.f30634c, false, (o1) null);
    }

    public r1 g(t tVar) {
        return new r1(tVar, d.b(this.f29998b), Collections.unmodifiableList(this.f29999c));
    }

    public r1 h(t tVar, d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.f29999c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (dVar.a(next.a())) {
                arrayList.add(next);
            }
        }
        return new r1(tVar, dVar, Collections.unmodifiableList(arrayList));
    }

    public r1 i(t tVar) {
        return new r1(tVar, (d) null, Collections.unmodifiableList(this.f29999c));
    }

    public s1 j(t tVar) {
        return new s1(tVar, d.b(this.f29998b), Collections.unmodifiableList(this.f29999c));
    }
}
