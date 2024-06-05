package t1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import s1.g;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g f22551a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f22552b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f22553c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f22551a = new g(executor);
    }

    public Executor a() {
        return this.f22553c;
    }

    public void b(Runnable runnable) {
        this.f22551a.execute(runnable);
    }

    public g c() {
        return this.f22551a;
    }

    public void d(Runnable runnable) {
        this.f22552b.post(runnable);
    }
}
