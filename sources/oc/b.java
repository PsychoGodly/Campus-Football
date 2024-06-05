package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36726a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36727b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36728c;

    public /* synthetic */ b(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36726a = nVar;
        this.f36727b = map;
        this.f36728c = taskCompletionSource;
    }

    public final void run() {
        this.f36726a.B(this.f36727b, this.f36728c);
    }
}
