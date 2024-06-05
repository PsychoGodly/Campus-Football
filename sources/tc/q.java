package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38588b;

    public /* synthetic */ q(e eVar, TaskCompletionSource taskCompletionSource) {
        this.f38587a = eVar;
        this.f38588b = taskCompletionSource;
    }

    public final void run() {
        this.f38587a.B(this.f38588b);
    }
}
