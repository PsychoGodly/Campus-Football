package y7;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* compiled from: ThrottledForwardingExecutor */
class a0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f31349a;

    /* renamed from: b  reason: collision with root package name */
    private final Semaphore f31350b;

    a0(int i10, Executor executor) {
        this.f31350b = new Semaphore(i10);
        this.f31349a = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        runnable.run();
        this.f31350b.release();
    }

    public void execute(Runnable runnable) {
        if (this.f31350b.tryAcquire()) {
            try {
                this.f31349a.execute(new z(this, runnable));
            } catch (RejectedExecutionException unused) {
                runnable.run();
            }
        } else {
            runnable.run();
        }
    }
}
