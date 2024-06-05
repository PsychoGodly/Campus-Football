package tc;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.e;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f38592b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38593c;

    public /* synthetic */ s(e eVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f38591a = eVar;
        this.f38592b = map;
        this.f38593c = taskCompletionSource;
    }

    public final void run() {
        this.f38591a.M(this.f38592b, this.f38593c);
    }
}
