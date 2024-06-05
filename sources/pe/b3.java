package pe;

import ue.l0;
import ue.q0;

/* compiled from: EventLoop.common.kt */
public final class b3 {

    /* renamed from: a  reason: collision with root package name */
    public static final b3 f37276a = new b3();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<m1> f37277b = q0.a(new l0("ThreadLocalEventLoop"));

    private b3() {
    }

    public final m1 a() {
        return f37277b.get();
    }

    public final m1 b() {
        ThreadLocal<m1> threadLocal = f37277b;
        m1 m1Var = threadLocal.get();
        if (m1Var != null) {
            return m1Var;
        }
        m1 a10 = p1.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f37277b.set((Object) null);
    }

    public final void d(m1 m1Var) {
        f37277b.set(m1Var);
    }
}
