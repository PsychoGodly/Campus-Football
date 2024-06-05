package t7;

import android.util.SparseArray;
import com.google.protobuf.i;
import g7.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p7.j;
import r7.a1;
import r7.f1;
import r7.g1;
import t7.o0;
import u7.l;
import u7.q;
import u7.s;
import u7.t;
import u7.u;
import u7.w;
import v7.f;
import v7.g;
import v7.h;
import v7.m;
import x7.m0;
import x7.u0;
import y7.g0;
import y7.v;

/* compiled from: LocalStore */
public final class i0 implements q7.a {

    /* renamed from: n  reason: collision with root package name */
    private static final long f30428n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a  reason: collision with root package name */
    private final e1 f30429a;

    /* renamed from: b  reason: collision with root package name */
    private l f30430b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f30431c;

    /* renamed from: d  reason: collision with root package name */
    private b f30432d;

    /* renamed from: e  reason: collision with root package name */
    private final l1 f30433e;

    /* renamed from: f  reason: collision with root package name */
    private n f30434f;

    /* renamed from: g  reason: collision with root package name */
    private final g1 f30435g;

    /* renamed from: h  reason: collision with root package name */
    private final k1 f30436h;

    /* renamed from: i  reason: collision with root package name */
    private final h4 f30437i;

    /* renamed from: j  reason: collision with root package name */
    private final a f30438j;

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<i4> f30439k = new SparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private final Map<f1, Integer> f30440l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final g1 f30441m;

    /* compiled from: LocalStore */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        i4 f30442a;

        /* renamed from: b  reason: collision with root package name */
        int f30443b;

