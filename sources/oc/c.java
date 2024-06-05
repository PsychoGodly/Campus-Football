package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36729a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36730b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36731c;

    public /* synthetic */ c(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36729a = nVar;
        this.f36730b = map;
        this.f36731c = taskCompletionSource;
    }

    public final void run() {
        this.f36729a.J(this.f36730b, this.f36731c);
    }
}
