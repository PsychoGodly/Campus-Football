package r7;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37827a;

    public /* synthetic */ g0(TaskCompletionSource taskCompletionSource) {
        this.f37827a = taskCompletionSource;
    }

    public final void onSuccess(Object obj) {
        this.f37827a.setResult((Map) obj);
    }
}
