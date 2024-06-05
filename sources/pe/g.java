package pe;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;

/* compiled from: Builders.kt */
final class g<T> extends a<T> {

    /* renamed from: d  reason: collision with root package name */
    private final Thread f37306d;

    /* renamed from: f  reason: collision with root package name */
    private final m1 f37307f;

    public g(xd.g gVar, Thread thread, m1 m1Var) {
        super(gVar, true, true);
        this.f37306d = thread;
        this.f37307f = m1Var;
    }

    public final T U0() {
        c.a();
        try {
            m1 m1Var = this.f37307f;
            c0 c0Var = null;
            if (m1Var != null) {
                m1.h1(m1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                m1 m1Var2 = this.f37307f;
                long k12 = m1Var2 != null ? m1Var2.k1() : Long.MAX_VALUE;
                if (!h()) {
                    c.a();
                    LockSupport.parkNanos(this, k12);
                } else {
                    m1 m1Var3 = this.f37307f;
                    if (m1Var3 != null) {
                        m1.c1(m1Var3, false, 1, (Object) null);
                    }
                    c.a();
                    T h10 = l2.h(Y());
                    if (h10 instanceof c0) {
                        c0Var = (c0) h10;
                    }
                    if (c0Var == null) {
                        return h10;
                    }
                    throw c0Var.f37280a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            C(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean d0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        if (!m.a(Thread.currentThread(), this.f37306d)) {
            Thread thread = this.f37306d;
            c.a();
            LockSupport.unpark(thread);
        }
    }
}
