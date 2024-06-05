package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38586b;

    public /* synthetic */ p(e eVar, TaskCompletionSource taskCompletionSource) {
        this.f38585a = eVar;
        this.f38586b = taskCompletionSource;
    }

    public final void run() {
        this.f38585a.C(this.f38586b);
    }
}
