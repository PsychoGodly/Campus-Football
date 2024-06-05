package t7;

import android.util.SparseArray;
import g7.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r7.f1;
import u7.l;
import u7.w;
import y7.n;

/* compiled from: MemoryTargetCache */
final class a1 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<f1, i4> f30358a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final k1 f30359b = new k1();

    /* renamed from: c  reason: collision with root package name */
    private int f30360c;

    /* renamed from: d  reason: collision with root package name */
    private w f30361d = w.f30653b;

    /* renamed from: e  reason: collision with root package name */
    private long f30362e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f30363f;

    a1(y0 y0Var) {
        this.f30363f = y0Var;
    }

    public void a(w wVar) {
        this.f30361d = wVar;
    }

    public void b(i4 i4Var) {
        this.f30358a.put(i4Var.g(), i4Var);
        int h10 = i4Var.h();
        if (h10 > this.f30360c) {
            this.f30360c = h10;
        }
        if (i4Var.e() > this.f30362e) {
            this.f30362e = i4Var.e();
        }
    }

    public void c(e<l> eVar, int i10) {
        this.f30359b.g(eVar, i10);
        j1 f10 = this.f30363f.f();
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            f10.j(it.next());
        }
    }

    public int d() {
        return this.f30360c;
    }

    public e<l> e(int i10) {
        return this.f30359b.d(i10);
    }

    public w f() {
        return this.f30361d;
    }

    public i4 g(f1 f1Var) {
        return this.f30358a.get(f1Var);
    }

    public void h(int i10) {
        this.f30359b.h(i10);
    }

    public void i(i4 i4Var) {
        b(i4Var);
    }

    public void j(e<l> eVar, int i10) {
        this.f30359b.b(eVar, i10);
        j1 f10 = this.f30363f.f();
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            f10.i(it.next());
        }
    }

    public boolean k(l lVar) {
        return this.f30359b.c(lVar);
    }

    public void l(n<i4> nVar) {
        for (i4 accept : this.f30358a.values()) {
            nVar.accept(accept);
        }
    }

    /* access modifiers changed from: package-private */
    public long m(o oVar) {
        long j10 = 0;
        for (Map.Entry<f1, i4> value : this.f30358a.entrySet()) {
            j10 += (long) oVar.q((i4) value.getValue()).f();
        }
        return j10;
    }

    public long n() {
        return this.f30362e;
    }

    public long o() {
        return (long) this.f30358a.size();
    }

    /* access modifiers changed from: package-private */
    public int p(long j10, SparseArray<?> sparseArray) {
        Iterator<Map.Entry<f1, i4>> it = this.f30358a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry next = it.next();
            int h10 = ((i4) next.getValue()).h();
            if (((i4) next.getValue()).e() <= j10 && sparseArray.get(h10) == null) {
                it.remove();
                h(h10);
                i10++;
            }
        }
        return i10;
    }

    public void q(i4 i4Var) {
        this.f30358a.remove(i4Var.g());
        this.f30359b.h(i4Var.h());
    }
}
