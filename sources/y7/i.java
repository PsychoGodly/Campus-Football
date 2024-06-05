package y7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import y7.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f39397a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f39398b;

    public /* synthetic */ i(TaskCompletionSource taskCompletionSource, Callable callable) {
        this.f39397a = taskCompletionSource;
        this.f39398b = callable;
    }

    public final void run() {
        g.c.q(this.f39397a, this.f39398b);
    }
}
