package x7;

import g7.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p8.g;
import r7.f1;
import r7.m;
import t7.h1;
import t7.i4;
import u7.f;
import u7.l;
import u7.s;
import u7.w;
import x7.m;
import x7.w0;
import x7.x0;
import y7.v;

/* compiled from: WatchChangeAggregator */
public class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f31194a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, v0> f31195b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<l, s> f31196c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<l, Set<Integer>> f31197d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<Integer, h1> f31198e = new HashMap();

    /* compiled from: WatchChangeAggregator */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31199a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                x7.x0$e[] r0 = x7.x0.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31199a = r0
                x7.x0$e r1 = x7.x0.e.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31199a     // Catch:{ NoSuchFieldError -> 0x001d }
                x7.x0$e r1 = x7.x0.e.Added     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31199a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x7.x0$e r1 = x7.x0.e.Removed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31199a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x7.x0$e r1 = x7.x0.e.Current     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31199a     // Catch:{ NoSuchFieldError -> 0x003e }
                x7.x0$e r1 = x7.x0.e.Reset     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.y0.a.<clinit>():void");
        }
    }

    /* compiled from: WatchChangeAggregator */
    enum b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    /* compiled from: WatchChangeAggregator */
    public interface c {
        f a();

        e<l> b(int i10);

        i4 c(int i10);
    }

    public y0(c cVar) {
        this.f31194a = cVar;
    }

    private void a(int i10, s sVar) {
        m.a aVar;
        if (l(i10)) {
            if (s(i10, sVar.getKey())) {
                aVar = m.a.MODIFIED;
            } else {
                aVar = m.a.ADDED;
            }
            e(i10).a(sVar.getKey(), aVar);
            this.f31196c.put(sVar.getKey(), sVar);
            d(sVar.getKey()).add(Integer.valueOf(i10));
        }
    }

    private b b(m mVar, x0.c cVar, int i10) {
        if (cVar.a().a() == i10 - f(mVar, cVar.b())) {
            return b.SUCCESS;
        }
        return b.FALSE_POSITIVE;
    }

    private Set<Integer> d(l lVar) {
        Set<Integer> set = this.f31197d.get(lVar);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f31197d.put(lVar, hashSet);
        return hashSet;
    }

    private v0 e(int i10) {
        v0 v0Var = this.f31195b.get(Integer.valueOf(i10));
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0();
        this.f31195b.put(Integer.valueOf(i10), v0Var2);
        return v0Var2;
    }

    private int f(m mVar, int i10) {
        Iterator<l> it = this.f31194a.b(i10).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            l next = it.next();
            f a10 = this.f31194a.a();
            if (!mVar.h("projects/" + a10.f() + "/databases/" + a10.e() + "/documents/" + next.l().d())) {
                p(i10, next, (s) null);
                i11++;
            }
        }
        return i11;
    }

    private int g(int i10) {
        u0 j10 = e(i10).j();
        return (this.f31194a.b(i10).size() + j10.b().size()) - j10.d().size();
    }

    private Collection<Integer> h(x0.d dVar) {
        List<Integer> d10 = dVar.d();
        if (!d10.isEmpty()) {
            return d10;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f31195b.keySet()) {
            if (l(next.intValue())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean l(int i10) {
        return n(i10) != null;
    }

    private m m(x0.c cVar) {
        g b10 = cVar.a().b();
        if (b10 != null && b10.i0()) {
            try {
                m a10 = m.a(b10.f0().f0(), b10.f0().h0(), b10.h0());
                if (a10.c() == 0) {
                    return null;
                }
                return a10;
            } catch (m.a e10) {
                v.e("WatchChangeAggregator", "Applying bloom filter failed: (" + e10.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    private i4 n(int i10) {
        v0 v0Var = this.f31195b.get(Integer.valueOf(i10));
        if (v0Var == null || !v0Var.e()) {
            return this.f31194a.c(i10);
        }
        return null;
    }

    private void p(int i10, l lVar, s sVar) {
        if (l(i10)) {
            v0 e10 = e(i10);
            if (s(i10, lVar)) {
                e10.a(lVar, m.a.REMOVED);
            } else {
                e10.i(lVar);
            }
            d(lVar).add(Integer.valueOf(i10));
            if (sVar != null) {
                this.f31196c.put(lVar, sVar);
            }
        }
    }

    private void r(int i10) {
        y7.b.d(this.f31195b.get(Integer.valueOf(i10)) != null && !this.f31195b.get(Integer.valueOf(i10)).e(), "Should only reset active targets", new Object[0]);
        this.f31195b.put(Integer.valueOf(i10), new v0());
        Iterator<l> it = this.f31194a.b(i10).iterator();
        while (it.hasNext()) {
            p(i10, it.next(), (s) null);
        }
    }

    private boolean s(int i10, l lVar) {
        return this.f31194a.b(i10).contains(lVar);
    }

    public m0 c(w wVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f31195b.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            v0 v0Var = (v0) next.getValue();
            i4 n10 = n(intValue);
            if (n10 != null) {
                if (v0Var.d() && n10.g().s()) {
                    l g10 = l.g(n10.g().n());
                    if (this.f31196c.get(g10) == null && !s(intValue, g10)) {
                        p(intValue, g10, s.p(g10, wVar));
                    }
                }
                if (v0Var.c()) {
                    hashMap.put(Integer.valueOf(intValue), v0Var.j());
                    v0Var.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry next2 : this.f31197d.entrySet()) {
            l lVar = (l) next2.getKey();
            boolean z10 = true;
            Iterator it = ((Set) next2.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    i4 n11 = n(((Integer) it.next()).intValue());
                    if (n11 != null && !n11.c().equals(h1.LIMBO_RESOLUTION)) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                hashSet.add(lVar);
            }
        }
        for (s t10 : this.f31196c.values()) {
            t10.t(wVar);
        }
        m0 m0Var = new m0(wVar, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(this.f31198e), Collections.unmodifiableMap(this.f31196c), Collections.unmodifiableSet(hashSet));
        this.f31196c = new HashMap();
        this.f31197d = new HashMap();
        this.f31198e = new HashMap();
        return m0Var;
    }

    public void i(x0.b bVar) {
        s b10 = bVar.b();
        l a10 = bVar.a();
        for (Integer intValue : bVar.d()) {
            int intValue2 = intValue.intValue();
            if (b10 == null || !b10.b()) {
                p(intValue2, a10, b10);
            } else {
                a(intValue2, b10);
            }
        }
        for (Integer intValue3 : bVar.c()) {
            p(intValue3.intValue(), a10, bVar.b());
        }
    }

    public void j(x0.c cVar) {
        b bVar;
        h1 h1Var;
        int b10 = cVar.b();
        int a10 = cVar.a().a();
        i4 n10 = n(b10);
        if (n10 != null) {
            f1 g10 = n10.g();
            if (!g10.s()) {
                int g11 = g(b10);
                if (g11 != a10) {
                    m m10 = m(cVar);
                    if (m10 != null) {
                        bVar = b(m10, cVar, g11);
                    } else {
                        bVar = b.SKIPPED;
                    }
                    if (bVar != b.SUCCESS) {
                        r(b10);
                        if (bVar == b.FALSE_POSITIVE) {
                            h1Var = h1.EXISTENCE_FILTER_MISMATCH_BLOOM;
                        } else {
                            h1Var = h1.EXISTENCE_FILTER_MISMATCH;
                        }
                        this.f31198e.put(Integer.valueOf(b10), h1Var);
                    }
                    w0.a().b(w0.b.e(g11, cVar.a(), this.f31194a.a(), m10, bVar));
                }
            } else if (a10 == 0) {
                l g12 = l.g(g10.n());
                p(b10, g12, s.p(g12, w.f30653b));
            } else {
                y7.b.d(a10 == 1, "Single document existence filter with count: %d", Integer.valueOf(a10));
            }
        }
    }

    public void k(x0.d dVar) {
        for (Integer intValue : h(dVar)) {
            int intValue2 = intValue.intValue();
            v0 e10 = e(intValue2);
            int i10 = a.f31199a[dVar.b().ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    e10.h();
                    if (!e10.e()) {
                        e10.b();
                    }
                    e10.k(dVar.c());
                } else if (i10 == 3) {
                    e10.h();
                    if (!e10.e()) {
                        q(intValue2);
                    }
                    if (dVar.a() != null) {
                        z10 = false;
                    }
                    y7.b.d(z10, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw y7.b.a("Unknown target watch change state: %s", dVar.b());
                    } else if (l(intValue2)) {
                        r(intValue2);
                        e10.k(dVar.c());
                    }
                } else if (l(intValue2)) {
                    e10.f();
                    e10.k(dVar.c());
                }
            } else if (l(intValue2)) {
                e10.k(dVar.c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        e(i10).g();
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        this.f31195b.remove(Integer.valueOf(i10));
    }
}
