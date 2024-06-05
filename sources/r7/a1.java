package r7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import r7.z0;
import u7.i;
import u7.l;
import u7.r;
import u7.u;

/* compiled from: Query */
public final class a1 {

    /* renamed from: l  reason: collision with root package name */
    private static final z0 f29847l;

    /* renamed from: m  reason: collision with root package name */
    private static final z0 f29848m;

    /* renamed from: a  reason: collision with root package name */
    private final List<z0> f29849a;

    /* renamed from: b  reason: collision with root package name */
    private List<z0> f29850b;

    /* renamed from: c  reason: collision with root package name */
    private f1 f29851c;

    /* renamed from: d  reason: collision with root package name */
    private f1 f29852d;

    /* renamed from: e  reason: collision with root package name */
    private final List<q> f29853e;

    /* renamed from: f  reason: collision with root package name */
    private final u f29854f;

    /* renamed from: g  reason: collision with root package name */
    private final String f29855g;

    /* renamed from: h  reason: collision with root package name */
    private final long f29856h;

    /* renamed from: i  reason: collision with root package name */
    private final a f29857i;

    /* renamed from: j  reason: collision with root package name */
    private final i f29858j;

    /* renamed from: k  reason: collision with root package name */
    private final i f29859k;

    /* compiled from: Query */
    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* compiled from: Query */
    private static class b implements Comparator<i> {

        /* renamed from: a  reason: collision with root package name */
        private final List<z0> f29863a;

        b(List<z0> list) {
            boolean z10;
            Iterator<z0> it = list.iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    z0 next = it.next();
                    if (z10 || next.c().equals(r.f30633b)) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f29863a = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            for (z0 a10 : this.f29863a) {
                int a11 = a10.a(iVar, iVar2);
                if (a11 != 0) {
                    return a11;
                }
            }
            return 0;
        }
    }

    static {
        z0.a aVar = z0.a.ASCENDING;
        r rVar = r.f30633b;
        f29847l = z0.d(aVar, rVar);
        f29848m = z0.d(z0.a.DESCENDING, rVar);
    }

    public a1(u uVar, String str, List<q> list, List<z0> list2, long j10, a aVar, i iVar, i iVar2) {
        this.f29854f = uVar;
        this.f29855g = str;
        this.f29849a = list2;
        this.f29853e = list;
        this.f29856h = j10;
        this.f29857i = aVar;
        this.f29858j = iVar;
        this.f29859k = iVar2;
    }

    private synchronized f1 E(List<z0> list) {
        if (this.f29857i == a.LIMIT_TO_FIRST) {
            return new f1(n(), f(), i(), list, this.f29856h, o(), g());
        }
        ArrayList arrayList = new ArrayList();
        for (z0 next : list) {
            z0.a b10 = next.b();
            z0.a aVar = z0.a.DESCENDING;
            if (b10 == aVar) {
                aVar = z0.a.ASCENDING;
            }
            arrayList.add(z0.d(aVar, next.c()));
        }
        i iVar = this.f29859k;
        i iVar2 = null;
        i iVar3 = iVar != null ? new i(iVar.b(), this.f29859k.c()) : null;
        i iVar4 = this.f29858j;
        if (iVar4 != null) {
            iVar2 = new i(iVar4.b(), this.f29858j.c());
        }
        return new f1(n(), f(), i(), arrayList, this.f29856h, iVar3, iVar2);
    }

    public static a1 b(u uVar) {
        return new a1(uVar, (String) null);
    }

    private boolean w(i iVar) {
        i iVar2 = this.f29858j;
        if (iVar2 != null && !iVar2.f(m(), iVar)) {
            return false;
        }
        i iVar3 = this.f29859k;
        if (iVar3 == null || iVar3.e(m(), iVar)) {
            return true;
        }
        return false;
    }

    private boolean x(i iVar) {
        for (q d10 : this.f29853e) {
            if (!d10.d(iVar)) {
                return false;
            }
        }
        return true;
    }

