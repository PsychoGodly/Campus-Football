package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f38568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38569b;

    public /* synthetic */ f(Map map, TaskCompletionSource taskCompletionSource) {
        this.f38568a = map;
        this.f38569b = taskCompletionSource;
    }

    public final void run() {
        e.O(this.f38568a, this.f38569b);
    }
}
