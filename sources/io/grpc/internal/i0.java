package io.grpc.internal;

import dd.j1;
import dd.n;
import dd.t;
import dd.v;
import java.io.InputStream;
import r6.i;

/* compiled from: ForwardingClientStream */
abstract class i0 implements q {
    i0() {
    }

    public void a(n nVar) {
        e().a(nVar);
    }

    public void b(j1 j1Var) {
        e().b(j1Var);
    }

    public void c(InputStream inputStream) {
        e().c(inputStream);
    }

    public void d() {
        e().d();
    }

    /* access modifiers changed from: protected */
    public abstract q e();

    public void flush() {
        e().flush();
    }

    public void h(int i10) {
        e().h(i10);
    }

    public void i(int i10) {
        e().i(i10);
    }

    public boolean isReady() {
        return e().isReady();
    }

    public void j(int i10) {
        e().j(i10);
    }

    public void k(t tVar) {
        e().k(tVar);
    }

    public void l(v vVar) {
        e().l(vVar);
    }

    public void m(String str) {
        e().m(str);
    }

    public void n(x0 x0Var) {
        e().n(x0Var);
    }

    public void o() {
        e().o();
    }

    public void q(r rVar) {
        e().q(rVar);
    }

    public void r(boolean z10) {
        e().r(z10);
    }

    public String toString() {
        return i.c(this).d("delegate", e()).toString();
    }
}
