package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import y6.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f38576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38577b;

    public /* synthetic */ j(f fVar, TaskCompletionSource taskCompletionSource) {
        this.f38576a = fVar;
        this.f38577b = taskCompletionSource;
    }

    public final void run() {
        e.D(this.f38576a, this.f38577b);
    }
}
