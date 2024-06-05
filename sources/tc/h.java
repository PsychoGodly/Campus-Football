package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f38572a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38573b;

    public /* synthetic */ h(Map map, TaskCompletionSource taskCompletionSource) {
        this.f38572a = map;
        this.f38573b = taskCompletionSource;
    }

    public final void run() {
        e.N(this.f38572a, this.f38573b);
    }
}
