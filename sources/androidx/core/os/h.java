package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat */
public final class h {

    /* compiled from: ExecutorCompat */
    private static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f2971a;

        a(Handler handler) {
            this.f2971a = (Handler) androidx.core.util.h.f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f2971a.post((Runnable) androidx.core.util.h.f(runnable))) {
                throw new RejectedExecutionException(this.f2971a + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
