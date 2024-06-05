package oc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f36744a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36745b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36746c;

    public /* synthetic */ j(n nVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f36744a = nVar;
        this.f36745b = map;
        this.f36746c = taskCompletionSource;
    }

    public final void run() {
        this.f36744a.E(this.f36745b, this.f36746c);
    }
}
