package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36751b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36752c;

    public /* synthetic */ l(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36750a = nVar;
        this.f36751b = map;
        this.f36752c = taskCompletionSource;
    }

    public final void run() {
        this.f36750a.F(this.f36751b, this.f36752c);
    }
}
