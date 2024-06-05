package y7;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: BackgroundQueue */
public class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private Semaphore f31382a = new Semaphore(0);

    /* renamed from: b  reason: collision with root package name */
    private int f31383b = 0;

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        runnable.run();
        this.f31382a.release();
    }

    public void b() {
        try {
            this.f31382a.acquire(this.f31383b);
            this.f31383b = 0;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            b.a("Interrupted while waiting for background task", e10);
        }
    }

    public void execute(Runnable runnable) {
        this.f31383b++;
        p.f31401c.execute(new l(this, runnable));
    }
}