    private boolean y(i iVar) {
        for (z0 next : m()) {
            if (!next.c().equals(r.f30633b) && iVar.h(next.f30060b) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean z(i iVar) {
        u l10 = iVar.getKey().l();
        if (this.f29855g != null) {
            if (!iVar.getKey().m(this.f29855g) || !this.f29854f.j(l10)) {
                return false;
            }
            return true;
        } else if (l.n(this.f29854f)) {
            return this.f29854f.equals(l10);
        } else {
            if (!this.f29854f.j(l10) || this.f29854f.k() != l10.k() - 1) {
                return false;
            }
            return true;
        }
    }

    public a1 A(z0 z0Var) {
        y7.b.d(!r(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f29849a);
        arrayList.add(z0Var);
        return new a1(this.f29854f, this.f29855g, this.f29853e, arrayList, this.f29856h, this.f29857i, this.f29858j, this.f29859k);
    }

    public a1 B(i iVar) {
        return new a1(this.f29854f, this.f29855g, this.f29853e, this.f29849a, this.f29856h, this.f29857i, iVar, this.f29859k);
    }

    public synchronized f1 C() {
        if (this.f29852d == null) {
            this.f29852d = E(this.f29849a);
        }
        return this.f29852d;
    }

    public synchronized f1 D() {
        if (this.f29851c == null) {
            this.f29851c = E(m());
        }
        return this.f29851c;
    }

    public a1 a(u uVar) {
        return new a1(uVar, (String) null, this.f29853e, this.f29849a, this.f29856h, this.f29857i, this.f29858j, this.f29859k);
    }

    public Comparator<i> c() {
        return new b(m());
    }

    public a1 d(i iVar) {
        return new a1(this.f29854f, this.f29855g, this.f29853e, this.f29849a, this.f29856h, this.f29857i, this.f29858j, iVar);
    }

    public a1 e(q qVar) {
        y7.b.d(!r(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f29853e);
        arrayList.add(qVar);
        return new a1(this.f29854f, this.f29855g, arrayList, this.f29849a, this.f29856h, this.f29857i, this.f29858j, this.f29859k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f29857i != a1Var.f29857i) {
            return false;
        }
        return D().equals(a1Var.D());
    }

    public String f() {
        return this.f29855g;
    }

    public i g() {
        return this.f29859k;
    }

    public List<z0> h() {
        return this.f29849a;
    }

    public int hashCode() {
        return (D().hashCode() * 31) + this.f29857i.hashCode();
    }

    public List<q> i() {
        return this.f29853e;
    }

    public SortedSet<r> j() {
        TreeSet treeSet = new TreeSet();
        for (q c10 : i()) {
            for (p next : c10.c()) {
                if (next.i()) {
                    treeSet.add(next.f());
                }
            }
        }
        return treeSet;
    }

    public long k() {
        return this.f29856h;
    }

    public a l() {
        return this.f29857i;
    }

    public synchronized List<z0> m() {
        z0.a aVar;
        if (this.f29850b == null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (z0 next : this.f29849a) {
                arrayList.add(next);
                hashSet.add(next.f30060b.d());
            }
            if (this.f29849a.size() > 0) {
                List<z0> list = this.f29849a;
                aVar = list.get(list.size() - 1).b();
            } else {
                aVar = z0.a.ASCENDING;
            }
            for (r rVar : j()) {
                if (!hashSet.contains(rVar.d()) && !rVar.r()) {
                    arrayList.add(z0.d(aVar, rVar));
                }
            }
            if (!hashSet.contains(r.f30633b.d())) {
                arrayList.add(aVar.equals(z0.a.ASCENDING) ? f29847l : f29848m);
            }
            this.f29850b = Collections.unmodifiableList(arrayList);
        }
        return this.f29850b;
    }

    public u n() {
        return this.f29854f;
    }

    public i o() {
        return this.f29858j;
    }

    public boolean p() {
        return this.f29856h != -1;
    }

    public boolean q() {
        return this.f29855g != null;
    }

    public boolean r() {
        return l.n(this.f29854f) && this.f29855g == null && this.f29853e.isEmpty();
    }

    public a1 s(long j10) {
        return new a1(this.f29854f, this.f29855g, this.f29853e, this.f29849a, j10, a.LIMIT_TO_FIRST, this.f29858j, this.f29859k);
    }

    public a1 t(long j10) {
        return new a1(this.f29854f, this.f29855g, this.f29853e, this.f29849a, j10, a.LIMIT_TO_LAST, this.f29858j, this.f29859k);
    }

    public String toString() {
        return "Query(target=" + D().toString() + ";limitType=" + this.f29857i.toString() + ")";
    }

    public boolean u(i iVar) {
        return iVar.b() && z(iVar) && y(iVar) && x(iVar) && w(iVar);
    }

    public boolean v() {
        if (this.f29853e.isEmpty() && this.f29856h == -1 && this.f29858j == null && this.f29859k == null) {
            if (h().isEmpty()) {
                return true;
            }
            if (h().size() != 1 || !h().get(0).f30060b.r()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a1(u uVar, String str) {
        this(uVar, str, Collections.emptyList(), Collections.emptyList(), -1, a.LIMIT_TO_FIRST, (i) null, (i) null);
    }
}
