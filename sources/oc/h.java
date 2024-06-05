package oc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36741b;

    public /* synthetic */ h(n nVar, TaskCompletionSource taskCompletionSource) {
        this.f36740a = nVar;
        this.f36741b = taskCompletionSource;
    }

    public final void run() {
        this.f36740a.C(this.f36741b);
    }
}
