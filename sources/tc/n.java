package tc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38582a;

    public /* synthetic */ n(TaskCompletionSource taskCompletionSource) {
        this.f38582a = taskCompletionSource;
    }

    public final void run() {
        this.f38582a.setResult(null);
    }
}
