package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38590b;

    public /* synthetic */ r(e eVar, TaskCompletionSource taskCompletionSource) {
        this.f38589a = eVar;
        this.f38590b = taskCompletionSource;
    }

    public final void run() {
        this.f38589a.E(this.f38590b);
    }
}
