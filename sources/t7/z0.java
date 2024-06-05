package t7;

import com.applovin.mediation.MaxReward;
import g7.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r7.a1;
import u7.i;
import u7.j;
import u7.l;
import u7.q;
import u7.s;
import u7.u;
import u7.w;

/* compiled from: MemoryRemoteDocumentCache */
final class z0 implements l1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c<l, i> f30554a = j.a();

    /* renamed from: b  reason: collision with root package name */
    private l f30555b;

    /* compiled from: MemoryRemoteDocumentCache */
    private class b implements Iterable<i> {

        /* compiled from: MemoryRemoteDocumentCache */
        class a implements Iterator<i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Iterator f30557a;

            a(Iterator it) {
                this.f30557a = it;
            }

            /* renamed from: a */
            public i next() {
                return (i) ((Map.Entry) this.f30557a.next()).getValue();
            }

            public boolean hasNext() {
                return this.f30557a.hasNext();
            }
        }

        private b() {
        }

        public Iterator<i> iterator() {
            return new a(z0.this.f30554a.iterator());
        }
    }

    z0() {
    }

    public Map<l, s> a(a1 a1Var, q.a aVar, Set<l> set, f1 f1Var) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<l, i>> m10 = this.f30554a.m(l.g((u) a1Var.n().a(MaxReward.DEFAULT_LABEL)));
        while (m10.hasNext()) {
            Map.Entry next = m10.next();
            i iVar = (i) next.getValue();
            l lVar = (l) next.getKey();
            if (!a1Var.n().j(lVar.l())) {
                break;
            } else if (lVar.l().k() <= a1Var.n().k() + 1 && q.a.f(iVar).compareTo(aVar) > 0) {
                if (set.contains(iVar.getKey()) || a1Var.u(iVar)) {
                    hashMap.put(iVar.getKey(), iVar.a());
                }
            }
        }
        return hashMap;
    }

    public s b(l lVar) {
        i c10 = this.f30554a.c(lVar);
        return c10 != null ? c10.a() : s.o(lVar);
    }

    public Map<l, s> c(String str, q.a aVar, int i10) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    public Map<l, s> d(Iterable<l> iterable) {
        HashMap hashMap = new HashMap();
        for (l next : iterable) {
            hashMap.put(next, b(next));
        }
        return hashMap;
    }

    public void e(l lVar) {
        this.f30555b = lVar;
    }

    public void f(s sVar, w wVar) {
        y7.b.d(this.f30555b != null, "setIndexManager() not called", new Object[0]);
        y7.b.d(!wVar.equals(w.f30653b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f30554a = this.f30554a.h(sVar.getKey(), sVar.a().t(wVar));
        this.f30555b.m(sVar.getKey().j());
    }

    /* access modifiers changed from: package-private */
    public long h(o oVar) {
        Iterator<i> it = new b().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) oVar.m(it.next()).f();
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public Iterable<i> i() {
        return new b();
    }

    public void removeAll(Collection<l> collection) {
        y7.b.d(this.f30555b != null, "setIndexManager() not called", new Object[0]);
        c<l, i> a10 = j.a();
        for (l next : collection) {
            this.f30554a = this.f30554a.n(next);
            a10 = a10.h(next, s.p(next, w.f30653b));
        }
        this.f30555b.c(a10);
    }
}
