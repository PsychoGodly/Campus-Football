package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36734c;

    public /* synthetic */ d(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36732a = nVar;
        this.f36733b = map;
        this.f36734c = taskCompletionSource;
    }

    public final void run() {
        this.f36732a.D(this.f36733b, this.f36734c);
    }
}
