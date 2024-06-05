package r7;

import com.google.firebase.firestore.z;
import java.util.ArrayList;
import r7.m;
import r7.o;
import y7.b;

/* compiled from: QueryListener */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f29864a;

    /* renamed from: b  reason: collision with root package name */
    private final o.a f29865b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.firestore.o<x1> f29866c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29867d = false;

    /* renamed from: e  reason: collision with root package name */
    private y0 f29868e = y0.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    private x1 f29869f;

    public b1(a1 a1Var, o.a aVar, com.google.firebase.firestore.o<x1> oVar) {
        this.f29864a = a1Var;
        this.f29866c = oVar;
        this.f29865b = aVar;
    }

    private void e(x1 x1Var) {
        b.d(!this.f29867d, "Trying to raise initial event for second time", new Object[0]);
        x1 c10 = x1.c(x1Var.h(), x1Var.e(), x1Var.f(), x1Var.k(), x1Var.b(), x1Var.i());
        this.f29867d = true;
        this.f29866c.a(c10, (z) null);
    }

    private boolean f(x1 x1Var) {
        boolean z10 = true;
        if (!x1Var.d().isEmpty()) {
            return true;
        }
        x1 x1Var2 = this.f29869f;
        if (x1Var2 == null || x1Var2.j() == x1Var.j()) {
            z10 = false;
        }
        if (x1Var.a() || z10) {
            return this.f29865b.f29962b;
        }
        return false;
    }

    private boolean g(x1 x1Var, y0 y0Var) {
        b.d(!this.f29867d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!x1Var.k()) {
            return true;
        }
        y0 y0Var2 = y0.OFFLINE;
        boolean z10 = !y0Var.equals(y0Var2);
        if (this.f29865b.f29963c && z10) {
            b.d(x1Var.k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
            return false;
        } else if (!x1Var.e().isEmpty() || x1Var.i() || y0Var.equals(y0Var2)) {
            return true;
        } else {
            return false;
        }
    }

    public a1 a() {
        return this.f29864a;
    }

    public void b(z zVar) {
        this.f29866c.a(null, zVar);
    }

    public boolean c(y0 y0Var) {
        this.f29868e = y0Var;
        x1 x1Var = this.f29869f;
        if (x1Var == null || this.f29867d || !g(x1Var, y0Var)) {
            return false;
        }
        e(this.f29869f);
        return true;
    }

    public boolean d(x1 x1Var) {
        boolean z10 = false;
        b.d(!x1Var.d().isEmpty() || x1Var.a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f29865b.f29961a) {
            ArrayList arrayList = new ArrayList();
            for (m next : x1Var.d()) {
                if (next.c() != m.a.METADATA) {
                    arrayList.add(next);
                }
            }
            x1Var = new x1(x1Var.h(), x1Var.e(), x1Var.g(), arrayList, x1Var.k(), x1Var.f(), x1Var.a(), true, x1Var.i());
        }
        if (!this.f29867d) {
            if (g(x1Var, this.f29868e)) {
                e(x1Var);
            }
            this.f29869f = x1Var;
            return z10;
        }
        if (f(x1Var)) {
            this.f29866c.a(x1Var, (z) null);
        }
        this.f29869f = x1Var;
        return z10;
        z10 = true;
        this.f29869f = x1Var;
        return z10;
    }
}
