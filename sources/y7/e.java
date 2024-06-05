package y7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f39390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f39391b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f39392c;

    public /* synthetic */ e(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        this.f39390a = callable;
        this.f39391b = executor;
        this.f39392c = taskCompletionSource;
    }

    public final void run() {
        g.r(this.f39390a, this.f39391b, this.f39392c);
    }
}
