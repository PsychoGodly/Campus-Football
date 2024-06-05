package t7;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r7.u0;
import t7.o0;
import u7.i;
import u7.l;
import y7.b;
import y7.n;

/* compiled from: MemoryLruReferenceDelegate */
class v0 implements j1, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f30529a;

    /* renamed from: b  reason: collision with root package name */
    private final o f30530b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<l, Long> f30531c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private k1 f30532d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f30533e;

    /* renamed from: f  reason: collision with root package name */
    private final u0 f30534f;

    /* renamed from: g  reason: collision with root package name */
    private long f30535g;

    v0(y0 y0Var, o0.b bVar, o oVar) {
        this.f30529a = y0Var;
        this.f30530b = oVar;
        this.f30534f = new u0(y0Var.h().n());
        this.f30535g = -1;
        this.f30533e = new o0(this, bVar);
    }

    private boolean r(l lVar, long j10) {
        if (t(lVar) || this.f30532d.c(lVar) || this.f30529a.h().k(lVar)) {
            return true;
        }
        Long l10 = this.f30531c.get(lVar);
        if (l10 == null || l10.longValue() <= j10) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(long[] jArr, Long l10) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean t(l lVar) {
        for (w0 l10 : this.f30529a.q()) {
            if (l10.l(lVar)) {
                return true;
            }
        }
        return false;
    }

    public int a(long j10, SparseArray<?> sparseArray) {
        return this.f30529a.h().p(j10, sparseArray);
    }

    public void b(n<i4> nVar) {
        this.f30529a.h().l(nVar);
    }

    public void c(l lVar) {
        this.f30531c.put(lVar, Long.valueOf(k()));
    }

    public void d(k1 k1Var) {
        this.f30532d = k1Var;
    }

    public void e() {
        b.d(this.f30535g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f30535g = -1;
    }

    public o0 f() {
        return this.f30533e;
    }

    public void g() {
        b.d(this.f30535g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f30535g = this.f30534f.a();
    }

    public void h(i4 i4Var) {
        this.f30529a.h().i(i4Var.l(k()));
    }

    public void i(l lVar) {
        this.f30531c.put(lVar, Long.valueOf(k()));
    }

    public void j(l lVar) {
        this.f30531c.put(lVar, Long.valueOf(k()));
    }

    public long k() {
        b.d(this.f30535g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f30535g;
    }

    public void l(l lVar) {
        this.f30531c.put(lVar, Long.valueOf(k()));
    }

    public long m() {
        long o10 = this.f30529a.h().o();
        long[] jArr = new long[1];
        p(new u0(jArr));
        return o10 + jArr[0];
    }

    public int n(long j10) {
        z0 r10 = this.f30529a.g();
        ArrayList arrayList = new ArrayList();
        for (i key : r10.i()) {
            l key2 = key.getKey();
            if (!r(key2, j10)) {
                arrayList.add(key2);
                this.f30531c.remove(key2);
            }
        }
        r10.removeAll(arrayList);
        return arrayList.size();
    }

    public long o() {
        long m10 = this.f30529a.h().m(this.f30530b) + 0 + this.f30529a.g().h(this.f30530b);
        for (w0 m11 : this.f30529a.q()) {
            m10 += m11.m(this.f30530b);
        }
        return m10;
    }

    public void p(n<Long> nVar) {
        for (Map.Entry next : this.f30531c.entrySet()) {
            if (!r((l) next.getKey(), ((Long) next.getValue()).longValue())) {
                nVar.accept((Long) next.getValue());
            }
        }
    }
}
