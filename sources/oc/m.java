package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36754b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36755c;

    public /* synthetic */ m(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36753a = nVar;
        this.f36754b = map;
        this.f36755c = taskCompletionSource;
    }

    public final void run() {
        this.f36753a.I(this.f36754b, this.f36755c);
    }
}
