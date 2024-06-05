package r7;

import g7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r7.m;
import u7.i;
import u7.l;
import u7.n;

/* compiled from: ViewSnapshot */
public class x1 {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f30042a;

    /* renamed from: b  reason: collision with root package name */
    private final n f30043b;

    /* renamed from: c  reason: collision with root package name */
    private final n f30044c;

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f30045d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f30046e;

    /* renamed from: f  reason: collision with root package name */
    private final e<l> f30047f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f30048g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f30049h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30050i;

    /* compiled from: ViewSnapshot */
    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public x1(a1 a1Var, n nVar, n nVar2, List<m> list, boolean z10, e<l> eVar, boolean z11, boolean z12, boolean z13) {
        this.f30042a = a1Var;
        this.f30043b = nVar;
        this.f30044c = nVar2;
        this.f30045d = list;
        this.f30046e = z10;
        this.f30047f = eVar;
        this.f30048g = z11;
        this.f30049h = z12;
        this.f30050i = z13;
    }

    public static x1 c(a1 a1Var, n nVar, e<l> eVar, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m.a(m.a.ADDED, it.next()));
        }
        return new x1(a1Var, nVar, n.e(a1Var.c()), arrayList, z10, eVar, true, z11, z12);
    }

    public boolean a() {
        return this.f30048g;
    }

    public boolean b() {
        return this.f30049h;
    }

    public List<m> d() {
        return this.f30045d;
    }

    public n e() {
        return this.f30043b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (this.f30046e == x1Var.f30046e && this.f30048g == x1Var.f30048g && this.f30049h == x1Var.f30049h && this.f30042a.equals(x1Var.f30042a) && this.f30047f.equals(x1Var.f30047f) && this.f30043b.equals(x1Var.f30043b) && this.f30044c.equals(x1Var.f30044c) && this.f30050i == x1Var.f30050i) {
            return this.f30045d.equals(x1Var.f30045d);
        }
        return false;
    }

    public e<l> f() {
        return this.f30047f;
    }

    public n g() {
        return this.f30044c;
    }

    public a1 h() {
        return this.f30042a;
    }

    public int hashCode() {
        return (((((((((((((((this.f30042a.hashCode() * 31) + this.f30043b.hashCode()) * 31) + this.f30044c.hashCode()) * 31) + this.f30045d.hashCode()) * 31) + this.f30047f.hashCode()) * 31) + (this.f30046e ? 1 : 0)) * 31) + (this.f30048g ? 1 : 0)) * 31) + (this.f30049h ? 1 : 0)) * 31) + (this.f30050i ? 1 : 0);
    }

    public boolean i() {
        return this.f30050i;
    }

    public boolean j() {
        return !this.f30047f.isEmpty();
    }

    public boolean k() {
        return this.f30046e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f30042a + ", " + this.f30043b + ", " + this.f30044c + ", " + this.f30045d + ", isFromCache=" + this.f30046e + ", mutatedKeys=" + this.f30047f.size() + ", didSyncStateChange=" + this.f30048g + ", excludesMetadataChanges=" + this.f30049h + ", hasCachedResults=" + this.f30050i + ")";
    }
}
