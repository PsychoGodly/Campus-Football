package pe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Executors.kt */
public final class u1 {
    public static final Executor a(k0 k0Var) {
        Executor b12;
        s1 s1Var = k0Var instanceof s1 ? (s1) k0Var : null;
        return (s1Var == null || (b12 = s1Var.b1()) == null) ? new f1(k0Var) : b12;
    }

    public static final k0 b(Executor executor) {
        k0 k0Var;
        f1 f1Var = executor instanceof f1 ? (f1) executor : null;
        return (f1Var == null || (k0Var = f1Var.f37303a) == null) ? new t1(executor) : k0Var;
    }

    public static final s1 c(ExecutorService executorService) {
        return new t1(executorService);
    }
}
