package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36748b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36749c;

    public /* synthetic */ k(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36747a = nVar;
        this.f36748b = map;
        this.f36749c = taskCompletionSource;
    }

    public final void run() {
        this.f36747a.G(this.f36748b, this.f36749c);
    }
}
