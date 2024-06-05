package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38584b;

    public /* synthetic */ o(e eVar, TaskCompletionSource taskCompletionSource) {
        this.f38583a = eVar;
        this.f38584b = taskCompletionSource;
    }

    public final void run() {
        this.f38583a.K(this.f38584b);
    }
}