        private b() {
        }
    }

    /* compiled from: LocalStore */
    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map<l, s> f30444a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Set<l> f30445b;

        private c(Map<l, s> map, Set<l> set) {
            this.f30444a = map;
            this.f30445b = set;
        }
    }

    public i0(e1 e1Var, g1 g1Var, j jVar) {
        y7.b.d(e1Var.i(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f30429a = e1Var;
        this.f30435g = g1Var;
        h4 h10 = e1Var.h();
        this.f30437i = h10;
        this.f30438j = e1Var.a();
        this.f30441m = g1.b(h10.d());
        this.f30433e = e1Var.g();
        k1 k1Var = new k1();
        this.f30436h = k1Var;
        e1Var.f().d(k1Var);
        M(jVar);
    }

    private Set<l> D(h hVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < hVar.e().size(); i10++) {
            if (!hVar.e().get(i10).a().isEmpty()) {
                hashSet.add(hVar.b().h().get(i10).g());
            }
        }
        return hashSet;
    }

    private void M(j jVar) {
        l c10 = this.f30429a.c(jVar);
        this.f30430b = c10;
        this.f30431c = this.f30429a.d(jVar, c10);
        b b10 = this.f30429a.b(jVar);
        this.f30432d = b10;
        this.f30434f = new n(this.f30433e, this.f30431c, b10, this.f30430b);
        this.f30433e.e(this.f30430b);
        this.f30435g.f(this.f30434f, this.f30430b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g7.c N(h hVar) {
        g b10 = hVar.b();
        this.f30431c.c(b10, hVar.f());
        x(hVar);
        this.f30431c.a();
        this.f30432d.d(hVar.b().e());
        this.f30434f.o(D(hVar));
        return this.f30434f.d(b10.f());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(b bVar, f1 f1Var) {
        int c10 = this.f30441m.c();
        bVar.f30443b = c10;
        i4 i4Var = new i4(f1Var, c10, this.f30429a.f().k(), h1.LISTEN);
        bVar.f30442a = i4Var;
        this.f30437i.b(i4Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g7.c P(g7.c cVar, i4 i4Var) {
        e<l> e10 = l.e();
        HashMap hashMap = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l lVar = (l) entry.getKey();
            s sVar = (s) entry.getValue();
            if (sVar.b()) {
                e10 = e10.e(lVar);
            }
            hashMap.put(lVar, sVar);
        }
        this.f30437i.h(i4Var.h());
        this.f30437i.j(e10, i4Var.h());
        c g02 = g0(hashMap);
        return this.f30434f.j(g02.f30444a, g02.f30445b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g7.c Q(m0 m0Var, w wVar) {
        Map<Integer, u0> d10 = m0Var.d();
        long k10 = this.f30429a.f().k();
        for (Map.Entry next : d10.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            u0 u0Var = (u0) next.getValue();
            i4 i4Var = this.f30439k.get(intValue);
            if (i4Var != null) {
                this.f30437i.c(u0Var.d(), intValue);
                this.f30437i.j(u0Var.b(), intValue);
                i4 l10 = i4Var.l(k10);
                if (m0Var.e().containsKey(Integer.valueOf(intValue))) {
                    i iVar = i.f27039b;
                    w wVar2 = w.f30653b;
                    l10 = l10.k(iVar, wVar2).j(wVar2);
                } else if (!u0Var.e().isEmpty()) {
                    l10 = l10.k(u0Var.e(), m0Var.c());
                }
                this.f30439k.put(intValue, l10);
                if (l0(i4Var, l10, u0Var)) {
                    this.f30437i.i(l10);
                }
            }
        }
        Map<l, s> a10 = m0Var.a();
        Set<l> b10 = m0Var.b();
        for (l next2 : a10.keySet()) {
            if (b10.contains(next2)) {
                this.f30429a.f().c(next2);
            }
        }
        c g02 = g0(a10);
        Map a11 = g02.f30444a;
        w f10 = this.f30437i.f();
        if (!wVar.equals(w.f30653b)) {
            y7.b.d(wVar.compareTo(f10) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", wVar, f10);
            this.f30437i.a(wVar);
        }
        return this.f30434f.j(a11, g02.f30445b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ o0.c R(o0 o0Var) {
        return o0Var.f(this.f30439k);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(List list) {
        Collection<q> e10 = this.f30430b.e();
        Comparator<q> comparator = q.f30626b;
        l lVar = this.f30430b;
        Objects.requireNonNull(lVar);
        h0 h0Var = new h0(lVar);
        l lVar2 = this.f30430b;
        Objects.requireNonNull(lVar2);
        g0.q(e10, list, comparator, h0Var, new q(lVar2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ q7.j T(String str) {
        return this.f30438j.d(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean U(q7.e eVar) {
        q7.e a10 = this.f30438j.a(eVar.a());
        return Boolean.valueOf(a10 != null && a10.b().compareTo(eVar.b()) >= 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            int d10 = j0Var.d();
            this.f30436h.b(j0Var.b(), d10);
            e<l> c10 = j0Var.c();
            Iterator<l> it2 = c10.iterator();
            while (it2.hasNext()) {
                this.f30429a.f().j(it2.next());
            }
            this.f30436h.g(c10, d10);
            if (!j0Var.e()) {
                i4 i4Var = this.f30439k.get(d10);
                y7.b.d(i4Var != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(d10));
                i4 j10 = i4Var.j(i4Var.f());
                this.f30439k.put(d10, j10);
                if (l0(i4Var, j10, (u0) null)) {
                    this.f30437i.i(j10);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g7.c W(int i10) {
        g g10 = this.f30431c.g(i10);
        y7.b.d(g10 != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f30431c.i(g10);
        this.f30431c.a();
        this.f30432d.d(i10);
        this.f30434f.o(g10.f());
        return this.f30434f.d(g10.f());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X(int i10) {
        i4 i4Var = this.f30439k.get(i10);
        y7.b.d(i4Var != null, "Tried to release nonexistent target: %s", Integer.valueOf(i10));
        Iterator<l> it = this.f30436h.h(i10).iterator();
        while (it.hasNext()) {
            this.f30429a.f().j(it.next());
        }
        this.f30429a.f().h(i4Var);
        this.f30439k.remove(i10);
        this.f30440l.remove(i4Var.g());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y(q7.e eVar) {
        this.f30438j.c(eVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Z(q7.j jVar, i4 i4Var, int i10, e eVar) {
        if (jVar.c().compareTo(i4Var.f()) > 0) {
            i4 k10 = i4Var.k(i.f27039b, jVar.c());
            this.f30439k.append(i10, k10);
            this.f30437i.i(k10);
            this.f30437i.h(i10);
            this.f30437i.j(eVar, i10);
        }
        this.f30438j.b(jVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0(i iVar) {
        this.f30431c.d(iVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b0() {
        this.f30430b.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0() {
        this.f30431c.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ m d0(Set set, List list, y6.q qVar) {
        Map<l, s> d10 = this.f30433e.d(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry next : d10.entrySet()) {
            if (!((s) next.getValue()).m()) {
                hashSet.add((l) next.getKey());
            }
        }
        Map<l, d1> l10 = this.f30434f.l(d10);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            t d11 = fVar.d(l10.get(fVar.g()).a());
            if (d11 != null) {
                arrayList.add(new v7.l(fVar.g(), d11, d11.j(), m.a(true)));
            }
        }
        g j10 = this.f30431c.j(qVar, arrayList, list);
        this.f30432d.e(j10.e(), j10.a(l10, hashSet));
        return m.a(j10.e(), l10);
    }

    private static f1 e0(String str) {
        return a1.b(u.p("__bundle__/docs/" + str)).D();
    }

    private c g0(Map<l, s> map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<l, s> d10 = this.f30433e.d(map.keySet());
        for (Map.Entry next : map.entrySet()) {
            l lVar = (l) next.getKey();
            s sVar = (s) next.getValue();
            s sVar2 = d10.get(lVar);
            if (sVar.b() != sVar2.b()) {
                hashSet.add(lVar);
            }
            if (sVar.g() && sVar.getVersion().equals(w.f30653b)) {
                arrayList.add(sVar.getKey());
                hashMap.put(lVar, sVar);
            } else if (!sVar2.m() || sVar.getVersion().compareTo(sVar2.getVersion()) > 0 || (sVar.getVersion().compareTo(sVar2.getVersion()) == 0 && sVar2.e())) {
                y7.b.d(!w.f30653b.equals(sVar.f()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f30433e.f(sVar, sVar.f());
                hashMap.put(lVar, sVar);
            } else {
                v.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", lVar, sVar2.getVersion(), sVar.getVersion());
            }
        }
        this.f30433e.removeAll(arrayList);
        return new c(hashMap, hashSet);
    }

    private static boolean l0(i4 i4Var, i4 i4Var2, u0 u0Var) {
        if (i4Var.d().isEmpty()) {
            return true;
        }
        long d10 = i4Var2.f().c().d() - i4Var.f().c().d();
        long j10 = f30428n;
        if (d10 >= j10 || i4Var2.b().c().d() - i4Var.b().c().d() >= j10) {
            return true;
        }
        if (u0Var != null && u0Var.b().size() + u0Var.c().size() + u0Var.d().size() > 0) {
            return true;
        }
        return false;
    }

    private void n0() {
        this.f30429a.k("Start IndexManager", new z(this));
    }

    private void o0() {
        this.f30429a.k("Start MutationQueue", new p(this));
    }

    private void x(h hVar) {
        g b10 = hVar.b();
        for (l next : b10.f()) {
            s b11 = this.f30433e.b(next);
            w c10 = hVar.d().c(next);
            y7.b.d(c10 != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (b11.getVersion().compareTo(c10) < 0) {
                b10.c(b11, hVar);
                if (b11.m()) {
                    this.f30433e.f(b11, hVar.c());
                }
            }
        }
        this.f30431c.i(b10);
    }

    public i1 A(a1 a1Var, boolean z10) {
        w wVar;
        e<l> eVar;
        i4 J = J(a1Var.D());
        w wVar2 = w.f30653b;
        e<l> e10 = l.e();
        if (J != null) {
            wVar = J.b();
            eVar = this.f30437i.e(J.h());
        } else {
            eVar = e10;
            wVar = wVar2;
        }
        g1 g1Var = this.f30435g;
        if (z10) {
            wVar2 = wVar;
        }
        return new i1(g1Var.e(a1Var, wVar2, eVar), eVar);
    }

    public int B() {
        return this.f30431c.f();
    }

    public l C() {
        return this.f30430b;
    }

    public w E() {
        return this.f30437i.f();
    }

    public i F() {
        return this.f30431c.h();
    }

    public n G() {
        return this.f30434f;
    }

    public q7.j H(String str) {
        return (q7.j) this.f30429a.j("Get named query", new t(this, str));
    }

    public g I(int i10) {
        return this.f30431c.e(i10);
    }

    /* access modifiers changed from: package-private */
    public i4 J(f1 f1Var) {
        Integer num = this.f30440l.get(f1Var);
        if (num != null) {
            return this.f30439k.get(num.intValue());
        }
        return this.f30437i.g(f1Var);
    }

    public g7.c<l, u7.i> K(j jVar) {
        List<g> k10 = this.f30431c.k();
        M(jVar);
        n0();
        o0();
        List<g> k11 = this.f30431c.k();
        e<l> e10 = l.e();
        for (List<g> it : Arrays.asList(new List[]{k10, k11})) {
            for (g h10 : it) {
                for (f g10 : h10.h()) {
                    e10 = e10.e(g10.g());
                }
            }
        }
        return this.f30434f.d(e10);
    }

    public boolean L(q7.e eVar) {
        return ((Boolean) this.f30429a.j("Has newer bundle", new v(this, eVar))).booleanValue();
    }

    public void a(q7.j jVar, e<l> eVar) {
        i4 v10 = v(jVar.a().b());
        this.f30429a.k("Saved named query", new f0(this, jVar, v10, v10.h(), eVar));
    }

    public void b(q7.e eVar) {
        this.f30429a.k("Save bundle", new e0(this, eVar));
    }

    public g7.c<l, u7.i> c(g7.c<l, s> cVar, String str) {
        return (g7.c) this.f30429a.j("Apply bundle documents", new s(this, cVar, v(e0(str))));
    }

    public void f0(List<j0> list) {
        this.f30429a.k("notifyLocalViewChanges", new d0(this, list));
    }

    public u7.i h0(l lVar) {
        return this.f30434f.c(lVar);
    }

    public g7.c<l, u7.i> i0(int i10) {
        return (g7.c) this.f30429a.j("Reject batch", new r(this, i10));
    }

    public void j0(int i10) {
        this.f30429a.k("Release target", new a0(this, i10));
    }

    public void k0(i iVar) {
        this.f30429a.k("Set stream token", new b0(this, iVar));
    }

    public void m0() {
        this.f30429a.e().run();
        n0();
        o0();
    }

    public m p0(List<f> list) {
        y6.q e10 = y6.q.e();
        HashSet hashSet = new HashSet();
        for (f g10 : list) {
            hashSet.add(g10.g());
        }
        return (m) this.f30429a.j("Locally write mutations", new u(this, hashSet, list, e10));
    }

    public g7.c<l, u7.i> u(h hVar) {
        return (g7.c) this.f30429a.j("Acknowledge batch", new x(this, hVar));
    }

    public i4 v(f1 f1Var) {
        int i10;
        i4 g10 = this.f30437i.g(f1Var);
        if (g10 != null) {
            i10 = g10.h();
        } else {
            b bVar = new b();
            this.f30429a.k("Allocate target", new g0(this, bVar, f1Var));
            i10 = bVar.f30443b;
            g10 = bVar.f30442a;
        }
        if (this.f30439k.get(i10) == null) {
            this.f30439k.put(i10, g10);
            this.f30440l.put(f1Var, Integer.valueOf(i10));
        }
        return g10;
    }

    public g7.c<l, u7.i> w(m0 m0Var) {
        return (g7.c) this.f30429a.j("Apply remote event", new y(this, m0Var, m0Var.c()));
    }

    public o0.c y(o0 o0Var) {
        return (o0.c) this.f30429a.j("Collect garbage", new w(this, o0Var));
    }

    public void z(List<q> list) {
        this.f30429a.k("Configure indexes", new c0(this, list));
    }
}
