package oc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36737b;

    public /* synthetic */ f(n nVar, TaskCompletionSource taskCompletionSource) {
        this.f36736a = nVar;
        this.f36737b = taskCompletionSource;
    }

    public final void run() {
        this.f36736a.y(this.f36737b);
    }
}
