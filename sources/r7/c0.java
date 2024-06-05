package r7;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37816a;

    public /* synthetic */ c0(TaskCompletionSource taskCompletionSource) {
        this.f37816a = taskCompletionSource;
    }

    public final void onFailure(Exception exc) {
        this.f37816a.setException(exc);
    }
}
