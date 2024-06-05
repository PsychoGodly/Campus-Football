package pe;

import java.util.concurrent.Executor;
import xd.h;

/* compiled from: Executors.kt */
final class f1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f37303a;

    public f1(k0 k0Var) {
        this.f37303a = k0Var;
    }

    public void execute(Runnable runnable) {
        k0 k0Var = this.f37303a;
        h hVar = h.f39347a;
        if (k0Var.Z0(hVar)) {
            this.f37303a.X0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f37303a.toString();
    }
}
