package t7;

import g7.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r7.f1;
import t7.l;
import u7.i;
import u7.l;
import u7.q;
import u7.u;
import y7.b;

/* compiled from: MemoryIndexManager */
class t0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final a f30519a = new a();

    /* compiled from: MemoryIndexManager */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, HashSet<u>> f30520a = new HashMap<>();

        a() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(u uVar) {
            boolean z10 = true;
            if (uVar.k() % 2 != 1) {
                z10 = false;
            }
            b.d(z10, "Expected a collection path.", new Object[0]);
            String g10 = uVar.g();
            u uVar2 = (u) uVar.m();
            HashSet hashSet = this.f30520a.get(g10);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f30520a.put(g10, hashSet);
            }
            return hashSet.add(uVar2);
        }

        /* access modifiers changed from: package-private */
        public List<u> b(String str) {
            HashSet hashSet = this.f30520a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    public List<l> a(f1 f1Var) {
        return null;
    }

    public void b(q qVar) {
    }

    public void c(c<l, i> cVar) {
    }

    public void d(f1 f1Var) {
    }

    public Collection<q> e() {
        return Collections.emptyList();
    }

    public String f() {
        return null;
    }

    public List<u> g(String str) {
        return this.f30519a.b(str);
    }

    public void h(String str, q.a aVar) {
    }

    public q.a i(String str) {
        return q.a.f30627a;
    }

    public q.a j(f1 f1Var) {
        return q.a.f30627a;
    }

    public void k(q qVar) {
    }

    public l.a l(f1 f1Var) {
        return l.a.NONE;
    }

    public void m(u uVar) {
        this.f30519a.a(uVar);
    }

    public void start() {
    }
}
