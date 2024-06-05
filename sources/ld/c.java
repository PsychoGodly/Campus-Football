package ld;

import dd.r0;
import dd.x;
import java.util.List;
import r6.i;

/* compiled from: ForwardingSubchannel */
public abstract class c extends r0.h {
    public List<x> b() {
        return i().b();
    }

    public Object d() {
        return i().d();
    }

    public void e() {
        i().e();
    }

    public void f() {
        i().f();
    }

    public void g(r0.j jVar) {
        i().g(jVar);
    }

    /* access modifiers changed from: protected */
    public abstract r0.h i();

    public String toString() {
        return i.c(this).d("delegate", i()).toString();
    }
}
