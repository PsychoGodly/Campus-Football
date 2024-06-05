package pe;

import java.util.concurrent.locks.LockSupport;
import pe.n1;

/* compiled from: EventLoop.kt */
public abstract class o1 extends m1 {
    /* access modifiers changed from: protected */
    public abstract Thread n1();

    /* access modifiers changed from: protected */
    public void o1(long j10, n1.c cVar) {
        v0.f37406i.y1(j10, cVar);
    }

    /* access modifiers changed from: protected */
    public final void p1() {
        Thread n12 = n1();
        if (Thread.currentThread() != n12) {
            c.a();
            LockSupport.unpark(n12);
        }
    }
}
