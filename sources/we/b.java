package we;

import java.util.concurrent.Executor;
import pe.k0;
import pe.s1;
import ue.m0;
import xd.g;
import xd.h;

/* compiled from: Dispatcher.kt */
public final class b extends s1 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final b f39247c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final k0 f39248d = m.f39268b.a1(o0.e("kotlinx.coroutines.io.parallelism", i.a(64, m0.a()), 0, 0, 12, (Object) null));

    private b() {
    }

    public void X0(g gVar, Runnable runnable) {
        f39248d.X0(gVar, runnable);
    }

    public void Y0(g gVar, Runnable runnable) {
        f39248d.Y0(gVar, runnable);
    }

    public Executor b1() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        X0(h.f39347a, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
