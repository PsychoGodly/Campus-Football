package b2;

import d2.b;
import d2.d;
import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class k implements b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final k f5434a = new k();
    }

    public static k a() {
        return a.f5434a;
    }

    public static Executor b() {
        return (Executor) d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
