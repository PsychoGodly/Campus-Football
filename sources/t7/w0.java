package t7;

import com.google.protobuf.i;
import g7.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p7.j;
import u7.l;
import v7.f;
import v7.g;
import x7.a1;
import y6.q;
import y7.b;
import y7.g0;
import y7.x;

/* compiled from: MemoryMutationQueue */
final class w0 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<g> f30539a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private e<e> f30540b = new e<>(Collections.emptyList(), e.f30387c);

    /* renamed from: c  reason: collision with root package name */
    private int f30541c = 1;

    /* renamed from: d  reason: collision with root package name */
    private i f30542d = a1.f31013v;

    /* renamed from: e  reason: collision with root package name */
    private final y0 f30543e;

    /* renamed from: f  reason: collision with root package name */
    private final t0 f30544f;

    w0(y0 y0Var, j jVar) {
        this.f30543e = y0Var;
        this.f30544f = y0Var.c(jVar);
    }

    private int n(int i10) {
        if (this.f30539a.isEmpty()) {
            return 0;
        }
        return i10 - this.f30539a.get(0).e();
    }

    private int o(int i10, String str) {
        int n10 = n(i10);
        b.d(n10 >= 0 && n10 < this.f30539a.size(), "Batches must exist to be %s", str);
        return n10;
    }

    private List<g> q(e<Integer> eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = eVar.iterator();
        while (it.hasNext()) {
            g g10 = g(it.next().intValue());
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.f30539a.isEmpty()) {
            b.d(this.f30540b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    public List<g> b(Iterable<l> iterable) {
        e eVar = new e(Collections.emptyList(), g0.g());
        for (l next : iterable) {
            Iterator<e> f10 = this.f30540b.f(new e(next, 0));
            while (f10.hasNext()) {
                e next2 = f10.next();
                if (!next.equals(next2.d())) {
                    break;
                }
                eVar = eVar.e(Integer.valueOf(next2.c()));
            }
        }
        return q(eVar);
    }

    public void c(g gVar, i iVar) {
        int e10 = gVar.e();
        int o10 = o(e10, "acknowledged");
        b.d(o10 == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        g gVar2 = this.f30539a.get(o10);
        b.d(e10 == gVar2.e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(e10), Integer.valueOf(gVar2.e()));
        this.f30542d = (i) x.b(iVar);
    }

    public void d(i iVar) {
        this.f30542d = (i) x.b(iVar);
    }

    public g e(int i10) {
        int n10 = n(i10 + 1);
        if (n10 < 0) {
            n10 = 0;
        }
        if (this.f30539a.size() > n10) {
            return this.f30539a.get(n10);
        }
        return null;
    }

    public int f() {
        if (this.f30539a.isEmpty()) {
            return -1;
        }
        return this.f30541c - 1;
    }

    public g g(int i10) {
        int n10 = n(i10);
        if (n10 < 0 || n10 >= this.f30539a.size()) {
            return null;
        }
        g gVar = this.f30539a.get(n10);
        b.d(gVar.e() == i10, "If found batch must match", new Object[0]);
        return gVar;
    }

    public i h() {
        return this.f30542d;
    }

    public void i(g gVar) {
        b.d(o(gVar.e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f30539a.remove(0);
        e<e> eVar = this.f30540b;
        for (f g10 : gVar.h()) {
            l g11 = g10.g();
            this.f30543e.f().l(g11);
            eVar = eVar.g(new e(g11, gVar.e()));
        }
        this.f30540b = eVar;
    }

    public g j(q qVar, List<f> list, List<f> list2) {
        boolean z10 = true;
        b.d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i10 = this.f30541c;
        this.f30541c = i10 + 1;
        int size = this.f30539a.size();
        if (size > 0) {
            if (this.f30539a.get(size - 1).e() >= i10) {
                z10 = false;
            }
            b.d(z10, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        g gVar = new g(i10, qVar, list, list2);
        this.f30539a.add(gVar);
        for (f next : list2) {
            this.f30540b = this.f30540b.e(new e(next.g(), i10));
            this.f30544f.m(next.g().j());
        }
        return gVar;
    }

    public List<g> k() {
        return Collections.unmodifiableList(this.f30539a);
    }

    /* access modifiers changed from: package-private */
    public boolean l(l lVar) {
        Iterator<e> f10 = this.f30540b.f(new e(lVar, 0));
        if (!f10.hasNext()) {
            return false;
        }
        return f10.next().d().equals(lVar);
    }

    /* access modifiers changed from: package-private */
    public long m(o oVar) {
        long j10 = 0;
        for (g o10 : this.f30539a) {
            j10 += (long) oVar.o(o10).f();
        }
        return j10;
    }

    public boolean p() {
        return this.f30539a.isEmpty();
    }

    public void start() {
        if (p()) {
            this.f30541c = 1;
        }
    }
}
