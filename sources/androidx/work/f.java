package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;

/* compiled from: DirectExecutor.kt */
public enum f implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        m.e(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
