package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f38570a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38571b;

    public /* synthetic */ g(Map map, TaskCompletionSource taskCompletionSource) {
        this.f38570a = map;
        this.f38571b = taskCompletionSource;
    }

    public final void run() {
        e.L(this.f38570a, this.f38571b);
    }
}
