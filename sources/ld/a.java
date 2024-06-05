package ld;

import dd.j1;
import dd.r0;
import r6.i;

/* compiled from: ForwardingLoadBalancer */
public abstract class a extends r0 {
    public boolean b() {
        return g().b();
    }

    public void c(j1 j1Var) {
        g().c(j1Var);
    }

    public void d(r0.g gVar) {
        g().d(gVar);
    }

    public void e() {
        g().e();
    }

    /* access modifiers changed from: protected */
    public abstract r0 g();

    public String toString() {
        return i.c(this).d("delegate", g()).toString();
    }
}
