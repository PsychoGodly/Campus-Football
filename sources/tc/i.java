package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f38574a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38575b;

    public /* synthetic */ i(Map map, TaskCompletionSource taskCompletionSource) {
        this.f38574a = map;
        this.f38575b = taskCompletionSource;
    }

    public final void run() {
        e.P(this.f38574a, this.f38575b);
    }
}
