package r7;

import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.k0;
import com.google.firebase.firestore.n0;
import dd.j1;
import g7.e;
import r7.j;
import t7.e1;
import t7.g1;
import t7.g4;
import t7.i0;
import t7.k;
import t7.o;
import t7.o0;
import t7.y0;
import u7.l;
import v7.h;
import x7.m0;
import x7.r0;

/* compiled from: MemoryComponentProvider */
public class w0 extends j {

    /* compiled from: MemoryComponentProvider */
    private class b implements r0.c {
        private b() {
        }

        public void a(y0 y0Var) {
            w0.this.p().a(y0Var);
        }

        public e<l> b(int i10) {
            return w0.this.p().b(i10);
        }

        public void c(int i10, j1 j1Var) {
            w0.this.p().c(i10, j1Var);
        }

        public void d(h hVar) {
            w0.this.p().d(hVar);
        }

        public void e(int i10, j1 j1Var) {
            w0.this.p().e(i10, j1Var);
        }

        public void f(m0 m0Var) {
            w0.this.p().f(m0Var);
        }
    }

    private boolean s(a0 a0Var) {
        if (a0Var.a() == null || !(a0Var.a() instanceof k0)) {
            return false;
        }
        return ((k0) a0Var.a()).a() instanceof n0;
    }

    /* access modifiers changed from: protected */
    public o b(j.a aVar) {
        return new o(p());
    }

    /* access modifiers changed from: protected */
    public g4 c(j.a aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    public k d(j.a aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    public i0 e(j.a aVar) {
        return new i0(n(), new g1(), aVar.e());
    }

    /* access modifiers changed from: protected */
    public e1 f(j.a aVar) {
        if (!s(aVar.g())) {
            return y0.n();
        }
        return y0.o(o0.b.a(aVar.g().b()), new o(new x7.n0(aVar.c().a())));
    }

    /* access modifiers changed from: protected */
    public r0 g(j.a aVar) {
        return new r0(new b(), m(), aVar.d(), aVar.a(), i());
    }

    /* access modifiers changed from: protected */
    public e1 h(j.a aVar) {
        return new e1(m(), o(), aVar.e(), aVar.f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public x7.j a(j.a aVar) {
        return new x7.j(aVar.b());
    }
}
