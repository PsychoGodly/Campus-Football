package t7;

import java.util.HashMap;
import java.util.Map;
import p7.j;
import t7.o0;
import y7.b;
import y7.y;

/* compiled from: MemoryPersistence */
public final class y0 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    private final Map<j, w0> f30546c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<j, r0> f30547d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final t0 f30548e = new t0();

    /* renamed from: f  reason: collision with root package name */
    private final a1 f30549f = new a1(this);

    /* renamed from: g  reason: collision with root package name */
    private final q0 f30550g = new q0();

    /* renamed from: h  reason: collision with root package name */
    private final z0 f30551h = new z0();

    /* renamed from: i  reason: collision with root package name */
    private j1 f30552i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30553j;

    private y0() {
    }

    public static y0 n() {
        y0 y0Var = new y0();
        y0Var.t(new s0(y0Var));
        return y0Var;
    }

    public static y0 o(o0.b bVar, o oVar) {
        y0 y0Var = new y0();
        y0Var.t(new v0(y0Var, bVar, oVar));
        return y0Var;
    }

    private void t(j1 j1Var) {
        this.f30552i = j1Var;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return this.f30550g;
    }

    /* access modifiers changed from: package-private */
    public b b(j jVar) {
        r0 r0Var = this.f30547d.get(jVar);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        this.f30547d.put(jVar, r0Var2);
        return r0Var2;
    }

    /* access modifiers changed from: package-private */
    public b1 d(j jVar, l lVar) {
        w0 w0Var = this.f30546c.get(jVar);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this, jVar);
        this.f30546c.put(jVar, w0Var2);
        return w0Var2;
    }

    /* access modifiers changed from: package-private */
    public c1 e() {
        return new x0();
    }

    public j1 f() {
        return this.f30552i;
    }

    public boolean i() {
        return this.f30553j;
    }

    /* access modifiers changed from: package-private */
    public <T> T j(String str, y<T> yVar) {
        this.f30552i.g();
        try {
            return yVar.get();
        } finally {
            this.f30552i.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(String str, Runnable runnable) {
        this.f30552i.g();
        try {
            runnable.run();
        } finally {
            this.f30552i.e();
        }
    }

    public void l() {
        b.d(this.f30553j, "MemoryPersistence shutdown without start", new Object[0]);
        this.f30553j = false;
    }

    public void m() {
        b.d(!this.f30553j, "MemoryPersistence double-started!", new Object[0]);
        this.f30553j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public t0 c(j jVar) {
        return this.f30548e;
    }

    /* access modifiers changed from: package-private */
    public Iterable<w0> q() {
        return this.f30546c.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public z0 g() {
        return this.f30551h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public a1 h() {
        return this.f30549f;
    }
}
