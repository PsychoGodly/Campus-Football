package ld;

import dd.f;
import dd.n1;
import dd.r0;
import java.util.concurrent.ScheduledExecutorService;
import r6.i;

/* compiled from: ForwardingLoadBalancerHelper */
public abstract class b extends r0.d {
    public r0.h a(r0.b bVar) {
        return g().a(bVar);
    }

    public f b() {
        return g().b();
    }

    public ScheduledExecutorService c() {
        return g().c();
    }

    public n1 d() {
        return g().d();
    }

    public void e() {
        g().e();
    }

    /* access modifiers changed from: protected */
    public abstract r0.d g();

    public String toString() {
        return i.c(this).d("delegate", g()).toString();
    }
}
