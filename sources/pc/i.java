package pc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f37101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37102b;

    public /* synthetic */ i(u uVar, TaskCompletionSource taskCompletionSource) {
        this.f37101a = uVar;
        this.f37102b = taskCompletionSource;
    }

    public final void run() {
        this.f37101a.V(this.f37102b);
    }
}
